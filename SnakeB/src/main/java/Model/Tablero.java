package Model;
import java.util.*;
public class Tablero {

    private int max; //medida maxima del tablero
    private List<List<Casilla>> cas;
    private int lvl;

    public Tablero(int lvl)
    {

    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public List<List<Casilla>> getCas() {
        return cas;
    }

    public void setCas(List<List<Casilla>> cas) {
        this.cas = cas;
    }

    public int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }
}
