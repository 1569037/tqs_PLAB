import Objects.*;
import junit.framework.TestCase;
import org.junit.jupiter.api.Test;


public class AppTest extends TestCase {
    @Test
    public void TestCreacionTablero()
    {
        int lvl=0;
        Tablero t = new Tablero(lvl);
        assertEquals(t.getLvl(), 0);
        assertEquals(t.getMax(),20);
        //queda la comprobacion de la matriz y la de otros lvls
    }
    @Test
    public void TestCreacionPosicion()
    {
        int x = 0;
        int y = 0;
        int lvl=0;
        Posicion p = new Posicion(x,y,lvl);
        assertNull(p.getS());
        assertNull(p.getComida());
        assertEquals(p.getX(), x);
        assertEquals(p.getY(),y);
        assertEquals(p.isOcupada(), false);
    }
    @Test
    public void TestCrearComida()
    {
        int lvl=0;
        Comida c = new Comida(lvl);
        assertEquals(c.getLvl(), 0);
        assertNotNull(c.getX());
        assertNotNull(c.getY());
        assertEquals(c.getContador(), 8);

        int lvl1=2;
        Comida c1 = new Comida(lvl1);
        assertEquals(c1.getLvl(), 2);
        assertNotNull(c1.getX());
        assertNotNull(c1.getY());
        assertEquals(c1.getContador(), 3);
    }
    @Test
    public void TestHayComida()
    {

    }
}
