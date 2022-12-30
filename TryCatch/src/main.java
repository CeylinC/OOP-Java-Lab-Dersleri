import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class main {
    public static void main(String[] args){
        System.out.println("Asal sayı kontrol programına hoşgeldiniz! Çıkış yapmak için 0 giriniz");
        Scanner scanner = new Scanner(System.in);
        int sayi;
        System.out.print("Lütfen asallık kontrolü yapılacak sayıyı giriniz : ");
        while(true){
            try{
                sayi = scanner.nextInt();
                if(sayi == 0){
                    System.exit(0);
                }
                asaldurum.asalSayiKontrol(sayi);
            }
            catch(InputMismatchException ex){
                System.out.println(new Hata("Sayısal veri girişi gerçekleşmedi"));
                scanner.nextLine();
            }
            catch (Hata ex) {
            System.out.println(ex.getMessage());
            }
        
        }
    }
}
