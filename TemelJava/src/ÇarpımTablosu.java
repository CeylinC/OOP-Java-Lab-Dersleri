import java.util.Scanner;

public class ÇarpımTablosu {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Çarpım tablosu için sayı giriniz: ");
        int girdi = scanner.nextInt();
        for(int i=1; i<=girdi;i++){
            for(int j=0; j<=girdi; j++){
                System.out.print((i*j)+" ");
            }
            System.out.println();
        }
    }
}
