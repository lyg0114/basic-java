package generic;

/**
 * @author : iyeong-gyo
 * @package : generic
 * @since : 2023/03/20
 */

public class Boxing {

  public static void main(String[] args) {
    Box box = new Box();
    box.setObj(new Apple());
    box.setObj(new Orange());
  }
}


class Box {

  private Object obj;

  public Object getObj() {
    return obj;
  }

  public void setObj(Object obj) {
    this.obj = obj;
  }
}


class Apple {

  @Override
  public String toString() {
    return "Apple{}";
  }
}

class Orange {

  @Override
  public String toString() {
    return "Orange{}";
  }

}
