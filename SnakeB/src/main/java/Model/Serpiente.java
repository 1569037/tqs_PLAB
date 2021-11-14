package Model;

public class Serpiente {
    private Direccion dir;
    private int largo;
    private Casilla cas;

    public Serpiente()
    {
        this.largo = 3;
        this.dir = Direccion.Arriba;
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
}
