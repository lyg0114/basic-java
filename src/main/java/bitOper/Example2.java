package bitOper;

/**
 * @author : iyeong-gyo
 * @package : bitOper
 * @since : 2023/04/09
 */
public class Example2 {

  public static void main(String[] args) {
    int num = 2;
    System.out.println((num << 1) + " ");
    System.out.println((num << 2) + " ");
    System.out.println((num << 3) + " ");
    System.out.println((num << 4) + " ");
    System.out.println("num = " + num);

    num = 1024;
    System.out.println((num >> 1) + " ");
    System.out.println((num >> 2) + " ");
    System.out.println((num >> 3) + " ");
    System.out.println((num >> 4) + " ");
    System.out.println((num >> 5) + " ");
    System.out.println((num >> 6) + " ");

    System.out.println("num = " + num);
  }
}
