package generic.v2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/**
 * @author : iyeong-gyo
 * @package : generic.v2
 * @since : 2023/03/21
 */
public class CookGenerics {

  public static void main(String[] args) {
    ArrayList<String> objects = new ArrayList<>();
    Collections.sort(objects);
    String a = null;
    Collections.binarySearch(objects, a);
    HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
    objectObjectHashMap.put("","");
  }
}

