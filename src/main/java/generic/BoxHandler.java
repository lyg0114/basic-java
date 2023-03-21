package generic;

/**
 * @author : iyeong-gyo
 * @package : generic
 * @since : 2023/03/21
 */
public class BoxHandler {

  public static void main(String[] args) {

  }

  public static void outBox(Box3<Toy> box) {
    Toy toy = box.get();
    System.out.println(toy);
  }

  public static void inBox(Box3<Toy> box, Toy nToy) {
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

class Toy {

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

