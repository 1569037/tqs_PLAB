package Model;

public enum Direccion {
    Arriba(0),
    Abajo(1),
    Izq(2),
    Der(3);

    //de esto hacemos test????
    private final int direccion;

    public int direccion()
    {
        return direccion;
    }

    Direccion(int direccion){
        this.direccion=direccion;
    }
}
