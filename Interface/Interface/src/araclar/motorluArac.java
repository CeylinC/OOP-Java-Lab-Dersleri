package araclar;
public abstract class motorluArac{
    public int beygirGucu;
    public benzin b;
    public motor mm;
    
    public motorluArac() {
        arizaKontrol();
    }

    public void motoCalistir(int a) {
        System.out.println("s");
    }
    
    public boolean arizaKontrol(){
        System.out.println("Arıza yok");
        System.out.println("arizaKontrol() yordamı çalıştı");
        return true;
    }
    
}
