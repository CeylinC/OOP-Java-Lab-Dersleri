/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pc
 */
public class Hata extends Exception{
    public Hata(){
        super("[HATA] Geçersiz işlem.");
    }
    public Hata(String ileti){
        super("[HATA] " + ileti);
    }
}
