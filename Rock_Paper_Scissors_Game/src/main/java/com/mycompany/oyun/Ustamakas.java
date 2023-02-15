/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oyun;

/**
 *
 * @author Unknow
 */
public class Ustamakas extends Makas{
    public int direnc;
    
    Ustamakas(double dayaniklilik, double seviyePuani, int direnc, int keskinlik)
    {
        super(keskinlik, dayaniklilik, seviyePuani );
        this.direnc=direnc;
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
