/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oyun;

import java.util.Random;

/**
 *
 * @author Unknow
 */
public class Kullanici extends Oyuncu{
    
    Kullanici(String oyuncuID, String oyuncuAdi, int skor)
    {
       super(oyuncuID, oyuncuAdi, skor);
    }
    
    public void SkorGoster(double skor)
    {
        System.out.println(this.oyuncuAdi+" Skor: "+skor);
    }
       
    public void nesneSec()
    {
        Random rand = new Random();
        for(int i=0;i<5;i++)
        {
            super.setNesneListesi(super.nesneler[rand.nextInt(9)]); 
        }
        
    }
    
    public void nesneListesiAdresleriElemanGonder(String nesne)
    {
        super.nesneListesiAdresleriFonk(nesne);
    }
      
    public String getOyuncuAdi()
    {
        return this.oyuncuAdi;
    }
}