package okul;
public class Makine extends Ogrenci{
    public Makine(int no, String isim, String soyisim) {
        setNo(no);
        setIsim(isim);
        setSoyisim(soyisim);
        setGirisTarihi();
        setBolum("makine");
    }
}
