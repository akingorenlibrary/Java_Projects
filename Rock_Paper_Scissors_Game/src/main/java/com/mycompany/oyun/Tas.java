/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oyun;

/**
 *
 * @author Unknow
 */
public class Tas extends Nesne{
     public int katilik=2;
    
    Tas(int katilik, double dayaniklilik, double seviyePuani)
    {
        super(dayaniklilik,seviyePuani);
        this.katilik=katilik;
    }
    
    public void nesnePuaniGoster()
    {
        System.out.println("Taş Dayanıklılık: "+this.dayaniklilik+" | Seviye Puanı: "+this.seviyePuani);
    }
    
    public int etkiHesapla(String karsiTaraf)
    {   
        double a=0.2f;
        int tas_etkisi = 0;
        
        if(karsiTaraf=="Taş")
        {
            tas_etkisi=0;
        }
        else if(karsiTaraf=="Kağıt")
        {   
            tas_etkisi=(int) ((this.katilik)/((1-a)*2));
        }
        else if(karsiTaraf=="Makas")
        {
            tas_etkisi=(int) ((this.katilik)/(a*2));
        } 
        return tas_etkisi;
    }
    public int durumGuncelle(double etkisi)
    {
        this.dayaniklilik=this.dayaniklilik-etkisi; 
        if(this.dayaniklilik<=0)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }

    public void seviyePuanimiGuncelle()
    {
        this.seviyePuani = this.seviyePuani + 20;
    }
    
    public int getDayaniklilik()
    {
        return (int) this.dayaniklilik;
    }
    
    public int getSeviyePuani()
    {
        return (int) this.seviyePuani;
    }
    
}
