package optinoal;

/**
 * @author : iyeong-gyo
 * @package : optinoal
 * @since : 2023/03/23
 */
public class Company {

  String cmpName;
  CountInfo info;

  public Company(String cmpName, CountInfo info) {
    this.cmpName = cmpName;
    this.info = info;
  }

  public String getCmpName() {
    return cmpName;
  }

  public void setCmpName(String cmpName) {
    this.cmpName = cmpName;
  }

  public CountInfo getInfo() {
    return info;
  }

  public void setInfo(CountInfo info) {
    this.info = info;
  }
}
