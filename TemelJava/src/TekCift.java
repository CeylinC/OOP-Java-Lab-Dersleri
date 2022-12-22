import java.util.ArrayList;

public class TekCift {
    //Çift başa tek sona
    public static void main(String[] args){
        int[] dizi = {23,15,45,39,6,34,35,20,7,44};
        ArrayList<Integer> tek = new ArrayList<Integer>();
        
        for(int i = dizi.length-1; i>=0; i--){
            if(dizi[i] % 2 == 0){
                System.out.print(dizi[i]+" ");
            }
            else{
                tek.add(dizi[i]);
            }
        }
        for(int i: tek){
            System.out.print(i+" ");
        }
    }
}
