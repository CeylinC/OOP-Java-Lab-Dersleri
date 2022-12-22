public class Araba {
    public String renk;
    private int tekerBoyutu;
    private int beygir;
    public String kasaTipi;

    public Araba(String renk, int tekerBoyutu, int beygir, String kasaTipi) {
        this.renk = renk;
        this.tekerBoyutu = tekerBoyutu;
        this.beygir = beygir;
        this.kasaTipi = kasaTipi;
    }

    public int getTekerBoyutu() {
        return tekerBoyutu;
    }

    public void setTekerBoyutu(int tekerBoyutu) {
        this.tekerBoyutu = tekerBoyutu;
    }

    public int getBeygir() {
        return beygir;
    }

    public void setBeygir(int beygir) {
        this.beygir = beygir;
    }
    
    
}
