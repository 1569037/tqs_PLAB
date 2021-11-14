package Controller;
import Model.*;
import Vista.VTablero;

public class Controller {
    private Juego game;
    private Casilla cas;
    private Direccion dir;
    private Posicion pos;
    private Record rec;
    private Serpiente ser;
    private Tablero tab;
    private VTablero window;

    public Controller(){

    }

    public Juego getGame() {
        return game;
    }

    public void setGame(Juego game) {
        this.game = game;
    }

    public Casilla getCas() {
        return cas;
    }

    public void setCas(Casilla cas) {
        this.cas = cas;
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
