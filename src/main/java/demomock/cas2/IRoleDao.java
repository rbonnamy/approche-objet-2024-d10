package demomock.cas2;

import java.util.List;

public interface IRoleDao {
    List<Role> findRoles(String user);
}
