package generic;

/**
 * @author : iyeong-gyo
 * @package : generic
 * @since : 2023/03/21
 */
public class BoxHandler {

  public static void main(String[] args) {
    Box3<Plastic> box = new Box3<>();

    Plastic plastic = new Plastic();
    Toy toy = new Toy();
    Car car = new Car();


    inBox(box, car);
    outBox(box);

  }

  //상한제한
  //상속관계상 값을 할당하는것은 허용되지 않는다.
  //자식 클래스는 부모 클래스를 참조할 수 없음
  public static <T> T outBox(Box3<? extends T> box) {
    return box.get();
  }

  //하한제한
  //상속관계상 값을 조회하는것은 허용되지 않는다.
  //자식 클래스는 부모 클래스를 참조할 수 없음
  public static <T> void inBox(Box3<? super T> box, T nToy) {
    box.set(nToy);
  }
}

class Box3<T> {

  private T obj;

  public T get() {
    return obj;
  }

  public void set(T obj) {
    this.obj = obj;
  }
}

class Plastic {

  @Override
  public String toString() {
    return "I am a Plastic";
  }
}

class Toy extends Plastic {

  @Override
  public String toString() {
    return "I am a Toy";
  }
}

class Car extends Toy {

  @Override
  public String toString() {
    return "I am a Car";
  }
}

class Robot extends Toy {

  @Override
  public String toString() {
    return "I am a Robot";
  }
}

