package generic.v2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author : iyeong-gyo
 * @package : generic.v2
 * @since : 2023/03/21
 */
public class CookGenerics {

  public static void main(String[] args) {
    List<String> smples = new ArrayList<>();
    smples.add("c");
    smples.add("a");
    smples.add("d");
    smples.add("f");
    smples.add("b");

    Comp comp = new Comp();
    smples.sort(comp);
    for (String smple : smples) {
      System.out.println("smple = " + smple);
    }
  }
}

class Comp implements Comparator<String> {

  @Override
  public int compare(String o1, String o2) {
    return o1.compareTo(o2);
  }
}


