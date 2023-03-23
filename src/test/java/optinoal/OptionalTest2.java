package optinoal;

import java.util.Optional;
import org.junit.Test;

/**
 * @author : iyeong-gyo
 * @package : optinoal
 * @since : 2023/03/23
 */
public class OptionalTest2 {


  @Test
  public void stringOptional2() {
    Optional<String> os1 = Optional.of("Optional String");
    Optional<String> os2 = os1.map(String::toUpperCase);
    System.out.println("os2.get() = " + os2.get());

    Optional<String> os3 = os1
        .map(s -> s.replace(' ', '_'))
        .map(String::toUpperCase);
    System.out.println("os3.get() = " + os3.get());
  }

  @Test
  public void stringOptional3() {
    Optional<String> os1 = Optional.empty();
    Optional<String> os2 = Optional.of("So Basic");

    String s1 = os1.map(String::toString)
        .orElse("Empty");
    String s2 = os1.map(String::toString)
        .orElse("Empty");

    System.out.println("s1 = " + s1);
    System.out.println("s2 = " + s2);
  }
}
