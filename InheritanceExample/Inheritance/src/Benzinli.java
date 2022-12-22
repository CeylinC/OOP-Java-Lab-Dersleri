public class Benzinli extends Araba{
    public int motorHacmi;
    public int yakıtDeposu;
    public int silindirSayisi;
    
        public void goruntule(){
        System.out.println("Menzil : "+motorHacmi+
                "\nSarj Suresi : "+yakıtDeposu+
                "\nSilindir Sayısı : "+silindirSayisi+
                "\nArabanın Rengi : "+renk+
                "\nArabanın Teker Boyutu : "+getTekerBoyutu()+
                "\nArabanın Beygiri : "+getBeygir()+
                "\nArabanın Kasa Tipi : "+kasaTipi);
    }

    public Benzinli(int motorHacmi, int yakıtDeposu, int silindirSayisi, String renk, int tekerBoyutu, int beygir, String kasaTipi) {
        super(renk, tekerBoyutu, beygir, kasaTipi);
        this.motorHacmi = motorHacmi;
        this.yakıtDeposu = yakıtDeposu;
        this.silindirSayisi = silindirSayisi;
    }
}
