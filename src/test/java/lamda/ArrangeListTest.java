package lamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
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
    ls.forEach(System.out::println);
  }

  @Test
  public void methodRef4() {
    List<Data> list = new LinkedList<>();
    list.add(new Data(1, 1, 1));
    list.add(new Data(2, 2, 2));
    list.add(new Data(3, 3, 3));
    list.add(new Data(4, 4, 4));
    list.add(new Data(5, 5, 5));

    list.stream()
        .max((o1, o2) -> o1.getNum1() - o2.getNum1())
        .ifPresent(i -> System.out.println(i.getNum1()))
    ;
  }

}

class Data {

  private int num1;
  private int num2;
  private int num3;

  public Data(int num1, int num2, int num3) {
    this.num1 = num1;
    this.num2 = num2;
    this.num3 = num3;
  }

  public void addPlus() {
    ++num1;
    ++num2;
    ++num3;
  }

  public int getNum1() {
    return num1;
  }

  public void setNum1(int num1) {
    this.num1 = num1;
  }

  public int getNum2() {
    return num2;
  }

  public void setNum2(int num2) {
    this.num2 = num2;
  }

  public int getNum3() {
    return num3;
  }

  public void setNum3(int num3) {
    this.num3 = num3;
  }
}


























