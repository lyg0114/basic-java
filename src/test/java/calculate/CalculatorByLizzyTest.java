package calculate;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author : iyeong-gyo
 * @package : calculate
 * @since : 2023/03/18
 */
public class CalculatorByLizzyTest extends CalculatorByLizzy {

  @Test
  public void testPlus() {
    CalculatorByLizzy calculatorByLizzy = new CalculatorByLizzy();
    assertEquals(3, calculatorByLizzy.lizzyPlus(1, 2));
  }
}