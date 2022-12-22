public class Elektrikli extends Araba{
    public int menzil;
    public int sarjSuresi;

    public Elektrikli(int menzil, int sarjSuresi, String renk, int tekerBoyutu, int beygir, String kasaTipi) {
        super(renk, tekerBoyutu, beygir, kasaTipi);
        this.menzil = menzil;
        this.sarjSuresi = sarjSuresi;
    }
    
    public void goruntule(){
        System.out.println("Menzil : "+menzil+
                "\nSarj Suresi : "+sarjSuresi+
                "\nArabanın Rengi : "+renk+
                "\nArabanın Teker Boyutu : "+getTekerBoyutu()+
                "\nArabanın Beygiri : "+getBeygir()+
                "\nArabanın Kasa Tipi : "+kasaTipi);
    }
}
