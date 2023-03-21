package generic;

/**
 * @author : iyeong-gyo
 * @package : generic
 * @since : 2023/03/20 TargetType
 */
public class Boxing2 {

  public static void main(String[] args) {
    Box2<String> objectBox2 = EmptyBoxFactory.makeBox();
    objectBox2.setObj("TEST");
    System.out.println("objectBox2.getObj() = " + objectBox2.getObj());
  }
}

class Box2<T> {

  private T obj;

  public T getObj() {
    return obj;
  }

  public void setObj(T obj) {
    this.obj = obj;
  }
}

class EmptyBoxFactory {

  public static <T> Box2<T> makeBox() {
    return new Box2<T>();
  }
}
