package Model;

public class Juego {
    private int punt; //puntuacion del juego
    private Serpiente serp;
    private Tablero tab;
    private int lvl;
    private Random random;
    private Casilla comida;
    private Direccion dir = Direccion.Izq;

    public Juego(int lvl)
    {
        if(lvl >0 && lvl < 3)
            this.lvl = lvl;
        else
            this.lvl = 0;
        this.punt = 0;
        comida = null;
        this.serp = new Serpiente(1);
        this.tab = new Tablero(lvl);
    }

    public void crearComida() //testea esto bby
    {
        int x,y;
        x = random.random();
        y = random.random();
        comida = this.tab.getCas()[x][y];
        this.tab.getCas()[x][y].setComida(true);
    }

    public boolean nextRound() //suerte testeando esto que no sabes ni qe hace xd
    {
        serp.setDir(dir);
        Casilla cas = serp.moveCasilla();
        Casilla serpC = serp.getCuerpo().removeFirst();
        if(serpC.getPos().getX()<=this.tab.getMax()-10 && serpC.getPos().getY()>=10 && !serp.hasCasilla(serpC)) {
            if (serpC.equals(this.comida))
            {
                punt+=20;
                serp.addCola(cas);
                crearComida();
            }
            serp.getCuerpo().addFirst(serpC);
            return true;
        }
        return false;
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
    public void changeDirection(Direccion newDir){
        dir = newDir;
    }

    public Casilla getComida() {
        return comida;
    }

    public void setComida(Casilla comida) {
        this.comida = comida;
    }

    public Direccion getDir() {
        return dir;
    }

    public Random getRandom() {
        return random;
    }

    public void setRandom(Random random) {
        this.random = random;
    }

    public void setDir(Direccion dir) {
        this.dir = dir;
    }
}
