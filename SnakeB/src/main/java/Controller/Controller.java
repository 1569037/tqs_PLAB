package Controller;
import Model.*;
import Vista.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Controller implements KeyListener, ActionListener {
    private Juego game;
    private Direccion dir;
    private Posicion pos;
    private Record rec;
    private Serpiente ser;
    private Tablero tab;
    private boolean running;
    private EasyModeView window;

    public boolean isRunning() {
        return running;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }

    public Controller(int lvl){
        if (lvl<0 || lvl>2 )
            lvl = 0;
        game = new Juego(lvl);
        tab = game.getTab();
        running = true;
        ser = game.getSerp();
        rec = Record.getInstance();
        dir = ser.getDir();
        int x = (tab.getMax()/2)-1;
        pos = new Posicion(x,x,tab.getMax());
        window = new EasyModeView(this);//esto tendremos que hacerlo cuando hagamos la vista xd
        try {
            window.getFrame().setVisible(true);
            window.getSerpiente().setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
        window.getNuevoJuego().addActionListener(this);
        window.getRecord().addActionListener(this);
        run(); // pa lante
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }
    @Override
    public void keyPressed(KeyEvent e) { //hay que mirar esto como testearlo con mock class
        int keyCode = e.getKeyCode();
        switch(keyCode) {
            case KeyEvent.VK_UP:
                game.changeDirection(Direccion.Arriba);
                break;
            case KeyEvent.VK_DOWN:
                game.changeDirection(Direccion.Abajo);
                break;
            case KeyEvent.VK_LEFT:
                game.changeDirection(Direccion.Izq);
                break;
            case KeyEvent.VK_RIGHT:
                game.changeDirection(Direccion.Der);
                break;
        }
        acabado(game.nextRound());
        window.draw();
    }
    public void selectLvl(ActionEvent e)
    {
        if(e.getSource() == window.getNuevoJuego()) {
            //this.window.dispose();
            Controller c = new Controller(0);
        if(e.getSource() == window.getRecord()){
            //mostrar los records
        }
        }


    }
    public void acabado(boolean a)
    {
        if(!a) {
            rec.leerFichero(game.getPunt());
            this.running = false;
            JOptionPane.showMessageDialog(null,"Juego terminado");
            System.exit(0);

            //enseñar mensaje de perder
        }
    }

    public void run(){
        while(running)
        {
            try{
                Thread.sleep(200);
                acabado(game.nextRound());
                window.draw();
            }catch (InterruptedException e)
            {
                break;
            }
        }
        running = false;
    }
    @Override
    public void keyReleased(KeyEvent e) {

    }
    public void moverSerpiente()
    {

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

    public EasyModeView getWindow() {
        return window;
    }

    public void setWindow(EasyModeView window) {
        this.window = window;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
