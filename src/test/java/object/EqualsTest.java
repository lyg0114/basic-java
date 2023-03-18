package object;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import object.equals.INum;
import org.junit.Test;

/**
 * @author : iyeong-gyo
 * @package : object
 * @since : 2023/03/18
 */
public class EqualsTest {

  @Test
  public void testEquals() {
    INum iNum1 = new INum(10);
    INum iNum2 = new INum(12);
    INum iNum3 = new INum(10);

    assertFalse(iNum1.equals(iNum2));
    assertFalse(iNum1.equals(iNum3));
  }

  @Test
  public void testStringEquals() {
    String str1 = "test str1";
    String str2 = "test str2";
    String str3 = "test str1";

    assertFalse(str1.equals(str2));
    assertTrue(str1.equals(str3));

  }
}