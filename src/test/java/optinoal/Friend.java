package optinoal;

/**
 * @author : iyeong-gyo
 * @package : optinoal
 * @since : 2023/03/23
 */
public class Friend {

  private String name;
  private Company cmp;

  public Friend(String name, Company cmp) {
    this.name = name;
    this.cmp = cmp;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Company getCmp() {
    return cmp;
  }

  public void setCmp(Company cmp) {
    this.cmp = cmp;
  }
}
