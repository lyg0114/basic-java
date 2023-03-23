package optinoal;

import java.util.Optional;
import org.junit.Test;

/**
 * @author : iyeong-gyo
 * @package : optinoal
 * @since : 2023/03/23
 */
public class OptionalCountInfoTest {

  @Test
  public void stringOptional1() {
    CountInfo ci = new CountInfo(null, "Republic of Korea");
    String phone;
    String adrs;

    if (ci.getPhone() != null) {
      phone = ci.getPhone();
    } else {
      phone = "There is no phone";
    }

    if (ci.getAdrs() != null) {
      adrs = ci.getAdrs();
    } else {
      adrs = "There is no address.";
    }

    System.out.println(phone);
    System.out.println(adrs);
  }

  @Test
  public void stringOptional2() {
    Optional<CountInfo> ci = Optional.of(new CountInfo(null, "Republic of Korea"));
    String phone = getPhone(ci);
    String addr = getAddr(ci);
  }

  private String getAddr(Optional<CountInfo> ci) {
    return ci.map(CountInfo::getAdrs)
        .orElseThrow(RuntimeException::new)
        ;
  }

  private String getPhone(Optional<CountInfo> ci) {
    return ci.map(CountInfo::getPhone)
        .orElse("No Phone");
  }

  @Test
  public void stringOptional3() {
    CountInfo ci = new CountInfo("010-1234-1234", "Republic of Korea");
    Company cp = new Company("YaHo Co. Ltd.", null);
    Friend frn = new Friend("LEE SU", cp);
    try{
      showCompAddr(Optional.of(frn));
    } catch (NullPointerException e){
      e.printStackTrace();
    }
  }

  private void showCompAddr(Optional<Friend> frn) {
    String s = frn
        .map(Friend::getCmp)
        .map(Company::getInfo)
        .map(CountInfo::getAdrs)
        .orElseThrow(() -> new NullPointerException());

    System.out.println(s);
  }
}
