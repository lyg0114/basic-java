package lamda;

import java.util.Collections;
import java.util.List;

/**
 * @author : iyeong-gyo
 * @package : lamda
 * @since : 2023/03/22
 */
public class JustSort {
  public void print(List<? extends Number> ls) {
    ls.forEach(i -> System.out.println("i = " + i));
  }

  public void sort(List<? extends Number> ls) {
  }

  public void reverse(List<? extends Number> ls) {
    Collections.reverse(ls);
  }
}
