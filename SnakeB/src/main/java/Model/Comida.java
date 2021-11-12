package Model;

public class Comida {

    private Posicion pos;

    public Comida(int x, int y)
    {
        //ponemos la comida en una posicion random y comprovamos que no se salga del tablero
    }

    public Posicion getPos() {
        return pos;
    }

    public void setPos(Posicion pos) {
        this.pos = pos;
    }
}
