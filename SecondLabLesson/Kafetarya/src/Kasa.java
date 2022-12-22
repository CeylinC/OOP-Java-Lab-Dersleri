public class Kasa {
    private double toplamSatisMiktari;
    private double gunlukKar;
    private double salataKar;
    private int tatliSayisi;
    private int salataSayisi = 0;

    public Kasa() {
        System.out.println("Hoşgeldin");
    }
    public Kasa(String isim) {
        System.out.println("Hoşgeldin "+isim);
    }
    
    public void hesapla(int secim, double fiyat){
        topSatHesapla(fiyat);
        gunlukKrHesapla(secim, fiyat);
    }
    private void topSatHesapla(double fiyat){
        toplamSatisMiktari += fiyat;
    }
    private void gunlukKrHesapla(int secim, double fiyat){
        double kar = 0;
        switch(secim){
            case 1: //Salata
                kar = fiyat * 0.3;
                salataSayisi++;
                salataKari(kar);
                break;
            case 2: //Hamburger
                kar = fiyat * 0.25;
                break;
            case 3: //Pizza
                kar = fiyat * 0.35;
                break;
            case 4: //Tatlı
                kar = fiyat * 0.2;
                tatliSayisiArttir();
                break;
        }
        gunlukKar += kar;
    }
    private void salataKari(double kar){
        salataKar += kar;
    }
    private void tatliSayisiArttir(){
        tatliSayisi++;
    }
    public void fisYazdir(){
        System.out.println("\n******************************"+
                "\nToplam Satış Miktarı: "+toplamSatisMiktari+
                "\nGünlük Kar Miktarı: "+gunlukKar+
                "\nOrtaLama Salata Karı: "+(salataKar / salataSayisi)+
                "\nTatlı Sayısı: "+tatliSayisi+
                "\n******************************");
    }

    
    
}
