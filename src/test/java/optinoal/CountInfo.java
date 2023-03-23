package optinoal;

/**
 * @author : iyeong-gyo
 * @package : optinoal
 * @since : 2023/03/23
 */
public class CountInfo {

  private String phone;
  private String adrs;

  public CountInfo(String phone, String adrs) {
    this.phone = phone;
    this.adrs = adrs;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getAdrs() {
    return adrs;
  }

  public void setAdrs(String adrs) {
    this.adrs = adrs;
  }
}
