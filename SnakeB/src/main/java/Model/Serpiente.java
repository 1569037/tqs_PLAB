package Model;

import java.util.Iterator;
import java.util.LinkedList;

public class Serpiente {
    private Direccion dir;
    private int largo;
    private LinkedList<Casilla> cuerpo;
    public int max;

    public Serpiente(int lvl)
    {
        this.max = ((lvl*(-5)) +20);
        this.largo = 3;
        this.dir = Direccion.Izq;
        cuerpo = new LinkedList<> (); //esto hay que añadirlo en el test de la serpiente
        int x = this.max/2 -1;
        int y = x;
        for (int i=0; i<this.largo; i++)
        {
            this.addCola(new Casilla(new Posicion(x, y, max)));
            x+=1;
        }
    }

    public Direccion getDir() {
        return dir;
    }

    public void setDir(Direccion dir) {
        this.dir = dir;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public Casilla getCabeza(){
        return cuerpo.getFirst();
    }
    public Casilla getCola()
    {
        return cuerpo.getLast();
    }
    public void addCola(Casilla cas) //testea y revisa casilla por si hay que quitarle serpiente
    {
        this.cuerpo.addLast(cas);
    }
    public LinkedList<Casilla> getCuerpo() {
        return cuerpo;
    }

    public boolean hasCasilla(Casilla c) //testea esto anda bb
    {
        Iterator<Casilla> it = cuerpo.iterator();
        Posicion pos = new Posicion(0,0,max);
        Casilla cas = new Casilla(pos);
        while(it.hasNext()) {
            cas = it.next();
            if (cas.getPos().getX() == c.getPos().getX() && cas.getPos().getY() == cas.getPos().getY())
                return true;
        }
        return false;
    }
    public Casilla moveCasilla() //suerte testeando esta basura, te vas a morir
    {
        Casilla c;
        Posicion p;
        switch(dir)
        {
            case Arriba:
                 p = new Posicion(this.getCabeza().getPos().getX(),this.getCabeza().getPos().getY()-1, max);
                c = new Casilla(p);
                break;
            case Abajo:
                p = new Posicion(this.getCabeza().getPos().getX(),this.getCabeza().getPos().getY()+1, max);
                c = new Casilla(p);
                break;
            case Der:
                p = new Posicion(this.getCabeza().getPos().getX()+1,this.getCabeza().getPos().getY(), max);
                c = new Casilla(p);
                break;
            default:
                p = new Posicion(this.getCabeza().getPos().getX()-1,this.getCabeza().getPos().getY(), max);
                c = new Casilla(p);
                break;
        }
        Casilla cas = this.cuerpo.getLast();
        this.cuerpo.addFirst(c);
        this.cuerpo.removeLast();
        return cas;
    }

    public int getMax() {
        return max;
    }

}
