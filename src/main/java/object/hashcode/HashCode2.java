package object.hashcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : iyeong-gyo
 * @package : object.hashcode
 * @since : 2023/03/20
 */
public class HashCode2 {

  public static void main(String[] args) {
    Map<Team, String> leaders = new HashMap<>();
    leaders.put(new Team("New York", "development"), "Anne");
    leaders.put(new Team("Boston", "development"), "Brian");
    leaders.put(new Team("Boston", "marketing"), "Charlie");

    Team myTeam = new Team("New York", "development");
    String myTeamLeader = leaders.get(myTeam);

    System.out.println("myTeamLeader = " + myTeamLeader);

  }
}

class Team {

  String city;
  String department;

  public Team(String city, String department) {
    this.city = city;
    this.department = department;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    Team team = (Team) o;

    if (city != null ? !city.equals(team.city) : team.city != null) {
      return false;
    }
    return department != null ? department.equals(team.department) : team.department == null;
  }

  @Override
  public int hashCode() {
    int result = city != null ? city.hashCode() : 0;
    result = 31 * result + (department != null ? department.hashCode() : 0);
    return result;
  }
}
