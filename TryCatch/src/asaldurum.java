public class asaldurum{
    public static void asalSayiKontrol(int sayi) throws Hata{
        if(sayi < 0){
            throw new Hata("Negatif sayı girişi.");
        }
        else if(sayi == 1){
            System.out.println(sayi + " sayısı asal sayı değildir");
        }
        else{
            boolean asalmi = true;
            for(int i = sayi ; i > 1; i--){
                if( sayi == i) { continue; }
                if( sayi % i == 0){
                    System.out.println(sayi + " sayısı asal değildir");
                    asalmi = false;
                    break;
                }
            }
            if(asalmi == true){
                System.out.println(sayi + " sayısı asaldır");
            }
        }
    }
    
}
