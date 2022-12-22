package okul;

import java.util.Date;

public abstract class Ogrenci {
    private int no;
    private String isim;
    private String soyisim;
    private Date girisTarihi;
    private static String fakülte = "Hasan Ferdi Turgutlu Teknoloji Fakültesi";
    private String bolum;

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public Date getGirişTarihi() {
        return girisTarihi;
    }
    
    public void setGirisTarihi() {
        girisTarihi = new Date();
    }

    public static String getFakülte() {
        return fakülte;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }
    
    @Override
    public String toString() {
        return "\n********************" +
                "\nÖgrenci Numarası : " + no +
                "\nÖgrenci İsmi : " + isim +
                "\nÖğrenci Soyismi : " + soyisim +
                "\nÖğrenci Giriş Tarihi : " + girisTarihi +
                "\nÖgrenci Fakülte İsmi : " + fakülte +
                "\nÖğrenci Bölümü : " + bolum +
                "\n********************";
    }
    
}
