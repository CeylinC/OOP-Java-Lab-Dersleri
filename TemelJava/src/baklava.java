public class baklava {
    public static void main(String[] args){
        int satir = 5;
        for(int i=0; i<satir; i++){
            for(int j=satir-i; j>0; j--){
                System.out.print(" ");
            }
            for(int j=(2*i+1); j>0; j--){
                System.out.print("*");
            }
            System.out.println("");
        }
        for(int i=satir; i>=0; i--){
            for(int j=satir-i; j>0; j--){
                System.out.print(" ");
            }
            for(int j=(2*i+1); j>0; j--){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
