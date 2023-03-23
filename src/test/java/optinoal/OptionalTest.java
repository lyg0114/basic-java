package optinoal;

import java.util.Optional;
import org.junit.Test;

/**
 * @author : iyeong-gyo
 * @package : optinoal
 * @since : 2023/03/23
 */
public class OptionalTest {

  @Test
  public void stringOptional1() {
    Optional<String> os1 = Optional.of(new String("Toy1"));
    Optional<String> os2 = Optional.ofNullable(new String("Toy2"));

    if (os1.isPresent()) {
      System.out.println(os1.get());
    }

    if (os1.isPresent()) {
      System.out.println(os2.get());
    }
  }

  @Test
  public void stringOptional2() {
    Optional<String> os1 = Optional.of(new String("Toy1"));
    Optional<String> os2 = Optional.ofNullable(new String("Toy2"));
    Optional<String> os3 = Optional.ofNullable(null);
    os1.ifPresent(i -> System.out.println(i));
    os2.ifPresent(System.out::println);
  }

}
