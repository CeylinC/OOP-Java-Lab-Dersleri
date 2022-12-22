package okul;

import java.util.ArrayList;
import java.util.Scanner;

/*
Üniversitemiz öğrencileri için okul bilgilerini içeren
(öğrenci no,öğrenci adı, öğrenci soyadı, giriş tarihi, fakülte, bölüm)
birer sınıf yapınız.

-Her bölüm için ayrı bir sınıf

- Tüm öğrenciler üzerinde de işlem yapabilmek için
bu sınıfları öğrenci adlı abstract bir sınıf üzerinden extend edin.

Gerekli absract sınıfı ve fakültemizde yer alan 5 bölüm için sınıfları yazınız.
*/
public class Main {
    public static void main(String[] args) {
        int no, islem;
        String isim, soyisim, bolum;
        ArrayList<Ogrenci> ogrenciler = new ArrayList<Ogrenci>();
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Manisa Celal Bayar Üniversitesi Öğrenci Sistemine Hoşgeldin"
                + "\n\tLütfen yapmak istediğiniz işlemi seçiniz : "
                + "\n\t\t 1 - Öğrenci Ekle"
                + "\n\t\t 2 - Tüm Öğrencileri Listele"
                + "\n\t\t 3 - Bölüme Göre Öğrencileri Listele"
                + "\n\t\t 4 - Çıkış");
        islem = scanner.nextInt();
        switch(islem){
            case 1:
                System.out.print("Eklenecek öğrencinin numarasını : ");
                no = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Eklenecek öğrencinin ismi : ");
                isim = scanner.nextLine();
                System.out.print("Eklenecek öğrencinin soyismi : ");
                soyisim = scanner.nextLine();
                System.out.print("Eklenecek öğrencinin bölümü : ");
                bolum = scanner.nextLine();
                switch(bolum){
                    case "yazilim":
                        ogrenciler.add(new Yazilim(no,isim,soyisim));
                        break;
                    case "mekatronik":
                        ogrenciler.add(new Mekatronik(no,isim,soyisim));
                        break;
                    case "makine":
                        ogrenciler.add(new Makine(no,isim,soyisim));
                        break;
                    case "elektrik":
                        ogrenciler.add(new Elektrik(no,isim,soyisim));
                        break;
                    case "enerji":
                        ogrenciler.add(new Enerji(no,isim,soyisim));
                        break;
                    default:
                        System.out.println("Geçersiz Bölüm Girişi");
                        break;
                }
                System.out.println("\nBaşarıyla öğrenci eklendi\n");
                break;
            case 2:
                for(Ogrenci ogr : ogrenciler){
                    System.out.println(ogr);
                }
                break;
            case 3:
                scanner.nextLine();
                System.out.print("Öğrencileri aranacak bölümü seçiniz : ");
                bolum = scanner.nextLine();
                for(Ogrenci ogr : ogrenciler){
                    if(ogr.getBolum().equals(bolum)){
                        System.out.println(ogr);
                    }
                }
                break;
            case 4:
                System.exit(0);
                break;
            default:
                System.out.println("Geçersiz İşlem!");
                break;
            }
        }
    }
}
