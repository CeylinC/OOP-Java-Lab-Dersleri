public class Main {
    public static void main(String[] args){
        Elektrikli elektrikli = new Elektrikli(20,200,"Yeşil", 10, 10000, "Kasasız");
        Benzinli benzinli = new Benzinli(30,400,500,"Fuşya", 90, 80000, "Kasalı");
        
        elektrikli.goruntule();
        System.out.println("");
        benzinli.goruntule();
    }
}
