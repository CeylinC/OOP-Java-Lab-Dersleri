package gps;
public class GPSProgrami {
    private String konumVerisi;
    private int enlem=0;
    private int boylam=0;
    
    public GPSProgrami(GPSAlicisi gA){
        konumVerisi = gA.programaVeriGonder();
        konumBilgisi(konumVerisi);
    }
    
    private void konumBilgisi(String konumVerisi){
        String[] konumDizisi = konumVerisi.split(",");
        
        for(int i = 1; i<konumDizisi.length; i++){
            try{
                if(enlem == 0){
                    enlem = Integer.parseInt(konumDizisi[i]);
                }
                else if(boylam == 0){
                    boylam = Integer.parseInt(konumDizisi[i]);
                }
            }
            catch(NumberFormatException numberFormatException){
                continue;
            }
        }
        
        System.out.println("GPS Cümlesinin Türü : "+konumDizisi[0]+
                "\nEnlem : "+enlem+
                "\nBoylam : "+boylam);
    }
}
