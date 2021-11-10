package Objects;

import java.util.Random;

public class Comida {
    private int x;
    private int y;
    private int contador;
    private int lvl;
    private Random rand;


    public Comida(int lvl)
    {
        this.rand = new Random();
        this.lvl=lvl;
        switch (lvl)
        {
            case 0: contador = 8;
                    x = rand.nextInt(20);
                    y = rand.nextInt(20);
                    break;
            case 1: contador = 5;
                    x = rand.nextInt(15);
                    y = rand.nextInt(15);
                    break;
            case 2: contador = 3;
                    x = rand.nextInt(10);
                    y = rand.nextInt(10);
                    break;
            default: contador = 10;
                    x = rand.nextInt(20);
                    y = rand.nextInt(20);
                    break;
        }
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

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public Random getRand() {
        return rand;
    }

    public void setRand(Random rand) {
        this.rand = rand;
    }
    //cada comida hace crecer a la serpiente en 1

}
