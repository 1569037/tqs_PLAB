package Model;
import Model.Juego;

public class MockRandom extends Random{
    int id;

    public MockRandom(int id) {
        super();
        this.id = id;
    }

    @Override
    public int random()
    {
        int c;
        switch (id){
            case 0:
               c= 13;
                break;
            default:
                 c = 10;
                break;
        }
        return c;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
