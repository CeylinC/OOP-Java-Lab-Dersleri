package araclar;
public class bisiklet extends ikiTekerlekli implements arac{
    public String model;

    @Override
    public void solaSagaDon() {
        System.out.println("solaSagaDon() yordamı çalıştı");
    }

    @Override
    public void sur() {
        System.out.println("sur() yordamı çalıştı");
    }
}
