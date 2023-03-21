package generic;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

/**
 * @author : iyeong-gyo
 * @package : generic
 * @since : 2023/03/21
 */
public class GenericPlayGround {

  @Test
  public void testCompare() {
    List<String> smples = new ArrayList<>();
    smples.add("c");
    smples.add("a");
    smples.add("d");
    smples.add("f");
    smples.add("b");

    smples.sort((o1, o2) -> o1.compareTo(o2));
    for (String smple : smples) {
      System.out.println("smple = " + smple);
    }
  }
}
