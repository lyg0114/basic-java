package object;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

/**
 * @author : iyeong-gyo
 * @package : object
 * @since : 2023/03/18
 */
public class INumTest {

  @Test
  public void testEquals() {
    INum iNum1 = new INum(10);
    INum iNum2 = new INum(12);
    INum iNum3 = new INum(10);

    assertFalse(iNum1.equals(iNum2));
    assertFalse(iNum1.equals(iNum3));

  }

}