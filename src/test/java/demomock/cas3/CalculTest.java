package demomock.cas3;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class CalculTest {

    @Test
    void traitement() {
        Calcul calcul = Mockito.spy(Calcul.class);
        calcul.traitement(10);

        Mockito.verify(calcul).incrementePos();
    }
}