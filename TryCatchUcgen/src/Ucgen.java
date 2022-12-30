public class Ucgen {
    private int a, b, c;
    private double u;
    public Ucgen(int a, int b, int c) throws Hata{
        if(a<0 || b<0 || c<0){
            throw new Hata("Kenarı negatif şekil olamaz.");
        }
        if(!(a+b > c) || !(a-b < c)){
            throw new Hata("Üçgen oluşturulamaz.");
        }
        this.a = a;
        this.b = b;
        this.c = c;
        this.u = (a + b + c) / 2.0;
    }
    public double alanHesapla(){
        return Math.sqrt(u*(u-a)*(u-b)*(u-c));
    }
    public double cevreHesapla(){
        return 2*u;
    }
}
