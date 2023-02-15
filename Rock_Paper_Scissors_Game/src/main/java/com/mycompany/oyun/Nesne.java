/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oyun;

/**
 *
 * @author Unknow
 */
public abstract class Nesne {
    public double dayaniklilik;
    public double seviyePuani;
    
    Nesne(double dayaniklilik, double seviyePuani)
    {
        this.dayaniklilik=dayaniklilik;
        this.seviyePuani=seviyePuani;
    }
   
    public abstract void nesnePuaniGoster();
    public abstract int etkiHesapla(String karsiTaraf);
    public abstract int durumGuncelle(double etkisi);
    public abstract void seviyePuanimiGuncelle();
    public abstract int getDayaniklilik();
    public abstract int getSeviyePuani();
}
