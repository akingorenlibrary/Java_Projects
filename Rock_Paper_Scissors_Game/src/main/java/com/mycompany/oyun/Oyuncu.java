/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oyun;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Unknow
 */
public abstract class Oyuncu {
    public String oyuncuID;
    public String oyuncuAdi;
    public int skor;
   
    Oyuncu(String oyuncuID, String oyuncuAdi, int skor)
    {
        this.oyuncuID=oyuncuID;
        this.oyuncuAdi=oyuncuAdi;
        this.skor=skor;
    }
    //public String[] nesneListesi=new String[5];
    //public String[] nesneListesi2=new String[5];
    public ArrayList<String> nesneListesi=new ArrayList<String>(); 
    public ArrayList<String> nesneListesiAdresleri=new ArrayList<String>();  
    public String[] nesneler={"Taş","Kağıt","Makas","Taş","Kağıt","Makas","Taş","Kağıt","Makas"};
    public abstract void SkorGoster(double skor);
    public abstract void nesneSec();
    public abstract void nesneListesiAdresleriElemanGonder(String nesne);
    
    public void setNesneListesi(String nesne)
    {
        nesneListesi.add(nesne);
    }
    
    public void nesneListesiAdresleriFonk(String nesne)
    {
        nesneListesiAdresleri.add(nesne);
    }
        
    public void nesneSil(int Index)
    {
        this.nesneListesi.remove(Index);
        this.nesneListesi.add(Index, "Silindi");
        this.nesneListesiAdresleri.remove(Index);
        this.nesneListesiAdresleri.add(Index, "Silindi");
    }

    public abstract String getOyuncuAdi();
}
