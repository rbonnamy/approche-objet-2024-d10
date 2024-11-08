package demomock;

import demomock.cas1.Operation;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ListMock {

    @Test
    void testAdd(){
        List<String> liste = Mockito.mock(List.class);
        liste.add("coucou");

        assertEquals(1, liste.size()); // ASSERTION FAUSSE !!
    }

    @Test
    void testAdd2(){
        ArrayList<String> liste = Mockito.spy(ArrayList.class);
        liste.add("coucou");

        assertEquals(1, liste.size());
    }
}
