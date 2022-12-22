package gps;
public class Test {
    public static void main(String[] args) {
        GPSAlicisi gA;
        while(true){
            gA = new GPSAlicisi();
            if(gA.aktifMi){
                break;
            }
        }
        Uydu uydu1 = new Uydu();
        Uydu uydu2 = new Uydu(gA);
        
        GPSProgrami program = new GPSProgrami(gA);
    }
    
}
