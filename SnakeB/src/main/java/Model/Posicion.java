package Model;

public class Posicion {

    private int x;
    private int y;
    private int max;

    public Posicion(int x, int y, int max)
    {
        if(max!=20 && max!=15 && max!=10)
            this.max = 20;
        else
            this.max = max;
        if(x<this.max && x>= 0)
            this.x=x;
        else
            this.x=0;
        if(y<=this.max && y>=0)
            this.y=y;
        else
            this.y=0;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getMax() {
        return max;
    }
}
