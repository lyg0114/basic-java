package lamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import org.junit.Test;

/**
 * @author : iyeong-gyo
 * @package : lamda
 * @since : 2023/03/22
 */
public class ArrangeListTest {

  @Test
  public void methodRef1() {
    List<Integer> ls = Arrays.asList(1, 3, 5, 7, 9);
    ArrayList<Integer> integers = new ArrayList<>(ls);

    Consumer<List<Integer>> c = l -> Collections.reverse(l);
    c.accept(integers);

    for (Integer integer : integers) {
      System.out.println("integer = " + integer);
    }
  }

  //Efectivly final
  @Test
  public void methodRef2() {
    List<Integer> ls = Arrays.asList(1, 3, 5, 7, 9);
    ls = new ArrayList<>(ls);
    JustSort js = new JustSort();

    Consumer<List<Integer>> c = js::reverse;
    c.accept(ls);

    ls.forEach(System.out::println);

  }

  @Test
  public void methodRef3() {
    List<String> ls = Arrays.asList("Box", "Robot");
    ls.forEach(s -> System.out.println(s));
//    ls.forEach(System.out::println);

  }

}

























