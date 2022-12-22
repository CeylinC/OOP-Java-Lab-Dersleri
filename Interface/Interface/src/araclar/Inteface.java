package araclar;
public class Inteface {
    public static void main(String[] args) {
        motorsiklet mobilet = new motorsiklet();
        bisiklet bs = new bisiklet();
        
        
        mobilet.motoCalistir();
        mobilet.sur();
        mobilet.cokHizYap();
        mobilet.solaSagaDon();
        mobilet.sur(120);
        
        System.out.println("\n\n\n");
        
        bs.sur();
        bs.dengeSagla();
        bs.solaSagaDon();
        
    }
    
}
