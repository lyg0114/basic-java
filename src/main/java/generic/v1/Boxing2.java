package generic.v1;

/**
 * @author : iyeong-gyo
 * @package : generic
 * @since : 2023/03/20 TargetType
 */
public class Boxing2 {

  public static void main(String[] args) {
    Box2<Integer> objectBox2 = EmptyBoxFactory.makeBox();
  }
}


class EmptyBoxFactory {

  public static <T> Box2<T> makeBox() {
    return new Box2<T>();
  }

  //제네릭 메소드 아님
  //기능은 동일, 차이 없음
  //하한제한 (Lower-Bounded Wildcards)
  public static Integer peekLowerBox(Box2<? super Integer> box) {
    return null;
  }

  //제네릭 메소드 아님
  //기능은 동일, 차이 없음
  //상한제한 (Upper-Bounded Wildcards)
  public static Object peekUpperBox(Box2<? extends Number> box) {
    return box.getObj();
  }

  //제네릭 메소드
  //기능은 동일, 차이 없음
  public static <T> void genericPeekBox(Box2<T> box) {
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
