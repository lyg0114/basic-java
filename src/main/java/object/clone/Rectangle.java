package object.clone;

/**
 * @author : iyeong-gyo
 * @package : object.clone
 * @since : 2023/03/18
 */
public class Rectangle implements Cloneable {

  private Point upperLeft;
  private Point lowerRight;

  public Rectangle(int x1, int y1, int x2, int y2) {
    upperLeft = new Point(x1, y1);
    lowerRight = new Point(x2, y2);
  }

  @Override
  public Object clone() throws CloneNotSupportedException {
    return super.clone();
  }

  public Rectangle shallowClone() {
    Rectangle copy = null;
    try {
      copy = (Rectangle) clone();
    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
    }
    return copy;
  }

  public Rectangle deepClone() {
    Rectangle copy = null;
    try {
      copy = (Rectangle) super.clone();
      copy.upperLeft = (Point) this.upperLeft.clone();
      copy.lowerRight = (Point) this.lowerRight.clone();
    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
    }
    return copy;
  }

  public Point getUpperLeft() {
    return upperLeft;
  }

  public Point getLowerRight() {
    return lowerRight;
  }
}
