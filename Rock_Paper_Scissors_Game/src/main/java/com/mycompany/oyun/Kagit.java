/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oyun;

/**
 *
 * @author Unknow
 */
public class Kagit extends Nesne{
     public int nufuz=2;
    
    Kagit(int nufus, double dayaniklilik, double seviyePuani)
    {
        super(dayaniklilik,seviyePuani);
        this.nufuz=nufuz;
    }
    
    public void nesnePuaniGoster()
    {
        System.out.println("Kağıt Dayanıklılık: "+this.dayaniklilik+" | Seviye Puanı: "+this.seviyePuani);
    }
    public int  etkiHesapla(String karsiTaraf)
    {
        double a=0.2f;
        int kagit_etkisi = 0;
        
        if(karsiTaraf=="Taş")
        {
            kagit_etkisi=(int) ((this.nufuz)/(a*2));
        }
        else if(karsiTaraf=="Kağıt")
        {   
            kagit_etkisi=0;
        }
        else if(karsiTaraf=="Makas")
        {
            kagit_etkisi=(int) ((this.nufuz)/((1-a)*2));
        } 
        return kagit_etkisi;
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
