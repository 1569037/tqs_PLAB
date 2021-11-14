package Model;
import java.util.*;
public class Tablero {

    private int max; //medida maxima del tablero
    private Casilla [][] cas;
    private int lvl;

    public Tablero(int lvl)
    {
        if(lvl>=0 && lvl <3)
            this.lvl = lvl;
        else
            this.lvl = 0;
        this.max = ((this.lvl*(-5)) +20);
        cas = new Casilla[max][max];
        for(int i=0; i<max; i++)
        {
            for(int j=0; j<max; j++)
            {
                Posicion pos = new Posicion(i,j,max);
                cas[i][j] = new Casilla(pos);
            }
        }
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public Casilla[][] getCas() {
        return cas;
    }

    public void setCas(Casilla[][] cas) {
        this.cas = cas;
    }

    public int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }
}
