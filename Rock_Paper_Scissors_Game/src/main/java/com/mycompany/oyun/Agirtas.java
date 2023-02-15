/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oyun;

/**
 *
 * @author Unknow
 */
public class Agirtas extends Tas{
    public int sicaklik;

    
    Agirtas(double dayaniklilik, double seviyePuani, int katilik, int sicaklik)
    {
        super(katilik,dayaniklilik,seviyePuani);
        this.sicaklik=sicaklik;
    }
     
    public void nesnePuaniGoster()
    {
        
    }
    public double etkiHesapla()
    {
        return 0;
    }
    public void durumGuncelle()
    {
    }
}
