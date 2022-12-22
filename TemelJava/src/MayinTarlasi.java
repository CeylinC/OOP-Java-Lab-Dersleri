import java.util.Scanner;

public class MayinTarlasi {
    public static void main(String[] args){
        int[][] tarla = new int[10][10];
        int satir, sutun, puan=0;
        Scanner scanner = new Scanner(System.in);
        
        for(int i=0; i<10; i++){
            int bombaSatir = (int) (Math.random()*9);
            int bombaSutun = (int) (Math.random()*9);
            if(tarla[bombaSatir][bombaSutun] != 1){
                tarla[bombaSatir][bombaSutun] = 1;
            }
            else{
                i--;
            }
        }
        
        do{
            System.out.println("Satır giriniz");
            satir = scanner.nextInt();
            System.out.println("Sütun giriniz");
            sutun = scanner.nextInt();
            
            if(tarla[satir][sutun] != 1){
                puan++;
                System.out.println("Basarili hamle Mevcut puan: "+puan);
            }
            
        }while(tarla[satir][sutun] !=1);
        System.out.println("Oyun Bitti, Puan:"+ puan);
        
    }
}
