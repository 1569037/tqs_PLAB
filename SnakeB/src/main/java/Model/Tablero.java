package Model;
import java.util.*;
public class Tablero {

    private int max; //medida maxima del tablero
    private Posicion [][] casillas;

    public Tablero(int lvl)
    {
        switch (lvl){
            case 0: this.max = 20;
                    break;
            case 1: this.max = 15;
                    break;
            case 2: this.max = 10;
                    break;
            default: this.max = 20;
                     break;
        }
        casillas = new Posicion[max][max];
    }



}
