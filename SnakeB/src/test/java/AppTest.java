import Model.Posicion;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class AppTest{

    @Test
    public void TestCrearPosicion() //pairwise
    {
        //proba caixa negra pairwise
        Posicion pos1 = new Posicion(11,19, 15); //maxInterior - xInterior - yFront
        Posicion pos2 = new Posicion(19, 13, 20); //maxFront - xFront - yInterior
        Posicion pos3 = new Posicion(-1, 23, 19); //maxLim - xInvalid - yFora
        Posicion pos4 = new Posicion(18, -1, 31); //maxFora- xLim - yInvalid
        Posicion pos5 = new Posicion(31, 18, -1); //maxInvalid - xFora - yLim

        Assertions.assertNotNull(pos1);


        Assertions.assertTrue(TestCrearPos(pos1));
        Assertions.assertTrue(TestCrearPos(pos2));
        Assertions.assertFalse(TestCrearPos(pos3));
        Assertions.assertFalse(TestCrearPos(pos4));
        Assertions.assertFalse(TestCrearPos(pos5));
    }


    public boolean TestCrearPos(Posicion p)
    {
        return p.getX() < 0 || p.getX() >= p.getMax() || p.getY() < 0 || p.getY() >= p.getMax() || p.getMax() > 20 || p.getMax() < 10;
    }

    @Test
    public void TestCreacionComida()
    {
        //aqui tenemos que saber el lvl porque si no no tiene sentido
        //segun el lvl mide un tamaño el tablero u otro
    }

}
