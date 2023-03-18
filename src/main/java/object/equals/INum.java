package object.equals;

/**
 * @author : iyeong-gyo
 * @package : object
 * @since : 2023/03/18
 */
public class INum {

  private int num;

  public INum(int num) {
    this.num = num;
  }

  @Override
  public boolean equals(Object obj) {
    if (this.num == ((INum) obj).num) {
      return super.equals(obj);
    } else {
      return false;
    }
  }
}
