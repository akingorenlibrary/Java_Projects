/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oyun;

/**
 *
 * @author Unknow
 */
public class Ozelkagit extends Kagit{
    
     public int kalinlik;
    
    Ozelkagit(int nufuz, int kalinlik, double dayaniklilik, double seviyePuani)
    {
        super(nufuz, dayaniklilik, seviyePuani);
        this.kalinlik=kalinlik;
    }
    
    public void nesnePuaniGoster()
    {
        
    }
    public int etkiHesapla(String karsiTaraf)
    {
        return 0;
    }
    public void durumGuncelle()
    {   
    }
}

