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

        assertFalse("El valor x no es cor   recto", pos1.getX()< 0 || pos1.getX()>=pos1.getMax());
        assertFalse("El valor y no es correcto", pos1.getY()< 0 || pos1.getY()>=pos1.getMax());
        assertFalse("El valor de max no es correcto", pos1.getMax()!=10 || pos1.getMax()!=15 || pos1.getMax()!= 20);

    }



    @Test
    public void TestCreacionComida()
    {
        //aqui tenemos que saber el lvl porque si no no tiene sentido
        //segun el lvl mide un tamaño el tablero u otro
    }

}
