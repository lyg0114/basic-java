package object.clone;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

/**
 * @author : iyeong-gyo
 * @package : object.clone
 * @since : 2023/03/18
 */
public class CloneTest {

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
  public void shallowClone() {
    Rectangle org = new Rectangle(1, 2, 3, 4);
    Rectangle shallowClone = org.shallowClone();
    assertEquals(shallowClone.getUpperLeft(), org.getUpperLeft());
    assertEquals(shallowClone.getLowerRight(), org.getLowerRight());
  }

  @Test
  public void deepClone() {
    Rectangle org = new Rectangle(1, 2, 3, 4);
    Rectangle shallowClone = org.deepClone();
    assertNotEquals(shallowClone.getUpperLeft(), org.getUpperLeft());
    assertNotEquals(shallowClone.getLowerRight(), org.getLowerRight());
  }
}