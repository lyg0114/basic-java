package object.clone;

/**
 * @author : iyeong-gyo
 * @package : object.clone
 * @since : 2023/03/18
 */
public class Point implements Cloneable {

  private int xPos;
  private int yPos;

  public Point(int xPos, int yPos) {
    this.xPos = xPos;
    this.yPos = yPos;
  }

  public void showPosition() {
    System.out.printf("[%d, %d]", xPos, yPos);
    System.out.println();
  }

  @Override
  public Object clone() throws CloneNotSupportedException {
    return super.clone();
  }
}
