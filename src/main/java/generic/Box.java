package generic;

/**
 * @author : iyeong-gyo
 * @package : generic
 * @since : 2023/03/20
 */
public class Box {

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
