/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oyun;

/**
 *
 * @author Unknow
 */
public class Makas extends Nesne{
     public int keskinlik=2;
    
    Makas(int keskinlik, double dayaniklilik, double seviyePuani)
    {
        super(dayaniklilik,seviyePuani);
        this.keskinlik=keskinlik;
    }
    
    public void nesnePuaniGoster()
    {
        System.out.println("Makas Dayanıklılık: "+this.dayaniklilik+" | Seviye Puanı: "+this.seviyePuani);
    }
    public int etkiHesapla(String karsiTaraf)
    {
     double a=0.2f;
     int makas_etkisi = 0;
        
        if(karsiTaraf=="Taş")
        {
            makas_etkisi=(int) ((this.keskinlik)/((1-a)*2));
        }
        else if(karsiTaraf=="Kağıt")
        {   
            makas_etkisi=(int) ((this.keskinlik)/(a*2));
        }
        else if(karsiTaraf=="Makas")
        {
            makas_etkisi=0;
        } 
        return makas_etkisi;
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
