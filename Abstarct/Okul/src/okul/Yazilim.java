package okul;
 public class Yazilim extends Ogrenci{
    public Yazilim(int no, String isim, String soyisim) {
        setNo(no);
        setIsim(isim);
        setSoyisim(soyisim);
        setGirisTarihi();
        setBolum("yazilim");
    }
}
