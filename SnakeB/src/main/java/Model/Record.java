package Model;

public class Record {
    private int record1;
    private int record2;
    private int record3;

    public Record()
    {

    }

    public int getRecord1() {
        return record1;
    }

    public void setRecord1(int record1) {
        this.record3 = this.record2;
        this.record2=this.record1;
        this.record1 = record1;
    }

    public int getRecord2() {
        return record2;
    }

    public void setRecord2(int record2) {
        this.record3=this.record2;
        this.record2 = record2;
    }

    public int getRecord3() {
        return record3;
    }

    public void setRecord3(int record3) {
        this.record3 = record3;
    }
}
