package tubespbo;

public class Programmer extends Orang {
    public Programmer(String id, String nama) {
        super(id, nama);
    }
    
    public void updateProgress(Tugas t,String progress){
        t.setProgress(progress);
    }

}