package varable;

/**
 * @author : iyeong-gyo
 * @package : varable
 * @since : 2023/03/18
 */
public class Varable {

  public static void main(String[] args) {
    int test = 1;
    for (int i = 0; i < 32; i++) {
      System.out.println("i : " + i + " : " + test);
      test *= 2;
    }
    System.out.println();
    System.out.println(Integer.MAX_VALUE);
  }
}
