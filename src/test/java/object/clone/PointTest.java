package object.clone;

import static org.junit.Assert.assertFalse;

import org.junit.Test;

/**
 * @author : iyeong-gyo
 * @package : object.clone
 * @since : 2023/03/18
 */
public class PointTest {

  @Test
  public void testClone() {
    Point org = new Point(3, 5);
    Point cpy = null;
    try {
      cpy = (Point) org.clone();
      org.showPosition();
      cpy.showPosition();
    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
    }

    assertFalse(org == cpy);
  }

  @Test
  public void testClone2() {
    Point org = new Point(3, 5);
    Point cpy = null;
    try {
      cpy = (Point) org.clone();

      org.moveRight();
      org.showPosition();
      cpy.showPosition();

    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
    }

  }
}