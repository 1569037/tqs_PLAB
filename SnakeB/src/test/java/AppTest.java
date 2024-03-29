import Model.*;
import Controller.*;
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
    @Test
    public void TestCrearCasilla()
    {
        Posicion pos = new Posicion(12,15,20);
        Casilla cas = new Casilla(pos);
        Assertions.assertEquals(pos,cas.getPos());
        Assertions.assertNull(cas.getSerp());
        Assertions.assertFalse(cas.isComida());
    }
    @Test
    public void TestCrearSerpiente()
    {
        Serpiente serp = new Serpiente(1);
        Assertions.assertNotNull(serp);
        Assertions.assertEquals(serp.getDir(), Direccion.Izq);
        Assertions.assertNotNull(serp.getCuerpo());
        Assertions.assertTrue(serp.getCuerpo().contains(serp.getCabeza()));
        Assertions.assertTrue(serp.getCuerpo().contains(serp.getCola()));
        Assertions.assertEquals(serp.getMax(),(1*(-5)+20));
        Assertions.assertEquals(serp.getLargo(), 3);
    }
    @Test
    public void TestAddColaSerp()
    {
        Casilla c = new Casilla(new Posicion(13,13,20));
        Serpiente s = new Serpiente(0);
        s.addCola(c);
        Assertions.assertEquals(c,s.getCola());
    }
    @Test
    public void TestHasCasillaSerp()
    {
        Casilla c = new Casilla(new Posicion(13,13,20));
        Casilla casNo = new Casilla(new Posicion(0,0,20));
        Serpiente s = new Serpiente(0);
        s.addCola(c);
        Assertions.assertTrue(s.hasCasilla(c));
        Assertions.assertFalse(s.hasCasilla(casNo));
    }


    @Test
    public void TestCrearTablero()
    {
        Tablero tFacil = new Tablero(0);
        Tablero tIntermedio = new Tablero(1);
        Tablero tDificil = new Tablero(2);
        Tablero tImposible = new Tablero(3);

        Assertions.assertTrue(crearTablero(tFacil));
        Assertions.assertTrue(crearTablero(tIntermedio));
        Assertions.assertTrue(crearTablero(tDificil));
        Assertions.assertTrue(crearTablero(tImposible));
    }
   @Test
   public void TestCrearRecord()
   {
       Record r = Record.getInstance();
       Assertions.assertNotNull(r);
       Assertions.assertEquals(r.getRecord1(),0);
       Assertions.assertEquals(r.getRecord2(), 0);
       Assertions.assertEquals(r.getRecord3(), 0);

       r.setRecord1(4);
       r.setRecord2(3);
       r.setRecord1(5);

       Assertions.assertEquals(r.getRecord1(), 5);
       Assertions.assertEquals(r.getRecord2(), 4);
       Assertions.assertEquals(r.getRecord3(), 3);
   }

   @Test
   public void TestCrearJuego()
   {
        Juego jug0 = new Juego(0);
        Juego jug1 = new Juego(1);
        Juego jug2 = new Juego(2);
        Juego jug3 = new Juego(3);

        Assertions.assertTrue(CrearJuego(jug0));
        Assertions.assertTrue(CrearJuego(jug1));
        Assertions.assertTrue(CrearJuego(jug2));
        Assertions.assertTrue(CrearJuego(jug3));
   }
   @Test
   public void TestCrearComida()
   {
       MockRandom r = new MockRandom(0);
       Juego j = new Juego(0);
       j.setRandom(r);
       j.crearComida();
       Assertions.assertEquals(j.getComida().getPos().getX(),13);
       Assertions.assertEquals(j.getComida().getPos().getX(),13);
       r.setId(1);
       j.crearComida();
       Assertions.assertEquals(j.getComida().getPos().getX(),10);
       Assertions.assertEquals(j.getComida().getPos().getX(),10);
   }


   @Test
   public void TestNextRound()
   {
       Juego j = new Juego(0);
       Assertions.assertTrue(j.nextRound());
   }



   /**
   @Test
   public void TestCrearController()
   {
       Controller con = new Controller(0);
       Assertions.assertNotNull(con.getGame());
       Assertions.assertNotNull(con.getDir());
       Assertions.assertNotNull(con.getRec());
       Assertions.assertNotNull(con.getSer());
       Assertions.assertNotNull(con.getPos());
       Assertions.assertNotNull(con.getTab());
       Assertions.assertNotNull(con.getWindow());
       Assertions.assertTrue(con.isRunning());
       Assertions.assertEquals((con.getTab().getMax()/2)-1, con.getPos().getX());
       Assertions.assertEquals((con.getTab().getMax()/2)-1, con.getPos().getY());
   }

*/
/**
   @Test
   public void TestMoverSerpiente()
   {
       Controller c = new Controller(0);
       c.moverSerpiente();
   }
**/

   public boolean CrearJuego(Juego j)
   {
       return (j.getComida()==null && j.getPunt()==0 && j.getSerp()!=null && j.getTab() != null && j.getLvl()>=0 && j.getLvl()<3);
   }

    public boolean recorrerArray(Tablero t)
    {
        Casilla [][] c = t.getCas();
        return (t.getCas() != null && c[0].length == t.getMax() && c.length==t.getMax());
    }
    public boolean crearTablero(Tablero t )
    {
        int tam = ((t.getLvl()*(-5)) + 20);
        return (tam==t.getMax() && t.getLvl()>=0 && t.getLvl()<3 && recorrerArray(t));
    }

    public boolean TestCrearPos(Posicion p)
    {
        return p.getX() >= 0 && p.getX() < p.getMax() && p.getY() >= 0 && p.getY() < p.getMax() && p.getMax() <=20 && p.getMax() >= 10;
    }
}
