import java.util.Scanner;

public class Sezar {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen şifrelenecek kelimeyi giriniz...");
        String metin = scanner.nextLine();
        System.out.println("Lütfen anahtar kelimeyi giriniz...");
        int anahtar = scanner.nextInt();
        
        System.out.println("Şifreli metniniz: ");
        for(int i=0; i<metin.length(); i++){
            System.out.print((char)((int)(metin.charAt(i)-65+anahtar)%26+65));
        }
        System.out.println("");
    }
}
