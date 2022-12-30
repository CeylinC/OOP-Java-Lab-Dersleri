public class Hata extends Exception {

    public Hata(String mesaj) {
        super("[HATA] "+mesaj);
    }
    
}
