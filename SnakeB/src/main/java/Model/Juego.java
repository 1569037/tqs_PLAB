package Model;

public class Juego {
    private int punt; //puntuacion del juego
    private Serpiente serp;
    private Tablero tab;
    private int lvl;

    public Juego(int lvl)
    {

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

    public Tablero getTab() {
        return tab;
    }

    public void setTab(Tablero tab) {
        this.tab = tab;
    }

    public int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }
}
