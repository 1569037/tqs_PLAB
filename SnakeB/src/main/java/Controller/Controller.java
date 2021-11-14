package Controller;
import Model.*;
import Vista.VTablero;

public class Controller {
    private Juego game;
    private Direccion dir;
    private Posicion pos;
    private Record rec;
    private Serpiente ser;
    private Tablero tab;
    private VTablero window;

    public Controller(int lvl){
        if (lvl<0 || lvl>2 )
            lvl = 0;
        game = new Juego(lvl);
        tab = game.getTab();
        ser = game.getSerp();
        rec = Record.getInstance();
        window = new VTablero(); //esto tendremos que hacerlo
    }

    public Juego getGame() {
        return game;
    }

    public void setGame(Juego game) {
        this.game = game;
    }

    public Direccion getDir() {
        return dir;
    }

    public void setDir(Direccion dir) {
        this.dir = dir;
    }
    public Posicion getPos() {
        return pos;
    }

    public void setPos(Posicion pos) {
        this.pos = pos;
    }

    public Record getRec() {
        return rec;
    }

    public void setRec(Record rec) {
        this.rec = rec;
    }

    public Serpiente getSer() {
        return ser;
    }

    public void setSer(Serpiente ser) {
        this.ser = ser;
    }

    public Tablero getTab() {
        return tab;
    }

    public void setTab(Tablero tab) {
        this.tab = tab;
    }

    public VTablero getWindow() {
        return window;
    }

    public void setWindow(VTablero window) {
        this.window = window;
    }
}
