package Objects;

public class Tablero {
    private Posicion matriz[][];
    private int max;
    private int lvl;

    public Tablero(int lvl){
        this.max=20;
        if(lvl == 0)
            this.max=20;
        else if(lvl ==1)
            this.max=15;
        else if(lvl ==2)
            this.max=10;
        this.matriz = new Posicion[this.max][this.max];
    }

    public Posicion[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(Posicion[][] matriz) {
        this.matriz = matriz;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

}
