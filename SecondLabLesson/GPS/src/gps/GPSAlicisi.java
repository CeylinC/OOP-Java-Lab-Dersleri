package gps;
public class GPSAlicisi {
    private int sicaklik;
    public boolean aktifMi;
    private String cumle;
    
    public GPSAlicisi(){
        if(sicaklikOlc()>5 && sicaklikOlc()<40){
            aktifMi = true;
        }
        else{
            aktifMi = false;
        }
    }
    private int sicaklikOlc(){
        sicaklik = (int)((Math.random()*38)+2);
        return sicaklik;
    }
    public void uydudanVeriAl(int cumleCesidi){
        switch(cumleCesidi){
            case 1:
                cumle = "$GPGGA,N,40,30,E";
                break;
            case 2:
                cumle = "$GPRMC,41,N,E,31";
                break;
            case 3:
                cumle = "$GPGLL,N,E,42,32";
                break;
            default:
                System.out.println("Geçersiz veri!");
        }
    }
    public String programaVeriGonder(){
        System.out.println(cumle);
        return cumle;
    }
}
