package Model;

public class Casilla {

    private Posicion pos;
    private boolean comida;
    private int punt;
    private Serpiente serp;
    public Casilla(Posicion pos)
    {
        this.pos = pos;
        this.comida=false;
        this.punt = 0;
        this.serp = null;
    }

    public Posicion getPos() {
        return pos;
    }

    public void setPos(Posicion pos) {
        this.pos = pos;
    }

    public boolean isComida() {
        return comida;
    }

    public void setComida(boolean comida) {
        this.comida = comida;
    }

    public int getPunt() {
        return punt;
    }

    public void setPunt(int punt) {
        this.punt = punt;
    }

    public Serpiente getSerp() {
        return serp;
    }

    public void setSerp(Serpiente serp) {
        this.serp = serp;
    }
}
