package generic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.Test;

/**
 * @author : iyeong-gyo
 * @package : generic
 * @since : 2023/03/21
 */
public class CarEcarExample {

  @Test
  public void testCar() {
    List<Car> list = new ArrayList<>();
    list.add(new Car(1200));
    list.add(new Car(3000));
    list.add(new ECar(1800));
    list.add(new ECar(2101));
    list.add(new ECar(3432));
    Collections.sort(list);

    for (Car car : list) {
      System.out.println(car.getDisp() + " " + car.toString());
    }

  }
}


class Car implements Comparable<Car> {

  private int disp;

  public Car(int disp) {
    this.disp = disp;
  }

  @Override
  public int compareTo(Car o) {
    return disp - o.disp;
  }

  public int getDisp() {
    return disp;
  }

  @Override
  public String toString() {
    return "This is Car";
  }
}

class ECar extends Car {

  public ECar(int disp) {
    super(disp);
  }

  @Override
  public String toString() {
    return "This is ECar";
  }
}
