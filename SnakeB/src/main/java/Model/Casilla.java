package Model;

public class Casilla {

    private Posicion pos;
    private boolean comida;
    private Serpiente serp;
    public Casilla(Posicion pos)
    {
        this.pos = pos;
        this.comida=false;
        this.serp = null;
    }

    public Posicion getPos() {
        return pos;
    }

    public boolean isComida() {
        return comida;
    }

    public void setComida(boolean comida) {
        this.comida = comida;
    }

    public Serpiente getSerp() {
        return serp;
    }

    public void setSerp(Serpiente serp) {
        this.serp = serp;
    }
}
