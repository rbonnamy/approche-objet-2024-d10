package demomock.cas2;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AuthenticationServiceTest {

    @Test
    void connect() throws Exception {
        IRoleDao dao = Mockito.mock(IRoleDao.class);
        List<Role> roles = new ArrayList<>();
        roles.add(new Role("ADMIN"));
        Mockito.when(dao.findRoles(Mockito.anyString())).thenReturn(roles);

        AuthenticationService service = Mockito.spy(AuthenticationService.class);
        service.setRoleDao(dao);
        //Mockito.when(service.connectMicrosoftActiveDirectory(Mockito.anyString(), Mockito.anyString())).thenReturn(true);
        Mockito.doReturn(true).when(service.connectMicrosoftActiveDirectory(Mockito.anyString(), Mockito.anyString()));
        List<Role> rolesRetournees = service.connect("root", "");
        assertTrue(rolesRetournees.size()==1);
    }
}