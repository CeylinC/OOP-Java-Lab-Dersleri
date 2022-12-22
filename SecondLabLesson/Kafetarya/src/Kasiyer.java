
import java.util.Scanner;

public class Kasiyer {
    Kasa kasa;
    
    public Kasiyer(){
        kasa = new Kasa();
    }
    
    public Kasiyer(String isim){
        kasa = new Kasa(isim);
    }
    
    public void isVakti(){ //Fiaytlar kullanıcıdan alınacak
        System.out.println("\n******************************\n"
                + "Salata seçimi için 1'e\n"
                + "Hamburger seçimi için 2'ye\n"
                + "Pizza seçimi için 3'e\n"
                + "Tatlı seçimi için 4'e tıklayınız."
                + "\n******************************\n");
        Scanner scanner = new Scanner(System.in);
        while(true){
            int fiyat = 0;
            System.out.print("Lütfen indis giriniz : ");
            int indis = scanner.nextInt();
            switch(indis){
                case 1: //Salata
                    System.out.print("Salata fiyatı : ");
                    fiyat = scanner.nextInt();
                    kasa.hesapla(1, fiyat);
                    break;
                case 2: //Hamburger
                    System.out.print("Hamburger fiyatı : ");
                    fiyat = scanner.nextInt();
                    kasa.hesapla(2, fiyat);
                    break;
                case 3: //Pizza
                    System.out.print("Pizza fiyatı : ");
                    fiyat = scanner.nextInt();
                    kasa.hesapla(3, fiyat);
                    break;
                case 4: //Tatlı
                    System.out.print("Tatlı fiyatı : ");
                    fiyat = scanner.nextInt();
                    kasa.hesapla(4, fiyat);
                    break;
                case 5: //Çıkış
                    System.out.println("Çıkış Yapılıyor...");
                    kasa.fisYazdir();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Geçerli Giriş Yapınız!..");
            }
            System.out.println("İşlem gerçekleşiyor...");
        }
    }
}
