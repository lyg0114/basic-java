package generic;

/**
 * @author : iyeong-gyo
 * @package : generic
 * @since : 2023/03/21
 */
public class BoxHandler {

  public static void main(String[] args) {
    Box3<Car> box = new Box3<>();
    outBox(box);

  }

  //상한제한
  //상속관계상 값을 할당하는것은 허용되지 않는다.
  public static Toy outBox(Box3<? extends Toy> box) {
    Toy toy = box.get();
    System.out.println(toy);
    return toy;
  }

  public static void inBox(Box3<? super Toy> box, Toy nToy) {
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

