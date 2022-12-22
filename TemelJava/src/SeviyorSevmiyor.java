import java.util.Scanner;

public class SeviyorSevmiyor {
    public static void main(String[] args){
        //Math.random()*range+min; range-> aralığı, min->min sayı
        
        //Seviyor Sevmiyor Uygulaması
        int yaprakSayisi = (int) (Math.random()*10+20);
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Seviyor ile başlamak için 1 sevmiyor ile başlamak için 0 giriniz...");
        int baslangıc = scanner.nextInt();
        
        System.out.println("Yaprak sayısı: "+yaprakSayisi);
        if(yaprakSayisi % 2 == 0){
            if(baslangıc == 0){
                System.out.println("Seviyor");
            }
            else{
                System.out.println("Sevmiyor");
            }
        }
        else{
            if(baslangıc == 1){
                System.out.println("Seviyor");
            }
            else{
                System.out.println("Sevmiyor");
            }
        }
        
    }
}
