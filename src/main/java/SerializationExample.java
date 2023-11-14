import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @author : iyeong-gyo
 * @package : PACKAGE_NAME
 * @since : 14.11.23
 */

public class SerializationExample {

  public static void main(String[] args) {
    MyClass myObject = new MyClass("example", 123);
    // 객체를 파일에 직렬화하여 저장
    try (ObjectOutputStream outputStream = new ObjectOutputStream(
        new FileOutputStream("data.ser"))) {
      outputStream.writeObject(myObject);
    } catch (IOException e) {
      e.printStackTrace();
    }

    try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("data.ser"))) {
      MyClass deserializedObject = (MyClass) inputStream.readObject();
      System.out.println("Deserialization successful.");
      System.out.println("Name: " + deserializedObject.getName());
      System.out.println("Value: " + deserializedObject.getValue());
    } catch (IOException | ClassNotFoundException e) {
      e.printStackTrace();
      System.out.println("Deserialization failed.");
    }

  }
}

class MyClass implements Serializable {

  private static final long serialVersionUID = 3L;

  private String name;
  private int value;

  public MyClass(String name, int value) {
    this.name = name;
    this.value = value;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getValue() {
    return value;
  }

  public void setValue(int value) {
    this.value = value;
  }

}


