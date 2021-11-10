package Objects;

public class Posicion {
    private boolean ocupada;
    private int x;
    private int y;
    private Serpiente s;
    private Comida comida;
    private int lvl;

    public Posicion(int x, int y, int lvl)
    {
        this.lvl = lvl;
        this.x = x;
        this.y= y;
        this.s = null;
        this.ocupada=false;
        this.comida = null;
    }

    public void generarComida()
    {
        Comida c = new Comida(this.lvl);
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Comida getComida() {
        return comida;
    }

    public void setComida(Comida comida) {
        this.comida = comida;
    }

    public Serpiente getS() {
        return s;
    }

    public void setS(Serpiente s) {
        this.s = s;
    }
}
