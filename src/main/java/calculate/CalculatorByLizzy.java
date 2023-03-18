package calculate;

/**
 * @author : iyeong-gyo
 * @package : calculate
 * @since : 2023/03/18
 */
public class CalculatorByLizzy implements Calculator {

  @Override
  public int plus(int x, int y) {
    return lizzyPlus(x, y);
  }

  private int lizzyPlus(int x, int y) {
    return x + y;
  }

  @Override
  public int minus(int x, int y) {
    return 0;
  }

  private int lizzyMinus(int x, int y) {
    return x - y;
  }

  @Override
  public int multi(int x, int y) {
    return 0;
  }

  private int lizzyMulti(int x, int y) {
    return x * y;
  }

  @Override
  public int divide(int x, int y) {
    return 0;
  }

  private int lizzydivide(int x, int y) {
    return x / y;
  }
}
