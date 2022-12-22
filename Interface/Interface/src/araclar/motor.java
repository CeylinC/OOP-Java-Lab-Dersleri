package araclar;
public class motor{
    public int motorHacmi = 1400;
    public disliSeti ds;

    public motor() {
        ds = new disliSeti();
        ds.calistir();
    }
    
    
    public void calistir(){
        System.out.println("Motor çalıştırılıyor");
        System.out.println("calistir() yordamı çalıştı");
    }

    public class disliSeti{
        public void calistir(){
            System.out.println("Dişli Seti Çalıştırılıyor");
            System.out.println("calistir() yordamı çalıştı");
        }
    }
}
