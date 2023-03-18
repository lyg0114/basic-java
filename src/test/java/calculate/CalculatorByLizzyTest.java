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
  public void testPlus1() {
    CalculatorByLizzy calculatorByLizzy = new CalculatorByLizzy();
    assertEquals(3, calculatorByLizzy.lizzyPlus(1, 2));
  }

  @Test
  public void testPlus2() {
    CalculatorByKyle calculatorByKyle = new CalculatorByKyle();
    assertEquals(3, calculatorByKyle.lizzyPlus(1, 2));
  }

}