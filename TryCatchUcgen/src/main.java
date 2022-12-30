
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Üçgen alanı ve kenarı hesaplayan programa hoşgeldiniz. Çıkış yapmak için 0'a basınız.");
        
        int a, b, c;
        Ucgen ucgen = null;
        
        System.out.print("Üçgenin 1. kenarını giriniz : ");
        a = scanner.nextInt();
        if(a == 0) { System.exit(0); }
        System.out.print("Üçgenin 2. kenarını giriniz : ");
        b = scanner.nextInt();
        System.out.print("Üçgenin 3. kenarını giriniz : ");
        c = scanner.nextInt();
        
        try {
            ucgen = new Ucgen(a,b,c);
            System.out.println("Üçgenin alanı : "+ucgen.alanHesapla());
            System.out.println("Üçgenin çevresini : "+ucgen.cevreHesapla());
        } catch (Hata ex) {
            System.out.println(ex.getMessage());
        }
        
    }
}
