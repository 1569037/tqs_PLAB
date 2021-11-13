import Model.*;
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
        Assertions.assertNotNull(pos2);
        Assertions.assertNotNull(pos3);
        Assertions.assertNotNull(pos4);
        Assertions.assertNotNull(pos5);

        Assertions.assertTrue(TestCrearPos(pos1));
        Assertions.assertTrue(TestCrearPos(pos2));
        Assertions.assertTrue(TestCrearPos(pos3));
        Assertions.assertTrue(TestCrearPos(pos4));
        Assertions.assertTrue(TestCrearPos(pos5));
    }


    public boolean TestCrearPos(Posicion p)
    {
        return p.getX() >= 0 && p.getX() < p.getMax() && p.getY() >= 0 && p.getY() < p.getMax() && p.getMax() <=20 && p.getMax() >= 10;
    }

    @Test
    public void TestCrearCasilla()
    {
        Posicion pos = new Posicion(12,15,20);
        Casilla cas = new Casilla(pos);
        Assertions.assertEquals(pos,cas.getPos());
        Assertions.assertEquals(cas.getPunt(), 0);
        Assertions.assertNull(cas.getSerp());
        Assertions.assertFalse(cas.isComida());
    }
    @Test
    public void TestCrearSerpiente()
    {
        Serpiente serp = new Serpiente();
        Assertions.assertNotNull(serp);
        Assertions.assertEquals(serp.getLargo(), 3);
        Assertions.assertEquals(serp.getDir(),Direccion.Arriba);
    }


}
