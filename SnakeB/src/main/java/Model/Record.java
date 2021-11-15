package Model;

import java.io.*;

public class Record{
    private int record1;
    private int record2;
    private int record3;
    private File f;
    private FileReader fr;
    private FileWriter fw;
    private PrintWriter pw;
    private static Record miRecord;

    public static Record getInstance() {

        if(miRecord == null)
            miRecord = new Record();
        return miRecord;
    }

    private Record()
    {
        record1 = 0;
        record2 = 0;
        record3 = 0;
        fr = null;
        fw = null;
        pw = null;
        f = new File("C:/Users/evely/OneDrive/Escritorio/Ingenieria/Tercero/TQS/Practicas/SnakeB",
                "fichero.txt");
        try {
            if (f.createNewFile())
                System.out.println("El fichero se ha creado correctamente");
            else
                System.out.println("No ha podido ser creado el fichero");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    public void leerFichero(int r)
    {
        try {
            fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String linea;
            while((linea = br.readLine())!=null)
            {
                int rec = Integer.parseInt(linea);
                if(rec > record1)
                    setRecord1(rec);
                else if (rec > record2)
                    setRecord2(rec);
                else if (rec> record3)
                    setRecord3(rec);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            try{
                if( null != fr ){
                    fr.close();
                }
            }catch (Exception e2){
                e2.printStackTrace();
            }
        }
        escribirFichero();
    }
    public void escribirFichero()
    {
        try{
            fw = new FileWriter(f);
            pw = new PrintWriter(fw);
            pw.println(record1);
            pw.println(record2);
            pw.println(record3);
        }catch (Exception e){
            e.printStackTrace();
        }finally{
            try{
                if(null!=fw)
                    fw.close();
            }catch (Exception e2){
                e2.printStackTrace();
            }
        }
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
