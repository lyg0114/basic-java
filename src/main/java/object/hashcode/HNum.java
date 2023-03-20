package object.hashcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : iyeong-gyo
 * @package : object
 * @since : 2023/03/18
 */
public class HNum {

  public static void main(String[] args) {
    Map<User, User> users = new HashMap<>();
    User user1 = new User(1L, "John", "john@domain.com");
    User user2 = new User(2L, "Jennifer", "jennifer@domain.com");
    User user3 = new User(3L, "Mary", "mary@domain.com");

    users.put(user1, user1);
    users.put(user2, user2);
    users.put(user3, user3);
    if (users.containsKey(user1)) {
      System.out.print("User found in the collection");
    }
  }
}

class User {

  Long id;
  String name;
  String email;

  public User(Long id, String name, String email) {
    this.id = id;
    this.name = name;
    this.email = email;
  }

  @Override
  public int hashCode() {
    int result = id != null ? id.hashCode() : 0;
    result = 31 * result + (name != null ? name.hashCode() : 0);
    result = 31 * result + (email != null ? email.hashCode() : 0);
    System.out.println("result = " + result);
    return result;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    User user = (User) o;

    if (id != null ? !id.equals(user.id) : user.id != null) {
      return false;
    }
    if (name != null ? !name.equals(user.name) : user.name != null) {
      return false;
    }
    return email != null ? email.equals(user.email) : user.email == null;
  }

}

