package okul;

public class Enerji extends Ogrenci{
    public Enerji(int no, String isim, String soyisim) {
        setNo(no);
        setIsim(isim);
        setSoyisim(soyisim);
        setGirisTarihi();
        setBolum("enerji");
    }
}
