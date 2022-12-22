package araclar;
public class motorsiklet extends motorluArac implements arac, suratMotoru {
    public void sur(int a){
        System.out.println(a + " ile gidiyor");
        System.out.println("sur(int a) yordamı çalıştı");
    }
    public void motoCalistir(){
        System.out.println("Motosiklet çalıştırılıyor...");
        System.out.println("motorCalistir() yordamı çalıştı");
    }

    @Override
    public void solaSagaDon() {
        System.out.println("solaSagaDon() yordamı çalıştı");
    }

    @Override
    public void sur() {
        System.out.println("sur() yordamı çalıştı");
    }

    @Override
    public void cokHizYap() {
        System.out.println("cokHizYap() yordamı çalıştı");
    }
}
