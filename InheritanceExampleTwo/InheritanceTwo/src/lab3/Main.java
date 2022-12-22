package lab3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Daire Oluşturmak için yarıçap giriniz : ");
        int r = scanner.nextInt();
        
        Circle circle = new Circle(r);
        System.out.print("Dairenin rengini girin:");
        circle.setColor(scanner.next());
        
        System.out.println("Daire dolu olsun mu (E/H)?");
        String onay = scanner.next();
        if(onay.equalsIgnoreCase("E")){
            circle.setFilled(true);
        }
        else if(onay.equalsIgnoreCase("H")){
            circle.setFilled(false);
        }
        
        //System.out.println(circle);
        
        System.out.println("Dairenin Çevresi : "+ circle.getPerimeter());
        System.out.println("Dairenin Çapı : "+circle.getDiameter());
        System.out.println("Dairenin Oluşturulma Tarihi : "+ circle.getDateCreated());
        System.out.println("Dairenin rengi : "+circle.getColor());
        if(circle.isFilled()){
            System.out.println("Çemberin İçi dolu");
            System.out.println("Dairenin Alanı : "+circle.getArea());
        }
        else{
            System.out.println("Çemberin İçi boş");
        }
        
        System.out.println("Dikdörtgen oluşturmak için Genişlik Giriniz : ");
        int w = scanner.nextInt();
        System.out.println("Dikdörtgen oluşturmak için Yükseklik Giriniz : ");
        int h= scanner.nextInt();
        
        Rectangle rect = new Rectangle(w, h);
        
        System.out.println("Dikdörtgenin Rengini girin : ");
        rect.setColor(scanner.next());
        
        System.out.println("Dikdörtgen dolu olsun mu (E/H)?");
        onay = scanner.next();
        if(onay.equalsIgnoreCase("E")){
            rect.setFilled(true);
        }
        else if(onay.equalsIgnoreCase("H")){
            rect.setFilled(false);
        }
        
        
        System.out.println("Dikdörtgenin Çevresi : "+rect.getPerimeter());
        System.out.println("Dikdörtgenin Oluşturulma Tarihi : "+rect.getDateCreated());
        System.out.println("Dikdörtgenin Rengi : "+rect.getColor());
        if(rect.isFilled()){
            System.out.println("Dikdörtgenin İçi dolu");
            System.out.println("Dikdörtgenin Alanı : "+rect.getArea());
        }
        else{
            System.out.println("Dikdörtgenin İçi boş");
        }
    }   
}
