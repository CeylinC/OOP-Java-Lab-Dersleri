package gps;
public class Uydu {
    public Uydu(){
        System.out.println("Hata! GPS alıcısına bağlantı bulunmamaktadır.");
    }
    public Uydu(GPSAlicisi gA){
        System.out.println("GPS Alıcısına bağlandı.");
        gA.uydudanVeriAl(veriTuruSec());
    }
    private int veriTuruSec(){
        return (int)((Math.random()*3)+1);
    }
}
