package serialize;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @author : iyeong-gyo
 * @package : serialize
 * @since : 14.11.23
 */
public class SerializeAttack {

  public static void main(String[] args) {
//    try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("data.ser"))) {
//      // 직렬화: MyClass 객체를 파일에 저장
//      MyClass myObject = new MyClass("Example Data");
//      outputStream.writeObject(myObject);
//    } catch (IOException e) {
//      e.printStackTrace();
//    }

    try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("data.ser"))) {
      // 역직렬화: MyClass 객체를 파일에서 읽어와서 생성
      MyClass deserializedObject = (MyClass) inputStream.readObject();
      System.out.println("Deserialization successful.");
      System.out.println("Data: " + deserializedObject.getData());
    } catch (IOException | ClassNotFoundException e) {
      e.printStackTrace();
    }
  }

  static class MyClass implements Serializable {

    private static final long serialVersionUID = 1L;
    private String data;

    public MyClass() {
      System.out.println("FUCK Constructor: " + data);
    }

    public MyClass(String data) {
      this.data = data;
      System.out.println("MyClass Constructor: " + data);
    }

    public String getData() {
      return data;
    }
  }

}

