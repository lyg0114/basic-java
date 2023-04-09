package bitOper;

/**
 * @author : iyeong-gyo
 * @package : bitOper
 * @since : 2023/04/09
 */
public class Example1 {
  public static void main(String[] args) {
    byte n1 = 13;
    byte n2 = 7;
    byte n3 = (byte)(n1 & n2);
    System.out.println("n3 = " + n3);
  }
}
