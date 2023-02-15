/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oyun;

import java.util.Random;
import java.util.UUID;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author Unknow
 */
public class Pcvspc {
    public void pcwarpc()
    {
        JFrame frame=new JFrame("Bilgisayar vs Bilgisayar");
        JPanel panel=new JPanel();
        
        //--------------------------------
  
        int dayaniklilik=20;
        //Oyuncu 1
            //Taş
            Nesne oyuncu1tas1=new Tas(2,dayaniklilik,0);
            Nesne oyuncu1tas2=new Tas(2,dayaniklilik,0);
            Nesne oyuncu1tas3=new Tas(2,dayaniklilik,0);
            Nesne oyuncu1tas4=new Tas(2,dayaniklilik,0);
            Nesne oyuncu1tas5=new Tas(2,dayaniklilik,0);
        
            //Kağıt
            Nesne oyuncu1kagit1=new Kagit(2,dayaniklilik,0);
            Nesne oyuncu1kagit2=new Kagit(2,dayaniklilik,0);
            Nesne oyuncu1kagit3=new Kagit(2,dayaniklilik,0);
            Nesne oyuncu1kagit4=new Kagit(2,dayaniklilik,0);
            Nesne oyuncu1kagit5=new Kagit(2,dayaniklilik,0);

            //Makas
            Nesne oyuncu1makas1=new Makas(2,dayaniklilik,0);
            Nesne oyuncu1makas2=new Makas(2,dayaniklilik,0);
            Nesne oyuncu1makas3=new Makas(2,dayaniklilik,0);
            Nesne oyuncu1makas4=new Makas(2,dayaniklilik,0);
            Nesne oyuncu1makas5=new Makas(2,dayaniklilik,0);
            
        //Oyuncu 2
            //Taş
            Nesne oyuncu2tas1=new Tas(2,dayaniklilik,0);
            Nesne oyuncu2tas2=new Tas(2,dayaniklilik,0);
            Nesne oyuncu2tas3=new Tas(2,dayaniklilik,0);
            Nesne oyuncu2tas4=new Tas(2,dayaniklilik,0);
            Nesne oyuncu2tas5=new Tas(2 ,dayaniklilik,0);
        
            //Kağıt
            Nesne oyuncu2kagit1=new Kagit(2,dayaniklilik,0);
            Nesne oyuncu2kagit2=new Kagit(2,dayaniklilik,0);
            Nesne oyuncu2kagit3=new Kagit(2,dayaniklilik,0);
            Nesne oyuncu2kagit4=new Kagit(2,dayaniklilik,0);
            Nesne oyuncu2kagit5=new Kagit(2,dayaniklilik,0);

            //Makas
            Nesne oyuncu2makas1=new Makas(2,dayaniklilik,0);
            Nesne oyuncu2makas2=new Makas(2,dayaniklilik,0);
            Nesne oyuncu2makas3=new Makas(2,dayaniklilik,0);
            Nesne oyuncu2makas4=new Makas(2,dayaniklilik,0);
            Nesne oyuncu2makas5=new Makas(2,dayaniklilik,0);
            
           
        //Oyuncuların IDleri belirlenir
        String oyuncu1ID=UUID.randomUUID().toString();
        String oyuncu2ID=UUID.randomUUID().toString();
           
        //Bilgisayar - Bilgisayar
        Oyuncu oyuncu1=new Bilgisayar(oyuncu1ID,"Bilgisayar1",0);
        Oyuncu oyuncu2=new Bilgisayar(oyuncu2ID,"Bilgisayar2",0); 

        oyuncu1.nesneSec();
        oyuncu2.nesneSec();


        System.out.println(oyuncu1.oyuncuAdi+": "+oyuncu1.nesneListesi.get(0)+","+oyuncu1.nesneListesi.get(1)+","+oyuncu1.nesneListesi.get(2)+","+oyuncu1.nesneListesi.get(3)+","+oyuncu1.nesneListesi.get(4));
        //System.out.println(o1.oyuncuAdi+": "+o1.nesneListesi2[0]+","+o1.nesneListesi2[1]+","+o1.nesneListesi2[2]+","+o1.nesneListesi2[3]+","+o1.nesneListesi2[4]);
        System.out.println(oyuncu2.oyuncuAdi+": "+oyuncu2.nesneListesi.get(0)+","+oyuncu2.nesneListesi.get(1)+","+oyuncu2.nesneListesi.get(2)+","+oyuncu2.nesneListesi.get(3)+","+oyuncu2.nesneListesi.get(4));
        //System.out.println(o2.oyuncuAdi+": "+o2.nesneListesi2[0]+","+o2.nesneListesi2[1]+","+o2.nesneListesi2[2]+","+o2.nesneListesi2[3]+","+o2.nesneListesi2[4]);
        System.out.println("\n");

        //---------------
        int tasSayac=1,kagitSayac=1,makasSayac=1;
        for(int j=0;j<oyuncu1.nesneListesi.size();j++)
        {
            if("Taş".equals(oyuncu1.nesneListesi.get(j)))
            {
                String temp="Taş"+tasSayac;
                oyuncu1.nesneListesiAdresleriElemanGonder(temp);
                tasSayac++;
            }
            if("Kağıt".equals(oyuncu1.nesneListesi.get(j)))
            {
                String temp="Kağıt"+kagitSayac;
                oyuncu1.nesneListesiAdresleriElemanGonder(temp);
                kagitSayac++;
            }
            if("Makas".equals(oyuncu1.nesneListesi.get(j)))
            {
                String temp="Makas"+makasSayac;
                oyuncu1.nesneListesiAdresleriElemanGonder(temp);
                makasSayac++;
            }
        }
            
        tasSayac=1;
        kagitSayac=1;
        makasSayac=1;
            
        for(int j=0;j<oyuncu2.nesneListesi.size();j++)
        {
            if("Taş".equals(oyuncu2.nesneListesi.get(j)))
            {
                String temp="Taş"+tasSayac;
                oyuncu2.nesneListesiAdresleriElemanGonder(temp);
                tasSayac++;
            }
            if("Kağıt".equals(oyuncu2.nesneListesi.get(j)))
            {
                String temp="Kağıt"+kagitSayac;
                oyuncu2.nesneListesiAdresleriElemanGonder(temp);
                kagitSayac++;
            }
            if("Makas".equals(oyuncu2.nesneListesi.get(j)))
            {
                String temp="Makas"+makasSayac;
                oyuncu2.nesneListesiAdresleriElemanGonder(temp);
                makasSayac++;
            }
        } 
        System.out.println(oyuncu1.oyuncuAdi+": "+oyuncu1.nesneListesiAdresleri.get(0)+","+oyuncu1.nesneListesiAdresleri.get(1)+","+oyuncu1.nesneListesiAdresleri.get(2)+","+oyuncu1.nesneListesiAdresleri.get(3)+","+oyuncu1.nesneListesiAdresleri.get(4));
        System.out.println(oyuncu2.oyuncuAdi+": "+oyuncu2.nesneListesiAdresleri.get(0)+","+oyuncu2.nesneListesiAdresleri.get(1)+","+oyuncu2.nesneListesiAdresleri.get(2)+","+oyuncu2.nesneListesiAdresleri.get(3)+","+oyuncu2.nesneListesiAdresleri.get(4));
        System.out.println("\n");
        //---------------
        String[][] hamleler={
            {"","","","","","","",""},
            {"","","","","","","",""},
            {"","","","","","","",""},
            {"","","","","","","",""},
            {"","","","","","","",""},
            {"","","","","","","",""},
            {"","","","","","","",""},
            {"","","","","","","",""},
            {"","","","","","","",""},
            {"","","","","","","",""}
        };//10 roundluk yer var
        //---------------
        
        int tas_etkisi=0,makas_etkisi=0,kagit_etkisi=0;
        int nesne_durum1=0,nesne_durum2=0;
        int oyuncu1NesneIndex = 0,oyuncu2NesneIndex=0;
        Random rand1 = new Random();
        Random rand2 = new Random();
        String sonucMetni="";
        int oyuncu2Skor=0,oyuncu1Skor=0;
        //Oyun Döngüsü
        for(int i=0;;i++)
        {
            //oyuncu1Nesnelistesinde eleman var mı
            if(oyuncu1.nesneListesi.isEmpty())
            {
                System.out.println("Oyuncu1 in elemanları bitti. Oyuncu2 kazandı.");
                sonucMetni="Oyuncu1 in elemanları bitti. Oyuncu2 kazandı.";
                break;
            }
            //oyuncu2Nesnelistesinde eleman var mı
            if(oyuncu2.nesneListesi.isEmpty())
            {
                System.out.println("Oyuncu2 nin elemanları bitti. Oyuncu1 kazandı.");
                sonucMetni="Oyuncu2 nin elemanları bitti. Oyuncu1 kazandı.";
                break;
            }
                
                
            if(i==10)//11. round
            {
                //Oyuncu1 in elindeki nesnelerin toplam dayanıklılıkları
                oyuncu1Skor=0;
                for(int n=0;n<oyuncu1.nesneListesiAdresleri.size();n++)
                {
                    if("Taş1".equals(oyuncu1.nesneListesiAdresleri.get(n)))
                    {
                        oyuncu1Skor += oyuncu1tas1.getDayaniklilik();
                    }
                    if("Taş2".equals(oyuncu1.nesneListesiAdresleri.get(n)))
                    {
                        oyuncu1Skor += oyuncu1tas2.getDayaniklilik();
                    }
                    if("Taş3".equals(oyuncu1.nesneListesiAdresleri.get(n)))
                    {
                        oyuncu1Skor += oyuncu1tas3.getDayaniklilik();
                    }
                    if("Taş4".equals(oyuncu1.nesneListesiAdresleri.get(n)))
                    {
                        oyuncu1Skor += oyuncu1tas4.getDayaniklilik();
                    }
                    if("Taş5".equals(oyuncu1.nesneListesiAdresleri.get(n)))
                    {
                        oyuncu1Skor += oyuncu1tas5.getDayaniklilik();
                    }
                    if("Kağıt1".equals(oyuncu1.nesneListesiAdresleri.get(n)))
                    {
                        oyuncu1Skor += oyuncu1kagit1.getDayaniklilik();
                    }
                    if("Kağıt2".equals(oyuncu1.nesneListesiAdresleri.get(n)))
                    {
                        oyuncu1Skor += oyuncu1kagit2.getDayaniklilik();
                    }
                    if("Kağıt3".equals(oyuncu1.nesneListesiAdresleri.get(n)))
                    {
                        oyuncu1Skor += oyuncu1kagit3.getDayaniklilik();
                    }
                    if("Kağıt4".equals(oyuncu1.nesneListesiAdresleri.get(n)))
                    {
                        oyuncu1Skor += oyuncu1kagit4.getDayaniklilik();
                    }
                    if("Kağıt5".equals(oyuncu1.nesneListesiAdresleri.get(n)))
                    {
                        oyuncu1Skor += oyuncu1kagit5.getDayaniklilik();
                    }
                    if("Makas1".equals(oyuncu1.nesneListesiAdresleri.get(n)))
                    {
                        oyuncu1Skor += oyuncu1makas1.getDayaniklilik();
                    }
                    if("Makas2".equals(oyuncu1.nesneListesiAdresleri.get(n)))
                    {
                        oyuncu1Skor += oyuncu1makas2.getDayaniklilik();
                    }
                    if("Makas3".equals(oyuncu1.nesneListesiAdresleri.get(n)))
                    {
                        oyuncu1Skor += oyuncu1makas3.getDayaniklilik();
                    }
                    if("Makas4".equals(oyuncu1.nesneListesiAdresleri.get(n)))
                    {
                        oyuncu1Skor += oyuncu1makas4.getDayaniklilik();
                    }
                    if("Makas5".equals(oyuncu1.nesneListesiAdresleri.get(n)))
                    {
                        oyuncu1Skor += oyuncu1makas5.getDayaniklilik();
                    }
                }
                
                //Oyuncu1 in elindeki nesnelerin toplam dayanıklılıkları
                oyuncu2Skor=0;
                for(int n=0;n<oyuncu2.nesneListesiAdresleri.size();n++)
                {
                    if("Taş1".equals(oyuncu2.nesneListesiAdresleri.get(n)))
                    {
                        oyuncu2Skor += oyuncu2tas1.getDayaniklilik();
                    }
                    if("Taş2".equals(oyuncu2.nesneListesiAdresleri.get(n)))
                    {
                        oyuncu2Skor += oyuncu2tas2.getDayaniklilik();
                    }
                    if("Taş3".equals(oyuncu2.nesneListesiAdresleri.get(n)))
                    {
                        oyuncu2Skor += oyuncu2tas3.getDayaniklilik();
                    }
                    if("Taş4".equals(oyuncu2.nesneListesiAdresleri.get(n)))
                    {
                        oyuncu2Skor += oyuncu2tas4.getDayaniklilik();
                    }
                    if("Taş5".equals(oyuncu2.nesneListesiAdresleri.get(n)))
                    {
                        oyuncu2Skor += oyuncu2tas5.getDayaniklilik();
                    }
                    if("Kağıt1".equals(oyuncu2.nesneListesiAdresleri.get(n)))
                    {
                        oyuncu2Skor += oyuncu2kagit1.getDayaniklilik();
                    }
                    if("Kağıt2".equals(oyuncu2.nesneListesiAdresleri.get(n)))
                    {
                        oyuncu2Skor += oyuncu2kagit2.getDayaniklilik();
                    }
                    if("Kağıt3".equals(oyuncu2.nesneListesiAdresleri.get(n)))
                    {
                        oyuncu2Skor += oyuncu2kagit3.getDayaniklilik();
                    }
                    if("Kağıt4".equals(oyuncu2.nesneListesiAdresleri.get(n)))
                    {
                        oyuncu2Skor += oyuncu2kagit4.getDayaniklilik();
                    }
                    if("Kağıt5".equals(oyuncu2.nesneListesiAdresleri.get(n)))
                    {
                        oyuncu2Skor += oyuncu2kagit5.getDayaniklilik();
                    }
                    if("Makas1".equals(oyuncu2.nesneListesiAdresleri.get(n)))
                    {
                        oyuncu2Skor += oyuncu2makas1.getDayaniklilik();
                    }
                    if("Makas2".equals(oyuncu2.nesneListesiAdresleri.get(n)))
                    {
                        oyuncu2Skor += oyuncu2makas2.getDayaniklilik();
                    }
                    if("Makas3".equals(oyuncu2.nesneListesiAdresleri.get(n)))
                    {
                        oyuncu2Skor += oyuncu2makas3.getDayaniklilik();
                    }
                    if("Makas4".equals(oyuncu2.nesneListesiAdresleri.get(n)))
                    {
                        oyuncu2Skor += oyuncu2makas4.getDayaniklilik();
                    }
                    if("Makas5".equals(oyuncu2.nesneListesiAdresleri.get(n)))
                    {
                        oyuncu2Skor += oyuncu2makas5.getDayaniklilik();
                    }
                }
                
                System.out.println("10 Hamle yapıldı");
                if(oyuncu1Skor>oyuncu2Skor)
                {
                    System.out.println("Oyuncu1 Skor: "+oyuncu1Skor+" | Oyuncu2 Skor: "+oyuncu2Skor+" | Kazanan Oyuncu1");
                    sonucMetni="10 hamle yapıldı | Oyuncu1 skor: "+oyuncu1Skor+" | Oyuncu2 Skor: "+oyuncu2Skor+" | Kazanan Oyuncu1";
                }
                else
                {
                    System.out.println("Oyuncu1 Skor: "+oyuncu1Skor+" | Oyuncu2 Skor: "+oyuncu2Skor+" | Kazanan Oyuncu2");
                    sonucMetni="10 hamle yapıldı | Oyuncu1 skor: "+oyuncu1Skor+" | Oyuncu2 Skor: "+oyuncu2Skor+" | Kazanan Oyuncu2";
                }

                
                break;
            }
            if(i<=4)
            {
                oyuncu1NesneIndex=i;
                oyuncu2NesneIndex=i;
            }
            if(i>=5)
            {
                int m=0;
                //nesnelistesindeki silindi yazan elemanları sil
                for(m=0;m<oyuncu1.nesneListesi.size();m++)
                {
                    if("Silindi".equals(oyuncu1.nesneListesi.get(m)))
                    {
                        oyuncu1.nesneListesi.remove(m);
                        oyuncu1.nesneListesiAdresleri.remove(m);
                    }
                }
                for(m=0;m<oyuncu2.nesneListesi.size();m++)
                {
                    if("Silindi".equals(oyuncu2.nesneListesi.get(m)))
                    {
                        oyuncu2.nesneListesi.remove(m);
                        oyuncu2.nesneListesiAdresleri.remove(m);
                    }
                }
                
                //oyuncu1Nesnelistesinde eleman var mı
                if(oyuncu1.nesneListesi.isEmpty())
                {
                    System.out.println("Oyuncu1 in elemanları bitti. Oyuncu2 kazandı.");
                    sonucMetni="Oyuncu1 in elemanları bitti. Oyuncu2 kazandı.";
                    break;
                }
                //oyuncu2Nesnelistesinde eleman var mı
                if(oyuncu2.nesneListesi.isEmpty())
                {
                    System.out.println("Oyuncu2 nin elemanları bitti. Oyuncu1 kazandı.");
                    sonucMetni="Oyuncu2 nin elemanları bitti. Oyuncu1 kazandı.";
                    break;
                }
                
                oyuncu1NesneIndex=rand1.nextInt(oyuncu1.nesneListesi.size());
                oyuncu2NesneIndex=rand2.nextInt(oyuncu2.nesneListesi.size());
            }
            if(i==5)//10. hamle
            {
                int m;
                
                //nesnelistesindeki silindi yazan elemanları sil
                for(m=0;m<oyuncu1.nesneListesi.size();m++)
                {
                    if("Silindi".equals(oyuncu1.nesneListesi.get(m)))
                    {
                        oyuncu1.nesneListesi.remove(m);
                        oyuncu1.nesneListesiAdresleri.remove(m);
                    }
                }
                for(m=0;m<oyuncu2.nesneListesi.size();m++)
                {
                    if("Silindi".equals(oyuncu2.nesneListesi.get(m)))
                    {
                        oyuncu2.nesneListesi.remove(m);
                        oyuncu2.nesneListesiAdresleri.remove(m);
                    }
                }

                //oyuncu1Nesnelistesinde eleman var mı
                if(oyuncu1.nesneListesi.isEmpty())
                {
                    System.out.println("Oyuncu1 in elemanları bitti. Oyuncu2 kazandı.");
                    sonucMetni="Oyuncu1 in elemanları bitti. Oyuncu2 kazandı.";
                    break;
                }
                //oyuncu2Nesnelistesinde eleman var mı
                if(oyuncu2.nesneListesi.isEmpty())
                {
                    System.out.println("Oyuncu2 nin elemanları bitti. Oyuncu1 kazandı.");
                    sonucMetni="Oyuncu2 nin elemanları bitti. Oyuncu1 kazandı.";
                    break;
                }

                oyuncu1NesneIndex=rand1.nextInt(oyuncu1.nesneListesi.size());
                oyuncu2NesneIndex=rand2.nextInt(oyuncu2.nesneListesi.size());
            }

            System.out.println("Round "+(i+1));
           
            System.out.print(oyuncu1.oyuncuAdi+": ");
            for(int n=0;n<oyuncu1.nesneListesiAdresleri.size();n++)
            {
                System.out.print(oyuncu1.nesneListesiAdresleri.get(n)+",");
            }
            
            System.out.println("\n");
            System.out.print(oyuncu2.oyuncuAdi+": ");
            for(int n=0;n<oyuncu2.nesneListesiAdresleri.size();n++)
            {
                System.out.print(oyuncu2.nesneListesiAdresleri.get(n)+",");
            }
            System.out.println("\n");
     
            
            if(oyuncu1.nesneListesi.get(oyuncu1NesneIndex).equals(oyuncu2.nesneListesi.get(oyuncu2NesneIndex)))
            {
                if("Taş".equals(oyuncu1.nesneListesi.get(oyuncu1NesneIndex)))
                {                
                    System.out.println("Taş-Taş");
                    hamleler[i][0]="Round "+(i+1);
                    hamleler[i][1]="Taş";
                    hamleler[i][4]="Taş";
                    hamleler[i][2]="Beraberlik";
                    hamleler[i][3]="Beraberlik";
                    hamleler[i][5]="Beraberlik";
                    hamleler[i][6]="Beraberlik";     
                }
                else if("Kağıt".equals(oyuncu1.nesneListesi.get(oyuncu1NesneIndex)))
                {
                    System.out.println("Kağıt-Kağıt");
                    hamleler[i][0]="Round "+(i+1);
                    hamleler[i][1]="Kağıt";
                    hamleler[i][4]="Kağıt";
                    hamleler[i][2]="Beraberlik";
                    hamleler[i][3]="Beraberlik";
                    hamleler[i][5]="Beraberlik";
                    hamleler[i][6]="Beraberlik";  
                }
                else if("Makas".equals(oyuncu1.nesneListesi.get(oyuncu1NesneIndex)))
                {
                    System.out.println("Makas-Makas");
                    hamleler[i][0]="Round "+(i+1);
                    hamleler[i][1]="Makas";
                    hamleler[i][4]="Makas";
                    hamleler[i][2]="Beraberlik";
                    hamleler[i][3]="Beraberlik";
                    hamleler[i][5]="Beraberlik";
                    hamleler[i][6]="Beraberlik";  
                }
            }
            else
            {
                 if("Taş".equals(oyuncu1.nesneListesi.get(oyuncu1NesneIndex)) && "Kağıt".equals(oyuncu2.nesneListesi.get(oyuncu2NesneIndex)) )
                 {
                     System.out.println("Taş-Kağıt");
                     hamleler[i][0]="Round "+(i+1);
                     hamleler[i][1]="Taş";
                     hamleler[i][4]="Kağıt";
                     
                     
                    if("Taş1".equals(oyuncu1.nesneListesiAdresleri.get(oyuncu1NesneIndex)) )
                    {
                     /*
                     Taş1 Kağıt1
                     Taş1 Kağıt2
                     Taş1 Kağıt3
                     Taş1 Kağıt4
                     Taş1 Kağıt5
                     */
                        tas_etkisi=oyuncu1tas1.etkiHesapla("Kağıt");   
                        if("Kağıt1".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu2kagit1.nesnePuaniGoster();
                            oyuncu1tas1.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2kagit1.durumGuncelle(tas_etkisi);
                            
                            //oyuncu 2 için
                            kagit_etkisi=oyuncu2kagit1.etkiHesapla("Taş"); 
                            nesne_durum1=oyuncu1tas1.durumGuncelle(kagit_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1tas1.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2kagit1.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2kagit1.nesnePuaniGoster();
                            oyuncu1tas1.nesnePuaniGoster();
                            
                           //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1tas1.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1tas1.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2kagit1.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2kagit1.getSeviyePuani());
                            
                        }
                        else if("Kağıt2".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu2kagit2.nesnePuaniGoster();
                            oyuncu1tas1.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2kagit2.durumGuncelle(tas_etkisi);
                            
                            //oyuncu 2 için
                            kagit_etkisi=oyuncu2kagit2.etkiHesapla("Taş"); 
                            nesne_durum1=oyuncu1tas1.durumGuncelle(kagit_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1tas1.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2kagit2.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2kagit2.nesnePuaniGoster();
                            oyuncu1tas1.nesnePuaniGoster();
                            
                           //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1tas1.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1tas1.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2kagit2.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2kagit2.getSeviyePuani());
                            
                        }
                        else if("Kağıt3".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu2kagit3.nesnePuaniGoster();
                            oyuncu1tas1.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2kagit3.durumGuncelle(tas_etkisi);
                            
                            //oyuncu 2 için
                            kagit_etkisi=oyuncu2kagit3.etkiHesapla("Taş"); 
                            nesne_durum1=oyuncu1tas1.durumGuncelle(kagit_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1tas1.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2kagit3.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2kagit3.nesnePuaniGoster();
                            oyuncu1tas1.nesnePuaniGoster();
                            
                           //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1tas1.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1tas1.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2kagit3.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2kagit3.getSeviyePuani());
                            
                        }
                        else if("Kağıt4".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu2kagit4.nesnePuaniGoster();
                            oyuncu1tas1.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2kagit4.durumGuncelle(tas_etkisi);
                            
                            //oyuncu 2 için
                            kagit_etkisi=oyuncu2kagit4.etkiHesapla("Taş"); 
                            nesne_durum1=oyuncu1tas1.durumGuncelle(kagit_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1tas1.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2kagit4.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2kagit4.nesnePuaniGoster();
                            oyuncu1tas1.nesnePuaniGoster();
                            
                           //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1tas1.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1tas1.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2kagit4.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2kagit4.getSeviyePuani());
                            
                        }
                        else if("Kağıt5".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu2kagit5.nesnePuaniGoster();
                            oyuncu1tas1.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2kagit5.durumGuncelle(tas_etkisi);
                            
                            //oyuncu 2 için
                            kagit_etkisi=oyuncu2kagit5.etkiHesapla("Taş"); 
                            nesne_durum1=oyuncu1tas1.durumGuncelle(kagit_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1tas1.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2kagit5.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2kagit5.nesnePuaniGoster();
                            oyuncu1tas1.nesnePuaniGoster();
                            
                           //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1tas1.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1tas1.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2kagit5.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2kagit5.getSeviyePuani());
                        }
                        
                    }
                    else if("Taş2".equals(oyuncu1.nesneListesiAdresleri.get(oyuncu1NesneIndex)))
                    {
                     /*
                     Taş2 Kağıt1
                     Taş2 Kağıt2
                     Taş2 Kağıt3
                     Taş2 Kağıt4
                     Taş2 Kağıt5
                     */
                        tas_etkisi=oyuncu1tas2.etkiHesapla("Kağıt");   
                        if("Kağıt1".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu2kagit1.nesnePuaniGoster();
                            oyuncu1tas2.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2kagit1.durumGuncelle(tas_etkisi);
                            
                            //oyuncu 2 için
                            kagit_etkisi=oyuncu2kagit1.etkiHesapla("Taş"); 
                            nesne_durum1=oyuncu1tas2.durumGuncelle(kagit_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1tas2.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2kagit1.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2kagit1.nesnePuaniGoster();
                            oyuncu1tas2.nesnePuaniGoster();
                            
                           //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1tas2.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1tas2.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2kagit1.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2kagit1.getSeviyePuani());
                            
                        }
                        else if("Kağıt2".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu2kagit2.nesnePuaniGoster();
                            oyuncu1tas2.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2kagit2.durumGuncelle(tas_etkisi);
                            
                            //oyuncu 2 için
                            kagit_etkisi=oyuncu2kagit2.etkiHesapla("Taş"); 
                            nesne_durum1=oyuncu1tas2.durumGuncelle(kagit_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1tas2.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2kagit2.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2kagit2.nesnePuaniGoster();
                            oyuncu1tas2.nesnePuaniGoster();
                            
                           //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1tas2.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1tas2.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2kagit2.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2kagit2.getSeviyePuani());
                        }
                        else if("Kağıt3".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu2kagit3.nesnePuaniGoster();
                            oyuncu1tas2.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2kagit3.durumGuncelle(tas_etkisi);
                            
                            //oyuncu 2 için
                            kagit_etkisi=oyuncu2kagit3.etkiHesapla("Taş"); 
                            nesne_durum1=oyuncu1tas2.durumGuncelle(kagit_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1tas2.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2kagit3.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2kagit3.nesnePuaniGoster();
                            oyuncu1tas2.nesnePuaniGoster();
                            
                           //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1tas2.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1tas2.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2kagit3.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2kagit3.getSeviyePuani());
                        }
                        else if("Kağıt4".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu2kagit4.nesnePuaniGoster();
                            oyuncu1tas2.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2kagit4.durumGuncelle(tas_etkisi);
                            
                            //oyuncu 2 için
                            kagit_etkisi=oyuncu2kagit4.etkiHesapla("Taş"); 
                            nesne_durum1=oyuncu1tas2.durumGuncelle(kagit_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1tas2.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2kagit4.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2kagit4.nesnePuaniGoster();
                            oyuncu1tas2.nesnePuaniGoster();
                            
                           //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1tas2.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1tas2.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2kagit4.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2kagit4.getSeviyePuani());
                        }
                        else if("Kağıt5".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu2kagit5.nesnePuaniGoster();
                            oyuncu1tas2.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2kagit5.durumGuncelle(tas_etkisi);
                            
                            //oyuncu 2 için
                            kagit_etkisi=oyuncu2kagit5.etkiHesapla("Taş"); 
                            nesne_durum1=oyuncu1tas2.durumGuncelle(kagit_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1tas2.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2kagit5.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2kagit5.nesnePuaniGoster();
                            oyuncu1tas2.nesnePuaniGoster();
                            
                           //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1tas2.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1tas2.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2kagit5.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2kagit5.getSeviyePuani());
                            
                        }
                    }
                    else if("Taş3".equals(oyuncu1.nesneListesiAdresleri.get(oyuncu1NesneIndex)))
                    {
                     /*
                     Taş3 Kağıt1
                     Taş3 Kağıt2
                     Taş3 Kağıt3
                     Taş3 Kağıt4
                     Taş3 Kağıt5
                     */
                        tas_etkisi=oyuncu1tas3.etkiHesapla("Kağıt");   
                        if("Kağıt1".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu2kagit1.nesnePuaniGoster();
                            oyuncu1tas3.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2kagit1.durumGuncelle(tas_etkisi);
                            
                            //oyuncu 2 için
                            kagit_etkisi=oyuncu2kagit1.etkiHesapla("Taş"); 
                            nesne_durum1=oyuncu1tas3.durumGuncelle(kagit_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1tas3.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2kagit1.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2kagit1.nesnePuaniGoster();
                            oyuncu1tas3.nesnePuaniGoster();
                            
                           //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1tas3.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1tas3.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2kagit1.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2kagit1.getSeviyePuani());
                        }
                        else if("Kağıt2".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu2kagit2.nesnePuaniGoster();
                            oyuncu1tas3.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2kagit2.durumGuncelle(tas_etkisi);
                            
                            //oyuncu 2 için
                            kagit_etkisi=oyuncu2kagit2.etkiHesapla("Taş"); 
                            nesne_durum1=oyuncu1tas3.durumGuncelle(kagit_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1tas3.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2kagit2.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2kagit2.nesnePuaniGoster();
                            oyuncu1tas3.nesnePuaniGoster();
                            
                           //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1tas3.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1tas3.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2kagit2.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2kagit2.getSeviyePuani());
                            
                        }
                        else if("Kağıt3".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu2kagit3.nesnePuaniGoster();
                            oyuncu1tas3.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2kagit3.durumGuncelle(tas_etkisi);
                            
                            //oyuncu 2 için
                            kagit_etkisi=oyuncu2kagit3.etkiHesapla("Taş"); 
                            nesne_durum1=oyuncu1tas3.durumGuncelle(kagit_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1tas3.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2kagit3.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2kagit3.nesnePuaniGoster();
                            oyuncu1tas3.nesnePuaniGoster();
                            
                           //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1tas3.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1tas3.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2kagit3.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2kagit3.getSeviyePuani());
                            
                        }
                        else if("Kağıt4".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu2kagit4.nesnePuaniGoster();
                            oyuncu1tas3.nesnePuaniGoster();
                                    
                            nesne_durum2=oyuncu2kagit4.durumGuncelle(tas_etkisi);
                            
                            //oyuncu 2 için
                            kagit_etkisi=oyuncu2kagit4.etkiHesapla("Taş"); 
                            nesne_durum1=oyuncu1tas3.durumGuncelle(kagit_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1tas3.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2kagit4.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2kagit4.nesnePuaniGoster();
                            oyuncu1tas3.nesnePuaniGoster();
                            
                           //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1tas3.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1tas3.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2kagit4.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2kagit4.getSeviyePuani());
                            
                        }
                        else if("Kağıt5".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu2kagit5.nesnePuaniGoster();
                            oyuncu1tas3.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2kagit5.durumGuncelle(tas_etkisi);
                            
                            //oyuncu 2 için
                            kagit_etkisi=oyuncu2kagit5.etkiHesapla("Taş"); 
                            nesne_durum1=oyuncu1tas3.durumGuncelle(kagit_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1tas3.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2kagit5.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2kagit5.nesnePuaniGoster();
                            oyuncu1tas3.nesnePuaniGoster();
                            
                           //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1tas3.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1tas3.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2kagit5.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2kagit5.getSeviyePuani());
                        }
                    }
                    else if("Taş4".equals(oyuncu1.nesneListesiAdresleri.get(oyuncu1NesneIndex)))
                    {
                     /*
                     Taş4 Kağıt1
                     Taş4 Kağıt2
                     Taş4 Kağıt3
                     Taş4 Kağıt4
                     Taş4 Kağıt5
                     */
                        tas_etkisi=oyuncu1tas4.etkiHesapla("Kağıt");   
                        if("Kağıt1".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu2kagit1.nesnePuaniGoster();
                            oyuncu1tas4.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2kagit1.durumGuncelle(tas_etkisi);
                            
                            //oyuncu 2 için
                            kagit_etkisi=oyuncu2kagit1.etkiHesapla("Taş"); 
                            nesne_durum1=oyuncu1tas4.durumGuncelle(kagit_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1tas4.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2kagit1.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2kagit1.nesnePuaniGoster();
                            oyuncu1tas4.nesnePuaniGoster();
                            
                           //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1tas4.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1tas4.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2kagit1.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2kagit1.getSeviyePuani());
                        }
                        else if("Kağıt2".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu2kagit2.nesnePuaniGoster();
                            oyuncu1tas4.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2kagit2.durumGuncelle(tas_etkisi);
                            
                            //oyuncu 2 için
                            kagit_etkisi=oyuncu2kagit2.etkiHesapla("Taş"); 
                            nesne_durum1=oyuncu1tas4.durumGuncelle(kagit_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1tas4.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2kagit2.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2kagit2.nesnePuaniGoster();
                            oyuncu1tas4.nesnePuaniGoster();
                            
                           //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1tas4.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1tas4.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2kagit2.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2kagit2.getSeviyePuani());
                        }
                        else if("Kağıt3".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu2kagit3.nesnePuaniGoster();
                            oyuncu1tas4.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2kagit3.durumGuncelle(tas_etkisi);
                            
                            //oyuncu 2 için
                            kagit_etkisi=oyuncu2kagit3.etkiHesapla("Taş"); 
                            nesne_durum1=oyuncu1tas4.durumGuncelle(kagit_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1tas4.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2kagit3.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2kagit3.nesnePuaniGoster();
                            oyuncu1tas4.nesnePuaniGoster();
                            
                           //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1tas4.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1tas4.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2kagit3.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2kagit3.getSeviyePuani());
                        }
                        else if("Kağıt4".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu2kagit4.nesnePuaniGoster();
                            oyuncu1tas4.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2kagit4.durumGuncelle(tas_etkisi);
                            
                            //oyuncu 2 için
                            kagit_etkisi=oyuncu2kagit4.etkiHesapla("Taş"); 
                            nesne_durum1=oyuncu1tas4.durumGuncelle(kagit_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1tas4.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2kagit4.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2kagit4.nesnePuaniGoster();
                            oyuncu1tas4.nesnePuaniGoster();
                            
                            //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1tas4.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1tas4.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2kagit4.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2kagit4.getSeviyePuani());
                            
                        }
                        else if("Kağıt5".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu2kagit5.nesnePuaniGoster();
                            oyuncu1tas4.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2kagit5.durumGuncelle(tas_etkisi);
                            
                            //oyuncu 2 için
                            kagit_etkisi=oyuncu2kagit5.etkiHesapla("Taş"); 
                            nesne_durum1=oyuncu1tas4.durumGuncelle(kagit_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1tas5.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2kagit5.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2kagit5.nesnePuaniGoster();
                            oyuncu1tas4.nesnePuaniGoster();
                            
                            //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1tas4.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1tas4.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2kagit5.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2kagit5.getSeviyePuani());
                            
                        }
                    }
                    else if("Taş5".equals(oyuncu1.nesneListesiAdresleri.get(oyuncu1NesneIndex)))
                    {
                     /*
                     Taş5 Kağıt1
                     Taş5 Kağıt2
                     Taş5 Kağıt3
                     Taş5 Kağıt4
                     Taş5 Kağıt5
                     */
                        tas_etkisi=oyuncu1tas5.etkiHesapla("Kağıt");   
                        if("Kağıt1".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu2kagit1.nesnePuaniGoster();
                            oyuncu1tas5.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2kagit1.durumGuncelle(tas_etkisi);
                            
                            //oyuncu 2 için
                            kagit_etkisi=oyuncu2kagit1.etkiHesapla("Taş"); 
                            nesne_durum1=oyuncu1tas5.durumGuncelle(kagit_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1tas5.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2kagit1.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2kagit1.nesnePuaniGoster();
                            oyuncu1tas5.nesnePuaniGoster();
                            
                            //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1tas5.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1tas5.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2kagit1.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2kagit1.getSeviyePuani());
                            
                        }
                        else if("Kağıt2".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu2kagit2.nesnePuaniGoster();
                            oyuncu1tas5.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2kagit2.durumGuncelle(tas_etkisi);
                            
                            //oyuncu 2 için
                            kagit_etkisi=oyuncu2kagit2.etkiHesapla("Taş"); 
                            nesne_durum1=oyuncu1tas5.durumGuncelle(kagit_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1tas5.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2kagit2.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2kagit2.nesnePuaniGoster();
                            oyuncu1tas5.nesnePuaniGoster();
                            
                            //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1tas5.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1tas5.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2kagit2.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2kagit2.getSeviyePuani());
                        }
                        else if("Kağıt3".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu2kagit3.nesnePuaniGoster();
                            oyuncu1tas5.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2kagit3.durumGuncelle(tas_etkisi);
                            
                            //oyuncu 2 için
                            kagit_etkisi=oyuncu2kagit3.etkiHesapla("Taş"); 
                            nesne_durum1=oyuncu1tas5.durumGuncelle(kagit_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1tas5.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2kagit3.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2kagit3.nesnePuaniGoster();
                            oyuncu1tas5.nesnePuaniGoster();
                            
                            //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1tas5.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1tas5.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2kagit3.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2kagit3.getSeviyePuani());
                            
                        }
                        else if("Kağıt4".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu2kagit4.nesnePuaniGoster();
                            oyuncu1tas5.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2kagit4.durumGuncelle(tas_etkisi);
                            
                            //oyuncu 2 için
                            kagit_etkisi=oyuncu2kagit4.etkiHesapla("Taş"); 
                            nesne_durum1=oyuncu1tas5.durumGuncelle(kagit_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1tas5.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2kagit4.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2kagit4.nesnePuaniGoster();
                            oyuncu1tas5.nesnePuaniGoster();
                            
                            //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1tas5.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1tas5.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2kagit4.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2kagit4.getSeviyePuani());
                        }
                        else if("Kağıt5".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu2kagit5.nesnePuaniGoster();
                            oyuncu1tas5.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2kagit5.durumGuncelle(tas_etkisi);
                            
                            //oyuncu 2 için
                            kagit_etkisi=oyuncu2kagit5.etkiHesapla("Taş"); 
                            nesne_durum1=oyuncu1tas5.durumGuncelle(kagit_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1tas5.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2kagit5.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2kagit5.nesnePuaniGoster();
                            oyuncu1tas5.nesnePuaniGoster();
                            
                            //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1tas5.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1tas5.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2kagit5.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2kagit5.getSeviyePuani());
                            
                        }
                    }
                 }
                 else if("Taş".equals(oyuncu1.nesneListesi.get(oyuncu1NesneIndex)) && "Makas".equals(oyuncu2.nesneListesi.get(oyuncu2NesneIndex))) {
                     System.out.println("Taş-Makas");
                     hamleler[i][0]="Round "+(i+1);
                     hamleler[i][1]="Taş";
                     hamleler[i][4]="Makas";
                     
                    if("Taş1".equals(oyuncu1.nesneListesiAdresleri.get(oyuncu1NesneIndex)))
                    {
                     /*
                     Taş1 Makas1
                     Taş1 Makas2
                     Taş1 Makas3
                     Taş1 Makas4
                     Taş1 Makas5
                     */
                        tas_etkisi=oyuncu1tas1.etkiHesapla("Makas");   
                        if("Makas1".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu2makas1.nesnePuaniGoster();
                            oyuncu1tas1.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2makas1.durumGuncelle(tas_etkisi);
                            
                            //oyuncu 2 için
                            makas_etkisi=oyuncu2makas1.etkiHesapla("Taş"); 
                            nesne_durum1=oyuncu1tas1.durumGuncelle(makas_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1tas1.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2makas1.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2makas1.nesnePuaniGoster();
                            oyuncu1tas1.nesnePuaniGoster();
                            
                            //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1tas1.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1tas1.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2makas1.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2makas1.getSeviyePuani());
                        }
                        else if("Makas2".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu2makas2.nesnePuaniGoster();
                            oyuncu1tas1.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2makas2.durumGuncelle(tas_etkisi);
                            
                            //oyuncu 2 için
                            makas_etkisi=oyuncu2makas2.etkiHesapla("Taş"); 
                            nesne_durum1=oyuncu1tas1.durumGuncelle(makas_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1tas1.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2makas2.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2makas2.nesnePuaniGoster();
                            oyuncu1tas1.nesnePuaniGoster();
                            
                            //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1tas1.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1tas1.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2makas2.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2makas2.getSeviyePuani());
                            
                        }
                        else if("Makas3".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu2makas3.nesnePuaniGoster();
                            oyuncu1tas1.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2makas3.durumGuncelle(tas_etkisi);
                            
                            //oyuncu 2 için
                            makas_etkisi=oyuncu2makas3.etkiHesapla("Taş"); 
                            nesne_durum1=oyuncu1tas1.durumGuncelle(makas_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1tas1.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2makas3.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2makas3.nesnePuaniGoster();
                            oyuncu1tas1.nesnePuaniGoster();
                            
                            //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1tas1.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1tas1.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2makas3.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2makas3.getSeviyePuani());
                            
                        }
                        else if("Makas4".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu2makas4.nesnePuaniGoster();
                            oyuncu1tas1.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2makas4.durumGuncelle(tas_etkisi);
                            
                            //oyuncu 2 için
                            makas_etkisi=oyuncu2makas4.etkiHesapla("Taş"); 
                            nesne_durum1=oyuncu1tas1.durumGuncelle(makas_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1tas1.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2makas4.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2makas4.nesnePuaniGoster();
                            oyuncu1tas1.nesnePuaniGoster();
                            
                            //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1tas1.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1tas1.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2makas4.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2makas4.getSeviyePuani());
                            
                        }
                        else if("Makas5".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu2makas5.nesnePuaniGoster();
                            oyuncu1tas1.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2makas5.durumGuncelle(tas_etkisi);
                            
                            //oyuncu 2 için
                            makas_etkisi=oyuncu2makas5.etkiHesapla("Taş"); 
                            nesne_durum1=oyuncu1tas1.durumGuncelle(makas_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1tas1.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2makas5.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2makas5.nesnePuaniGoster();
                            oyuncu1tas1.nesnePuaniGoster();
                            
                            //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1tas1.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1tas1.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2makas5.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2makas5.getSeviyePuani());
                        }
                        
                    }
                    else if("Taş2".equals(oyuncu1.nesneListesiAdresleri.get(oyuncu1NesneIndex)))
                    {
                     /*
                     Taş2 Makas1
                     Taş2 Makas2
                     Taş2 Makas3
                     Taş2 Makas4
                     Taş2 Makas5
                     */
                        tas_etkisi=oyuncu1tas2.etkiHesapla("Makas");   
                        if("Makas1".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu2makas1.nesnePuaniGoster();
                            oyuncu1tas2.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2makas1.durumGuncelle(tas_etkisi);
                            
                            //oyuncu 2 için
                            makas_etkisi=oyuncu2makas1.etkiHesapla("Taş"); 
                            nesne_durum1=oyuncu1tas2.durumGuncelle(makas_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1tas2.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2makas1.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2makas1.nesnePuaniGoster();
                            oyuncu1tas2.nesnePuaniGoster();
                            
                            //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1tas2.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1tas2.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2makas1.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2makas1.getSeviyePuani());
                            
                        }
                        else if("Makas2".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu2makas2.nesnePuaniGoster();
                            oyuncu1tas2.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2makas2.durumGuncelle(tas_etkisi);
                            
                            //oyuncu 2 için
                            makas_etkisi=oyuncu2makas2.etkiHesapla("Taş"); 
                            nesne_durum1=oyuncu1tas2.durumGuncelle(makas_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1tas2.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2makas2.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2makas2.nesnePuaniGoster();
                            oyuncu1tas2.nesnePuaniGoster();
                            
                            
                            //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1tas2.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1tas2.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2makas2.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2makas2.getSeviyePuani());
                            
                        }
                        else if("Makas3".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu2makas3.nesnePuaniGoster();
                            oyuncu1tas2.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2makas3.durumGuncelle(tas_etkisi);
                            
                            //oyuncu 2 için
                            makas_etkisi=oyuncu2makas3.etkiHesapla("Taş"); 
                            nesne_durum1=oyuncu1tas2.durumGuncelle(makas_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1tas2.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2makas3.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2makas3.nesnePuaniGoster();
                            oyuncu1tas2.nesnePuaniGoster();
                            
                            //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1tas2.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1tas2.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2makas3.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2makas3.getSeviyePuani());
                            
                        }
                        else if("Makas4".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu2makas4.nesnePuaniGoster();
                            oyuncu1tas2.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2makas4.durumGuncelle(tas_etkisi);
                            
                            //oyuncu 2 için
                            makas_etkisi=oyuncu2makas4.etkiHesapla("Taş"); 
                            nesne_durum1=oyuncu1tas2.durumGuncelle(makas_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1tas2.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2makas4.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2makas4.nesnePuaniGoster();
                            oyuncu1tas2.nesnePuaniGoster();
                            
                            //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1tas2.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1tas2.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2makas4.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2makas4.getSeviyePuani());
                            
                        }
                        else if("Makas5".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu2makas5.nesnePuaniGoster();
                            oyuncu1tas2.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2makas5.durumGuncelle(tas_etkisi);
                            
                            //oyuncu 2 için
                            makas_etkisi=oyuncu2makas5.etkiHesapla("Taş"); 
                            nesne_durum1=oyuncu1tas2.durumGuncelle(makas_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1tas2.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2makas5.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2makas5.nesnePuaniGoster();
                            oyuncu1tas2.nesnePuaniGoster();
                            
                            //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1tas2.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1tas2.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2makas5.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2makas5.getSeviyePuani());
                        }
                    }
                    else if("Taş3".equals(oyuncu1.nesneListesiAdresleri.get(oyuncu1NesneIndex)))
                    {
                     /*
                     Taş3 Makas1
                     Taş3 Makas2
                     Taş3 Makas3
                     Taş3 Makas4
                     Taş3 Makas5
                     */
                        tas_etkisi=oyuncu1tas3.etkiHesapla("Makas");   
                        if("Makas1".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu2makas1.nesnePuaniGoster();
                            oyuncu1tas3.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2makas1.durumGuncelle(tas_etkisi);
                            
                            //oyuncu 2 için
                            makas_etkisi=oyuncu2makas1.etkiHesapla("Taş"); 
                            nesne_durum1=oyuncu1tas3.durumGuncelle(makas_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1tas3.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2makas1.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2makas1.nesnePuaniGoster();
                            oyuncu1tas3.nesnePuaniGoster();
                            
                            //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1tas3.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1tas3.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2makas1.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2makas1.getSeviyePuani());
                            
                        }
                        else if("Makas2".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu2makas2.nesnePuaniGoster();
                            oyuncu1tas3.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2makas2.durumGuncelle(tas_etkisi);
                            
                            //oyuncu 2 için
                            makas_etkisi=oyuncu2makas2.etkiHesapla("Taş"); 
                            nesne_durum1=oyuncu1tas3.durumGuncelle(makas_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1tas3.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2makas2.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2makas2.nesnePuaniGoster();
                            oyuncu1tas3.nesnePuaniGoster();
                            
                            //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1tas3.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1tas3.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2makas2.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2makas2.getSeviyePuani());
                            
                        }
                        else if("Makas3".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu2makas3.nesnePuaniGoster();
                            oyuncu1tas3.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2makas3.durumGuncelle(tas_etkisi);
                            
                            //oyuncu 2 için
                            makas_etkisi=oyuncu2makas3.etkiHesapla("Taş"); 
                            nesne_durum1=oyuncu1tas3.durumGuncelle(makas_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1tas3.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2makas3.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2makas3.nesnePuaniGoster();
                            oyuncu1tas3.nesnePuaniGoster();
                            
                            //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1tas3.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1tas3.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2makas3.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2makas3.getSeviyePuani());
                        }
                        else if("Makas4".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu2makas4.nesnePuaniGoster();
                            oyuncu1tas3.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2makas4.durumGuncelle(tas_etkisi);
                            
                            //oyuncu 2 için
                            makas_etkisi=oyuncu2makas4.etkiHesapla("Taş"); 
                            nesne_durum1=oyuncu1tas3.durumGuncelle(makas_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1tas3.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2makas4.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2makas4.nesnePuaniGoster();
                            oyuncu1tas3.nesnePuaniGoster();
                            
                            //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1tas3.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1tas3.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2makas4.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2makas4.getSeviyePuani());
                            
                        }
                        else if("Makas5".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu2makas5.nesnePuaniGoster();
                            oyuncu1tas3.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2makas5.durumGuncelle(tas_etkisi);
                            
                            //oyuncu 2 için
                            makas_etkisi=oyuncu2makas5.etkiHesapla("Taş"); 
                            nesne_durum1=oyuncu1tas3.durumGuncelle(makas_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1tas3.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2makas5.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2makas5.nesnePuaniGoster();
                            oyuncu1tas3.nesnePuaniGoster();
                            
                            //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1tas3.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1tas3.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2makas5.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2makas5.getSeviyePuani());
                        }
                    }
                    else if("Taş4".equals(oyuncu1.nesneListesiAdresleri.get(oyuncu1NesneIndex)))
                    {
                     /*
                     Taş4 Makas1
                     Taş4 Makas2
                     Taş4 Makas3
                     Taş4 Makas4
                     Taş4 Makas5
                     */
                        tas_etkisi=oyuncu1tas4.etkiHesapla("Makas");   
                        if("Makas1".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu2makas1.nesnePuaniGoster();
                            oyuncu1tas4.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2makas1.durumGuncelle(tas_etkisi);
                            
                            //oyuncu 2 için
                            makas_etkisi=oyuncu2makas1.etkiHesapla("Taş"); 
                            nesne_durum1=oyuncu1tas4.durumGuncelle(makas_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1tas4.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2makas1.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2makas1.nesnePuaniGoster();
                            oyuncu1tas4.nesnePuaniGoster();
                            
                            //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1tas4.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1tas4.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2makas1.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2makas1.getSeviyePuani());
                            
                        }
                        else if("Makas2".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu2makas2.nesnePuaniGoster();
                            oyuncu1tas4.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2makas2.durumGuncelle(tas_etkisi);
                            
                            //oyuncu 2 için
                            makas_etkisi=oyuncu2makas2.etkiHesapla("Taş"); 
                            nesne_durum1=oyuncu1tas4.durumGuncelle(makas_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1tas4.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2makas2.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2makas2.nesnePuaniGoster();
                            oyuncu1tas4.nesnePuaniGoster();
                            
                            //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1tas4.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1tas4.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2makas2.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2makas2.getSeviyePuani());
                            
                        }
                        else if("Makas3".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu2makas3.nesnePuaniGoster();
                            oyuncu1tas4.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2makas3.durumGuncelle(tas_etkisi);
                            
                            //oyuncu 2 için
                            makas_etkisi=oyuncu2makas3.etkiHesapla("Taş"); 
                            nesne_durum1=oyuncu1tas4.durumGuncelle(makas_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1tas4.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2makas3.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2makas3.nesnePuaniGoster();
                            oyuncu1tas4.nesnePuaniGoster();
                            
                            //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1tas4.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1tas4.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2makas3.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2makas3.getSeviyePuani());
                        }
                        else if("Makas4".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu2makas4.nesnePuaniGoster();
                            oyuncu1tas4.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2makas4.durumGuncelle(tas_etkisi);
                            
                            //oyuncu 2 için
                            makas_etkisi=oyuncu2makas4.etkiHesapla("Taş"); 
                            nesne_durum1=oyuncu1tas4.durumGuncelle(makas_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1tas4.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2makas4.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2makas4.nesnePuaniGoster();
                            oyuncu1tas4.nesnePuaniGoster();
                            
                            //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1tas4.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1tas4.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2makas4.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2makas4.getSeviyePuani());
                        }
                        else if("Makas5".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu2makas5.nesnePuaniGoster();
                            oyuncu1tas4.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2makas5.durumGuncelle(tas_etkisi);
                            
                            //oyuncu 2 için
                            makas_etkisi=oyuncu2makas5.etkiHesapla("Taş"); 
                            nesne_durum1=oyuncu1tas4.durumGuncelle(makas_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1tas4.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2makas5.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2makas5.nesnePuaniGoster();
                            oyuncu1tas4.nesnePuaniGoster();
                            
                            //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1tas4.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1tas4.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2makas5.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2makas5.getSeviyePuani());
                        }
                    }
                    else if("Taş5".equals(oyuncu1.nesneListesiAdresleri.get(oyuncu1NesneIndex)))
                    {
                     /*
                     Taş5 Makas1
                     Taş5 Makas2
                     Taş5 Makas3
                     Taş5 Makas4
                     Taş5 Makas5
                     */
                        tas_etkisi=oyuncu1tas5.etkiHesapla("Makas");   
                        if("Makas1".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu2makas1.nesnePuaniGoster();
                            oyuncu1tas5.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2makas1.durumGuncelle(tas_etkisi);
                            
                            //oyuncu 2 için
                            makas_etkisi=oyuncu2makas1.etkiHesapla("Taş"); 
                            nesne_durum1=oyuncu1tas5.durumGuncelle(makas_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1tas5.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2makas1.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2makas1.nesnePuaniGoster();
                            oyuncu1tas5.nesnePuaniGoster();
                            
                            //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1tas5.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1tas5.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2makas1.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2makas1.getSeviyePuani());
                            
                        }
                        else if("Makas2".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu2makas2.nesnePuaniGoster();
                            oyuncu1tas5.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2makas2.durumGuncelle(tas_etkisi);
                            
                            //oyuncu 2 için
                            makas_etkisi=oyuncu2makas2.etkiHesapla("Taş"); 
                            nesne_durum1=oyuncu1tas5.durumGuncelle(makas_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1tas5.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2makas2.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2makas2.nesnePuaniGoster();
                            oyuncu1tas5.nesnePuaniGoster();
                            
                            //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1tas5.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1tas5.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2makas2.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2makas2.getSeviyePuani());
                            
                        }
                        else if("Makas3".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu2makas3.nesnePuaniGoster();
                            oyuncu1tas5.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2makas3.durumGuncelle(tas_etkisi);
                            
                            //oyuncu 2 için
                            makas_etkisi=oyuncu2makas3.etkiHesapla("Taş"); 
                            nesne_durum1=oyuncu1tas5.durumGuncelle(makas_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1tas5.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2makas3.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2makas3.nesnePuaniGoster();
                            oyuncu1tas5.nesnePuaniGoster();
                            
                            //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1tas5.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1tas5.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2makas3.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2makas3.getSeviyePuani());
                        }
                        else if("Makas4".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu2makas4.nesnePuaniGoster();
                            oyuncu1tas5.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2makas4.durumGuncelle(tas_etkisi);
                            
                            //oyuncu 2 için
                            makas_etkisi=oyuncu2makas4.etkiHesapla("Taş"); 
                            nesne_durum1=oyuncu1tas5.durumGuncelle(makas_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1tas5.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2makas4.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2makas4.nesnePuaniGoster();
                            oyuncu1tas5.nesnePuaniGoster();
                            
                            //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1tas5.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1tas5.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2makas4.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2makas4.getSeviyePuani());
                            
                        }
                        else if("Makas5".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu2makas5.nesnePuaniGoster();
                            oyuncu1tas5.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2makas5.durumGuncelle(tas_etkisi);
                            
                            //oyuncu 2 için
                            makas_etkisi=oyuncu2makas5.etkiHesapla("Taş"); 
                            nesne_durum1=oyuncu1tas5.durumGuncelle(makas_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1tas5.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2makas5.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2makas5.nesnePuaniGoster();
                            oyuncu1tas5.nesnePuaniGoster();
                            
                            //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1tas5.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1tas5.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2makas5.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2makas5.getSeviyePuani());
                        }
                    }
                     
                 }
                 else if("Kağıt".equals(oyuncu1.nesneListesi.get(oyuncu1NesneIndex)) && "Taş".equals(oyuncu2.nesneListesi.get(oyuncu2NesneIndex))) {
                     System.out.println("Kağıt-Taş");
                     hamleler[i][0]="Round "+(i+1);
                     hamleler[i][1]="Kağıt";
                     hamleler[i][4]="Taş";
                     
                    if("Kağıt1".equals(oyuncu1.nesneListesiAdresleri.get(oyuncu1NesneIndex)))
                    {
                     /*
                     Kağıt1 Taş1
                     Kağıt1 Taş2
                     Kağıt1 Taş3
                     Kağıt1 Taş4
                     Kağıt1 Taş5
                     */
                        kagit_etkisi=oyuncu1kagit1.etkiHesapla("Taş");   
                        if("Taş1".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu1kagit1.nesnePuaniGoster();
                            oyuncu2tas1.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2tas1.durumGuncelle(kagit_etkisi);
                            
                            //oyuncu 2 için
                            tas_etkisi=oyuncu2tas1.etkiHesapla("Kağıt"); 
                            nesne_durum1=oyuncu1kagit1.durumGuncelle(tas_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1kagit1.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2tas1.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2tas1.nesnePuaniGoster();
                            oyuncu1kagit1.nesnePuaniGoster();
                            
                            //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1kagit1.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1kagit1.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2tas1.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2tas1.getSeviyePuani());
                        }
                        else if("Taş2".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu1kagit1.nesnePuaniGoster();
                            oyuncu2tas2.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2tas2.durumGuncelle(kagit_etkisi);
                            
                            //oyuncu 2 için
                            tas_etkisi=oyuncu2tas2.etkiHesapla("Kağıt"); 
                            nesne_durum1=oyuncu1kagit1.durumGuncelle(tas_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1kagit1.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2tas2.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2tas2.nesnePuaniGoster();
                            oyuncu1kagit1.nesnePuaniGoster();
                            
                            //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1kagit1.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1kagit1.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2tas2.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2tas2.getSeviyePuani());
                        }
                        else if("Taş3".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu1kagit1.nesnePuaniGoster();
                            oyuncu2tas3.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2tas3.durumGuncelle(kagit_etkisi);
                            
                            //oyuncu 2 için
                            tas_etkisi=oyuncu2tas3.etkiHesapla("Kağıt"); 
                            nesne_durum1=oyuncu1kagit1.durumGuncelle(tas_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1kagit1.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2tas3.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2tas3.nesnePuaniGoster();
                            oyuncu1kagit1.nesnePuaniGoster();
                            
                            //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1kagit1.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1kagit1.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2tas3.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2tas3.getSeviyePuani());
                            
                        }
                        else if("Taş4".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu1kagit1.nesnePuaniGoster();
                            oyuncu2tas4.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2tas4.durumGuncelle(kagit_etkisi);
                            
                            //oyuncu 2 için
                            tas_etkisi=oyuncu2tas4.etkiHesapla("Kağıt"); 
                            nesne_durum1=oyuncu1kagit1.durumGuncelle(tas_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1kagit1.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2tas4.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2tas4.nesnePuaniGoster();
                            oyuncu1kagit1.nesnePuaniGoster();
                            
                            //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1kagit1.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1kagit1.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2tas4.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2tas4.getSeviyePuani());
                        }
                        else if("Taş5".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu1kagit1.nesnePuaniGoster();
                            oyuncu2tas5.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2tas5.durumGuncelle(kagit_etkisi);
                            
                            //oyuncu 2 için
                            tas_etkisi=oyuncu2tas5.etkiHesapla("Kağıt"); 
                            nesne_durum1=oyuncu1kagit1.durumGuncelle(tas_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1kagit1.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2tas5.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2tas5.nesnePuaniGoster();
                            oyuncu1kagit1.nesnePuaniGoster();
                            
                            //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1kagit1.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1kagit1.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2tas5.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2tas5.getSeviyePuani());
                        }
                        
                    }
                    else if("Kağıt2".equals(oyuncu1.nesneListesiAdresleri.get(oyuncu1NesneIndex)))
                    {
                     /*
                     Kağıt2 Taş1
                     Kağıt2 Taş2
                     Kağıt2 Taş3
                     Kağıt2 Taş4
                     Kağıt2 Taş5
                     */
                        kagit_etkisi=oyuncu1kagit2.etkiHesapla("Taş");   
                        if("Taş1".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu1kagit2.nesnePuaniGoster();
                            oyuncu2tas1.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2tas1.durumGuncelle(kagit_etkisi);
                            
                            //oyuncu 2 için
                            tas_etkisi=oyuncu2tas1.etkiHesapla("Kağıt"); 
                            nesne_durum1=oyuncu1kagit2.durumGuncelle(tas_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1kagit2.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2tas1.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2tas1.nesnePuaniGoster();
                            oyuncu1kagit2.nesnePuaniGoster();
                            
                            //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1kagit2.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1kagit2.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2tas1.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2tas1.getSeviyePuani());
                            
                        }
                        else if("Taş2".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu1kagit2.nesnePuaniGoster();
                            oyuncu2tas2.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2tas2.durumGuncelle(kagit_etkisi);
                            
                            //oyuncu 2 için
                            tas_etkisi=oyuncu2tas2.etkiHesapla("Kağıt"); 
                            nesne_durum1=oyuncu1kagit2.durumGuncelle(tas_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1kagit2.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2tas2.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2tas2.nesnePuaniGoster();
                            oyuncu1kagit2.nesnePuaniGoster();
                            
                            //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1kagit2.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1kagit2.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2tas2.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2tas2.getSeviyePuani());
                            
                        }
                        else if("Taş3".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu1kagit2.nesnePuaniGoster();
                            oyuncu2tas3.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2tas3.durumGuncelle(kagit_etkisi);
                            
                            //oyuncu 2 için
                            tas_etkisi=oyuncu2tas3.etkiHesapla("Kağıt"); 
                            nesne_durum1=oyuncu1kagit2.durumGuncelle(tas_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1kagit2.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2tas3.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2tas3.nesnePuaniGoster();
                            oyuncu1kagit2.nesnePuaniGoster();
                            
                            //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1kagit2.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1kagit2.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2tas3.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2tas3.getSeviyePuani());
                            
                        }
                        else if("Taş4".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu1kagit2.nesnePuaniGoster();
                            oyuncu2tas4.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2tas4.durumGuncelle(kagit_etkisi);
                            
                            //oyuncu 2 için
                            tas_etkisi=oyuncu2tas4.etkiHesapla("Kağıt"); 
                            nesne_durum1=oyuncu1kagit2.durumGuncelle(tas_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1kagit2.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2tas4.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2tas4.nesnePuaniGoster();
                            oyuncu1kagit2.nesnePuaniGoster();
                            
                            //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1kagit2.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1kagit2.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2tas4.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2tas4.getSeviyePuani());
                            
                        }
                        else if("Taş5".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu1kagit2.nesnePuaniGoster();
                            oyuncu2tas5.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2tas5.durumGuncelle(kagit_etkisi);
                            
                            //oyuncu 2 için
                            tas_etkisi=oyuncu2tas5.etkiHesapla("Kağıt"); 
                            nesne_durum1=oyuncu1kagit2.durumGuncelle(tas_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1kagit2.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2tas5.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2tas5.nesnePuaniGoster();
                            oyuncu1kagit2.nesnePuaniGoster();
                            
                            //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1kagit2.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1kagit2.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2tas5.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2tas5.getSeviyePuani());
                        }
                    }
                    else if("Kağıt3".equals(oyuncu1.nesneListesiAdresleri.get(oyuncu1NesneIndex)))
                    {
                     /*
                     Kağıt3 Taş1
                     Kağıt3 Taş2
                     Kağıt3 Taş3
                     Kağıt3 Taş4
                     Kağıt3 Taş5
                     */
                        kagit_etkisi=oyuncu1kagit3.etkiHesapla("Taş");   
                        if("Taş1".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu1kagit3.nesnePuaniGoster();
                            oyuncu2tas1.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2tas1.durumGuncelle(kagit_etkisi);
                            
                            //oyuncu 2 için
                            tas_etkisi=oyuncu2tas1.etkiHesapla("Kağıt"); 
                            nesne_durum1=oyuncu1kagit3.durumGuncelle(tas_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1kagit3.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2tas1.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2tas1.nesnePuaniGoster();
                            oyuncu1kagit3.nesnePuaniGoster();
                            
                            //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1kagit3.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1kagit3.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2tas1.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2tas1.getSeviyePuani());
                            
                        }
                        else if("Taş2".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu1kagit3.nesnePuaniGoster();
                            oyuncu2tas2.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2tas2.durumGuncelle(kagit_etkisi);
                            
                            //oyuncu 2 için
                            tas_etkisi=oyuncu2tas2.etkiHesapla("Kağıt"); 
                            nesne_durum1=oyuncu1kagit3.durumGuncelle(tas_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1kagit3.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2tas2.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2tas2.nesnePuaniGoster();
                            oyuncu1kagit3.nesnePuaniGoster();
                            
                            //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1kagit3.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1kagit3.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2tas2.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2tas2.getSeviyePuani());
                            
                        }
                        else if("Taş3".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu1kagit3.nesnePuaniGoster();
                            oyuncu2tas3.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2tas3.durumGuncelle(kagit_etkisi);
                            
                            //oyuncu 2 için
                            tas_etkisi=oyuncu2tas3.etkiHesapla("Kağıt"); 
                            nesne_durum1=oyuncu1kagit3.durumGuncelle(tas_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1kagit3.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2tas3.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2tas3.nesnePuaniGoster();
                            oyuncu1kagit3.nesnePuaniGoster();
                            
                            //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1kagit3.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1kagit3.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2tas3.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2tas3.getSeviyePuani());
                            
                        }
                        else if("Taş4".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu1kagit3.nesnePuaniGoster();
                            oyuncu2tas4.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2tas4.durumGuncelle(kagit_etkisi);
                            
                            //oyuncu 2 için
                            tas_etkisi=oyuncu2tas4.etkiHesapla("Kağıt"); 
                            nesne_durum1=oyuncu1kagit3.durumGuncelle(tas_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1kagit3.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2tas4.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2tas4.nesnePuaniGoster();
                            oyuncu1kagit3.nesnePuaniGoster();
                            
                            //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1kagit3.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1kagit3.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2tas4.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2tas4.getSeviyePuani());
                        }
                        else if("Taş5".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu1kagit3.nesnePuaniGoster();
                            oyuncu2tas5.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2tas5.durumGuncelle(kagit_etkisi);
                            
                            //oyuncu 2 için
                            tas_etkisi=oyuncu2tas5.etkiHesapla("Kağıt"); 
                            nesne_durum1=oyuncu1kagit3.durumGuncelle(tas_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1kagit3.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2tas5.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2tas5.nesnePuaniGoster();
                            oyuncu1kagit3.nesnePuaniGoster();
                            
                            //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1kagit3.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1kagit3.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2tas5.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2tas5.getSeviyePuani());
                        }
                    }
                    else if("Kağıt4".equals(oyuncu1.nesneListesiAdresleri.get(oyuncu1NesneIndex)))
                    {
                     /*
                     Kağıt4 Taş1
                     Kağıt4 Taş2
                     Kağıt4 Taş3
                     Kağıt4 Taş4
                     Kağıt4 Taş5
                     */
                        kagit_etkisi=oyuncu1kagit4.etkiHesapla("Taş");   
                        if("Taş1".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu1kagit4.nesnePuaniGoster();
                            oyuncu2tas1.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2tas1.durumGuncelle(kagit_etkisi);
                            
                            //oyuncu 2 için
                            tas_etkisi=oyuncu2tas1.etkiHesapla("Kağıt"); 
                            nesne_durum1=oyuncu1kagit4.durumGuncelle(tas_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1kagit4.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2tas1.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2tas1.nesnePuaniGoster();
                            oyuncu1kagit4.nesnePuaniGoster();
                            
                            //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1kagit4.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1kagit4.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2tas1.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2tas1.getSeviyePuani());
                        }
                        else if("Taş2".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu1kagit4.nesnePuaniGoster();
                            oyuncu2tas2.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2tas2.durumGuncelle(kagit_etkisi);
                            
                            //oyuncu 2 için
                            tas_etkisi=oyuncu2tas2.etkiHesapla("Kağıt"); 
                            nesne_durum1=oyuncu1kagit4.durumGuncelle(tas_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1kagit4.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2tas2.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2tas2.nesnePuaniGoster();
                            oyuncu1kagit4.nesnePuaniGoster();
                            
                            //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1kagit4.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1kagit4.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2tas2.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2tas2.getSeviyePuani());
                        }
                        else if("Taş3".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu1kagit4.nesnePuaniGoster();
                            oyuncu2tas3.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2tas3.durumGuncelle(kagit_etkisi);
                            
                            //oyuncu 2 için
                            tas_etkisi=oyuncu2tas3.etkiHesapla("Kağıt"); 
                            nesne_durum1=oyuncu1kagit4.durumGuncelle(tas_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1kagit4.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2tas3.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2tas3.nesnePuaniGoster();
                            oyuncu1kagit4.nesnePuaniGoster();
                            
                            //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1kagit4.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1kagit4.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2tas3.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2tas3.getSeviyePuani());
                            
                        }
                        else if("Taş4".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu1kagit4.nesnePuaniGoster();
                            oyuncu2tas4.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2tas4.durumGuncelle(kagit_etkisi);
                            
                            //oyuncu 2 için
                            tas_etkisi=oyuncu2tas4.etkiHesapla("Kağıt"); 
                            nesne_durum1=oyuncu1kagit4.durumGuncelle(tas_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1kagit4.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2tas4.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2tas4.nesnePuaniGoster();
                            oyuncu1kagit4.nesnePuaniGoster();
                            
                            //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1kagit4.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1kagit4.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2tas4.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2tas4.getSeviyePuani());
                        }
                        else if("Taş5".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu1kagit4.nesnePuaniGoster();
                            oyuncu2tas5.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2tas5.durumGuncelle(kagit_etkisi);
                            
                            //oyuncu 2 için
                            tas_etkisi=oyuncu2tas5.etkiHesapla("Kağıt"); 
                            nesne_durum1=oyuncu1kagit4.durumGuncelle(tas_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1kagit4.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2tas5.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2tas5.nesnePuaniGoster();
                            oyuncu1kagit4.nesnePuaniGoster();
                            
                            //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1kagit4.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1kagit4.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2tas5.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2tas5.getSeviyePuani());
                        }
                    }
                    else if("Kağıt5".equals(oyuncu1.nesneListesiAdresleri.get(oyuncu1NesneIndex)))
                    {
                     /*
                     Kağıt5 Taş1
                     Kağıt5 Taş2
                     Kağıt5 Taş3
                     Kağıt5 Taş4
                     Kağıt5 Taş5
                     */
                        kagit_etkisi=oyuncu1kagit5.etkiHesapla("Taş");   
                        if("Taş1".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu1kagit5.nesnePuaniGoster();
                            oyuncu2tas1.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2tas1.durumGuncelle(kagit_etkisi);
                            
                            //oyuncu 2 için
                            tas_etkisi=oyuncu2tas1.etkiHesapla("Kağıt"); 
                            nesne_durum1=oyuncu1kagit5.durumGuncelle(tas_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1kagit5.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2tas1.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2tas1.nesnePuaniGoster();
                            oyuncu1kagit5.nesnePuaniGoster();
                            
                            //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1kagit5.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1kagit5.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2tas1.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2tas1.getSeviyePuani());
                            
                        }
                        else if("Taş2".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu1kagit5.nesnePuaniGoster();
                            oyuncu2tas2.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2tas2.durumGuncelle(kagit_etkisi);
                            
                            //oyuncu 2 için
                            tas_etkisi=oyuncu2tas2.etkiHesapla("Kağıt"); 
                            nesne_durum1=oyuncu1kagit5.durumGuncelle(tas_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1kagit5.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2tas2.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2tas2.nesnePuaniGoster();
                            oyuncu1kagit5.nesnePuaniGoster();
                            
                            //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1kagit5.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1kagit5.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2tas2.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2tas2.getSeviyePuani());
                        }
                        else if("Taş3".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu1kagit5.nesnePuaniGoster();
                            oyuncu2tas3.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2tas3.durumGuncelle(kagit_etkisi);
                            
                            //oyuncu 2 için
                            tas_etkisi=oyuncu2tas3.etkiHesapla("Kağıt"); 
                            nesne_durum1=oyuncu1kagit5.durumGuncelle(tas_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1kagit5.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2tas3.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2tas3.nesnePuaniGoster();
                            oyuncu1kagit5.nesnePuaniGoster();
                            
                            //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1kagit5.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1kagit5.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2tas3.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2tas3.getSeviyePuani());
                            
                        }
                        else if("Taş4".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu1kagit5.nesnePuaniGoster();
                            oyuncu2tas4.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2tas4.durumGuncelle(kagit_etkisi);
                            
                            //oyuncu 2 için
                            tas_etkisi=oyuncu2tas4.etkiHesapla("Kağıt"); 
                            nesne_durum1=oyuncu1kagit5.durumGuncelle(tas_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1kagit5.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2tas4.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2tas4.nesnePuaniGoster();
                            oyuncu1kagit5.nesnePuaniGoster();
                            
                            //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1kagit5.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1kagit5.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2tas4.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2tas4.getSeviyePuani());
                        }
                        else if("Taş5".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu1kagit5.nesnePuaniGoster();
                            oyuncu2tas5.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2tas5.durumGuncelle(kagit_etkisi);
                            
                            //oyuncu 2 için
                            tas_etkisi=oyuncu2tas5.etkiHesapla("Kağıt"); 
                            nesne_durum1=oyuncu1kagit5.durumGuncelle(tas_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1kagit5.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2tas5.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2tas5.nesnePuaniGoster();
                            oyuncu1kagit5.nesnePuaniGoster();
                            
                            //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1kagit5.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1kagit5.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2tas5.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2tas5.getSeviyePuani());
                        }
                    }
                 }
                 else if("Kağıt".equals(oyuncu1.nesneListesi.get(oyuncu1NesneIndex)) && "Makas".equals(oyuncu2.nesneListesi.get(oyuncu2NesneIndex))) {
                     System.out.println("Kağıt-Makas");
                     hamleler[i][0]="Round "+(i+1);
                     hamleler[i][1]="Kağıt";
                     hamleler[i][4]="Makas";
                     
                     if("Kağıt1".equals(oyuncu1.nesneListesiAdresleri.get(oyuncu1NesneIndex)))
                     {
                     /*
                     Kağıt1 Makas1
                     Kağıt1 Makas2
                     Kağıt1 Makas3
                     Kağıt1 Makas4
                     Kağıt1 Makas5
                     */   
                        kagit_etkisi=oyuncu1kagit1.etkiHesapla("Makas");   
                        if("Makas1".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu1kagit1.nesnePuaniGoster();
                            oyuncu2makas1.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2makas1.durumGuncelle(kagit_etkisi);
                            
                            //oyuncu 2 için
                            makas_etkisi=oyuncu2makas1.etkiHesapla("Kağıt"); 
                            nesne_durum1=oyuncu1kagit1.durumGuncelle(makas_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1kagit1.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2makas1.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2makas1.nesnePuaniGoster();
                            oyuncu1kagit1.nesnePuaniGoster();
                            
                            //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1kagit1.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1kagit1.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2makas1.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2makas1.getSeviyePuani());
                        }
                        else if("Makas2".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu1kagit1.nesnePuaniGoster();
                            oyuncu2makas2.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2makas2.durumGuncelle(kagit_etkisi);
                            
                            //oyuncu 2 için
                            makas_etkisi=oyuncu2makas2.etkiHesapla("Kağıt"); 
                            nesne_durum1=oyuncu1kagit1.durumGuncelle(makas_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1kagit1.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2makas2.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2makas2.nesnePuaniGoster();
                            oyuncu1kagit1.nesnePuaniGoster();
                            
                            //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1kagit1.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1kagit1.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2makas2.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2makas2.getSeviyePuani());
                            
                        }
                        else if("Makas3".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu1kagit1.nesnePuaniGoster();
                            oyuncu2makas3.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2makas3.durumGuncelle(kagit_etkisi);
                            
                            //oyuncu 2 için
                            makas_etkisi=oyuncu2makas3.etkiHesapla("Kağıt"); 
                            nesne_durum1=oyuncu1kagit1.durumGuncelle(makas_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1kagit1.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2makas3.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2makas3.nesnePuaniGoster();
                            oyuncu1kagit1.nesnePuaniGoster();
                            
                            //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1kagit1.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1kagit1.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2makas3.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2makas3.getSeviyePuani());
                            
                        }
                        else if("Makas4".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu1kagit1.nesnePuaniGoster();
                            oyuncu2makas4.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2makas4.durumGuncelle(kagit_etkisi);
                            
                            //oyuncu 2 için
                            makas_etkisi=oyuncu2makas4.etkiHesapla("Kağıt"); 
                            nesne_durum1=oyuncu1kagit1.durumGuncelle(makas_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1kagit1.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2makas4.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2makas4.nesnePuaniGoster();
                            oyuncu1kagit1.nesnePuaniGoster();
                            
                            //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1kagit1.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1kagit1.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2makas4.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2makas4.getSeviyePuani());
                        }
                        else if("Makas5".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu1kagit1.nesnePuaniGoster();
                            oyuncu2makas5.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2makas5.durumGuncelle(kagit_etkisi);
                            
                            //oyuncu 2 için
                            makas_etkisi=oyuncu2makas5.etkiHesapla("Kağıt"); 
                            nesne_durum1=oyuncu1kagit1.durumGuncelle(makas_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1kagit1.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2makas5.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2makas5.nesnePuaniGoster();
                            oyuncu1kagit1.nesnePuaniGoster();
                            
                            //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1kagit1.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1kagit1.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2makas5.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2makas5.getSeviyePuani());
                        }
                         
                     }
                     else if("Kağıt2".equals(oyuncu1.nesneListesiAdresleri.get(oyuncu1NesneIndex)))
                     {
                     /*
                     Kağıt2 Makas1
                     Kağıt2 Makas2
                     Kağıt2 Makas3
                     Kağıt2 Makas4
                     Kağıt2 Makas5
                     */   
                        kagit_etkisi=oyuncu1kagit2.etkiHesapla("Makas");   
                        if("Makas1".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu1kagit2.nesnePuaniGoster();
                            oyuncu2makas1.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2makas1.durumGuncelle(kagit_etkisi);
                            
                            //oyuncu 2 için
                            makas_etkisi=oyuncu2makas1.etkiHesapla("Kağıt"); 
                            nesne_durum1=oyuncu1kagit2.durumGuncelle(makas_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1kagit2.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2makas1.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2makas1.nesnePuaniGoster();
                            oyuncu1kagit2.nesnePuaniGoster();
                            
                            //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1kagit2.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1kagit2.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2makas1.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2makas1.getSeviyePuani());
                            
                        }
                        else if("Makas2".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu1kagit2.nesnePuaniGoster();
                            oyuncu2makas2.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2makas2.durumGuncelle(kagit_etkisi);
                            
                            //oyuncu 2 için
                            makas_etkisi=oyuncu2makas2.etkiHesapla("Kağıt"); 
                            nesne_durum1=oyuncu1kagit2.durumGuncelle(makas_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1kagit2.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2makas2.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2makas2.nesnePuaniGoster();
                            oyuncu1kagit2.nesnePuaniGoster();
                            
                            //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1kagit2.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1kagit2.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2makas2.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2makas2.getSeviyePuani());
                            
                        }
                        else if("Makas3".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu1kagit2.nesnePuaniGoster();
                            oyuncu2makas3.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2makas3.durumGuncelle(kagit_etkisi);
                            
                            //oyuncu 2 için
                            makas_etkisi=oyuncu2makas3.etkiHesapla("Kağıt"); 
                            nesne_durum1=oyuncu1kagit2.durumGuncelle(makas_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1kagit2.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2makas3.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2makas3.nesnePuaniGoster();
                            oyuncu1kagit2.nesnePuaniGoster();
                            
                            //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1kagit2.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1kagit2.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2makas3.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2makas3.getSeviyePuani());
                            
                        }
                        else if("Makas4".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu1kagit2.nesnePuaniGoster();
                            oyuncu2makas4.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2makas4.durumGuncelle(kagit_etkisi);
                            
                            //oyuncu 2 için
                            makas_etkisi=oyuncu2makas4.etkiHesapla("Kağıt"); 
                            nesne_durum1=oyuncu1kagit2.durumGuncelle(makas_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1kagit2.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2makas4.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2makas4.nesnePuaniGoster();
                            oyuncu1kagit2.nesnePuaniGoster();
                            
                            //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1kagit2.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1kagit2.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2makas4.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2makas4.getSeviyePuani());
                        }
                        else if("Makas5".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu1kagit2.nesnePuaniGoster();
                            oyuncu2makas5.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2makas5.durumGuncelle(kagit_etkisi);
                            
                            //oyuncu 2 için
                            makas_etkisi=oyuncu2makas5.etkiHesapla("Kağıt"); 
                            nesne_durum1=oyuncu1kagit2.durumGuncelle(makas_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1kagit2.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2makas5.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2makas5.nesnePuaniGoster();
                            oyuncu1kagit2.nesnePuaniGoster();
                            
                            //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1kagit2.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1kagit2.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2makas5.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2makas5.getSeviyePuani());
                        }
                     }
                     else if("Kağıt3".equals(oyuncu1.nesneListesiAdresleri.get(oyuncu1NesneIndex)))
                     {
                     /*
                     Kağıt3 Makas1
                     Kağıt3 Makas2
                     Kağıt3 Makas3
                     Kağıt3 Makas4
                     Kağıt3 Makas5
                     */  
                        kagit_etkisi=oyuncu1kagit3.etkiHesapla("Makas");   
                        if("Makas1".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu1kagit3.nesnePuaniGoster();
                            oyuncu2makas1.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2makas1.durumGuncelle(kagit_etkisi);
                            
                            //oyuncu 2 için
                            makas_etkisi=oyuncu2makas1.etkiHesapla("Kağıt"); 
                            nesne_durum1=oyuncu1kagit3.durumGuncelle(makas_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1kagit3.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2makas1.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2makas1.nesnePuaniGoster();
                            oyuncu1kagit3.nesnePuaniGoster();
                            
                            //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1kagit3.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1kagit3.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2makas1.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2makas1.getSeviyePuani());
                        }
                        else if("Makas2".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu1kagit3.nesnePuaniGoster();
                            oyuncu2makas2.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2makas2.durumGuncelle(kagit_etkisi);
                            
                            //oyuncu 2 için
                            makas_etkisi=oyuncu2makas2.etkiHesapla("Kağıt"); 
                            nesne_durum1=oyuncu1kagit3.durumGuncelle(makas_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1kagit3.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2makas2.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2makas2.nesnePuaniGoster();
                            oyuncu1kagit3.nesnePuaniGoster();
                            
                            //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1kagit3.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1kagit3.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2makas2.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2makas2.getSeviyePuani());
                            
                        }
                        else if("Makas3".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu1kagit3.nesnePuaniGoster();
                            oyuncu2makas3.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2makas3.durumGuncelle(kagit_etkisi);
                            
                            //oyuncu 2 için
                            makas_etkisi=oyuncu2makas3.etkiHesapla("Kağıt"); 
                            nesne_durum1=oyuncu1kagit3.durumGuncelle(makas_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1kagit3.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2makas3.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2makas3.nesnePuaniGoster();
                            oyuncu1kagit3.nesnePuaniGoster();
                            
                            //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1kagit3.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1kagit3.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2makas3.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2makas3.getSeviyePuani());
                            
                        }
                        else if("Makas4".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu1kagit3.nesnePuaniGoster();
                            oyuncu2makas4.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2makas4.durumGuncelle(kagit_etkisi);
                            
                            //oyuncu 2 için
                            makas_etkisi=oyuncu2makas4.etkiHesapla("Kağıt"); 
                            nesne_durum1=oyuncu1kagit3.durumGuncelle(makas_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1kagit3.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2makas4.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2makas4.nesnePuaniGoster();
                            oyuncu1kagit3.nesnePuaniGoster();
                            
                            //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1kagit3.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1kagit3.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2makas4.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2makas4.getSeviyePuani());
                        }
                        else if("Makas5".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu1kagit3.nesnePuaniGoster();
                            oyuncu2makas5.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2makas5.durumGuncelle(kagit_etkisi);
                            
                            //oyuncu 2 için
                            makas_etkisi=oyuncu2makas5.etkiHesapla("Kağıt"); 
                            nesne_durum1=oyuncu1kagit3.durumGuncelle(makas_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1kagit3.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2makas5.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2makas5.nesnePuaniGoster();
                            oyuncu1kagit3.nesnePuaniGoster();
                            
                            //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1kagit3.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1kagit3.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2makas5.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2makas5.getSeviyePuani());
                        }
                        
                     }
                     else if("Kağıt4".equals(oyuncu1.nesneListesiAdresleri.get(oyuncu1NesneIndex)))
                     {
                     /*
                     Kağıt4 Makas1
                     Kağıt4 Makas2
                     Kağıt4 Makas3
                     Kağıt4 Makas4
                     Kağıt4 Makas5
                     */  
                        kagit_etkisi=oyuncu1kagit4.etkiHesapla("Makas");   
                        if("Makas1".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu1kagit4.nesnePuaniGoster();
                            oyuncu2makas1.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2makas1.durumGuncelle(kagit_etkisi);
                            
                            //oyuncu 2 için
                            makas_etkisi=oyuncu2makas1.etkiHesapla("Kağıt"); 
                            nesne_durum1=oyuncu1kagit4.durumGuncelle(makas_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1kagit4.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2makas1.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2makas1.nesnePuaniGoster();
                            oyuncu1kagit4.nesnePuaniGoster();
                            
                            //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1kagit4.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1kagit4.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2makas1.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2makas1.getSeviyePuani());
                        }
                        else if("Makas2".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu1kagit4.nesnePuaniGoster();
                            oyuncu2makas2.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2makas2.durumGuncelle(kagit_etkisi);
                            
                            //oyuncu 2 için
                            makas_etkisi=oyuncu2makas2.etkiHesapla("Kağıt"); 
                            nesne_durum1=oyuncu1kagit4.durumGuncelle(makas_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1kagit4.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2makas2.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2makas2.nesnePuaniGoster();
                            oyuncu1kagit4.nesnePuaniGoster();
                            
                            //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1kagit4.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1kagit4.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2makas2.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2makas2.getSeviyePuani());
                            
                        }
                        else if("Makas3".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu1kagit4.nesnePuaniGoster();
                            oyuncu2makas3.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2makas3.durumGuncelle(kagit_etkisi);
                            
                            //oyuncu 2 için
                            makas_etkisi=oyuncu2makas3.etkiHesapla("Kağıt"); 
                            nesne_durum1=oyuncu1kagit4.durumGuncelle(makas_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1kagit4.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2makas3.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2makas3.nesnePuaniGoster();
                            oyuncu1kagit4.nesnePuaniGoster();
                            
                            //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1kagit4.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1kagit4.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2makas3.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2makas3.getSeviyePuani());
                        }
                        else if("Makas4".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu1kagit4.nesnePuaniGoster();
                            oyuncu2makas4.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2makas4.durumGuncelle(kagit_etkisi);
                            
                            //oyuncu 2 için
                            makas_etkisi=oyuncu2makas4.etkiHesapla("Kağıt"); 
                            nesne_durum1=oyuncu1kagit4.durumGuncelle(makas_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1kagit4.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2makas4.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2makas4.nesnePuaniGoster();
                            oyuncu1kagit4.nesnePuaniGoster();
                            
                            //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1kagit4.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1kagit4.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2makas4.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2makas4.getSeviyePuani());
                        }
                        else if("Makas5".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu1kagit4.nesnePuaniGoster();
                            oyuncu2makas5.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2makas5.durumGuncelle(kagit_etkisi);
                            
                            //oyuncu 2 için
                            makas_etkisi=oyuncu2makas5.etkiHesapla("Kağıt"); 
                            nesne_durum1=oyuncu1kagit4.durumGuncelle(makas_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1kagit4.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2makas5.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2makas5.nesnePuaniGoster();
                            oyuncu1kagit4.nesnePuaniGoster();
                            
                            //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1kagit4.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1kagit4.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2makas5.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2makas5.getSeviyePuani());
                        }
                     }
                     else if("Kağıt5".equals(oyuncu1.nesneListesiAdresleri.get(oyuncu1NesneIndex)))
                     {
                     /*
                     Kağıt5 Makas1
                     Kağıt5 Makas2
                     Kağıt5 Makas3
                     Kağıt5 Makas4
                     Kağıt5 Makas5
                     */  
                        kagit_etkisi=oyuncu1kagit5.etkiHesapla("Makas");   
                        if("Makas1".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu1kagit5.nesnePuaniGoster();
                            oyuncu2makas1.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2makas1.durumGuncelle(kagit_etkisi);
                            
                            //oyuncu 2 için
                            makas_etkisi=oyuncu2makas1.etkiHesapla("Kağıt"); 
                            nesne_durum1=oyuncu1kagit5.durumGuncelle(makas_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1kagit5.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2makas1.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2makas1.nesnePuaniGoster();
                            oyuncu1kagit5.nesnePuaniGoster();
                            
                            //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1kagit5.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1kagit5.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2makas1.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2makas1.getSeviyePuani());
                        }
                        else if("Makas2".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu1kagit5.nesnePuaniGoster();
                            oyuncu2makas2.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2makas2.durumGuncelle(kagit_etkisi);
                            
                            //oyuncu 2 için
                            makas_etkisi=oyuncu2makas2.etkiHesapla("Kağıt"); 
                            nesne_durum1=oyuncu1kagit5.durumGuncelle(makas_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1kagit5.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2makas2.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2makas2.nesnePuaniGoster();
                            oyuncu1kagit5.nesnePuaniGoster();
                            
                            //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1kagit5.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1kagit5.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2makas2.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2makas2.getSeviyePuani());
                            
                        }
                        else if("Makas3".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu1kagit5.nesnePuaniGoster();
                            oyuncu2makas3.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2makas3.durumGuncelle(kagit_etkisi);
                            
                            //oyuncu 2 için
                            makas_etkisi=oyuncu2makas3.etkiHesapla("Kağıt"); 
                            nesne_durum1=oyuncu1kagit5.durumGuncelle(makas_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1kagit5.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2makas3.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2makas3.nesnePuaniGoster();
                            oyuncu1kagit5.nesnePuaniGoster();
                            
                            //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1kagit5.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1kagit5.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2makas3.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2makas3.getSeviyePuani());
                        }
                        else if("Makas4".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu1kagit5.nesnePuaniGoster();
                            oyuncu2makas4.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2makas4.durumGuncelle(kagit_etkisi);
                            
                            //oyuncu 2 için
                            makas_etkisi=oyuncu2makas4.etkiHesapla("Kağıt"); 
                            nesne_durum1=oyuncu1kagit5.durumGuncelle(makas_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1kagit5.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2makas4.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2makas4.nesnePuaniGoster();
                            oyuncu1kagit5.nesnePuaniGoster();
                            
                            //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1kagit5.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1kagit5.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2makas4.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2makas4.getSeviyePuani());
                            
                        }
                        else if("Makas5".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu1kagit5.nesnePuaniGoster();
                            oyuncu2makas5.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2makas5.durumGuncelle(kagit_etkisi);
                            
                            //oyuncu 2 için
                            makas_etkisi=oyuncu2makas5.etkiHesapla("Kağıt"); 
                            nesne_durum1=oyuncu1kagit5.durumGuncelle(makas_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1kagit5.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2makas5.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2makas5.nesnePuaniGoster();
                            oyuncu1kagit5.nesnePuaniGoster();
                            
                            //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1kagit5.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1kagit5.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2makas5.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2makas5.getSeviyePuani());
                        }  
                     }
                 }
                 else if("Makas".equals(oyuncu1.nesneListesi.get(oyuncu1NesneIndex)) && "Taş".equals(oyuncu2.nesneListesi.get(oyuncu2NesneIndex))) {
                     System.out.println("Makas-Taş");
                     hamleler[i][0]="Round "+(i+1);
                     hamleler[i][1]="Makas";
                     hamleler[i][4]="Taş";
                     
                     if("Makas1".equals(oyuncu1.nesneListesiAdresleri.get(oyuncu1NesneIndex)))
                     {
                     /*
                     Makas1 Taş1
                     Makas1 Taş2
                     Makas1 Taş3
                     Makas1 Taş4
                     Makas1 Taş5
                     */   
                        makas_etkisi=oyuncu1makas1.etkiHesapla("Taş");   
                        if("Taş1".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu2tas1.nesnePuaniGoster();
                            oyuncu1makas1.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2tas1.durumGuncelle(makas_etkisi);
                            
                            //oyuncu 2 için
                            tas_etkisi=oyuncu2tas1.etkiHesapla("Makas"); 
                            nesne_durum1=oyuncu1makas1.durumGuncelle(tas_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1makas1.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2tas1.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2tas1.nesnePuaniGoster();
                            oyuncu1makas1.nesnePuaniGoster();
                            
                            //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1makas1.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1makas1.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2tas1.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2tas1.getSeviyePuani());
                        }
                        else if("Taş2".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu2tas2.nesnePuaniGoster();
                            oyuncu1makas1.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2tas2.durumGuncelle(makas_etkisi);
                            
                            //oyuncu 2 için
                            tas_etkisi=oyuncu2tas2.etkiHesapla("Makas"); 
                            nesne_durum1=oyuncu1makas1.durumGuncelle(tas_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1makas1.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2tas2.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2tas2.nesnePuaniGoster();
                            oyuncu1makas1.nesnePuaniGoster();
                            
                            //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1makas1.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1makas1.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2tas2.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2tas2.getSeviyePuani());
                        }
                        else if("Taş3".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu2tas3.nesnePuaniGoster();
                            oyuncu1makas1.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2tas3.durumGuncelle(makas_etkisi);
                            
                            //oyuncu 2 için
                            tas_etkisi=oyuncu2tas3.etkiHesapla("Makas"); 
                            nesne_durum1=oyuncu1makas1.durumGuncelle(tas_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1makas1.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2tas3.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2tas3.nesnePuaniGoster();
                            oyuncu1makas1.nesnePuaniGoster();
                            
                            //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1makas1.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1makas1.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2tas3.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2tas3.getSeviyePuani());
                        }
                        else if("Taş4".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu2tas4.nesnePuaniGoster();
                            oyuncu1makas1.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2tas4.durumGuncelle(makas_etkisi);
                            
                            //oyuncu 2 için
                            tas_etkisi=oyuncu2tas4.etkiHesapla("Makas"); 
                            nesne_durum1=oyuncu1makas1.durumGuncelle(tas_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1makas1.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2tas4.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2tas4.nesnePuaniGoster();
                            oyuncu1makas1.nesnePuaniGoster();
                            
                            //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1makas1.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1makas1.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2tas4.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2tas4.getSeviyePuani());
                        }
                        else if("Taş5".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu2tas5.nesnePuaniGoster();
                            oyuncu1makas1.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2tas5.durumGuncelle(makas_etkisi);
                            
                            //oyuncu 2 için
                            tas_etkisi=oyuncu2tas5.etkiHesapla("Makas"); 
                            nesne_durum1=oyuncu1makas1.durumGuncelle(tas_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1makas1.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2tas5.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2tas5.nesnePuaniGoster();
                            oyuncu1makas1.nesnePuaniGoster();
                            
                            //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1makas1.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1makas1.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2tas5.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2tas5.getSeviyePuani());
                        }
                         
                     }
                     else if("Makas2".equals(oyuncu1.nesneListesiAdresleri.get(oyuncu1NesneIndex)))
                     {
                     /*
                     Makas2 Taş1
                     Makas2 Taş2
                     Makas2 Taş3
                     Makas2 Taş4
                     Makas2 Taş5
                     */   
                        makas_etkisi=oyuncu1makas2.etkiHesapla("Taş");   
                        if("Taş1".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu2tas1.nesnePuaniGoster();
                            oyuncu1makas2.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2tas1.durumGuncelle(makas_etkisi);
                            
                            //oyuncu 2 için
                            tas_etkisi=oyuncu2tas1.etkiHesapla("Makas"); 
                            nesne_durum1=oyuncu1makas2.durumGuncelle(tas_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1makas2.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2tas1.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2tas1.nesnePuaniGoster();
                            oyuncu1makas2.nesnePuaniGoster();
                            
                            //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1makas2.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1makas2.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2tas1.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2tas1.getSeviyePuani());
                        }
                        else if("Taş2".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu2tas2.nesnePuaniGoster();
                            oyuncu1makas2.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2tas2.durumGuncelle(makas_etkisi);
                            
                            //oyuncu 2 için
                            tas_etkisi=oyuncu2tas2.etkiHesapla("Makas"); 
                            nesne_durum1=oyuncu1makas2.durumGuncelle(tas_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1makas2.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2tas2.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2tas2.nesnePuaniGoster();
                            oyuncu1makas2.nesnePuaniGoster();
                            
                            //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1makas2.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1makas2.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2tas2.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2tas2.getSeviyePuani());
                        }
                        else if("Taş3".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu2tas3.nesnePuaniGoster();
                            oyuncu1makas2.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2tas3.durumGuncelle(makas_etkisi);
                            
                            //oyuncu 2 için
                            tas_etkisi=oyuncu2tas3.etkiHesapla("Makas"); 
                            nesne_durum1=oyuncu1makas2.durumGuncelle(tas_etkisi);
                                                     
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1makas2.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2tas3.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2tas3.nesnePuaniGoster();
                            oyuncu1makas2.nesnePuaniGoster();
                            
                            //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1makas2.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1makas2.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2tas3.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2tas3.getSeviyePuani());
                        }
                        else if("Taş4".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu2tas4.nesnePuaniGoster();
                            oyuncu1makas2.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2tas4.durumGuncelle(makas_etkisi);
                            
                            //oyuncu 2 için
                            tas_etkisi=oyuncu2tas4.etkiHesapla("Makas"); 
                            nesne_durum1=oyuncu1makas2.durumGuncelle(tas_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1makas2.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2tas4.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2tas4.nesnePuaniGoster();
                            oyuncu1makas2.nesnePuaniGoster();
                            
                            //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1makas2.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1makas2.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2tas4.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2tas4.getSeviyePuani());
                            
                        }
                        else if("Taş5".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu2tas5.nesnePuaniGoster();
                            oyuncu1makas2.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2tas5.durumGuncelle(makas_etkisi);
                            
                            //oyuncu 2 için
                            tas_etkisi=oyuncu2tas5.etkiHesapla("Makas"); 
                            nesne_durum1=oyuncu1makas2.durumGuncelle(tas_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1makas2.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2tas5.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2tas5.nesnePuaniGoster();
                            oyuncu1makas2.nesnePuaniGoster();
                            
                            //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1makas2.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1makas2.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2tas5.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2tas5.getSeviyePuani());
                        }
                     }
                     else if("Makas3".equals(oyuncu1.nesneListesiAdresleri.get(oyuncu1NesneIndex)))
                     {
                     /*
                     Makas3 Taş1
                     Makas3 Taş2
                     Makas3 Taş3
                     Makas3 Taş4
                     Makas3 Taş5
                     */   
                        makas_etkisi=oyuncu1makas3.etkiHesapla("Taş");   
                        if("Taş1".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu2tas1.nesnePuaniGoster();
                            oyuncu1makas3.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2tas1.durumGuncelle(makas_etkisi);
                            
                            //oyuncu 2 için
                            tas_etkisi=oyuncu2tas1.etkiHesapla("Makas"); 
                            nesne_durum1=oyuncu1makas3.durumGuncelle(tas_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1makas3.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2tas1.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2tas1.nesnePuaniGoster();
                            oyuncu1makas3.nesnePuaniGoster();
                            
                            //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1makas3.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1makas3.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2tas1.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2tas1.getSeviyePuani());
                        }
                        else if("Taş2".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu2tas2.nesnePuaniGoster();
                            oyuncu1makas3.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2tas2.durumGuncelle(makas_etkisi);
                            
                            //oyuncu 2 için
                            tas_etkisi=oyuncu2tas2.etkiHesapla("Makas"); 
                            nesne_durum1=oyuncu1makas3.durumGuncelle(tas_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1makas3.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2tas2.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2tas2.nesnePuaniGoster();
                            oyuncu1makas3.nesnePuaniGoster();
                            
                            //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1makas3.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1makas3.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2tas2.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2tas2.getSeviyePuani());
                        }
                        else if("Taş3".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu2tas3.nesnePuaniGoster();
                            oyuncu1makas3.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2tas3.durumGuncelle(makas_etkisi);
                            
                            //oyuncu 2 için
                            tas_etkisi=oyuncu2tas3.etkiHesapla("Makas"); 
                            nesne_durum1=oyuncu1makas3.durumGuncelle(tas_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1makas3.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2tas3.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2tas3.nesnePuaniGoster();
                            oyuncu1makas3.nesnePuaniGoster();
                            
                            //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1makas3.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1makas3.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2tas3.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2tas3.getSeviyePuani());
                        }
                        else if("Taş4".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu2tas4.nesnePuaniGoster();
                            oyuncu1makas3.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2tas4.durumGuncelle(makas_etkisi);
                            
                            //oyuncu 2 için
                            tas_etkisi=oyuncu2tas4.etkiHesapla("Makas"); 
                            nesne_durum1=oyuncu1makas3.durumGuncelle(tas_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1makas3.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2tas4.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2tas4.nesnePuaniGoster();
                            oyuncu1makas3.nesnePuaniGoster();
                         
                            //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1makas3.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1makas3.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2tas4.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2tas4.getSeviyePuani());
                        }
                        else if("Taş5".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu2tas5.nesnePuaniGoster();
                            oyuncu1makas3.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2tas5.durumGuncelle(makas_etkisi);
                            
                            //oyuncu 2 için
                            tas_etkisi=oyuncu2tas5.etkiHesapla("Makas"); 
                            nesne_durum1=oyuncu1makas3.durumGuncelle(tas_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1makas3.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2tas5.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2tas5.nesnePuaniGoster();
                            oyuncu1makas3.nesnePuaniGoster();
                            
                            //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1makas3.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1makas3.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2tas5.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2tas5.getSeviyePuani());
                        }
                        
                     }
                     else if("Makas4".equals(oyuncu1.nesneListesiAdresleri.get(oyuncu1NesneIndex)))
                     {
                     /*
                     Makas4 Taş1
                     Makas4 Taş2
                     Makas4 Taş3
                     Makas4 Taş4
                     Makas4 Taş5
                     */   
                        makas_etkisi=oyuncu1makas4.etkiHesapla("Taş");   
                        if("Taş1".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu2tas1.nesnePuaniGoster();
                            oyuncu1makas4.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2tas1.durumGuncelle(makas_etkisi);
                            
                            //oyuncu 2 için
                            tas_etkisi=oyuncu2tas1.etkiHesapla("Makas"); 
                            nesne_durum1=oyuncu1makas4.durumGuncelle(tas_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1makas4.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2tas1.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2tas1.nesnePuaniGoster();
                            oyuncu1makas4.nesnePuaniGoster();
                            
                            //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1makas4.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1makas4.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2tas1.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2tas1.getSeviyePuani());
                        }
                        else if("Taş2".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu2tas2.nesnePuaniGoster();
                            oyuncu1makas4.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2tas2.durumGuncelle(makas_etkisi);
                            
                            //oyuncu 2 için
                            tas_etkisi=oyuncu2tas2.etkiHesapla("Makas"); 
                            nesne_durum1=oyuncu1makas4.durumGuncelle(tas_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1makas4.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2tas2.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2tas2.nesnePuaniGoster();
                            oyuncu1makas4.nesnePuaniGoster();
                            
                            //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1makas4.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1makas4.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2tas2.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2tas2.getSeviyePuani());
                            
                        }
                        else if("Taş3".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu2tas3.nesnePuaniGoster();
                            oyuncu1makas4.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2tas3.durumGuncelle(makas_etkisi);
                            
                            //oyuncu 2 için
                            tas_etkisi=oyuncu2tas3.etkiHesapla("Makas"); 
                            nesne_durum1=oyuncu1makas4.durumGuncelle(tas_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1makas4.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2tas3.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2tas3.nesnePuaniGoster();
                            oyuncu1makas4.nesnePuaniGoster();
                            
                            //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1makas4.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1makas4.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2tas3.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2tas3.getSeviyePuani());
                            
                        }
                        else if("Taş4".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu2tas4.nesnePuaniGoster();
                            oyuncu1makas4.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2tas4.durumGuncelle(makas_etkisi);
                            
                            //oyuncu 2 için
                            tas_etkisi=oyuncu2tas4.etkiHesapla("Makas"); 
                            nesne_durum1=oyuncu1makas4.durumGuncelle(tas_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1makas4.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2tas4.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2tas4.nesnePuaniGoster();
                            oyuncu1makas4.nesnePuaniGoster();
                            
                            //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1makas4.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1makas4.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2tas4.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2tas4.getSeviyePuani());
                        }
                        else if("Taş5".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu2tas5.nesnePuaniGoster();
                            oyuncu1makas4.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2tas5.durumGuncelle(makas_etkisi);
                            
                            //oyuncu 2 için
                            tas_etkisi=oyuncu2tas5.etkiHesapla("Makas"); 
                            nesne_durum1=oyuncu1makas4.durumGuncelle(tas_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1makas4.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2tas5.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2tas5.nesnePuaniGoster();
                            oyuncu1makas4.nesnePuaniGoster();
                            
                            //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1makas4.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1makas4.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2tas5.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2tas5.getSeviyePuani());
                        }
                     }
                     else if("Makas5".equals(oyuncu1.nesneListesiAdresleri.get(oyuncu1NesneIndex)))
                     {
                     /*
                     Makas5 Taş1
                     Makas5 Taş2
                     Makas5 Taş3
                     Makas5 Taş4
                     Makas5 Taş5
                     */   
                        makas_etkisi=oyuncu1makas5.etkiHesapla("Taş");   
                        if("Taş1".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu2tas1.nesnePuaniGoster();
                            oyuncu1makas5.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2tas1.durumGuncelle(makas_etkisi);
                            
                            //oyuncu 2 için
                            tas_etkisi=oyuncu2tas1.etkiHesapla("Makas"); 
                            nesne_durum1=oyuncu1makas5.durumGuncelle(tas_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1makas5.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2tas1.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2tas1.nesnePuaniGoster();
                            oyuncu1makas5.nesnePuaniGoster();
                            
                            //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1makas5.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1makas5.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2tas1.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2tas1.getSeviyePuani());
                        }
                        else if("Taş2".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu2tas2.nesnePuaniGoster();
                            oyuncu1makas5.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2tas2.durumGuncelle(makas_etkisi);
                            
                            //oyuncu 2 için
                            tas_etkisi=oyuncu2tas2.etkiHesapla("Makas"); 
                            nesne_durum1=oyuncu1makas5.durumGuncelle(tas_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1makas5.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2tas2.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2tas2.nesnePuaniGoster();
                            oyuncu1makas5.nesnePuaniGoster();
                            
                            //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1makas5.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1makas5.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2tas2.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2tas2.getSeviyePuani());
                            
                        }
                        else if("Taş3".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu2tas3.nesnePuaniGoster();
                            oyuncu1makas5.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2tas3.durumGuncelle(makas_etkisi);
                            
                            //oyuncu 2 için
                            tas_etkisi=oyuncu2tas3.etkiHesapla("Makas"); 
                            nesne_durum1=oyuncu1makas5.durumGuncelle(tas_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1makas5.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2tas3.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2tas3.nesnePuaniGoster();
                            oyuncu1makas5.nesnePuaniGoster();
                            
                            //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1makas5.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1makas5.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2tas3.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2tas3.getSeviyePuani());
                        }
                        else if("Taş4".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu2tas4.nesnePuaniGoster();
                            oyuncu1makas5.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2tas4.durumGuncelle(makas_etkisi);
                            
                            //oyuncu 2 için
                            tas_etkisi=oyuncu2tas4.etkiHesapla("Makas"); 
                            nesne_durum1=oyuncu1makas5.durumGuncelle(tas_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1makas5.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2tas4.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2tas4.nesnePuaniGoster();
                            oyuncu1makas5.nesnePuaniGoster();
                            
                            //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1makas5.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1makas5.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2tas4.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2tas4.getSeviyePuani());
                        }
                        else if("Taş5".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu2tas5.nesnePuaniGoster();
                            oyuncu1makas5.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2tas5.durumGuncelle(makas_etkisi);
                            
                            //oyuncu 2 için
                            tas_etkisi=oyuncu2tas5.etkiHesapla("Makas"); 
                            nesne_durum1=oyuncu1makas5.durumGuncelle(tas_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1makas5.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2tas5.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2tas5.nesnePuaniGoster();
                            oyuncu1makas5.nesnePuaniGoster();
                            
                            //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1makas5.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1makas5.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2tas5.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2tas5.getSeviyePuani());
                        } 
                     }
                 }
                 else if("Makas".equals(oyuncu1.nesneListesi.get(oyuncu1NesneIndex)) && "Kağıt".equals(oyuncu2.nesneListesi.get(oyuncu2NesneIndex))) {
                     System.out.println("Makas-Kağıt");
                     hamleler[i][0]="Round "+(i+1);
                     hamleler[i][1]="Makas";
                     hamleler[i][4]="Kağıt";
                     
                                          
                     if("Makas1".equals(oyuncu1.nesneListesiAdresleri.get(oyuncu1NesneIndex)))
                     {
                     /*
                     Makas1 Kağıt1
                     Makas1 Kağıt2
                     Makas1 Kağıt3
                     Makas1 Kağıt4
                     Makas1 Kağıt5
                     */   
                        makas_etkisi=oyuncu1makas1.etkiHesapla("Kağıt");   
                        if("Kağıt1".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu2kagit1.nesnePuaniGoster();
                            oyuncu1makas1.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2kagit1.durumGuncelle(makas_etkisi);
                            
                            //oyuncu 2 için
                            kagit_etkisi=oyuncu2kagit1.etkiHesapla("Makas"); 
                            nesne_durum1=oyuncu1makas1.durumGuncelle(kagit_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1makas1.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2kagit1.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2kagit1.nesnePuaniGoster();
                            oyuncu1makas1.nesnePuaniGoster();
                            
                            //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1makas1.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1makas1.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2kagit1.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2kagit1.getSeviyePuani());
                        }
                        else if("Kağıt2".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu2kagit2.nesnePuaniGoster();
                            oyuncu1makas1.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2kagit2.durumGuncelle(makas_etkisi);
                            
                            //oyuncu 2 için
                            kagit_etkisi=oyuncu2kagit2.etkiHesapla("Makas"); 
                            nesne_durum1=oyuncu1makas1.durumGuncelle(kagit_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1makas1.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2kagit2.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2kagit2.nesnePuaniGoster();
                            oyuncu1makas1.nesnePuaniGoster();
                            
                            //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1makas1.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1makas1.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2kagit2.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2kagit2.getSeviyePuani());
                        }
                        else if("Kağıt3".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu2kagit3.nesnePuaniGoster();
                            oyuncu1makas1.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2kagit3.durumGuncelle(makas_etkisi);
                            
                            //oyuncu 2 için
                            kagit_etkisi=oyuncu2kagit3.etkiHesapla("Makas"); 
                            nesne_durum1=oyuncu1makas1.durumGuncelle(kagit_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1makas1.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2kagit3.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2kagit3.nesnePuaniGoster();
                            oyuncu1makas1.nesnePuaniGoster();
                            
                            //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1makas1.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1makas1.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2kagit3.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2kagit3.getSeviyePuani());
                        }
                        else if("Kağıt4".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu2kagit4.nesnePuaniGoster();
                            oyuncu1makas1.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2kagit4.durumGuncelle(makas_etkisi);
                            
                            //oyuncu 2 için
                            kagit_etkisi=oyuncu2kagit4.etkiHesapla("Makas"); 
                            nesne_durum1=oyuncu1makas1.durumGuncelle(kagit_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1makas1.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2kagit4.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2kagit4.nesnePuaniGoster();
                            oyuncu1makas1.nesnePuaniGoster();
                            
                            //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1makas1.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1makas1.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2kagit4.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2kagit4.getSeviyePuani());
                        }
                        else if("Kağıt5".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu2kagit5.nesnePuaniGoster();
                            oyuncu1makas1.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2kagit5.durumGuncelle(makas_etkisi);
                            
                            //oyuncu 2 için
                            kagit_etkisi=oyuncu2kagit5.etkiHesapla("Makas"); 
                            nesne_durum1=oyuncu1makas1.durumGuncelle(kagit_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1makas1.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2kagit5.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2kagit5.nesnePuaniGoster();
                            oyuncu1makas1.nesnePuaniGoster();
                            
                            //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1makas1.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1makas1.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2kagit5.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2kagit5.getSeviyePuani());
                        }
                         
                     }
                     else if("Makas2".equals(oyuncu1.nesneListesiAdresleri.get(oyuncu1NesneIndex)))
                     {
                     /*
                     Makas2 Kağıt1
                     Makas2 Kağıt2
                     Makas2 Kağıt3
                     Makas2 Kağıt4
                     Makas2 Kağıt5
                     */   
                        makas_etkisi=oyuncu1makas2.etkiHesapla("Kağıt");   
                        if("Kağıt1".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu2kagit1.nesnePuaniGoster();
                            oyuncu1makas2.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2kagit1.durumGuncelle(makas_etkisi);
                            
                            //oyuncu 2 için
                            kagit_etkisi=oyuncu2kagit1.etkiHesapla("Makas"); 
                            nesne_durum1=oyuncu1makas2.durumGuncelle(kagit_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1makas2.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2kagit1.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2kagit1.nesnePuaniGoster();
                            oyuncu1makas2.nesnePuaniGoster();
                            
                            //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1makas2.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1makas2.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2kagit1.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2kagit1.getSeviyePuani());
                        }
                        else if("Kağıt2".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu2kagit2.nesnePuaniGoster();
                            oyuncu1makas2.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2kagit2.durumGuncelle(makas_etkisi);
                            
                            //oyuncu 2 için
                            kagit_etkisi=oyuncu2kagit2.etkiHesapla("Makas"); 
                            nesne_durum1=oyuncu1makas2.durumGuncelle(kagit_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1makas2.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2kagit2.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2kagit2.nesnePuaniGoster();
                            oyuncu1makas2.nesnePuaniGoster();
                            
                            //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1makas2.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1makas2.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2kagit2.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2kagit2.getSeviyePuani());
                        }
                        else if("Kağıt3".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu2kagit3.nesnePuaniGoster();
                            oyuncu1makas2.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2kagit3.durumGuncelle(makas_etkisi);
                            
                            //oyuncu 2 için
                            kagit_etkisi=oyuncu2kagit3.etkiHesapla("Makas"); 
                            nesne_durum1=oyuncu1makas2.durumGuncelle(kagit_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1makas2.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2kagit3.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2kagit3.nesnePuaniGoster();
                            oyuncu1makas2.nesnePuaniGoster();
                            
                            //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1makas2.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1makas2.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2kagit3.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2kagit3.getSeviyePuani());
                        }
                        else if("Kağıt4".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu2kagit4.nesnePuaniGoster();
                            oyuncu1makas2.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2kagit4.durumGuncelle(makas_etkisi);
                            
                            //oyuncu 2 için
                            kagit_etkisi=oyuncu2kagit4.etkiHesapla("Makas"); 
                            nesne_durum1=oyuncu1makas2.durumGuncelle(kagit_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1makas2.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2kagit4.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2kagit4.nesnePuaniGoster();
                            oyuncu1makas2.nesnePuaniGoster();
                            
                            //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1makas2.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1makas2.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2kagit4.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2kagit4.getSeviyePuani());
                        }
                        else if("Kağıt5".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu2kagit5.nesnePuaniGoster();
                            oyuncu1makas2.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2kagit5.durumGuncelle(makas_etkisi);
                            
                            //oyuncu 2 için
                            kagit_etkisi=oyuncu2kagit5.etkiHesapla("Makas"); 
                            nesne_durum1=oyuncu1makas2.durumGuncelle(kagit_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1makas2.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2kagit5.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2kagit5.nesnePuaniGoster();
                            oyuncu1makas2.nesnePuaniGoster();
                            
                            //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1makas2.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1makas2.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2kagit5.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2kagit5.getSeviyePuani());
                        }
                     }
                     else if("Makas3".equals(oyuncu1.nesneListesiAdresleri.get(oyuncu1NesneIndex)))
                     {
                     /*
                     Makas3 Kağıt1
                     Makas3 Kağıt2
                     Makas3 Kağıt3
                     Makas3 Kağıt4
                     Makas3 Kağıt5
                     */   
                        makas_etkisi=oyuncu1makas3.etkiHesapla("Kağıt");   
                        if("Kağıt1".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu2kagit1.nesnePuaniGoster();
                            oyuncu1makas3.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2kagit1.durumGuncelle(makas_etkisi);
                            
                            //oyuncu 2 için
                            kagit_etkisi=oyuncu2kagit1.etkiHesapla("Makas"); 
                            nesne_durum1=oyuncu1makas3.durumGuncelle(kagit_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1makas3.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2kagit1.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2kagit1.nesnePuaniGoster();
                            oyuncu1makas3.nesnePuaniGoster();
                            
                            //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1makas3.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1makas3.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2kagit1.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2kagit1.getSeviyePuani());
                        }
                        else if("Kağıt2".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu2kagit2.nesnePuaniGoster();
                            oyuncu1makas3.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2kagit2.durumGuncelle(makas_etkisi);
                            
                            //oyuncu 2 için
                            kagit_etkisi=oyuncu2kagit2.etkiHesapla("Makas"); 
                            nesne_durum1=oyuncu1makas3.durumGuncelle(kagit_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1makas3.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2kagit2.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2kagit2.nesnePuaniGoster();
                            oyuncu1makas3.nesnePuaniGoster();
                            
                            //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1makas3.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1makas3.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2kagit2.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2kagit2.getSeviyePuani());
                        }
                        else if("Kağıt3".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu2kagit3.nesnePuaniGoster();
                            oyuncu1makas3.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2kagit3.durumGuncelle(makas_etkisi);
                            
                            //oyuncu 2 için
                            kagit_etkisi=oyuncu2kagit3.etkiHesapla("Makas"); 
                            nesne_durum1=oyuncu1makas3.durumGuncelle(kagit_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1makas3.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2kagit3.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2kagit3.nesnePuaniGoster();
                            oyuncu1makas3.nesnePuaniGoster();
                            
                            //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1makas3.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1makas3.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2kagit3.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2kagit3.getSeviyePuani());
                        }
                        else if("Kağıt4".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu2kagit4.nesnePuaniGoster();
                            oyuncu1makas3.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2kagit4.durumGuncelle(makas_etkisi);
                            
                            //oyuncu 2 için
                            kagit_etkisi=oyuncu2kagit4.etkiHesapla("Makas"); 
                            nesne_durum1=oyuncu1makas3.durumGuncelle(kagit_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1makas3.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2kagit4.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2kagit4.nesnePuaniGoster();
                            oyuncu1makas3.nesnePuaniGoster();
                            
                            //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1makas3.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1makas3.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2kagit4.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2kagit4.getSeviyePuani());
                        }
                        else if("Kağıt5".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu2kagit5.nesnePuaniGoster();
                            oyuncu1makas3.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2kagit5.durumGuncelle(makas_etkisi);
                            
                            //oyuncu 2 için
                            kagit_etkisi=oyuncu2kagit5.etkiHesapla("Makas"); 
                            nesne_durum1=oyuncu1makas3.durumGuncelle(kagit_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1makas3.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2kagit5.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2kagit5.nesnePuaniGoster();
                            oyuncu1makas3.nesnePuaniGoster();
                         
                            //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1makas3.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1makas3.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2kagit5.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2kagit5.getSeviyePuani());
                        }
                        
                     }
                     else if("Makas4".equals(oyuncu1.nesneListesiAdresleri.get(oyuncu1NesneIndex)))
                     {
                     /*
                     Makas4 Kağıt1
                     Makas4 Kağıt2
                     Makas4 Kağıt3
                     Makas4 Kağıt4
                     Makas4 Kağıt5
                     */   
                        makas_etkisi=oyuncu1makas4.etkiHesapla("Kağıt");   
                        if("Kağıt1".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu2kagit1.nesnePuaniGoster();
                            oyuncu1makas4.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2kagit1.durumGuncelle(makas_etkisi);
                            
                            //oyuncu 2 için
                            kagit_etkisi=oyuncu2kagit1.etkiHesapla("Makas"); 
                            nesne_durum1=oyuncu1makas4.durumGuncelle(kagit_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1makas4.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2kagit1.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2kagit1.nesnePuaniGoster();
                            oyuncu1makas4.nesnePuaniGoster();
                            
                            //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1makas4.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1makas4.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2kagit1.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2kagit1.getSeviyePuani());
                        }
                        else if("Kağıt2".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu2kagit2.nesnePuaniGoster();
                            oyuncu1makas4.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2kagit2.durumGuncelle(makas_etkisi);
                            
                            //oyuncu 2 için
                            kagit_etkisi=oyuncu2kagit2.etkiHesapla("Makas"); 
                            nesne_durum1=oyuncu1makas4.durumGuncelle(kagit_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1makas4.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2kagit2.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2kagit2.nesnePuaniGoster();
                            oyuncu1makas4.nesnePuaniGoster();
                            
                            //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1makas4.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1makas4.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2kagit2.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2kagit2.getSeviyePuani());
                        }
                        else if("Kağıt3".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu2kagit3.nesnePuaniGoster();
                            oyuncu1makas4.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2kagit3.durumGuncelle(makas_etkisi);
                            
                            //oyuncu 2 için
                            kagit_etkisi=oyuncu2kagit3.etkiHesapla("Makas"); 
                            nesne_durum1=oyuncu1makas4.durumGuncelle(kagit_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1makas4.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2kagit3.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2kagit3.nesnePuaniGoster();
                            oyuncu1makas4.nesnePuaniGoster();
                            
                            //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1makas4.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1makas4.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2kagit3.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2kagit3.getSeviyePuani());
                        }
                        else if("Kağıt4".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu2kagit4.nesnePuaniGoster();
                            oyuncu1makas4.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2kagit4.durumGuncelle(makas_etkisi);
                            
                            //oyuncu 2 için
                            kagit_etkisi=oyuncu2kagit4.etkiHesapla("Makas"); 
                            nesne_durum1=oyuncu1makas4.durumGuncelle(kagit_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1makas4.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2kagit4.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2kagit4.nesnePuaniGoster();
                            oyuncu1makas4.nesnePuaniGoster();
                            
                            //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1makas4.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1makas4.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2kagit4.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2kagit4.getSeviyePuani());
                        }
                        else if("Kağıt5".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu2kagit5.nesnePuaniGoster();
                            oyuncu1makas4.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2kagit5.durumGuncelle(makas_etkisi);
                            
                            //oyuncu 2 için
                            kagit_etkisi=oyuncu2kagit5.etkiHesapla("Makas"); 
                            nesne_durum1=oyuncu1makas4.durumGuncelle(kagit_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1makas4.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2kagit5.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2kagit5.nesnePuaniGoster();
                            oyuncu1makas4.nesnePuaniGoster();
                            
                            //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1makas4.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1makas4.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2kagit5.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2kagit5.getSeviyePuani());
                        }
                     }
                     else if("Makas5".equals(oyuncu1.nesneListesiAdresleri.get(oyuncu1NesneIndex)))
                     {
                     /*
                     Makas5 Kağıt1
                     Makas5 Kağıt2
                     Makas5 Kağıt3
                     Makas5 Kağıt4
                     Makas5 Kağıt5
                     */   
                        makas_etkisi=oyuncu1makas5.etkiHesapla("Kağıt");   
                        if("Kağıt1".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu2kagit1.nesnePuaniGoster();
                            oyuncu1makas5.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2kagit1.durumGuncelle(makas_etkisi);
                            
                            //oyuncu 2 için
                            kagit_etkisi=oyuncu2kagit1.etkiHesapla("Makas"); 
                            nesne_durum1=oyuncu1makas5.durumGuncelle(kagit_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1makas5.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2kagit1.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2kagit1.nesnePuaniGoster();
                            oyuncu1makas5.nesnePuaniGoster();
                           
                            //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1makas5.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1makas5.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2kagit1.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2kagit1.getSeviyePuani());
                        }
                        else if("Kağıt2".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu2kagit2.nesnePuaniGoster();
                            oyuncu1makas5.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2kagit2.durumGuncelle(makas_etkisi);
                            
                            //oyuncu 2 için
                            kagit_etkisi=oyuncu2kagit2.etkiHesapla("Makas"); 
                            nesne_durum1=oyuncu1makas5.durumGuncelle(kagit_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1makas5.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2kagit2.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2kagit2.nesnePuaniGoster();
                            oyuncu1makas5.nesnePuaniGoster();
                         
                            //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1makas5.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1makas5.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2kagit2.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2kagit2.getSeviyePuani());
                        }
                        else if("Kağıt3".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu2kagit3.nesnePuaniGoster();
                            oyuncu1makas5.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2kagit3.durumGuncelle(makas_etkisi);
                            
                            //oyuncu 2 için
                            kagit_etkisi=oyuncu2kagit3.etkiHesapla("Makas"); 
                            nesne_durum1=oyuncu1makas5.durumGuncelle(kagit_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1makas5.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2kagit3.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2kagit3.nesnePuaniGoster();
                            oyuncu1makas5.nesnePuaniGoster();
                        
                            //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1makas5.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1makas5.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2kagit3.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2kagit3.getSeviyePuani());
                        }
                        else if("Kağıt4".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu2kagit4.nesnePuaniGoster();
                            oyuncu1makas5.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2kagit4.durumGuncelle(makas_etkisi);
                            
                            //oyuncu 2 için
                            kagit_etkisi=oyuncu2kagit4.etkiHesapla("Makas"); 
                            nesne_durum1=oyuncu1makas5.durumGuncelle(kagit_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1makas5.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2kagit4.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2kagit4.nesnePuaniGoster();
                            oyuncu1makas5.nesnePuaniGoster();
                        
                            //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1makas5.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1makas5.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2kagit4.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2kagit4.getSeviyePuani());
                        }
                        else if("Kağıt5".equals(oyuncu2.nesneListesiAdresleri.get(oyuncu2NesneIndex)))
                        {
                            oyuncu2kagit5.nesnePuaniGoster();
                            oyuncu1makas5.nesnePuaniGoster();
                            
                            nesne_durum2=oyuncu2kagit5.durumGuncelle(makas_etkisi);
                            
                            //oyuncu 2 için
                            kagit_etkisi=oyuncu2kagit5.etkiHesapla("Makas"); 
                            nesne_durum1=oyuncu1makas5.durumGuncelle(kagit_etkisi);
                            
                            //Eğer oyuncu1 in nesnesi oyuncu2 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum2==1)
                            {
                                oyuncu2.nesneSil(oyuncu2NesneIndex);
                                oyuncu1makas5.seviyePuanimiGuncelle();
                            }
                            //Eğer oyuncu2 in nesnesi oyuncu1 nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                            if(nesne_durum1==1)
                            {
                                oyuncu1.nesneSil(oyuncu1NesneIndex);
                                oyuncu2kagit5.seviyePuanimiGuncelle();
                            }
                            
                            //Puanları yazdır
                            oyuncu2kagit5.nesnePuaniGoster();
                            oyuncu1makas5.nesnePuaniGoster();

                            //Ekrana yazdır
                             //Oyuncu1
                             hamleler[i][2]=Integer.toString(oyuncu1makas5.getDayaniklilik());
                             hamleler[i][3]=Integer.toString(oyuncu1makas5.getSeviyePuani());
                             
                             //Oyuncu2
                             hamleler[i][5]=Integer.toString(oyuncu2kagit5.getDayaniklilik());
                             hamleler[i][6]=Integer.toString(oyuncu2kagit5.getSeviyePuani());
                        }
                     }
                     
                 }
             }  
            System.out.println("\n");
        }    
         
        String tabloBaslik[]={"Round","Bilgisayar 1","B1 Dayanıklılık","B1 Seviye Puanı","Bilgisayar 2","B2 Dayanıklılık","B2 Seviye Puanı"};   
        JTable jt=new JTable(hamleler,tabloBaslik);  
        JScrollPane sp=new JScrollPane(jt); 
        JLabel sonucLabel=new JLabel(sonucMetni);
        JLabel l2=new JLabel("Beraberlik durumunda dayanıklılık ve seviye puanı hesaplanmaz.");
        panel.add(sp);
        panel.add(sonucLabel);
        panel.add(l2);

       //--------------------------------
       
       frame.add(panel);
       frame.setSize(800,600);
       frame.setVisible(true);
   }
}

