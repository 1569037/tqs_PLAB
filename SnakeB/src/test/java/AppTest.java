import Model.*;
import junit.framework.TestCase;
import org.junit.jupiter.api.Test;
import static junit.framework.Assert.*;

public class AppTest{

    @Test
    public void TestCrearPosicion() //pairwise
    {

        //proba caixa negra pairwise
        int x = 11;
        int y = 19;
        int max = 15;
        Posicion pos1 = new Posicion(11,19, 15); //maxInterior - xInterior - yFront
        Posicion pos2 = new Posicion(19, 13, 20); //maxFront - xFront - yInterior
        Posicion pos3 = new Posicion(-1, 23, 19); //maxLim - xInvalid - yFora
        Posicion pos4 = new Posicion(18, -1, 31); //maxFora- xLim - yInvalid
        Posicion pos5 = new Posicion(31, 18, -1); //maxInvalid - xFora - yLim

        assertNull(pos1);
        assertEquals(pos1.getX(),x);
        assertEquals(pos1.getY(),y);
        assertEquals(pos1.getMax(), max);

        TestCrearPos(pos1.getX(),pos1.getY(), pos1.getMax());
        TestCrearPos(pos2.getX(),pos2.getY(), pos2.getMax());
        TestCrearPos(pos3.getX(),pos3.getY(), pos3.getMax());
        TestCrearPos(pos4.getX(),pos4.getY(), pos4.getMax());
        TestCrearPos(pos5.getX(),pos5.getY(), pos5.getMax());

    }
    @Test
    public void TestCrearPos(int x, int y, int max)
    {
        assertFalse("El valor x no es correcto", x< 0 || x>= max);
        assertFalse("El valor y no es correcto", y < 0 || y >= max);
        assertFalse("El valor de max no es correcto", max>20 || max<10);
    }


    @Test
    public void TestCreacionComida()
    {
        //aqui tenemos que saber el lvl porque si no no tiene sentido
        //segun el lvl mide un tamaño el tablero u otro
    }

}
