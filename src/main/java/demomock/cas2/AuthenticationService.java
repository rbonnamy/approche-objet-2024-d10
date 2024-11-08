package demomock.cas2;

import java.io.IOException;
import java.net.*;
import java.util.List;

public class AuthenticationService {

    private IRoleDao roleDao;

    public List<Role> connect(String user, String pwd) throws Exception {
        boolean authenticate = connectMicrosoftActiveDirectory(user, pwd);
        if (authenticate){
            List<Role> roles = roleDao.findRoles(user);
            return roles;
        }
        throw new AuthentificationException("Connexion non autorisée.");
    }

    boolean connectMicrosoftActiveDirectory(String user, String pwd) throws Exception {
        // Accès Microsoft AD ici
        URI uri = new URI("https://www.sid-diginamic.fr/login");
        URL url = uri.toURL();
        url.openConnection();
        Object content = url.getContent();
        System.out.println("je me suis connecté :"+content);
        return false;
    }

    /**
     * Getter
     *
     * @return roleDao
     */
    public IRoleDao getRoleDao() {
        return roleDao;
    }

    /**
     * Setter
     *
     * @param roleDao roleDao
     */
    public void setRoleDao(IRoleDao roleDao) {
        this.roleDao = roleDao;
    }
}
