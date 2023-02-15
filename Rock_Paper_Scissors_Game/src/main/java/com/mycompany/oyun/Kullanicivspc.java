/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oyun;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import java.util.UUID;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;


/**
 *
 * @author Unknow
 */
public class Kullanicivspc {

    public ArrayList<String> secilenNesnelerAsil=new ArrayList<String>();
    public ArrayList<String> secilenNesnelerAdresleri=new ArrayList<String>();
    public DefaultListModel secilenNesnelerNedenSilindi = new DefaultListModel();
    public int roundSayaci=0;
    public String bilgisayarNesneLabelText;
    public int silinen_nesne_sayisi=0;
    public String oyuncuAdi;
    
    public void kullaniciwarpc(DefaultListModel<String> secilenNesneler){
        JFrame frame=new JFrame("Kullanıcı vs Bilgisayar");
        JPanel panel=new JPanel();
        
        for (int i=0;i<secilenNesneler.size();i++)
        {
            secilenNesnelerAsil.add(secilenNesneler.get(i));
            secilenNesnelerNedenSilindi.add(i, secilenNesneler.get(i));
        }
        
        Kullanicinesnesecimi kl=new Kullanicinesnesecimi();
        oyuncuAdi=kl.oyuncuAdi;
       
        //Oyuncuların IDleri belirlenir
        String kullaniciID=UUID.randomUUID().toString();
        String bilgisayarID=UUID.randomUUID().toString();
            
        //Kullanıcı - Bilgisayar
        Oyuncu kullanici=new Kullanici(kullaniciID,oyuncuAdi,0);
        Oyuncu bilgisayar=new Bilgisayar(bilgisayarID,"Bilgisayar",0); 
            
        oyuncuAdi=kullanici.getOyuncuAdi();
        
        int dayaniklilik=7;
        //Bilgisayar nesnelerini tanımladık
            //Taş
            Nesne bilgisayartas1=new Tas(2,dayaniklilik,0);
            Nesne bilgisayartas2=new Tas(2,dayaniklilik,0);
            Nesne bilgisayartas3=new Tas(2,dayaniklilik,0);
            Nesne bilgisayartas4=new Tas(2,dayaniklilik,0);
            Nesne bilgisayartas5=new Tas(2 ,dayaniklilik,0);
        
            //Kağıt
            Nesne bilgisayarkagit1=new Kagit(2,dayaniklilik,0);
            Nesne bilgisayarkagit2=new Kagit(2,dayaniklilik,0);
            Nesne bilgisayarkagit3=new Kagit(2,dayaniklilik,0);
            Nesne bilgisayarkagit4=new Kagit(2,dayaniklilik,0);
            Nesne bilgisayarkagit5=new Kagit(2,dayaniklilik,0);

            //Makas
            Nesne bilgisayarmakas1=new Makas(2,dayaniklilik,0);
            Nesne bilgisayarmakas2=new Makas(2,dayaniklilik,0);
            Nesne bilgisayarmakas3=new Makas(2,dayaniklilik,0);
            Nesne bilgisayarmakas4=new Makas(2,dayaniklilik,0);
            Nesne bilgisayarmakas5=new Makas(2,dayaniklilik,0);
            
        //Kullanıcı nesnelerini tanımladık
            //Taş
            Nesne kullanicitas1=new Tas(2,dayaniklilik,0);
            Nesne kullanicitas2=new Tas(2,dayaniklilik,0);
            Nesne kullanicitas3=new Tas(2,dayaniklilik,0);
            Nesne kullanicitas4=new Tas(2,dayaniklilik,0);
            Nesne kullanicitas5=new Tas(2 ,dayaniklilik,0);
        
            //Kağıt
            Nesne kullanicikagit1=new Kagit(2,dayaniklilik,0);
            Nesne kullanicikagit2=new Kagit(2,dayaniklilik,0);
            Nesne kullanicikagit3=new Kagit(2,dayaniklilik,0);
            Nesne kullanicikagit4=new Kagit(2,dayaniklilik,0);
            Nesne kullanicikagit5=new Kagit(2,dayaniklilik,0);

            //Makas
            Nesne kullanicimakas1=new Makas(2,dayaniklilik,0);
            Nesne kullanicimakas2=new Makas(2,dayaniklilik,0);
            Nesne kullanicimakas3=new Makas(2,dayaniklilik,0);
            Nesne kullanicimakas4=new Makas(2,dayaniklilik,0);
            Nesne kullanicimakas5=new Makas(2,dayaniklilik,0);
            
            
        bilgisayar.nesneSec();
         
        int tasSayac=1,kagitSayac=1,makasSayac=1;
            
        for(int j=0;j<bilgisayar.nesneListesi.size();j++)
        {
            if("Taş".equals(bilgisayar.nesneListesi.get(j)))
            {
                String temp="Taş"+tasSayac;
                bilgisayar.nesneListesiAdresleriElemanGonder(temp);
                tasSayac++;
            }
            if("Kağıt".equals(bilgisayar.nesneListesi.get(j)))
            {
                String temp="Kağıt"+kagitSayac;
                bilgisayar.nesneListesiAdresleriElemanGonder(temp);
                kagitSayac++;
            }
            if("Makas".equals(bilgisayar.nesneListesi.get(j)))
            {
                String temp="Makas"+makasSayac;
                bilgisayar.nesneListesiAdresleriElemanGonder(temp);
                makasSayac++;
            }
        } 
        
        //Oyuncunun nesnelerini sayalim
        tasSayac=1;
        kagitSayac=1;
        makasSayac=1;
        for(int j=0;j<secilenNesnelerAsil.size();j++)
        {
            if("Taş".equals(secilenNesnelerAsil.get(j)))
            {
                String temp="Taş"+tasSayac;
                secilenNesnelerAdresleri.add(temp);
                tasSayac++;
            }
            if("Kağıt".equals(secilenNesnelerAsil.get(j)))
            {
                String temp="Kağıt"+kagitSayac;
                secilenNesnelerAdresleri.add(temp);
                kagitSayac++;
            }
            if("Makas".equals(secilenNesnelerAsil.get(j)))
            {
                String temp="Makas"+makasSayac;
                secilenNesnelerAdresleri.add(temp);
                makasSayac++;
            }
        }
  
        
        System.out.println(bilgisayar.oyuncuAdi+": "+bilgisayar.nesneListesi.get(0)+","+bilgisayar.nesneListesi.get(1)+","+bilgisayar.nesneListesi.get(2)+","+bilgisayar.nesneListesi.get(3)+","+bilgisayar.nesneListesi.get(4));  
        System.out.println(bilgisayar.oyuncuAdi+": "+bilgisayar.nesneListesiAdresleri.get(0)+","+bilgisayar.nesneListesiAdresleri.get(1)+","+bilgisayar.nesneListesiAdresleri.get(2)+","+bilgisayar.nesneListesiAdresleri.get(3)+","+bilgisayar.nesneListesiAdresleri.get(4));  
        System.out.println(kullanici.oyuncuAdi+": "+secilenNesnelerAsil.get(0)+","+secilenNesnelerAsil.get(1)+","+secilenNesnelerAsil.get(2)+","+secilenNesnelerAsil.get(3)+","+secilenNesnelerAsil.get(4));  
        System.out.println(oyuncuAdi+": "+secilenNesnelerAdresleri.get(0)+","+secilenNesnelerAdresleri.get(1)+","+secilenNesnelerAdresleri.get(2)+","+secilenNesnelerAdresleri.get(3)+","+secilenNesnelerAdresleri.get(4));  
        
        String sonucMetni="";
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


        JButton btn=new JButton("Devam et");
        JLabel oyuncuadiLabel=new JLabel(oyuncuAdi+": ");
        JList<String> list = new JList<>(secilenNesnelerNedenSilindi);  
        //DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>(kullaniciNesneleriListesi);
        //JComboBox listem=new JComboBox(kullaniciNesneleriListesi);
        JLabel bilgisayarYazisiLabel=new JLabel("Bilgisayar: ");
        bilgisayarNesneLabelText="";
        JLabel bilgisayarNesneLabel=new JLabel(bilgisayarNesneLabelText);
        JLabel oyunKazananLabel=new JLabel();
        
       String[] tabloBaslik={"Round",oyuncuAdi,oyuncuAdi+" Dayanıklılık",oyuncuAdi+" Seviye Puanı","Bilgisayar","B Dayanıklılık","B Seviye Puanı"};  
       JTable jt=new JTable(hamleler,tabloBaslik);
       JScrollPane sp=new JScrollPane(jt); 
       JLabel sonucLabel=new JLabel(sonucMetni);
       
        JLabel aciklamaLabel=new JLabel("Beraberlik durumunda dayanıklılık ve seviye puanı hesaplanmaz.");

        btn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                int tasSayac=1,kagitSayac=1,makasSayac=1;
                String temp;
                int tas_etkisi=0,makas_etkisi=0,kagit_etkisi=0;
                int nesne_durum1=0,nesne_durum2=0;
                int bilgisayarNesneIndex = 0,kullaniciNesneIndex=0;
                Random rand1 = new Random();
                String sonucMetni="";
                int oyuncu2Skor=0,oyuncu1Skor=0;
                int oyuncularinElindekiNesnelerBittimi=0;
                if("Erişilemez".equals(list.getSelectedValue()) || "Silindi".equals(list.getSelectedValue()) || list.getSelectedValue()==null)
                {
                    JOptionPane.showMessageDialog(frame, "Hatalı nesne seçimi");
                }
                else
                {
                    for(;roundSayaci<10;roundSayaci++)
                    {
                        
                        btn.setEnabled(false);
   
                        //bilgisarın elemanları var mı
                        if(bilgisayar.nesneListesi.isEmpty())
                        {
                            System.out.println("Bilgisayarın in elemanları bitti. "+oyuncuAdi+" kazandı.");
                            sonucMetni="Bilgisayarın in elemanları bitti. "+oyuncuAdi+" kazandı.";
                            oyuncularinElindekiNesnelerBittimi=1;
                            break;
                        }
                        //kullanıcının eleman var mı
                        if(secilenNesnelerAsil.isEmpty())
                        {
                            System.out.println(oyuncuAdi+" nin elemanları bitti. Bilgisayar kazandı.");
                            sonucMetni=oyuncuAdi+" nin elemanları bitti. Bilgisayar kazandı.";
                            oyuncularinElindekiNesnelerBittimi=1;
                            break;
                        }

                        if(roundSayaci<=4)
                        {
                            bilgisayarNesneIndex=roundSayaci;
                            kullaniciNesneIndex=list.getSelectedIndex();
                        }

                        if(roundSayaci>=5)
                        {
                            int m=0;
                            //nesnelistesindeki silindi yazan elemanları sil
                            for(m=0;m<bilgisayar.nesneListesi.size();m++)
                            {
                                if("Silindi".equals(bilgisayar.nesneListesi.get(m)))
                                {
                                    bilgisayar.nesneListesi.remove(m);
                                    bilgisayar.nesneListesiAdresleri.remove(m);
                                }
                            }


                            //bilgisayarın eleman var mı
                            if(bilgisayar.nesneListesi.isEmpty())
                            {
                                System.out.println("Bilgisayarın elemanları bitti. "+oyuncuAdi+" kazandı.");
                                sonucMetni="Bilgisayarın elemanları bitti. "+oyuncuAdi+" kazandı.";
                                oyuncularinElindekiNesnelerBittimi=1;
                                break;
                            }
                            //kullanıcının eleman var mı
                            if(secilenNesnelerAsil.isEmpty())
                            {
                                System.out.println(oyuncuAdi+" nin elemanları bitti. Bilgisayar kazandı.");
                                sonucMetni=oyuncuAdi+" nin elemanları bitti. Bilgisayar kazandı.";
                                oyuncularinElindekiNesnelerBittimi=1;
                                break;
                            }

                            bilgisayarNesneIndex=rand1.nextInt(bilgisayar.nesneListesi.size());
                            kullaniciNesneIndex=list.getSelectedIndex();
                        }


                        if(roundSayaci==5)//10. hamle
                        {  
                            int m;
                            //nesnelistesindeki silindi yazan elemanları sil
                            for(m=0;m<bilgisayar.nesneListesi.size();m++)
                            {
                                if("Silindi".equals(bilgisayar.nesneListesi.get(m)))
                                {
                                    bilgisayar.nesneListesi.remove(m);
                                    bilgisayar.nesneListesiAdresleri.remove(m);
                                }
                            }

                            //oyuncu1Nesnelistesinde eleman var mı
                            if(bilgisayar.nesneListesi.isEmpty())
                            {
                                System.out.println("Bilgisayarın in elemanları bitti. "+oyuncuAdi+" kazandı.");
                                sonucMetni="Bilgisayarın in elemanları bitti. "+oyuncuAdi+" kazandı.";
                                oyuncularinElindekiNesnelerBittimi=1;
                                break;
                            }
                            //oyuncu2Nesnelistesinde eleman var mı
                            if(secilenNesnelerAsil.isEmpty())
                            {
                                System.out.println(oyuncuAdi+" nin elemanları bitti. Bilgisayar kazandı.");
                                sonucMetni=oyuncuAdi+" nin elemanları bitti. Bilgisayar kazandı.";
                                oyuncularinElindekiNesnelerBittimi=1;
                                break;
                            }

                            bilgisayarNesneIndex=rand1.nextInt(bilgisayar.nesneListesi.size());
                            kullaniciNesneIndex=list.getSelectedIndex();
                        }


                        System.out.println("\n");System.out.println("\n");
                        System.out.println("\nRound "+(roundSayaci+1));

                        System.out.print(bilgisayar.oyuncuAdi+": ");
                        for(int n=0;n<bilgisayar.nesneListesi.size();n++)
                        {
                            System.out.print(bilgisayar.nesneListesi.get(n)+",");
                        }

                        System.out.println("\n");
                        System.out.print(oyuncuAdi+": ");
                        for(int n=0;n<secilenNesnelerAsil.size();n++)
                        {
                            System.out.print(secilenNesnelerAsil.get(n)+",");
                        }
                        System.out.println("\n");
                        for(int n=0;n<secilenNesnelerNedenSilindi.size();n++)
                        {
                            System.out.print(secilenNesnelerNedenSilindi.get(n)+",");
                        }
                        System.out.println("\n");
                        //System.out.println("kullaniciNesneIndex: "+kullaniciNesneIndex);
                        //System.out.println("bilgisayarNesneIndex: "+bilgisayarNesneIndex);
                        if(bilgisayar.nesneListesi.get(bilgisayarNesneIndex).equals(secilenNesnelerAsil.get(kullaniciNesneIndex)))
                        {
                            if("Taş".equals(bilgisayar.nesneListesi.get(bilgisayarNesneIndex)))
                            {                
                                System.out.println("Taş-Taş");
                                bilgisayarNesneLabelText="Taş";
                                hamleler[roundSayaci][0]="Round "+(roundSayaci+1);
                                hamleler[roundSayaci][1]="Taş";
                                hamleler[roundSayaci][4]="Taş";
                                hamleler[roundSayaci][2]="Beraberlik";
                                hamleler[roundSayaci][3]="Beraberlik";
                                hamleler[roundSayaci][5]="Beraberlik";
                                hamleler[roundSayaci][6]="Beraberlik";     
                            }
                            else if("Kağıt".equals(bilgisayar.nesneListesi.get(bilgisayarNesneIndex)))
                            {
                                System.out.println("Kağıt-Kağıt");
                                bilgisayarNesneLabelText="Kağıt";
                                hamleler[roundSayaci][0]="Round "+(roundSayaci+1);
                                hamleler[roundSayaci][1]="Kağıt";
                                hamleler[roundSayaci][4]="Kağıt";
                                hamleler[roundSayaci][2]="Beraberlik";
                                hamleler[roundSayaci][3]="Beraberlik";
                                hamleler[roundSayaci][5]="Beraberlik";
                                hamleler[roundSayaci][6]="Beraberlik";  
                            }
                            else if("Makas".equals(bilgisayar.nesneListesi.get(bilgisayarNesneIndex)))
                            {
                                System.out.println("Makas-Makas");
                                bilgisayarNesneLabelText="Makas";
                                hamleler[roundSayaci][0]="Round "+(roundSayaci+1);
                                hamleler[roundSayaci][1]="Makas";
                                hamleler[roundSayaci][4]="Makas";
                                hamleler[roundSayaci][2]="Beraberlik";
                                hamleler[roundSayaci][3]="Beraberlik";
                                hamleler[roundSayaci][5]="Beraberlik";
                                hamleler[roundSayaci][6]="Beraberlik";  
                            }
                        }
                        else
                        {
                            if("Taş".equals(bilgisayar.nesneListesi.get(bilgisayarNesneIndex)) && "Kağıt".equals(secilenNesnelerAsil.get(kullaniciNesneIndex)) )
                            {
                                System.out.println("Taş-Kağıt");
                                bilgisayarNesneLabelText="Taş";
                                hamleler[roundSayaci][0]="Round "+(roundSayaci+1);
                                hamleler[roundSayaci][1]="Kağıt";
                                hamleler[roundSayaci][4]="Taş";

                                if("Taş1".equals(bilgisayar.nesneListesiAdresleri.get(bilgisayarNesneIndex)) )
                                {
                                 /*
                                 Taş1 Kağıt1
                                 Taş1 Kağıt2
                                 Taş1 Kağıt3
                                 Taş1 Kağıt4
                                 Taş1 Kağıt5
                                 */
                                    tas_etkisi=bilgisayartas1.etkiHesapla("Kağıt");   
                                    if("Kağıt1".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                    {
                                        kullanicikagit1.nesnePuaniGoster();
                                        bilgisayartas1.nesnePuaniGoster();

                                        nesne_durum2=kullanicikagit1.durumGuncelle(tas_etkisi);

                                        //oyuncu 2 için
                                        kagit_etkisi=kullanicikagit1.etkiHesapla("Taş"); 
                                        nesne_durum1=bilgisayartas1.durumGuncelle(kagit_etkisi);

                                        //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum2==1)
                                        {
                                            secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                            bilgisayartas1.seviyePuanimiGuncelle();
                                        }
                                        //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum1==1)
                                        {
                                            bilgisayar.nesneSil(bilgisayarNesneIndex);
                                            kullanicikagit1.seviyePuanimiGuncelle();
                                        }

                                        //Puanları yazdır
                                        kullanicikagit1.nesnePuaniGoster();
                                        bilgisayartas1.nesnePuaniGoster();

                                       //Ekrana yazdır
                                         //bilgisayar
                                         hamleler[roundSayaci][5]=Integer.toString(bilgisayartas1.getDayaniklilik());
                                         hamleler[roundSayaci][6]=Integer.toString(bilgisayartas1.getSeviyePuani());

                                         //kullanici
                                         hamleler[roundSayaci][2]=Integer.toString(kullanicikagit1.getDayaniklilik());
                                         hamleler[roundSayaci][3]=Integer.toString(kullanicikagit1.getSeviyePuani());

                                    }
                                    else if("Kağıt2".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                    {
                                        kullanicikagit2.nesnePuaniGoster();
                                        bilgisayartas1.nesnePuaniGoster();

                                        nesne_durum2=kullanicikagit2.durumGuncelle(tas_etkisi);

                                        //oyuncu 2 için
                                        kagit_etkisi=kullanicikagit2.etkiHesapla("Taş"); 
                                        nesne_durum1=bilgisayartas1.durumGuncelle(kagit_etkisi);

                                        //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum2==1)
                                        {
                                            secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                            bilgisayartas1.seviyePuanimiGuncelle();
                                        }
                                        //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum1==1)
                                        {
                                            bilgisayar.nesneSil(bilgisayarNesneIndex);
                                            kullanicikagit2.seviyePuanimiGuncelle();
                                        }

                                        //Puanları yazdır
                                        kullanicikagit2.nesnePuaniGoster();
                                        bilgisayartas1.nesnePuaniGoster();

                                       //Ekrana yazdır
                                         //bilgisayar
                                         hamleler[roundSayaci][5]=Integer.toString(bilgisayartas1.getDayaniklilik());
                                         hamleler[roundSayaci][6]=Integer.toString(bilgisayartas1.getSeviyePuani());

                                         //kullanici
                                         hamleler[roundSayaci][2]=Integer.toString(kullanicikagit2.getDayaniklilik());
                                         hamleler[roundSayaci][3]=Integer.toString(kullanicikagit2.getSeviyePuani());

                                    }
                                    else if("Kağıt3".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                    {
                                        kullanicikagit3.nesnePuaniGoster();
                                        bilgisayartas1.nesnePuaniGoster();

                                        nesne_durum2=kullanicikagit3.durumGuncelle(tas_etkisi);

                                        //oyuncu 2 için
                                        kagit_etkisi=kullanicikagit3.etkiHesapla("Taş"); 
                                        nesne_durum1=bilgisayartas1.durumGuncelle(kagit_etkisi);

                                        //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum2==1)
                                        {
                                            secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                            bilgisayartas1.seviyePuanimiGuncelle();
                                        }
                                        //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum1==1)
                                        {
                                            bilgisayar.nesneSil(bilgisayarNesneIndex);
                                            kullanicikagit3.seviyePuanimiGuncelle();
                                        }

                                        //Puanları yazdır
                                        kullanicikagit3.nesnePuaniGoster();
                                        bilgisayartas1.nesnePuaniGoster();

                                       //Ekrana yazdır
                                         //bilgisayar
                                         hamleler[roundSayaci][5]=Integer.toString(bilgisayartas1.getDayaniklilik());
                                         hamleler[roundSayaci][6]=Integer.toString(bilgisayartas1.getSeviyePuani());

                                         //kullanici
                                         hamleler[roundSayaci][2]=Integer.toString(kullanicikagit3.getDayaniklilik());
                                         hamleler[roundSayaci][3]=Integer.toString(kullanicikagit3.getSeviyePuani());

                                    }
                                    else if("Kağıt4".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                    {
                                        kullanicikagit4.nesnePuaniGoster();
                                        bilgisayartas1.nesnePuaniGoster();

                                        nesne_durum2=kullanicikagit4.durumGuncelle(tas_etkisi);

                                        //oyuncu 2 için
                                        kagit_etkisi=kullanicikagit4.etkiHesapla("Taş"); 
                                        nesne_durum1=bilgisayartas1.durumGuncelle(kagit_etkisi);

                                        //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum2==1)
                                        {
                                            secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                            bilgisayartas1.seviyePuanimiGuncelle();
                                        }
                                        //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum1==1)
                                        {
                                            bilgisayar.nesneSil(bilgisayarNesneIndex);
                                            kullanicikagit4.seviyePuanimiGuncelle();
                                        }

                                        //Puanları yazdır
                                        kullanicikagit4.nesnePuaniGoster();
                                        bilgisayartas1.nesnePuaniGoster();

                                       //Ekrana yazdır
                                         //bilgisayar
                                         hamleler[roundSayaci][5]=Integer.toString(bilgisayartas1.getDayaniklilik());
                                         hamleler[roundSayaci][6]=Integer.toString(bilgisayartas1.getSeviyePuani());

                                         //kullanici
                                         hamleler[roundSayaci][2]=Integer.toString(kullanicikagit4.getDayaniklilik());
                                         hamleler[roundSayaci][3]=Integer.toString(kullanicikagit4.getSeviyePuani());

                                    }
                                    else if("Kağıt5".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                    {
                                        kullanicikagit5.nesnePuaniGoster();
                                        bilgisayartas1.nesnePuaniGoster();

                                        nesne_durum2=kullanicikagit5.durumGuncelle(tas_etkisi);

                                        //oyuncu 2 için
                                        kagit_etkisi=kullanicikagit5.etkiHesapla("Taş"); 
                                        nesne_durum1=bilgisayartas1.durumGuncelle(kagit_etkisi);

                                        //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum2==1)
                                        {
                                            secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                            bilgisayartas1.seviyePuanimiGuncelle();
                                        }
                                        //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum1==1)
                                        {
                                            bilgisayar.nesneSil(bilgisayarNesneIndex);
                                            kullanicikagit5.seviyePuanimiGuncelle();
                                        }

                                        //Puanları yazdır
                                        kullanicikagit5.nesnePuaniGoster();
                                        bilgisayartas1.nesnePuaniGoster();

                                       //Ekrana yazdır
                                         //bilgisayar
                                         hamleler[roundSayaci][5]=Integer.toString(bilgisayartas1.getDayaniklilik());
                                         hamleler[roundSayaci][6]=Integer.toString(bilgisayartas1.getSeviyePuani());

                                         //kullanici
                                         hamleler[roundSayaci][2]=Integer.toString(kullanicikagit5.getDayaniklilik());
                                         hamleler[roundSayaci][3]=Integer.toString(kullanicikagit5.getSeviyePuani());
                                    }

                                }
                                else if("Taş2".equals(bilgisayar.nesneListesiAdresleri.get(bilgisayarNesneIndex)))
                                {
                                 /*
                                 Taş2 Kağıt1
                                 Taş2 Kağıt2
                                 Taş2 Kağıt3
                                 Taş2 Kağıt4
                                 Taş2 Kağıt5
                                 */
                                    tas_etkisi=bilgisayartas2.etkiHesapla("Kağıt");   
                                    if("Kağıt1".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                    {
                                        kullanicikagit1.nesnePuaniGoster();
                                        bilgisayartas2.nesnePuaniGoster();

                                        nesne_durum2=kullanicikagit1.durumGuncelle(tas_etkisi);

                                        //oyuncu 2 için
                                        kagit_etkisi=kullanicikagit1.etkiHesapla("Taş"); 
                                        nesne_durum1=bilgisayartas2.durumGuncelle(kagit_etkisi);

                                        //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum2==1)
                                        {
                                            secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                            bilgisayartas2.seviyePuanimiGuncelle();
                                        }
                                        //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum1==1)
                                        {
                                            bilgisayar.nesneSil(bilgisayarNesneIndex);
                                            kullanicikagit1.seviyePuanimiGuncelle();
                                        }

                                        //Puanları yazdır
                                        kullanicikagit1.nesnePuaniGoster();
                                        bilgisayartas2.nesnePuaniGoster();

                                       //Ekrana yazdır
                                         //bilgisayar
                                         hamleler[roundSayaci][5]=Integer.toString(bilgisayartas2.getDayaniklilik());
                                         hamleler[roundSayaci][6]=Integer.toString(bilgisayartas2.getSeviyePuani());

                                         //kullanici
                                         hamleler[roundSayaci][2]=Integer.toString(kullanicikagit1.getDayaniklilik());
                                         hamleler[roundSayaci][3]=Integer.toString(kullanicikagit1.getSeviyePuani());

                                    }
                                    else if("Kağıt2".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                    {
                                        kullanicikagit2.nesnePuaniGoster();
                                        bilgisayartas2.nesnePuaniGoster();

                                        nesne_durum2=kullanicikagit2.durumGuncelle(tas_etkisi);

                                        //oyuncu 2 için
                                        kagit_etkisi=kullanicikagit2.etkiHesapla("Taş"); 
                                        nesne_durum1=bilgisayartas2.durumGuncelle(kagit_etkisi);

                                        //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum2==1)
                                        {
                                            secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                            bilgisayartas2.seviyePuanimiGuncelle();
                                        }
                                        //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum1==1)
                                        {
                                            bilgisayar.nesneSil(bilgisayarNesneIndex);
                                            kullanicikagit2.seviyePuanimiGuncelle();
                                        }

                                        //Puanları yazdır
                                        kullanicikagit2.nesnePuaniGoster();
                                        bilgisayartas2.nesnePuaniGoster();

                                       //Ekrana yazdır
                                         //bilgisayar
                                         hamleler[roundSayaci][5]=Integer.toString(bilgisayartas2.getDayaniklilik());
                                         hamleler[roundSayaci][6]=Integer.toString(bilgisayartas2.getSeviyePuani());

                                         //kullanici
                                         hamleler[roundSayaci][2]=Integer.toString(kullanicikagit2.getDayaniklilik());
                                         hamleler[roundSayaci][3]=Integer.toString(kullanicikagit2.getSeviyePuani());
                                    }
                                    else if("Kağıt3".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                    {
                                        kullanicikagit3.nesnePuaniGoster();
                                        bilgisayartas2.nesnePuaniGoster();

                                        nesne_durum2=kullanicikagit3.durumGuncelle(tas_etkisi);

                                        //oyuncu 2 için
                                        kagit_etkisi=kullanicikagit3.etkiHesapla("Taş"); 
                                        nesne_durum1=bilgisayartas2.durumGuncelle(kagit_etkisi);

                                        //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum2==1)
                                        {
                                            secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                            bilgisayartas2.seviyePuanimiGuncelle();
                                        }
                                        //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum1==1)
                                        {
                                            bilgisayar.nesneSil(bilgisayarNesneIndex);
                                            kullanicikagit3.seviyePuanimiGuncelle();
                                        }

                                        //Puanları yazdır
                                        kullanicikagit3.nesnePuaniGoster();
                                        bilgisayartas2.nesnePuaniGoster();

                                       //Ekrana yazdır
                                         //bilgisayar
                                         hamleler[roundSayaci][5]=Integer.toString(bilgisayartas2.getDayaniklilik());
                                         hamleler[roundSayaci][6]=Integer.toString(bilgisayartas2.getSeviyePuani());

                                         //kullanici
                                         hamleler[roundSayaci][2]=Integer.toString(kullanicikagit3.getDayaniklilik());
                                         hamleler[roundSayaci][3]=Integer.toString(kullanicikagit3.getSeviyePuani());
                                    }
                                    else if("Kağıt4".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                    {
                                        kullanicikagit4.nesnePuaniGoster();
                                        bilgisayartas2.nesnePuaniGoster();

                                        nesne_durum2=kullanicikagit4.durumGuncelle(tas_etkisi);

                                        //oyuncu 2 için
                                        kagit_etkisi=kullanicikagit4.etkiHesapla("Taş"); 
                                        nesne_durum1=bilgisayartas2.durumGuncelle(kagit_etkisi);

                                        //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum2==1)
                                        {
                                            secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                            bilgisayartas2.seviyePuanimiGuncelle();
                                        }
                                        //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum1==1)
                                        {
                                            bilgisayar.nesneSil(bilgisayarNesneIndex);
                                            kullanicikagit4.seviyePuanimiGuncelle();
                                        }

                                        //Puanları yazdır
                                        kullanicikagit4.nesnePuaniGoster();
                                        bilgisayartas2.nesnePuaniGoster();

                                       //Ekrana yazdır
                                         //bilgisayar
                                         hamleler[roundSayaci][5]=Integer.toString(bilgisayartas2.getDayaniklilik());
                                         hamleler[roundSayaci][6]=Integer.toString(bilgisayartas2.getSeviyePuani());

                                         //kullanici
                                         hamleler[roundSayaci][2]=Integer.toString(kullanicikagit4.getDayaniklilik());
                                         hamleler[roundSayaci][3]=Integer.toString(kullanicikagit4.getSeviyePuani());
                                    }
                                    else if("Kağıt5".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                    {
                                        kullanicikagit5.nesnePuaniGoster();
                                        bilgisayartas2.nesnePuaniGoster();

                                        nesne_durum2=kullanicikagit5.durumGuncelle(tas_etkisi);

                                        //oyuncu 2 için
                                        kagit_etkisi=kullanicikagit5.etkiHesapla("Taş"); 
                                        nesne_durum1=bilgisayartas2.durumGuncelle(kagit_etkisi);

                                        //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum2==1)
                                        {
                                            secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                            bilgisayartas2.seviyePuanimiGuncelle();
                                        }
                                        //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum1==1)
                                        {
                                            bilgisayar.nesneSil(bilgisayarNesneIndex);
                                            kullanicikagit5.seviyePuanimiGuncelle();
                                        }

                                        //Puanları yazdır
                                        kullanicikagit5.nesnePuaniGoster();
                                        bilgisayartas2.nesnePuaniGoster();

                                       //Ekrana yazdır
                                         //bilgisayar
                                         hamleler[roundSayaci][5]=Integer.toString(bilgisayartas2.getDayaniklilik());
                                         hamleler[roundSayaci][6]=Integer.toString(bilgisayartas2.getSeviyePuani());

                                         //kullanici
                                         hamleler[roundSayaci][2]=Integer.toString(kullanicikagit5.getDayaniklilik());
                                         hamleler[roundSayaci][3]=Integer.toString(kullanicikagit5.getSeviyePuani());

                                    }
                                }
                                else if("Taş3".equals(bilgisayar.nesneListesiAdresleri.get(bilgisayarNesneIndex)))
                                {
                                 /*
                                 Taş3 Kağıt1
                                 Taş3 Kağıt2
                                 Taş3 Kağıt3
                                 Taş3 Kağıt4
                                 Taş3 Kağıt5
                                 */
                                    tas_etkisi=bilgisayartas3.etkiHesapla("Kağıt");   
                                    if("Kağıt1".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                    {
                                        kullanicikagit1.nesnePuaniGoster();
                                        bilgisayartas3.nesnePuaniGoster();

                                        nesne_durum2=kullanicikagit1.durumGuncelle(tas_etkisi);

                                        //oyuncu 2 için
                                        kagit_etkisi=kullanicikagit1.etkiHesapla("Taş"); 
                                        nesne_durum1=bilgisayartas3.durumGuncelle(kagit_etkisi);

                                        //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum2==1)
                                        {
                                            secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                            bilgisayartas3.seviyePuanimiGuncelle();
                                        }
                                        //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum1==1)
                                        {
                                            bilgisayar.nesneSil(bilgisayarNesneIndex);
                                            kullanicikagit1.seviyePuanimiGuncelle();
                                        }

                                        //Puanları yazdır
                                        kullanicikagit1.nesnePuaniGoster();
                                        bilgisayartas3.nesnePuaniGoster();

                                       //Ekrana yazdır
                                         //bilgisayar
                                         hamleler[roundSayaci][5]=Integer.toString(bilgisayartas3.getDayaniklilik());
                                         hamleler[roundSayaci][6]=Integer.toString(bilgisayartas3.getSeviyePuani());

                                         //kullanici
                                         hamleler[roundSayaci][2]=Integer.toString(kullanicikagit1.getDayaniklilik());
                                         hamleler[roundSayaci][3]=Integer.toString(kullanicikagit1.getSeviyePuani());
                                    }
                                    else if("Kağıt2".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                    {
                                        kullanicikagit2.nesnePuaniGoster();
                                        bilgisayartas3.nesnePuaniGoster();

                                        nesne_durum2=kullanicikagit2.durumGuncelle(tas_etkisi);

                                        //oyuncu 2 için
                                        kagit_etkisi=kullanicikagit2.etkiHesapla("Taş"); 
                                        nesne_durum1=bilgisayartas3.durumGuncelle(kagit_etkisi);

                                        //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum2==1)
                                        {
                                            secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                            bilgisayartas3.seviyePuanimiGuncelle();
                                        }
                                        //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum1==1)
                                        {
                                            bilgisayar.nesneSil(bilgisayarNesneIndex);
                                            kullanicikagit2.seviyePuanimiGuncelle();
                                        }

                                        //Puanları yazdır
                                        kullanicikagit2.nesnePuaniGoster();
                                        bilgisayartas3.nesnePuaniGoster();

                                       //Ekrana yazdır
                                         //bilgisayar
                                         hamleler[roundSayaci][5]=Integer.toString(bilgisayartas3.getDayaniklilik());
                                         hamleler[roundSayaci][6]=Integer.toString(bilgisayartas3.getSeviyePuani());

                                         //kullanici
                                         hamleler[roundSayaci][2]=Integer.toString(kullanicikagit2.getDayaniklilik());
                                         hamleler[roundSayaci][3]=Integer.toString(kullanicikagit2.getSeviyePuani());

                                    }
                                    else if("Kağıt3".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                    {
                                        kullanicikagit3.nesnePuaniGoster();
                                        bilgisayartas3.nesnePuaniGoster();

                                        nesne_durum2=kullanicikagit3.durumGuncelle(tas_etkisi);

                                        //oyuncu 2 için
                                        kagit_etkisi=kullanicikagit3.etkiHesapla("Taş"); 
                                        nesne_durum1=bilgisayartas3.durumGuncelle(kagit_etkisi);

                                        //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum2==1)
                                        {
                                            secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                            bilgisayartas3.seviyePuanimiGuncelle();
                                        }
                                        //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum1==1)
                                        {
                                            bilgisayar.nesneSil(bilgisayarNesneIndex);
                                            kullanicikagit3.seviyePuanimiGuncelle();
                                        }

                                        //Puanları yazdır
                                        kullanicikagit3.nesnePuaniGoster();
                                        bilgisayartas3.nesnePuaniGoster();

                                       //Ekrana yazdır
                                         //bilgisayar
                                         hamleler[roundSayaci][5]=Integer.toString(bilgisayartas3.getDayaniklilik());
                                         hamleler[roundSayaci][6]=Integer.toString(bilgisayartas3.getSeviyePuani());

                                         //kullanici
                                         hamleler[roundSayaci][2]=Integer.toString(kullanicikagit3.getDayaniklilik());
                                         hamleler[roundSayaci][3]=Integer.toString(kullanicikagit3.getSeviyePuani());

                                    }
                                    else if("Kağıt4".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                    {
                                        kullanicikagit4.nesnePuaniGoster();
                                        bilgisayartas3.nesnePuaniGoster();

                                        nesne_durum2=kullanicikagit4.durumGuncelle(tas_etkisi);

                                        //oyuncu 2 için
                                        kagit_etkisi=kullanicikagit4.etkiHesapla("Taş"); 
                                        nesne_durum1=bilgisayartas3.durumGuncelle(kagit_etkisi);

                                        //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum2==1)
                                        {
                                            secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                            bilgisayartas3.seviyePuanimiGuncelle();
                                        }
                                        //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum1==1)
                                        {
                                            bilgisayar.nesneSil(bilgisayarNesneIndex);
                                            kullanicikagit4.seviyePuanimiGuncelle();
                                        }

                                        //Puanları yazdır
                                        kullanicikagit4.nesnePuaniGoster();
                                        bilgisayartas3.nesnePuaniGoster();

                                       //Ekrana yazdır
                                         //bilgisayar
                                         hamleler[roundSayaci][5]=Integer.toString(bilgisayartas3.getDayaniklilik());
                                         hamleler[roundSayaci][6]=Integer.toString(bilgisayartas3.getSeviyePuani());

                                         //kullanici
                                         hamleler[roundSayaci][2]=Integer.toString(kullanicikagit4.getDayaniklilik());
                                         hamleler[roundSayaci][3]=Integer.toString(kullanicikagit4.getSeviyePuani());

                                    }
                                    else if("Kağıt5".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                    {
                                        kullanicikagit5.nesnePuaniGoster();
                                        bilgisayartas3.nesnePuaniGoster();

                                        nesne_durum2=kullanicikagit5.durumGuncelle(tas_etkisi);

                                        //oyuncu 2 için
                                        kagit_etkisi=kullanicikagit5.etkiHesapla("Taş"); 
                                        nesne_durum1=bilgisayartas3.durumGuncelle(kagit_etkisi);

                                        //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum2==1)
                                        {
                                            secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                            bilgisayartas3.seviyePuanimiGuncelle();
                                        }
                                        //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum1==1)
                                        {
                                            bilgisayar.nesneSil(bilgisayarNesneIndex);
                                            kullanicikagit5.seviyePuanimiGuncelle();
                                        }

                                        //Puanları yazdır
                                        kullanicikagit5.nesnePuaniGoster();
                                        bilgisayartas3.nesnePuaniGoster();

                                       //Ekrana yazdır
                                         //bilgisayar
                                         hamleler[roundSayaci][5]=Integer.toString(bilgisayartas3.getDayaniklilik());
                                         hamleler[roundSayaci][6]=Integer.toString(bilgisayartas3.getSeviyePuani());

                                         //kullanici
                                         hamleler[roundSayaci][2]=Integer.toString(kullanicikagit5.getDayaniklilik());
                                         hamleler[roundSayaci][3]=Integer.toString(kullanicikagit5.getSeviyePuani());
                                    }
                                }
                                else if("Taş4".equals(bilgisayar.nesneListesiAdresleri.get(bilgisayarNesneIndex)))
                                {
                                 /*
                                 Taş4 Kağıt1
                                 Taş4 Kağıt2
                                 Taş4 Kağıt3
                                 Taş4 Kağıt4
                                 Taş4 Kağıt5
                                 */
                                    tas_etkisi=bilgisayartas4.etkiHesapla("Kağıt");   
                                    if("Kağıt1".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                    {
                                        kullanicikagit1.nesnePuaniGoster();
                                        bilgisayartas4.nesnePuaniGoster();

                                        nesne_durum2=kullanicikagit1.durumGuncelle(tas_etkisi);

                                        //oyuncu 2 için
                                        kagit_etkisi=kullanicikagit1.etkiHesapla("Taş"); 
                                        nesne_durum1=bilgisayartas4.durumGuncelle(kagit_etkisi);

                                        //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum2==1)
                                        {
                                            secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                            bilgisayartas4.seviyePuanimiGuncelle();
                                        }
                                        //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum1==1)
                                        {
                                            bilgisayar.nesneSil(bilgisayarNesneIndex);
                                            kullanicikagit1.seviyePuanimiGuncelle();
                                        }

                                        //Puanları yazdır
                                        kullanicikagit1.nesnePuaniGoster();
                                        bilgisayartas4.nesnePuaniGoster();

                                       //Ekrana yazdır
                                         //bilgisayar
                                         hamleler[roundSayaci][5]=Integer.toString(bilgisayartas4.getDayaniklilik());
                                         hamleler[roundSayaci][6]=Integer.toString(bilgisayartas4.getSeviyePuani());

                                         //kullanici
                                         hamleler[roundSayaci][2]=Integer.toString(kullanicikagit1.getDayaniklilik());
                                         hamleler[roundSayaci][3]=Integer.toString(kullanicikagit1.getSeviyePuani());
                                    }
                                    else if("Kağıt2".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                    {
                                        kullanicikagit2.nesnePuaniGoster();
                                        bilgisayartas4.nesnePuaniGoster();

                                        nesne_durum2=kullanicikagit2.durumGuncelle(tas_etkisi);

                                        //oyuncu 2 için
                                        kagit_etkisi=kullanicikagit2.etkiHesapla("Taş"); 
                                        nesne_durum1=bilgisayartas4.durumGuncelle(kagit_etkisi);

                                        //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum2==1)
                                        {
                                            secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                            bilgisayartas4.seviyePuanimiGuncelle();
                                        }
                                        //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum1==1)
                                        {
                                            bilgisayar.nesneSil(bilgisayarNesneIndex);
                                            kullanicikagit2.seviyePuanimiGuncelle();
                                        }

                                        //Puanları yazdır
                                        kullanicikagit2.nesnePuaniGoster();
                                        bilgisayartas4.nesnePuaniGoster();

                                       //Ekrana yazdır
                                         //bilgisayar
                                         hamleler[roundSayaci][5]=Integer.toString(bilgisayartas4.getDayaniklilik());
                                         hamleler[roundSayaci][6]=Integer.toString(bilgisayartas4.getSeviyePuani());

                                         //kullanici
                                         hamleler[roundSayaci][2]=Integer.toString(kullanicikagit2.getDayaniklilik());
                                         hamleler[roundSayaci][3]=Integer.toString(kullanicikagit2.getSeviyePuani());
                                    }
                                    else if("Kağıt3".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                    {
                                        kullanicikagit3.nesnePuaniGoster();
                                        bilgisayartas4.nesnePuaniGoster();

                                        nesne_durum2=kullanicikagit3.durumGuncelle(tas_etkisi);

                                        //oyuncu 2 için
                                        kagit_etkisi=kullanicikagit3.etkiHesapla("Taş"); 
                                        nesne_durum1=bilgisayartas4.durumGuncelle(kagit_etkisi);

                                        //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum2==1)
                                        {
                                            secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                            bilgisayartas4.seviyePuanimiGuncelle();
                                        }
                                        //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum1==1)
                                        {
                                            bilgisayar.nesneSil(bilgisayarNesneIndex);
                                            kullanicikagit3.seviyePuanimiGuncelle();
                                        }

                                        //Puanları yazdır
                                        kullanicikagit3.nesnePuaniGoster();
                                        bilgisayartas4.nesnePuaniGoster();

                                       //Ekrana yazdır
                                         //bilgisayar
                                         hamleler[roundSayaci][5]=Integer.toString(bilgisayartas4.getDayaniklilik());
                                         hamleler[roundSayaci][6]=Integer.toString(bilgisayartas4.getSeviyePuani());

                                         //kullanici
                                         hamleler[roundSayaci][2]=Integer.toString(kullanicikagit3.getDayaniklilik());
                                         hamleler[roundSayaci][3]=Integer.toString(kullanicikagit3.getSeviyePuani());
                                    }
                                    else if("Kağıt4".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                    {
                                        kullanicikagit4.nesnePuaniGoster();
                                        bilgisayartas4.nesnePuaniGoster();

                                        nesne_durum2=kullanicikagit4.durumGuncelle(tas_etkisi);

                                        //oyuncu 2 için
                                        kagit_etkisi=kullanicikagit4.etkiHesapla("Taş"); 
                                        nesne_durum1=bilgisayartas4.durumGuncelle(kagit_etkisi);

                                        //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum2==1)
                                        {
                                            secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                            bilgisayartas4.seviyePuanimiGuncelle();
                                        }
                                        //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum1==1)
                                        {
                                            bilgisayar.nesneSil(bilgisayarNesneIndex);
                                            kullanicikagit4.seviyePuanimiGuncelle();
                                        }

                                        //Puanları yazdır
                                        kullanicikagit4.nesnePuaniGoster();
                                        bilgisayartas4.nesnePuaniGoster();

                                        //Ekrana yazdır
                                         //bilgisayar
                                         hamleler[roundSayaci][5]=Integer.toString(bilgisayartas4.getDayaniklilik());
                                         hamleler[roundSayaci][6]=Integer.toString(bilgisayartas4.getSeviyePuani());

                                         //kullanici
                                         hamleler[roundSayaci][2]=Integer.toString(kullanicikagit4.getDayaniklilik());
                                         hamleler[roundSayaci][3]=Integer.toString(kullanicikagit4.getSeviyePuani());

                                    }
                                    else if("Kağıt5".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                    {
                                        kullanicikagit5.nesnePuaniGoster();
                                        bilgisayartas4.nesnePuaniGoster();

                                        nesne_durum2=kullanicikagit5.durumGuncelle(tas_etkisi);

                                        //oyuncu 2 için
                                        kagit_etkisi=kullanicikagit5.etkiHesapla("Taş"); 
                                        nesne_durum1=bilgisayartas4.durumGuncelle(kagit_etkisi);

                                        //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum2==1)
                                        {
                                            secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                            bilgisayartas5.seviyePuanimiGuncelle();
                                        }
                                        //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum1==1)
                                        {
                                            bilgisayar.nesneSil(bilgisayarNesneIndex);
                                            kullanicikagit5.seviyePuanimiGuncelle();
                                        }

                                        //Puanları yazdır
                                        kullanicikagit5.nesnePuaniGoster();
                                        bilgisayartas4.nesnePuaniGoster();

                                        //Ekrana yazdır
                                         //bilgisayar
                                         hamleler[roundSayaci][5]=Integer.toString(bilgisayartas4.getDayaniklilik());
                                         hamleler[roundSayaci][6]=Integer.toString(bilgisayartas4.getSeviyePuani());

                                         //kullanici
                                         hamleler[roundSayaci][2]=Integer.toString(kullanicikagit5.getDayaniklilik());
                                         hamleler[roundSayaci][3]=Integer.toString(kullanicikagit5.getSeviyePuani());

                                    }
                                }
                                else if("Taş5".equals(bilgisayar.nesneListesiAdresleri.get(bilgisayarNesneIndex)))
                                {
                                 /*
                                 Taş5 Kağıt1
                                 Taş5 Kağıt2
                                 Taş5 Kağıt3
                                 Taş5 Kağıt4
                                 Taş5 Kağıt5
                                 */
                                    tas_etkisi=bilgisayartas5.etkiHesapla("Kağıt");   
                                    if("Kağıt1".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                    {
                                        kullanicikagit1.nesnePuaniGoster();
                                        bilgisayartas5.nesnePuaniGoster();

                                        nesne_durum2=kullanicikagit1.durumGuncelle(tas_etkisi);

                                        //oyuncu 2 için
                                        kagit_etkisi=kullanicikagit1.etkiHesapla("Taş"); 
                                        nesne_durum1=bilgisayartas5.durumGuncelle(kagit_etkisi);

                                        //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum2==1)
                                        {
                                            secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                            bilgisayartas5.seviyePuanimiGuncelle();
                                        }
                                        //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum1==1)
                                        {
                                            bilgisayar.nesneSil(bilgisayarNesneIndex);
                                            kullanicikagit1.seviyePuanimiGuncelle();
                                        }

                                        //Puanları yazdır
                                        kullanicikagit1.nesnePuaniGoster();
                                        bilgisayartas5.nesnePuaniGoster();

                                        //Ekrana yazdır
                                         //bilgisayar
                                         hamleler[roundSayaci][5]=Integer.toString(bilgisayartas5.getDayaniklilik());
                                         hamleler[roundSayaci][6]=Integer.toString(bilgisayartas5.getSeviyePuani());

                                         //kullanici
                                         hamleler[roundSayaci][2]=Integer.toString(kullanicikagit1.getDayaniklilik());
                                         hamleler[roundSayaci][3]=Integer.toString(kullanicikagit1.getSeviyePuani());

                                    }
                                    else if("Kağıt2".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                    {
                                        kullanicikagit2.nesnePuaniGoster();
                                        bilgisayartas5.nesnePuaniGoster();

                                        nesne_durum2=kullanicikagit2.durumGuncelle(tas_etkisi);

                                        //oyuncu 2 için
                                        kagit_etkisi=kullanicikagit2.etkiHesapla("Taş"); 
                                        nesne_durum1=bilgisayartas5.durumGuncelle(kagit_etkisi);

                                        //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum2==1)
                                        {
                                            secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                            bilgisayartas5.seviyePuanimiGuncelle();
                                        }
                                        //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum1==1)
                                        {
                                            bilgisayar.nesneSil(bilgisayarNesneIndex);
                                            kullanicikagit2.seviyePuanimiGuncelle();
                                        }

                                        //Puanları yazdır
                                        kullanicikagit2.nesnePuaniGoster();
                                        bilgisayartas5.nesnePuaniGoster();

                                        //Ekrana yazdır
                                         //bilgisayar
                                         hamleler[roundSayaci][5]=Integer.toString(bilgisayartas5.getDayaniklilik());
                                         hamleler[roundSayaci][6]=Integer.toString(bilgisayartas5.getSeviyePuani());

                                         //kullanici
                                         hamleler[roundSayaci][2]=Integer.toString(kullanicikagit2.getDayaniklilik());
                                         hamleler[roundSayaci][3]=Integer.toString(kullanicikagit2.getSeviyePuani());
                                    }
                                    else if("Kağıt3".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                    {
                                        kullanicikagit3.nesnePuaniGoster();
                                        bilgisayartas5.nesnePuaniGoster();

                                        nesne_durum2=kullanicikagit3.durumGuncelle(tas_etkisi);

                                        //oyuncu 2 için
                                        kagit_etkisi=kullanicikagit3.etkiHesapla("Taş"); 
                                        nesne_durum1=bilgisayartas5.durumGuncelle(kagit_etkisi);

                                        //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum2==1)
                                        {
                                            secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                            bilgisayartas5.seviyePuanimiGuncelle();
                                        }
                                        //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum1==1)
                                        {
                                            bilgisayar.nesneSil(bilgisayarNesneIndex);
                                            kullanicikagit3.seviyePuanimiGuncelle();
                                        }

                                        //Puanları yazdır
                                        kullanicikagit3.nesnePuaniGoster();
                                        bilgisayartas5.nesnePuaniGoster();

                                        //Ekrana yazdır
                                         //bilgisayar
                                         hamleler[roundSayaci][5]=Integer.toString(bilgisayartas5.getDayaniklilik());
                                         hamleler[roundSayaci][6]=Integer.toString(bilgisayartas5.getSeviyePuani());

                                         //kullanici
                                         hamleler[roundSayaci][2]=Integer.toString(kullanicikagit3.getDayaniklilik());
                                         hamleler[roundSayaci][3]=Integer.toString(kullanicikagit3.getSeviyePuani());

                                    }
                                    else if("Kağıt4".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                    {
                                        kullanicikagit4.nesnePuaniGoster();
                                        bilgisayartas5.nesnePuaniGoster();

                                        nesne_durum2=kullanicikagit4.durumGuncelle(tas_etkisi);

                                        //oyuncu 2 için
                                        kagit_etkisi=kullanicikagit4.etkiHesapla("Taş"); 
                                        nesne_durum1=bilgisayartas5.durumGuncelle(kagit_etkisi);

                                        //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum2==1)
                                        {
                                            secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                            bilgisayartas5.seviyePuanimiGuncelle();
                                        }
                                        //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum1==1)
                                        {
                                            bilgisayar.nesneSil(bilgisayarNesneIndex);
                                            kullanicikagit4.seviyePuanimiGuncelle();
                                        }

                                        //Puanları yazdır
                                        kullanicikagit4.nesnePuaniGoster();
                                        bilgisayartas5.nesnePuaniGoster();

                                        //Ekrana yazdır
                                         //bilgisayar
                                         hamleler[roundSayaci][5]=Integer.toString(bilgisayartas5.getDayaniklilik());
                                         hamleler[roundSayaci][6]=Integer.toString(bilgisayartas5.getSeviyePuani());

                                         //kullanici
                                         hamleler[roundSayaci][2]=Integer.toString(kullanicikagit4.getDayaniklilik());
                                         hamleler[roundSayaci][3]=Integer.toString(kullanicikagit4.getSeviyePuani());
                                    }
                                    else if("Kağıt5".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                    {
                                        kullanicikagit5.nesnePuaniGoster();
                                        bilgisayartas5.nesnePuaniGoster();

                                        nesne_durum2=kullanicikagit5.durumGuncelle(tas_etkisi);

                                        //oyuncu 2 için
                                        kagit_etkisi=kullanicikagit5.etkiHesapla("Taş"); 
                                        nesne_durum1=bilgisayartas5.durumGuncelle(kagit_etkisi);

                                        //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum2==1)
                                        {
                                            secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                            bilgisayartas5.seviyePuanimiGuncelle();
                                        }
                                        //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum1==1)
                                        {
                                            bilgisayar.nesneSil(bilgisayarNesneIndex);
                                            kullanicikagit5.seviyePuanimiGuncelle();
                                        }

                                        //Puanları yazdır
                                        kullanicikagit5.nesnePuaniGoster();
                                        bilgisayartas5.nesnePuaniGoster();

                                        //Ekrana yazdır
                                         //bilgisayar
                                         hamleler[roundSayaci][5]=Integer.toString(bilgisayartas5.getDayaniklilik());
                                         hamleler[roundSayaci][6]=Integer.toString(bilgisayartas5.getSeviyePuani());

                                         //kullanici
                                         hamleler[roundSayaci][2]=Integer.toString(kullanicikagit5.getDayaniklilik());
                                         hamleler[roundSayaci][3]=Integer.toString(kullanicikagit5.getSeviyePuani());

                                    }
                                }


                            }
                            else if("Taş".equals(bilgisayar.nesneListesi.get(bilgisayarNesneIndex)) && "Makas".equals(secilenNesnelerAsil.get(kullaniciNesneIndex))) {
                                System.out.println("Taş-Makas");
                                bilgisayarNesneLabelText="Taş";
                                hamleler[roundSayaci][0]="Round "+(roundSayaci+1);
                                hamleler[roundSayaci][1]="Makas";
                                hamleler[roundSayaci][4]="Taş";

                                if("Taş1".equals(bilgisayar.nesneListesiAdresleri.get(bilgisayarNesneIndex)))
                                {
                                 /*
                                 Taş1 Makas1
                                 Taş1 Makas2
                                 Taş1 Makas3
                                 Taş1 Makas4
                                 Taş1 Makas5
                                 */
                                    tas_etkisi=bilgisayartas1.etkiHesapla("Makas");   
                                    if("Makas1".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                    {
                                        kullanicimakas1.nesnePuaniGoster();
                                        bilgisayartas1.nesnePuaniGoster();

                                        nesne_durum2=kullanicimakas1.durumGuncelle(tas_etkisi);

                                        //kullanici için
                                        makas_etkisi=kullanicimakas1.etkiHesapla("Taş"); 
                                        nesne_durum1=bilgisayartas1.durumGuncelle(makas_etkisi);

                                        //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum2==1)
                                        {
                                            secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                            bilgisayartas1.seviyePuanimiGuncelle();
                                        }
                                        //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum1==1)
                                        {
                                            bilgisayar.nesneSil(bilgisayarNesneIndex);
                                            kullanicimakas1.seviyePuanimiGuncelle();
                                        }

                                        //Puanları yazdır
                                        kullanicimakas1.nesnePuaniGoster();
                                        bilgisayartas1.nesnePuaniGoster();

                                        //Ekrana yazdır
                                         //bilgisayar
                                         hamleler[roundSayaci][5]=Integer.toString(bilgisayartas1.getDayaniklilik());
                                         hamleler[roundSayaci][6]=Integer.toString(bilgisayartas1.getSeviyePuani());

                                         //kullanici
                                         hamleler[roundSayaci][2]=Integer.toString(kullanicimakas1.getDayaniklilik());
                                         hamleler[roundSayaci][3]=Integer.toString(kullanicimakas1.getSeviyePuani());
                                    }
                                    else if("Makas2".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                    {
                                        kullanicimakas2.nesnePuaniGoster();
                                        bilgisayartas1.nesnePuaniGoster();

                                        nesne_durum2=kullanicimakas2.durumGuncelle(tas_etkisi);

                                        //kullanici için
                                        makas_etkisi=kullanicimakas2.etkiHesapla("Taş"); 
                                        nesne_durum1=bilgisayartas1.durumGuncelle(makas_etkisi);

                                        //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum2==1)
                                        {
                                            secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                            bilgisayartas1.seviyePuanimiGuncelle();
                                        }
                                        //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum1==1)
                                        {
                                            bilgisayar.nesneSil(bilgisayarNesneIndex);
                                            kullanicimakas2.seviyePuanimiGuncelle();
                                        }

                                        //Puanları yazdır
                                        kullanicimakas2.nesnePuaniGoster();
                                        bilgisayartas1.nesnePuaniGoster();

                                        //Ekrana yazdır
                                         //bilgisayar
                                         hamleler[roundSayaci][5]=Integer.toString(bilgisayartas1.getDayaniklilik());
                                         hamleler[roundSayaci][6]=Integer.toString(bilgisayartas1.getSeviyePuani());

                                         //kullanici
                                         hamleler[roundSayaci][2]=Integer.toString(kullanicimakas2.getDayaniklilik());
                                         hamleler[roundSayaci][3]=Integer.toString(kullanicimakas2.getSeviyePuani());

                                    }
                                    else if("Makas3".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                    {
                                        kullanicimakas3.nesnePuaniGoster();
                                        bilgisayartas1.nesnePuaniGoster();

                                        nesne_durum2=kullanicimakas3.durumGuncelle(tas_etkisi);

                                        //kullanici için
                                        makas_etkisi=kullanicimakas3.etkiHesapla("Taş"); 
                                        nesne_durum1=bilgisayartas1.durumGuncelle(makas_etkisi);

                                        //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum2==1)
                                        {
                                            secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                            bilgisayartas1.seviyePuanimiGuncelle();
                                        }
                                        //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum1==1)
                                        {
                                            bilgisayar.nesneSil(bilgisayarNesneIndex);
                                            kullanicimakas3.seviyePuanimiGuncelle();
                                        }

                                        //Puanları yazdır
                                        kullanicimakas3.nesnePuaniGoster();
                                        bilgisayartas1.nesnePuaniGoster();

                                        //Ekrana yazdır
                                         //bilgisayar
                                         hamleler[roundSayaci][5]=Integer.toString(bilgisayartas1.getDayaniklilik());
                                         hamleler[roundSayaci][6]=Integer.toString(bilgisayartas1.getSeviyePuani());

                                         //kullanici
                                         hamleler[roundSayaci][2]=Integer.toString(kullanicimakas3.getDayaniklilik());
                                         hamleler[roundSayaci][3]=Integer.toString(kullanicimakas3.getSeviyePuani());

                                    }
                                    else if("Makas4".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                    {
                                        kullanicimakas4.nesnePuaniGoster();
                                        bilgisayartas1.nesnePuaniGoster();

                                        nesne_durum2=kullanicimakas4.durumGuncelle(tas_etkisi);

                                        //kullanici için
                                        makas_etkisi=kullanicimakas4.etkiHesapla("Taş"); 
                                        nesne_durum1=bilgisayartas1.durumGuncelle(makas_etkisi);

                                        //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum2==1)
                                        {
                                            secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                            bilgisayartas1.seviyePuanimiGuncelle();
                                        }
                                        //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum1==1)
                                        {
                                            bilgisayar.nesneSil(bilgisayarNesneIndex);
                                            kullanicimakas4.seviyePuanimiGuncelle();
                                        }

                                        //Puanları yazdır
                                        kullanicimakas4.nesnePuaniGoster();
                                        bilgisayartas1.nesnePuaniGoster();

                                        //Ekrana yazdır
                                         //bilgisayar
                                         hamleler[roundSayaci][5]=Integer.toString(bilgisayartas1.getDayaniklilik());
                                         hamleler[roundSayaci][6]=Integer.toString(bilgisayartas1.getSeviyePuani());

                                         //kullanici
                                         hamleler[roundSayaci][2]=Integer.toString(kullanicimakas4.getDayaniklilik());
                                         hamleler[roundSayaci][3]=Integer.toString(kullanicimakas4.getSeviyePuani());

                                    }
                                    else if("Makas5".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                    {
                                        kullanicimakas5.nesnePuaniGoster();
                                        bilgisayartas1.nesnePuaniGoster();

                                        nesne_durum2=kullanicimakas5.durumGuncelle(tas_etkisi);

                                        //kullanici için
                                        makas_etkisi=kullanicimakas5.etkiHesapla("Taş"); 
                                        nesne_durum1=bilgisayartas1.durumGuncelle(makas_etkisi);

                                        //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum2==1)
                                        {
                                            secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                            bilgisayartas1.seviyePuanimiGuncelle();
                                        }
                                        //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum1==1)
                                        {
                                            bilgisayar.nesneSil(bilgisayarNesneIndex);
                                            kullanicimakas5.seviyePuanimiGuncelle();
                                        }

                                        //Puanları yazdır
                                        kullanicimakas5.nesnePuaniGoster();
                                        bilgisayartas1.nesnePuaniGoster();

                                        //Ekrana yazdır
                                         //bilgisayar
                                         hamleler[roundSayaci][5]=Integer.toString(bilgisayartas1.getDayaniklilik());
                                         hamleler[roundSayaci][6]=Integer.toString(bilgisayartas1.getSeviyePuani());

                                         //kullanici
                                         hamleler[roundSayaci][2]=Integer.toString(kullanicimakas5.getDayaniklilik());
                                         hamleler[roundSayaci][3]=Integer.toString(kullanicimakas5.getSeviyePuani());
                                    }

                                }
                                else if("Taş2".equals(bilgisayar.nesneListesiAdresleri.get(bilgisayarNesneIndex)))
                                {
                                 /*
                                 Taş2 Makas1
                                 Taş2 Makas2
                                 Taş2 Makas3
                                 Taş2 Makas4
                                 Taş2 Makas5
                                 */
                                    tas_etkisi=bilgisayartas2.etkiHesapla("Makas");   
                                    if("Makas1".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                    {
                                        kullanicimakas1.nesnePuaniGoster();
                                        bilgisayartas2.nesnePuaniGoster();

                                        nesne_durum2=kullanicimakas1.durumGuncelle(tas_etkisi);

                                        //kullanici için
                                        makas_etkisi=kullanicimakas1.etkiHesapla("Taş"); 
                                        nesne_durum1=bilgisayartas2.durumGuncelle(makas_etkisi);

                                        //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum2==1)
                                        {
                                            secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                            bilgisayartas2.seviyePuanimiGuncelle();
                                        }
                                        //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum1==1)
                                        {
                                            bilgisayar.nesneSil(bilgisayarNesneIndex);
                                            kullanicimakas1.seviyePuanimiGuncelle();
                                        }

                                        //Puanları yazdır
                                        kullanicimakas1.nesnePuaniGoster();
                                        bilgisayartas2.nesnePuaniGoster();

                                        //Ekrana yazdır
                                         //bilgisayar
                                         hamleler[roundSayaci][5]=Integer.toString(bilgisayartas2.getDayaniklilik());
                                         hamleler[roundSayaci][6]=Integer.toString(bilgisayartas2.getSeviyePuani());

                                         //kullanici
                                         hamleler[roundSayaci][2]=Integer.toString(kullanicimakas1.getDayaniklilik());
                                         hamleler[roundSayaci][3]=Integer.toString(kullanicimakas1.getSeviyePuani());

                                    }
                                    else if("Makas2".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                    {
                                        kullanicimakas2.nesnePuaniGoster();
                                        bilgisayartas2.nesnePuaniGoster();

                                        nesne_durum2=kullanicimakas2.durumGuncelle(tas_etkisi);

                                        //kullanici için
                                        makas_etkisi=kullanicimakas2.etkiHesapla("Taş"); 
                                        nesne_durum1=bilgisayartas2.durumGuncelle(makas_etkisi);

                                        //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum2==1)
                                        {
                                            secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                            bilgisayartas2.seviyePuanimiGuncelle();
                                        }
                                        //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum1==1)
                                        {
                                            bilgisayar.nesneSil(bilgisayarNesneIndex);
                                            kullanicimakas2.seviyePuanimiGuncelle();
                                        }

                                        //Puanları yazdır
                                        kullanicimakas2.nesnePuaniGoster();
                                        bilgisayartas2.nesnePuaniGoster();


                                        //Ekrana yazdır
                                         //bilgisayar
                                         hamleler[roundSayaci][5]=Integer.toString(bilgisayartas2.getDayaniklilik());
                                         hamleler[roundSayaci][6]=Integer.toString(bilgisayartas2.getSeviyePuani());

                                         //kullanici
                                         hamleler[roundSayaci][2]=Integer.toString(kullanicimakas2.getDayaniklilik());
                                         hamleler[roundSayaci][3]=Integer.toString(kullanicimakas2.getSeviyePuani());

                                    }
                                    else if("Makas3".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                    {
                                        kullanicimakas3.nesnePuaniGoster();
                                        bilgisayartas2.nesnePuaniGoster();

                                        nesne_durum2=kullanicimakas3.durumGuncelle(tas_etkisi);

                                        //kullanici için
                                        makas_etkisi=kullanicimakas3.etkiHesapla("Taş"); 
                                        nesne_durum1=bilgisayartas2.durumGuncelle(makas_etkisi);

                                        //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum2==1)
                                        {
                                            secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                            bilgisayartas2.seviyePuanimiGuncelle();
                                        }
                                        //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum1==1)
                                        {
                                            bilgisayar.nesneSil(bilgisayarNesneIndex);
                                            kullanicimakas3.seviyePuanimiGuncelle();
                                        }

                                        //Puanları yazdır
                                        kullanicimakas3.nesnePuaniGoster();
                                        bilgisayartas2.nesnePuaniGoster();

                                        //Ekrana yazdır
                                         //bilgisayar
                                         hamleler[roundSayaci][5]=Integer.toString(bilgisayartas2.getDayaniklilik());
                                         hamleler[roundSayaci][6]=Integer.toString(bilgisayartas2.getSeviyePuani());

                                         //kullanici
                                         hamleler[roundSayaci][2]=Integer.toString(kullanicimakas3.getDayaniklilik());
                                         hamleler[roundSayaci][3]=Integer.toString(kullanicimakas3.getSeviyePuani());

                                    }
                                    else if("Makas4".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                    {
                                        kullanicimakas4.nesnePuaniGoster();
                                        bilgisayartas2.nesnePuaniGoster();

                                        nesne_durum2=kullanicimakas4.durumGuncelle(tas_etkisi);

                                        //kullanici için
                                        makas_etkisi=kullanicimakas4.etkiHesapla("Taş"); 
                                        nesne_durum1=bilgisayartas2.durumGuncelle(makas_etkisi);

                                        //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum2==1)
                                        {
                                            secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                            bilgisayartas2.seviyePuanimiGuncelle();
                                        }
                                        //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum1==1)
                                        {
                                            bilgisayar.nesneSil(bilgisayarNesneIndex);
                                            kullanicimakas4.seviyePuanimiGuncelle();
                                        }

                                        //Puanları yazdır
                                        kullanicimakas4.nesnePuaniGoster();
                                        bilgisayartas2.nesnePuaniGoster();

                                        //Ekrana yazdır
                                         //bilgisayar
                                         hamleler[roundSayaci][5]=Integer.toString(bilgisayartas2.getDayaniklilik());
                                         hamleler[roundSayaci][6]=Integer.toString(bilgisayartas2.getSeviyePuani());

                                         //kullanici
                                         hamleler[roundSayaci][2]=Integer.toString(kullanicimakas4.getDayaniklilik());
                                         hamleler[roundSayaci][3]=Integer.toString(kullanicimakas4.getSeviyePuani());

                                    }
                                    else if("Makas5".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                    {
                                        kullanicimakas5.nesnePuaniGoster();
                                        bilgisayartas2.nesnePuaniGoster();

                                        nesne_durum2=kullanicimakas5.durumGuncelle(tas_etkisi);

                                        //kullanici için
                                        makas_etkisi=kullanicimakas5.etkiHesapla("Taş"); 
                                        nesne_durum1=bilgisayartas2.durumGuncelle(makas_etkisi);

                                        //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum2==1)
                                        {
                                            secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                            bilgisayartas2.seviyePuanimiGuncelle();
                                        }
                                        //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum1==1)
                                        {
                                            bilgisayar.nesneSil(bilgisayarNesneIndex);
                                            kullanicimakas5.seviyePuanimiGuncelle();
                                        }

                                        //Puanları yazdır
                                        kullanicimakas5.nesnePuaniGoster();
                                        bilgisayartas2.nesnePuaniGoster();

                                        //Ekrana yazdır
                                         //bilgisayar
                                         hamleler[roundSayaci][5]=Integer.toString(bilgisayartas2.getDayaniklilik());
                                         hamleler[roundSayaci][6]=Integer.toString(bilgisayartas2.getSeviyePuani());

                                         //kullanici
                                         hamleler[roundSayaci][2]=Integer.toString(kullanicimakas5.getDayaniklilik());
                                         hamleler[roundSayaci][3]=Integer.toString(kullanicimakas5.getSeviyePuani());
                                    }
                                }
                                else if("Taş3".equals(bilgisayar.nesneListesiAdresleri.get(bilgisayarNesneIndex)))
                                {
                                 /*
                                 Taş3 Makas1
                                 Taş3 Makas2
                                 Taş3 Makas3
                                 Taş3 Makas4
                                 Taş3 Makas5
                                 */
                                    tas_etkisi=bilgisayartas3.etkiHesapla("Makas");   
                                    if("Makas1".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                    {
                                        kullanicimakas1.nesnePuaniGoster();
                                        bilgisayartas3.nesnePuaniGoster();

                                        nesne_durum2=kullanicimakas1.durumGuncelle(tas_etkisi);

                                        //kullanici için
                                        makas_etkisi=kullanicimakas1.etkiHesapla("Taş"); 
                                        nesne_durum1=bilgisayartas3.durumGuncelle(makas_etkisi);

                                        //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum2==1)
                                        {
                                            secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                            bilgisayartas3.seviyePuanimiGuncelle();
                                        }
                                        //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum1==1)
                                        {
                                            bilgisayar.nesneSil(bilgisayarNesneIndex);
                                            kullanicimakas1.seviyePuanimiGuncelle();
                                        }

                                        //Puanları yazdır
                                        kullanicimakas1.nesnePuaniGoster();
                                        bilgisayartas3.nesnePuaniGoster();

                                        //Ekrana yazdır
                                         //bilgisayar
                                         hamleler[roundSayaci][5]=Integer.toString(bilgisayartas3.getDayaniklilik());
                                         hamleler[roundSayaci][6]=Integer.toString(bilgisayartas3.getSeviyePuani());

                                         //kullanici
                                         hamleler[roundSayaci][2]=Integer.toString(kullanicimakas1.getDayaniklilik());
                                         hamleler[roundSayaci][3]=Integer.toString(kullanicimakas1.getSeviyePuani());

                                    }
                                    else if("Makas2".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                    {
                                        kullanicimakas2.nesnePuaniGoster();
                                        bilgisayartas3.nesnePuaniGoster();

                                        nesne_durum2=kullanicimakas2.durumGuncelle(tas_etkisi);

                                        //kullanici için
                                        makas_etkisi=kullanicimakas2.etkiHesapla("Taş"); 
                                        nesne_durum1=bilgisayartas3.durumGuncelle(makas_etkisi);

                                        //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum2==1)
                                        {
                                            secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                            bilgisayartas3.seviyePuanimiGuncelle();
                                        }
                                        //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum1==1)
                                        {
                                            bilgisayar.nesneSil(bilgisayarNesneIndex);
                                            kullanicimakas2.seviyePuanimiGuncelle();
                                        }

                                        //Puanları yazdır
                                        kullanicimakas2.nesnePuaniGoster();
                                        bilgisayartas3.nesnePuaniGoster();

                                        //Ekrana yazdır
                                         //bilgisayar
                                         hamleler[roundSayaci][5]=Integer.toString(bilgisayartas3.getDayaniklilik());
                                         hamleler[roundSayaci][6]=Integer.toString(bilgisayartas3.getSeviyePuani());

                                         //kullanici
                                         hamleler[roundSayaci][2]=Integer.toString(kullanicimakas2.getDayaniklilik());
                                         hamleler[roundSayaci][3]=Integer.toString(kullanicimakas2.getSeviyePuani());

                                    }
                                    else if("Makas3".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                    {
                                        kullanicimakas3.nesnePuaniGoster();
                                        bilgisayartas3.nesnePuaniGoster();

                                        nesne_durum2=kullanicimakas3.durumGuncelle(tas_etkisi);

                                        //kullanici için
                                        makas_etkisi=kullanicimakas3.etkiHesapla("Taş"); 
                                        nesne_durum1=bilgisayartas3.durumGuncelle(makas_etkisi);

                                        //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum2==1)
                                        {
                                            secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                            bilgisayartas3.seviyePuanimiGuncelle();
                                        }
                                        //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum1==1)
                                        {
                                            bilgisayar.nesneSil(bilgisayarNesneIndex);
                                            kullanicimakas3.seviyePuanimiGuncelle();
                                        }

                                        //Puanları yazdır
                                        kullanicimakas3.nesnePuaniGoster();
                                        bilgisayartas3.nesnePuaniGoster();

                                        //Ekrana yazdır
                                         //bilgisayar
                                         hamleler[roundSayaci][5]=Integer.toString(bilgisayartas3.getDayaniklilik());
                                         hamleler[roundSayaci][6]=Integer.toString(bilgisayartas3.getSeviyePuani());

                                         //kullanici
                                         hamleler[roundSayaci][2]=Integer.toString(kullanicimakas3.getDayaniklilik());
                                         hamleler[roundSayaci][3]=Integer.toString(kullanicimakas3.getSeviyePuani());
                                    }
                                    else if("Makas4".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                    {
                                        kullanicimakas4.nesnePuaniGoster();
                                        bilgisayartas3.nesnePuaniGoster();

                                        nesne_durum2=kullanicimakas4.durumGuncelle(tas_etkisi);

                                        //kullanici için
                                        makas_etkisi=kullanicimakas4.etkiHesapla("Taş"); 
                                        nesne_durum1=bilgisayartas3.durumGuncelle(makas_etkisi);

                                        //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum2==1)
                                        {
                                            secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                            bilgisayartas3.seviyePuanimiGuncelle();
                                        }
                                        //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum1==1)
                                        {
                                            bilgisayar.nesneSil(bilgisayarNesneIndex);
                                            kullanicimakas4.seviyePuanimiGuncelle();
                                        }

                                        //Puanları yazdır
                                        kullanicimakas4.nesnePuaniGoster();
                                        bilgisayartas3.nesnePuaniGoster();

                                        //Ekrana yazdır
                                         //bilgisayar
                                         hamleler[roundSayaci][5]=Integer.toString(bilgisayartas3.getDayaniklilik());
                                         hamleler[roundSayaci][6]=Integer.toString(bilgisayartas3.getSeviyePuani());

                                         //kullanici
                                         hamleler[roundSayaci][2]=Integer.toString(kullanicimakas4.getDayaniklilik());
                                         hamleler[roundSayaci][3]=Integer.toString(kullanicimakas4.getSeviyePuani());

                                    }
                                    else if("Makas5".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                    {
                                        kullanicimakas5.nesnePuaniGoster();
                                        bilgisayartas3.nesnePuaniGoster();

                                        nesne_durum2=kullanicimakas5.durumGuncelle(tas_etkisi);

                                        //kullanici için
                                        makas_etkisi=kullanicimakas5.etkiHesapla("Taş"); 
                                        nesne_durum1=bilgisayartas3.durumGuncelle(makas_etkisi);

                                        //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum2==1)
                                        {
                                            secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                            bilgisayartas3.seviyePuanimiGuncelle();
                                        }
                                        //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum1==1)
                                        {
                                            bilgisayar.nesneSil(bilgisayarNesneIndex);
                                            kullanicimakas5.seviyePuanimiGuncelle();
                                        }

                                        //Puanları yazdır
                                        kullanicimakas5.nesnePuaniGoster();
                                        bilgisayartas3.nesnePuaniGoster();

                                        //Ekrana yazdır
                                         //bilgisayar
                                         hamleler[roundSayaci][5]=Integer.toString(bilgisayartas3.getDayaniklilik());
                                         hamleler[roundSayaci][6]=Integer.toString(bilgisayartas3.getSeviyePuani());

                                         //kullanici
                                         hamleler[roundSayaci][2]=Integer.toString(kullanicimakas5.getDayaniklilik());
                                         hamleler[roundSayaci][3]=Integer.toString(kullanicimakas5.getSeviyePuani());
                                    }
                                }
                                else if("Taş4".equals(bilgisayar.nesneListesiAdresleri.get(bilgisayarNesneIndex)))
                                {
                                 /*
                                 Taş4 Makas1
                                 Taş4 Makas2
                                 Taş4 Makas3
                                 Taş4 Makas4
                                 Taş4 Makas5
                                 */
                                    tas_etkisi=bilgisayartas4.etkiHesapla("Makas");   
                                    if("Makas1".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                    {
                                        kullanicimakas1.nesnePuaniGoster();
                                        bilgisayartas4.nesnePuaniGoster();

                                        nesne_durum2=kullanicimakas1.durumGuncelle(tas_etkisi);

                                        //kullanici için
                                        makas_etkisi=kullanicimakas1.etkiHesapla("Taş"); 
                                        nesne_durum1=bilgisayartas4.durumGuncelle(makas_etkisi);

                                        //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum2==1)
                                        {
                                            secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                            bilgisayartas4.seviyePuanimiGuncelle();
                                        }
                                        //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum1==1)
                                        {
                                            bilgisayar.nesneSil(bilgisayarNesneIndex);
                                            kullanicimakas1.seviyePuanimiGuncelle();
                                        }

                                        //Puanları yazdır
                                        kullanicimakas1.nesnePuaniGoster();
                                        bilgisayartas4.nesnePuaniGoster();

                                        //Ekrana yazdır
                                         //bilgisayar
                                         hamleler[roundSayaci][5]=Integer.toString(bilgisayartas4.getDayaniklilik());
                                         hamleler[roundSayaci][6]=Integer.toString(bilgisayartas4.getSeviyePuani());

                                         //kullanici
                                         hamleler[roundSayaci][2]=Integer.toString(kullanicimakas1.getDayaniklilik());
                                         hamleler[roundSayaci][3]=Integer.toString(kullanicimakas1.getSeviyePuani());

                                    }
                                    else if("Makas2".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                    {
                                        kullanicimakas2.nesnePuaniGoster();
                                        bilgisayartas4.nesnePuaniGoster();

                                        nesne_durum2=kullanicimakas2.durumGuncelle(tas_etkisi);

                                        //kullanici için
                                        makas_etkisi=kullanicimakas2.etkiHesapla("Taş"); 
                                        nesne_durum1=bilgisayartas4.durumGuncelle(makas_etkisi);

                                        //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum2==1)
                                        {
                                            secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                            bilgisayartas4.seviyePuanimiGuncelle();
                                        }
                                        //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum1==1)
                                        {
                                            bilgisayar.nesneSil(bilgisayarNesneIndex);
                                            kullanicimakas2.seviyePuanimiGuncelle();
                                        }

                                        //Puanları yazdır
                                        kullanicimakas2.nesnePuaniGoster();
                                        bilgisayartas4.nesnePuaniGoster();

                                        //Ekrana yazdır
                                         //bilgisayar
                                         hamleler[roundSayaci][5]=Integer.toString(bilgisayartas4.getDayaniklilik());
                                         hamleler[roundSayaci][6]=Integer.toString(bilgisayartas4.getSeviyePuani());

                                         //kullanici
                                         hamleler[roundSayaci][2]=Integer.toString(kullanicimakas2.getDayaniklilik());
                                         hamleler[roundSayaci][3]=Integer.toString(kullanicimakas2.getSeviyePuani());

                                    }
                                    else if("Makas3".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                    {
                                        kullanicimakas3.nesnePuaniGoster();
                                        bilgisayartas4.nesnePuaniGoster();

                                        nesne_durum2=kullanicimakas3.durumGuncelle(tas_etkisi);

                                        //kullanici için
                                        makas_etkisi=kullanicimakas3.etkiHesapla("Taş"); 
                                        nesne_durum1=bilgisayartas4.durumGuncelle(makas_etkisi);

                                        //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum2==1)
                                        {
                                            secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                            bilgisayartas4.seviyePuanimiGuncelle();
                                        }
                                        //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum1==1)
                                        {
                                            bilgisayar.nesneSil(bilgisayarNesneIndex);
                                            kullanicimakas3.seviyePuanimiGuncelle();
                                        }

                                        //Puanları yazdır
                                        kullanicimakas3.nesnePuaniGoster();
                                        bilgisayartas4.nesnePuaniGoster();

                                        //Ekrana yazdır
                                         //bilgisayar
                                         hamleler[roundSayaci][5]=Integer.toString(bilgisayartas4.getDayaniklilik());
                                         hamleler[roundSayaci][6]=Integer.toString(bilgisayartas4.getSeviyePuani());

                                         //kullanici
                                         hamleler[roundSayaci][2]=Integer.toString(kullanicimakas3.getDayaniklilik());
                                         hamleler[roundSayaci][3]=Integer.toString(kullanicimakas3.getSeviyePuani());
                                    }
                                    else if("Makas4".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                    {
                                        kullanicimakas4.nesnePuaniGoster();
                                        bilgisayartas4.nesnePuaniGoster();

                                        nesne_durum2=kullanicimakas4.durumGuncelle(tas_etkisi);

                                        //kullanici için
                                        makas_etkisi=kullanicimakas4.etkiHesapla("Taş"); 
                                        nesne_durum1=bilgisayartas4.durumGuncelle(makas_etkisi);

                                        //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum2==1)
                                        {
                                            secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                            bilgisayartas4.seviyePuanimiGuncelle();
                                        }
                                        //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum1==1)
                                        {
                                            bilgisayar.nesneSil(bilgisayarNesneIndex);
                                            kullanicimakas4.seviyePuanimiGuncelle();
                                        }

                                        //Puanları yazdır
                                        kullanicimakas4.nesnePuaniGoster();
                                        bilgisayartas4.nesnePuaniGoster();

                                        //Ekrana yazdır
                                         //bilgisayar
                                         hamleler[roundSayaci][5]=Integer.toString(bilgisayartas4.getDayaniklilik());
                                         hamleler[roundSayaci][6]=Integer.toString(bilgisayartas4.getSeviyePuani());

                                         //kullanici
                                         hamleler[roundSayaci][2]=Integer.toString(kullanicimakas4.getDayaniklilik());
                                         hamleler[roundSayaci][3]=Integer.toString(kullanicimakas4.getSeviyePuani());
                                    }
                                    else if("Makas5".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                    {
                                        kullanicimakas5.nesnePuaniGoster();
                                        bilgisayartas4.nesnePuaniGoster();

                                        nesne_durum2=kullanicimakas5.durumGuncelle(tas_etkisi);

                                        //kullanici için
                                        makas_etkisi=kullanicimakas5.etkiHesapla("Taş"); 
                                        nesne_durum1=bilgisayartas4.durumGuncelle(makas_etkisi);

                                        //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum2==1)
                                        {
                                            secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                            bilgisayartas4.seviyePuanimiGuncelle();
                                        }
                                        //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum1==1)
                                        {
                                            bilgisayar.nesneSil(bilgisayarNesneIndex);
                                            kullanicimakas5.seviyePuanimiGuncelle();
                                        }

                                        //Puanları yazdır
                                        kullanicimakas5.nesnePuaniGoster();
                                        bilgisayartas4.nesnePuaniGoster();

                                        //Ekrana yazdır
                                         //bilgisayar
                                         hamleler[roundSayaci][5]=Integer.toString(bilgisayartas4.getDayaniklilik());
                                         hamleler[roundSayaci][6]=Integer.toString(bilgisayartas4.getSeviyePuani());

                                         //kullanici
                                         hamleler[roundSayaci][2]=Integer.toString(kullanicimakas5.getDayaniklilik());
                                         hamleler[roundSayaci][3]=Integer.toString(kullanicimakas5.getSeviyePuani());
                                    }
                                }
                                else if("Taş5".equals(bilgisayar.nesneListesiAdresleri.get(bilgisayarNesneIndex)))
                                {
                                 /*
                                 Taş5 Makas1
                                 Taş5 Makas2
                                 Taş5 Makas3
                                 Taş5 Makas4
                                 Taş5 Makas5
                                 */
                                    tas_etkisi=bilgisayartas5.etkiHesapla("Makas");   
                                    if("Makas1".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                    {
                                        kullanicimakas1.nesnePuaniGoster();
                                        bilgisayartas5.nesnePuaniGoster();

                                        nesne_durum2=kullanicimakas1.durumGuncelle(tas_etkisi);

                                        //kullanici için
                                        makas_etkisi=kullanicimakas1.etkiHesapla("Taş"); 
                                        nesne_durum1=bilgisayartas5.durumGuncelle(makas_etkisi);

                                        //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum2==1)
                                        {
                                            secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                            bilgisayartas5.seviyePuanimiGuncelle();
                                        }
                                        //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum1==1)
                                        {
                                            bilgisayar.nesneSil(bilgisayarNesneIndex);
                                            kullanicimakas1.seviyePuanimiGuncelle();
                                        }

                                        //Puanları yazdır
                                        kullanicimakas1.nesnePuaniGoster();
                                        bilgisayartas5.nesnePuaniGoster();

                                        //Ekrana yazdır
                                         //bilgisayar
                                         hamleler[roundSayaci][5]=Integer.toString(bilgisayartas5.getDayaniklilik());
                                         hamleler[roundSayaci][6]=Integer.toString(bilgisayartas5.getSeviyePuani());

                                         //kullanici
                                         hamleler[roundSayaci][2]=Integer.toString(kullanicimakas1.getDayaniklilik());
                                         hamleler[roundSayaci][3]=Integer.toString(kullanicimakas1.getSeviyePuani());

                                    }
                                    else if("Makas2".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                    {
                                        kullanicimakas2.nesnePuaniGoster();
                                        bilgisayartas5.nesnePuaniGoster();

                                        nesne_durum2=kullanicimakas2.durumGuncelle(tas_etkisi);

                                        //kullanici için
                                        makas_etkisi=kullanicimakas2.etkiHesapla("Taş"); 
                                        nesne_durum1=bilgisayartas5.durumGuncelle(makas_etkisi);

                                        //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum2==1)
                                        {
                                            secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                            bilgisayartas5.seviyePuanimiGuncelle();
                                        }
                                        //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum1==1)
                                        {
                                            bilgisayar.nesneSil(bilgisayarNesneIndex);
                                            kullanicimakas2.seviyePuanimiGuncelle();
                                        }

                                        //Puanları yazdır
                                        kullanicimakas2.nesnePuaniGoster();
                                        bilgisayartas5.nesnePuaniGoster();

                                        //Ekrana yazdır
                                         //bilgisayar
                                         hamleler[roundSayaci][5]=Integer.toString(bilgisayartas5.getDayaniklilik());
                                         hamleler[roundSayaci][6]=Integer.toString(bilgisayartas5.getSeviyePuani());

                                         //kullanici
                                         hamleler[roundSayaci][2]=Integer.toString(kullanicimakas2.getDayaniklilik());
                                         hamleler[roundSayaci][3]=Integer.toString(kullanicimakas2.getSeviyePuani());

                                    }
                                    else if("Makas3".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                    {
                                        kullanicimakas3.nesnePuaniGoster();
                                        bilgisayartas5.nesnePuaniGoster();

                                        nesne_durum2=kullanicimakas3.durumGuncelle(tas_etkisi);

                                        //kullanici için
                                        makas_etkisi=kullanicimakas3.etkiHesapla("Taş"); 
                                        nesne_durum1=bilgisayartas5.durumGuncelle(makas_etkisi);

                                        //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum2==1)
                                        {
                                            secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                            bilgisayartas5.seviyePuanimiGuncelle();
                                        }
                                        //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum1==1)
                                        {
                                            bilgisayar.nesneSil(bilgisayarNesneIndex);
                                            kullanicimakas3.seviyePuanimiGuncelle();
                                        }

                                        //Puanları yazdır
                                        kullanicimakas3.nesnePuaniGoster();
                                        bilgisayartas5.nesnePuaniGoster();

                                        //Ekrana yazdır
                                         //bilgisayar
                                         hamleler[roundSayaci][5]=Integer.toString(bilgisayartas5.getDayaniklilik());
                                         hamleler[roundSayaci][6]=Integer.toString(bilgisayartas5.getSeviyePuani());

                                         //kullanici
                                         hamleler[roundSayaci][2]=Integer.toString(kullanicimakas3.getDayaniklilik());
                                         hamleler[roundSayaci][3]=Integer.toString(kullanicimakas3.getSeviyePuani());
                                    }
                                    else if("Makas4".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                    {
                                        kullanicimakas4.nesnePuaniGoster();
                                        bilgisayartas5.nesnePuaniGoster();

                                        nesne_durum2=kullanicimakas4.durumGuncelle(tas_etkisi);

                                        //kullanici için
                                        makas_etkisi=kullanicimakas4.etkiHesapla("Taş"); 
                                        nesne_durum1=bilgisayartas5.durumGuncelle(makas_etkisi);

                                        //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum2==1)
                                        {
                                            secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                            bilgisayartas5.seviyePuanimiGuncelle();
                                        }
                                        //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum1==1)
                                        {
                                            bilgisayar.nesneSil(bilgisayarNesneIndex);
                                            kullanicimakas4.seviyePuanimiGuncelle();
                                        }

                                        //Puanları yazdır
                                        kullanicimakas4.nesnePuaniGoster();
                                        bilgisayartas5.nesnePuaniGoster();

                                        //Ekrana yazdır
                                         //bilgisayar
                                         hamleler[roundSayaci][5]=Integer.toString(bilgisayartas5.getDayaniklilik());
                                         hamleler[roundSayaci][6]=Integer.toString(bilgisayartas5.getSeviyePuani());

                                         //kullanici
                                         hamleler[roundSayaci][2]=Integer.toString(kullanicimakas4.getDayaniklilik());
                                         hamleler[roundSayaci][3]=Integer.toString(kullanicimakas4.getSeviyePuani());

                                    }
                                    else if("Makas5".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                    {
                                        kullanicimakas5.nesnePuaniGoster();
                                        bilgisayartas5.nesnePuaniGoster();

                                        nesne_durum2=kullanicimakas5.durumGuncelle(tas_etkisi);

                                        //kullanici için
                                        makas_etkisi=kullanicimakas5.etkiHesapla("Taş"); 
                                        nesne_durum1=bilgisayartas5.durumGuncelle(makas_etkisi);

                                        //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum2==1)
                                        {
                                            secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                            bilgisayartas5.seviyePuanimiGuncelle();
                                        }
                                        //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum1==1)
                                        {
                                            bilgisayar.nesneSil(bilgisayarNesneIndex);
                                            kullanicimakas5.seviyePuanimiGuncelle();
                                        }

                                        //Puanları yazdır
                                        kullanicimakas5.nesnePuaniGoster();
                                        bilgisayartas5.nesnePuaniGoster();

                                        //Ekrana yazdır
                                         //bilgisayar
                                         hamleler[roundSayaci][5]=Integer.toString(bilgisayartas5.getDayaniklilik());
                                         hamleler[roundSayaci][6]=Integer.toString(bilgisayartas5.getSeviyePuani());

                                         //kullanici
                                         hamleler[roundSayaci][2]=Integer.toString(kullanicimakas5.getDayaniklilik());
                                         hamleler[roundSayaci][3]=Integer.toString(kullanicimakas5.getSeviyePuani());
                                    }
                                }



                            }
                            else if("Kağıt".equals(bilgisayar.nesneListesi.get(bilgisayarNesneIndex)) && "Taş".equals(secilenNesnelerAsil.get(kullaniciNesneIndex))) {
                                System.out.println("Kağıt-Taş");
                                bilgisayarNesneLabelText="Kağıt";
                                hamleler[roundSayaci][0]="Round "+(roundSayaci+1);
                                hamleler[roundSayaci][1]="Taş";
                                hamleler[roundSayaci][4]="Kağıt";


                                if("Kağıt1".equals(bilgisayar.nesneListesiAdresleri.get(bilgisayarNesneIndex)))
                                {
                                 /*
                                 Kağıt1 Taş1
                                 Kağıt1 Taş2
                                 Kağıt1 Taş3
                                 Kağıt1 Taş4
                                 Kağıt1 Taş5
                                 */
                                    kagit_etkisi=bilgisayarkagit1.etkiHesapla("Taş");   
                                    if("Taş1".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                    {
                                        bilgisayarkagit1.nesnePuaniGoster();
                                        kullanicitas1.nesnePuaniGoster();

                                        nesne_durum2=kullanicitas1.durumGuncelle(kagit_etkisi);

                                        //kullanici için
                                        tas_etkisi=kullanicitas1.etkiHesapla("Kağıt"); 
                                        nesne_durum1=bilgisayarkagit1.durumGuncelle(tas_etkisi);

                                        //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum2==1)
                                        {
                                            //kullanici.nesneSil(kullaniciNesneIndex);
                                            secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");                                       
                                            bilgisayarkagit1.seviyePuanimiGuncelle();
                                        }
                                        //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum1==1)
                                        {
                                            bilgisayar.nesneSil(bilgisayarNesneIndex);
                                            kullanicitas1.seviyePuanimiGuncelle();
                                        }

                                        //Puanları yazdır
                                        kullanicitas1.nesnePuaniGoster();
                                        bilgisayarkagit1.nesnePuaniGoster();

                                        //Ekrana yazdır
                                         //bilgisayar
                                         hamleler[roundSayaci][5]=Integer.toString(bilgisayarkagit1.getDayaniklilik());
                                         hamleler[roundSayaci][6]=Integer.toString(bilgisayarkagit1.getSeviyePuani());

                                         //kullanici
                                         hamleler[roundSayaci][2]=Integer.toString(kullanicitas1.getDayaniklilik());
                                         hamleler[roundSayaci][3]=Integer.toString(kullanicitas1.getSeviyePuani());
                                    }
                                    else if("Taş2".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                    {
                                        bilgisayarkagit1.nesnePuaniGoster();
                                        kullanicitas2.nesnePuaniGoster();

                                        nesne_durum2=kullanicitas2.durumGuncelle(kagit_etkisi);

                                        //kullanici için
                                        tas_etkisi=kullanicitas2.etkiHesapla("Kağıt"); 
                                        nesne_durum1=bilgisayarkagit1.durumGuncelle(tas_etkisi);

                                        //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum2==1)
                                        {
                                            secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                            bilgisayarkagit1.seviyePuanimiGuncelle();
                                        }
                                        //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum1==1)
                                        {
                                            bilgisayar.nesneSil(bilgisayarNesneIndex);
                                            kullanicitas2.seviyePuanimiGuncelle();
                                        }

                                        //Puanları yazdır
                                        kullanicitas2.nesnePuaniGoster();
                                        bilgisayarkagit1.nesnePuaniGoster();

                                        //Ekrana yazdır
                                         //bilgisayar
                                         hamleler[roundSayaci][5]=Integer.toString(bilgisayarkagit1.getDayaniklilik());
                                         hamleler[roundSayaci][6]=Integer.toString(bilgisayarkagit1.getSeviyePuani());

                                         //kullanici
                                         hamleler[roundSayaci][2]=Integer.toString(kullanicitas2.getDayaniklilik());
                                         hamleler[roundSayaci][3]=Integer.toString(kullanicitas2.getSeviyePuani());
                                    }
                                    else if("Taş3".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                    {
                                        bilgisayarkagit1.nesnePuaniGoster();
                                        kullanicitas3.nesnePuaniGoster();

                                        nesne_durum2=kullanicitas3.durumGuncelle(kagit_etkisi);

                                        //kullanici için
                                        tas_etkisi=kullanicitas3.etkiHesapla("Kağıt"); 
                                        nesne_durum1=bilgisayarkagit1.durumGuncelle(tas_etkisi);

                                        //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum2==1)
                                        {
                                            secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                            bilgisayarkagit1.seviyePuanimiGuncelle();
                                        }
                                        //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum1==1)
                                        {
                                            bilgisayar.nesneSil(bilgisayarNesneIndex);
                                            kullanicitas3.seviyePuanimiGuncelle();
                                        }

                                        //Puanları yazdır
                                        kullanicitas3.nesnePuaniGoster();
                                        bilgisayarkagit1.nesnePuaniGoster();

                                        //Ekrana yazdır
                                         //bilgisayar
                                         hamleler[roundSayaci][5]=Integer.toString(bilgisayarkagit1.getDayaniklilik());
                                         hamleler[roundSayaci][6]=Integer.toString(bilgisayarkagit1.getSeviyePuani());

                                         //kullanici
                                         hamleler[roundSayaci][2]=Integer.toString(kullanicitas3.getDayaniklilik());
                                         hamleler[roundSayaci][3]=Integer.toString(kullanicitas3.getSeviyePuani());

                                    }
                                    else if("Taş4".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                    {
                                        bilgisayarkagit1.nesnePuaniGoster();
                                        kullanicitas4.nesnePuaniGoster();

                                        nesne_durum2=kullanicitas4.durumGuncelle(kagit_etkisi);

                                        //kullanici için
                                        tas_etkisi=kullanicitas4.etkiHesapla("Kağıt"); 
                                        nesne_durum1=bilgisayarkagit1.durumGuncelle(tas_etkisi);

                                        //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum2==1)
                                        {
                                            secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                            bilgisayarkagit1.seviyePuanimiGuncelle();
                                        }
                                        //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum1==1)
                                        {
                                            bilgisayar.nesneSil(bilgisayarNesneIndex);
                                            kullanicitas4.seviyePuanimiGuncelle();
                                        }

                                        //Puanları yazdır
                                        kullanicitas4.nesnePuaniGoster();
                                        bilgisayarkagit1.nesnePuaniGoster();

                                        //Ekrana yazdır
                                         //bilgisayar
                                         hamleler[roundSayaci][5]=Integer.toString(bilgisayarkagit1.getDayaniklilik());
                                         hamleler[roundSayaci][6]=Integer.toString(bilgisayarkagit1.getSeviyePuani());

                                         //kullanici
                                         hamleler[roundSayaci][2]=Integer.toString(kullanicitas4.getDayaniklilik());
                                         hamleler[roundSayaci][3]=Integer.toString(kullanicitas4.getSeviyePuani());
                                    }
                                    else if("Taş5".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                    {
                                        bilgisayarkagit1.nesnePuaniGoster();
                                        kullanicitas5.nesnePuaniGoster();

                                        nesne_durum2=kullanicitas5.durumGuncelle(kagit_etkisi);

                                        //kullanici için
                                        tas_etkisi=kullanicitas5.etkiHesapla("Kağıt"); 
                                        nesne_durum1=bilgisayarkagit1.durumGuncelle(tas_etkisi);

                                        //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum2==1)
                                        {
                                            secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                            bilgisayarkagit1.seviyePuanimiGuncelle();
                                        }
                                        //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum1==1)
                                        {
                                            bilgisayar.nesneSil(bilgisayarNesneIndex);
                                            kullanicitas5.seviyePuanimiGuncelle();
                                        }

                                        //Puanları yazdır
                                        kullanicitas5.nesnePuaniGoster();
                                        bilgisayarkagit1.nesnePuaniGoster();

                                        //Ekrana yazdır
                                         //bilgisayar
                                         hamleler[roundSayaci][5]=Integer.toString(bilgisayarkagit1.getDayaniklilik());
                                         hamleler[roundSayaci][6]=Integer.toString(bilgisayarkagit1.getSeviyePuani());

                                         //kullanici
                                         hamleler[roundSayaci][2]=Integer.toString(kullanicitas5.getDayaniklilik());
                                         hamleler[roundSayaci][3]=Integer.toString(kullanicitas5.getSeviyePuani());
                                    }

                                }
                                else if("Kağıt2".equals(bilgisayar.nesneListesiAdresleri.get(bilgisayarNesneIndex)))
                                {
                                 /*
                                 Kağıt2 Taş1
                                 Kağıt2 Taş2
                                 Kağıt2 Taş3
                                 Kağıt2 Taş4
                                 Kağıt2 Taş5
                                 */
                                    kagit_etkisi=bilgisayarkagit2.etkiHesapla("Taş");   
                                    if("Taş1".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                    {
                                        bilgisayarkagit2.nesnePuaniGoster();
                                        kullanicitas1.nesnePuaniGoster();

                                        nesne_durum2=kullanicitas1.durumGuncelle(kagit_etkisi);

                                        //kullanici için
                                        tas_etkisi=kullanicitas1.etkiHesapla("Kağıt"); 
                                        nesne_durum1=bilgisayarkagit2.durumGuncelle(tas_etkisi);

                                        //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum2==1)
                                        {
                                            secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                            bilgisayarkagit2.seviyePuanimiGuncelle();
                                        }
                                        //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum1==1)
                                        {
                                            bilgisayar.nesneSil(bilgisayarNesneIndex);
                                            kullanicitas1.seviyePuanimiGuncelle();
                                        }

                                        //Puanları yazdır
                                        kullanicitas1.nesnePuaniGoster();
                                        bilgisayarkagit2.nesnePuaniGoster();

                                        //Ekrana yazdır
                                         //bilgisayar
                                         hamleler[roundSayaci][5]=Integer.toString(bilgisayarkagit2.getDayaniklilik());
                                         hamleler[roundSayaci][6]=Integer.toString(bilgisayarkagit2.getSeviyePuani());

                                         //kullanici
                                         hamleler[roundSayaci][2]=Integer.toString(kullanicitas1.getDayaniklilik());
                                         hamleler[roundSayaci][3]=Integer.toString(kullanicitas1.getSeviyePuani());

                                    }
                                    else if("Taş2".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                    {
                                        bilgisayarkagit2.nesnePuaniGoster();
                                        kullanicitas2.nesnePuaniGoster();

                                        nesne_durum2=kullanicitas2.durumGuncelle(kagit_etkisi);

                                        //kullanici için
                                        tas_etkisi=kullanicitas2.etkiHesapla("Kağıt"); 
                                        nesne_durum1=bilgisayarkagit2.durumGuncelle(tas_etkisi);

                                        //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum2==1)
                                        {
                                            secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                            bilgisayarkagit2.seviyePuanimiGuncelle();
                                        }
                                        //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum1==1)
                                        {
                                            bilgisayar.nesneSil(bilgisayarNesneIndex);
                                            kullanicitas2.seviyePuanimiGuncelle();
                                        }

                                        //Puanları yazdır
                                        kullanicitas2.nesnePuaniGoster();
                                        bilgisayarkagit2.nesnePuaniGoster();

                                        //Ekrana yazdır
                                         //bilgisayar
                                         hamleler[roundSayaci][5]=Integer.toString(bilgisayarkagit2.getDayaniklilik());
                                         hamleler[roundSayaci][6]=Integer.toString(bilgisayarkagit2.getSeviyePuani());

                                         //kullanici
                                         hamleler[roundSayaci][2]=Integer.toString(kullanicitas2.getDayaniklilik());
                                         hamleler[roundSayaci][3]=Integer.toString(kullanicitas2.getSeviyePuani());

                                    }
                                    else if("Taş3".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                    {
                                        bilgisayarkagit2.nesnePuaniGoster();
                                        kullanicitas3.nesnePuaniGoster();

                                        nesne_durum2=kullanicitas3.durumGuncelle(kagit_etkisi);

                                        //kullanici için
                                        tas_etkisi=kullanicitas3.etkiHesapla("Kağıt"); 
                                        nesne_durum1=bilgisayarkagit2.durumGuncelle(tas_etkisi);

                                        //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum2==1)
                                        {
                                            secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                            bilgisayarkagit2.seviyePuanimiGuncelle();
                                        }
                                        //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum1==1)
                                        {
                                            bilgisayar.nesneSil(bilgisayarNesneIndex);
                                            kullanicitas3.seviyePuanimiGuncelle();
                                        }

                                        //Puanları yazdır
                                        kullanicitas3.nesnePuaniGoster();
                                        bilgisayarkagit2.nesnePuaniGoster();

                                        //Ekrana yazdır
                                         //bilgisayar
                                         hamleler[roundSayaci][5]=Integer.toString(bilgisayarkagit2.getDayaniklilik());
                                         hamleler[roundSayaci][6]=Integer.toString(bilgisayarkagit2.getSeviyePuani());

                                         //kullanici
                                         hamleler[roundSayaci][2]=Integer.toString(kullanicitas3.getDayaniklilik());
                                         hamleler[roundSayaci][3]=Integer.toString(kullanicitas3.getSeviyePuani());

                                    }
                                    else if("Taş4".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                    {
                                        bilgisayarkagit2.nesnePuaniGoster();
                                        kullanicitas4.nesnePuaniGoster();

                                        nesne_durum2=kullanicitas4.durumGuncelle(kagit_etkisi);

                                        //kullanici için
                                        tas_etkisi=kullanicitas4.etkiHesapla("Kağıt"); 
                                        nesne_durum1=bilgisayarkagit2.durumGuncelle(tas_etkisi);

                                        //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum2==1)
                                        {
                                            secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                            bilgisayarkagit2.seviyePuanimiGuncelle();
                                        }
                                        //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum1==1)
                                        {
                                            bilgisayar.nesneSil(bilgisayarNesneIndex);
                                            kullanicitas4.seviyePuanimiGuncelle();
                                        }

                                        //Puanları yazdır
                                        kullanicitas4.nesnePuaniGoster();
                                        bilgisayarkagit2.nesnePuaniGoster();

                                        //Ekrana yazdır
                                         //bilgisayar
                                         hamleler[roundSayaci][5]=Integer.toString(bilgisayarkagit2.getDayaniklilik());
                                         hamleler[roundSayaci][6]=Integer.toString(bilgisayarkagit2.getSeviyePuani());

                                         //kullanici
                                         hamleler[roundSayaci][2]=Integer.toString(kullanicitas4.getDayaniklilik());
                                         hamleler[roundSayaci][3]=Integer.toString(kullanicitas4.getSeviyePuani());

                                    }
                                    else if("Taş5".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                    {
                                        bilgisayarkagit2.nesnePuaniGoster();
                                        kullanicitas5.nesnePuaniGoster();

                                        nesne_durum2=kullanicitas5.durumGuncelle(kagit_etkisi);

                                        //kullanici için
                                        tas_etkisi=kullanicitas5.etkiHesapla("Kağıt"); 
                                        nesne_durum1=bilgisayarkagit2.durumGuncelle(tas_etkisi);

                                        //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum2==1)
                                        {
                                            secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                            bilgisayarkagit2.seviyePuanimiGuncelle();
                                        }
                                        //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum1==1)
                                        {
                                            bilgisayar.nesneSil(bilgisayarNesneIndex);
                                            kullanicitas5.seviyePuanimiGuncelle();
                                        }

                                        //Puanları yazdır
                                        kullanicitas5.nesnePuaniGoster();
                                        bilgisayarkagit2.nesnePuaniGoster();

                                        //Ekrana yazdır
                                         //bilgisayar
                                         hamleler[roundSayaci][5]=Integer.toString(bilgisayarkagit2.getDayaniklilik());
                                         hamleler[roundSayaci][6]=Integer.toString(bilgisayarkagit2.getSeviyePuani());

                                         //kullanici
                                         hamleler[roundSayaci][2]=Integer.toString(kullanicitas5.getDayaniklilik());
                                         hamleler[roundSayaci][3]=Integer.toString(kullanicitas5.getSeviyePuani());
                                    }
                                }
                                else if("Kağıt3".equals(bilgisayar.nesneListesiAdresleri.get(bilgisayarNesneIndex)))
                                {
                                 /*
                                 Kağıt3 Taş1
                                 Kağıt3 Taş2
                                 Kağıt3 Taş3
                                 Kağıt3 Taş4
                                 Kağıt3 Taş5
                                 */
                                    kagit_etkisi=bilgisayarkagit3.etkiHesapla("Taş");   
                                    if("Taş1".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                    {
                                        bilgisayarkagit3.nesnePuaniGoster();
                                        kullanicitas1.nesnePuaniGoster();

                                        nesne_durum2=kullanicitas1.durumGuncelle(kagit_etkisi);

                                        //kullanici için
                                        tas_etkisi=kullanicitas1.etkiHesapla("Kağıt"); 
                                        nesne_durum1=bilgisayarkagit3.durumGuncelle(tas_etkisi);

                                        //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum2==1)
                                        {
                                            secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                            bilgisayarkagit3.seviyePuanimiGuncelle();
                                        }
                                        //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum1==1)
                                        {
                                            bilgisayar.nesneSil(bilgisayarNesneIndex);
                                            kullanicitas1.seviyePuanimiGuncelle();
                                        }

                                        //Puanları yazdır
                                        kullanicitas1.nesnePuaniGoster();
                                        bilgisayarkagit3.nesnePuaniGoster();

                                        //Ekrana yazdır
                                         //bilgisayar
                                         hamleler[roundSayaci][5]=Integer.toString(bilgisayarkagit3.getDayaniklilik());
                                         hamleler[roundSayaci][6]=Integer.toString(bilgisayarkagit3.getSeviyePuani());

                                         //kullanici
                                         hamleler[roundSayaci][2]=Integer.toString(kullanicitas1.getDayaniklilik());
                                         hamleler[roundSayaci][3]=Integer.toString(kullanicitas1.getSeviyePuani());

                                    }
                                    else if("Taş2".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                    {
                                        bilgisayarkagit3.nesnePuaniGoster();
                                        kullanicitas2.nesnePuaniGoster();

                                        nesne_durum2=kullanicitas2.durumGuncelle(kagit_etkisi);

                                        //kullanici için
                                        tas_etkisi=kullanicitas2.etkiHesapla("Kağıt"); 
                                        nesne_durum1=bilgisayarkagit3.durumGuncelle(tas_etkisi);

                                        //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum2==1)
                                        {
                                            secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                            bilgisayarkagit3.seviyePuanimiGuncelle();
                                        }
                                        //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum1==1)
                                        {
                                            bilgisayar.nesneSil(bilgisayarNesneIndex);
                                            kullanicitas2.seviyePuanimiGuncelle();
                                        }

                                        //Puanları yazdır
                                        kullanicitas2.nesnePuaniGoster();
                                        bilgisayarkagit3.nesnePuaniGoster();

                                        //Ekrana yazdır
                                         //bilgisayar
                                         hamleler[roundSayaci][5]=Integer.toString(bilgisayarkagit3.getDayaniklilik());
                                         hamleler[roundSayaci][6]=Integer.toString(bilgisayarkagit3.getSeviyePuani());

                                         //kullanici
                                         hamleler[roundSayaci][2]=Integer.toString(kullanicitas2.getDayaniklilik());
                                         hamleler[roundSayaci][3]=Integer.toString(kullanicitas2.getSeviyePuani());

                                    }
                                    else if("Taş3".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                    {
                                        bilgisayarkagit3.nesnePuaniGoster();
                                        kullanicitas3.nesnePuaniGoster();

                                        nesne_durum2=kullanicitas3.durumGuncelle(kagit_etkisi);

                                        //kullanici için
                                        tas_etkisi=kullanicitas3.etkiHesapla("Kağıt"); 
                                        nesne_durum1=bilgisayarkagit3.durumGuncelle(tas_etkisi);

                                        //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum2==1)
                                        {
                                            secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                            bilgisayarkagit3.seviyePuanimiGuncelle();
                                        }
                                        //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum1==1)
                                        {
                                            bilgisayar.nesneSil(bilgisayarNesneIndex);
                                            kullanicitas3.seviyePuanimiGuncelle();
                                        }

                                        //Puanları yazdır
                                        kullanicitas3.nesnePuaniGoster();
                                        bilgisayarkagit3.nesnePuaniGoster();

                                        //Ekrana yazdır
                                         //bilgisayar
                                         hamleler[roundSayaci][5]=Integer.toString(bilgisayarkagit3.getDayaniklilik());
                                         hamleler[roundSayaci][6]=Integer.toString(bilgisayarkagit3.getSeviyePuani());

                                         //kullanici
                                         hamleler[roundSayaci][2]=Integer.toString(kullanicitas3.getDayaniklilik());
                                         hamleler[roundSayaci][3]=Integer.toString(kullanicitas3.getSeviyePuani());

                                    }
                                    else if("Taş4".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                    {
                                        bilgisayarkagit3.nesnePuaniGoster();
                                        kullanicitas4.nesnePuaniGoster();

                                        nesne_durum2=kullanicitas4.durumGuncelle(kagit_etkisi);

                                        //kullanici için
                                        tas_etkisi=kullanicitas4.etkiHesapla("Kağıt"); 
                                        nesne_durum1=bilgisayarkagit3.durumGuncelle(tas_etkisi);

                                        //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum2==1)
                                        {
                                            secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                            bilgisayarkagit3.seviyePuanimiGuncelle();
                                        }
                                        //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum1==1)
                                        {
                                            bilgisayar.nesneSil(bilgisayarNesneIndex);
                                            kullanicitas4.seviyePuanimiGuncelle();
                                        }

                                        //Puanları yazdır
                                        kullanicitas4.nesnePuaniGoster();
                                        bilgisayarkagit3.nesnePuaniGoster();

                                        //Ekrana yazdır
                                         //bilgisayar
                                         hamleler[roundSayaci][5]=Integer.toString(bilgisayarkagit3.getDayaniklilik());
                                         hamleler[roundSayaci][6]=Integer.toString(bilgisayarkagit3.getSeviyePuani());

                                         //kullanici
                                         hamleler[roundSayaci][2]=Integer.toString(kullanicitas4.getDayaniklilik());
                                         hamleler[roundSayaci][3]=Integer.toString(kullanicitas4.getSeviyePuani());
                                    }
                                    else if("Taş5".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                    {
                                        bilgisayarkagit3.nesnePuaniGoster();
                                        kullanicitas5.nesnePuaniGoster();

                                        nesne_durum2=kullanicitas5.durumGuncelle(kagit_etkisi);

                                        //kullanici için
                                        tas_etkisi=kullanicitas5.etkiHesapla("Kağıt"); 
                                        nesne_durum1=bilgisayarkagit3.durumGuncelle(tas_etkisi);

                                        //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum2==1)
                                        {
                                            secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                            bilgisayarkagit3.seviyePuanimiGuncelle();
                                        }
                                        //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum1==1)
                                        {
                                            bilgisayar.nesneSil(bilgisayarNesneIndex);
                                            kullanicitas5.seviyePuanimiGuncelle();
                                        }

                                        //Puanları yazdır
                                        kullanicitas5.nesnePuaniGoster();
                                        bilgisayarkagit3.nesnePuaniGoster();

                                        //Ekrana yazdır
                                         //bilgisayar
                                         hamleler[roundSayaci][5]=Integer.toString(bilgisayarkagit3.getDayaniklilik());
                                         hamleler[roundSayaci][6]=Integer.toString(bilgisayarkagit3.getSeviyePuani());

                                         //kullanici
                                         hamleler[roundSayaci][2]=Integer.toString(kullanicitas5.getDayaniklilik());
                                         hamleler[roundSayaci][3]=Integer.toString(kullanicitas5.getSeviyePuani());
                                    }
                                }
                                else if("Kağıt4".equals(bilgisayar.nesneListesiAdresleri.get(bilgisayarNesneIndex)))
                                {
                                 /*
                                 Kağıt4 Taş1
                                 Kağıt4 Taş2
                                 Kağıt4 Taş3
                                 Kağıt4 Taş4
                                 Kağıt4 Taş5
                                 */
                                    kagit_etkisi=bilgisayarkagit4.etkiHesapla("Taş");   
                                    if("Taş1".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                    {
                                        bilgisayarkagit4.nesnePuaniGoster();
                                        kullanicitas1.nesnePuaniGoster();

                                        nesne_durum2=kullanicitas1.durumGuncelle(kagit_etkisi);

                                        //kullanici için
                                        tas_etkisi=kullanicitas1.etkiHesapla("Kağıt"); 
                                        nesne_durum1=bilgisayarkagit4.durumGuncelle(tas_etkisi);

                                        //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum2==1)
                                        {
                                            secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                            bilgisayarkagit4.seviyePuanimiGuncelle();
                                        }
                                        //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum1==1)
                                        {
                                            bilgisayar.nesneSil(bilgisayarNesneIndex);
                                            kullanicitas1.seviyePuanimiGuncelle();
                                        }

                                        //Puanları yazdır
                                        kullanicitas1.nesnePuaniGoster();
                                        bilgisayarkagit4.nesnePuaniGoster();

                                        //Ekrana yazdır
                                         //bilgisayar
                                         hamleler[roundSayaci][5]=Integer.toString(bilgisayarkagit4.getDayaniklilik());
                                         hamleler[roundSayaci][6]=Integer.toString(bilgisayarkagit4.getSeviyePuani());

                                         //kullanici
                                         hamleler[roundSayaci][2]=Integer.toString(kullanicitas1.getDayaniklilik());
                                         hamleler[roundSayaci][3]=Integer.toString(kullanicitas1.getSeviyePuani());
                                    }
                                    else if("Taş2".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                    {
                                        bilgisayarkagit4.nesnePuaniGoster();
                                        kullanicitas2.nesnePuaniGoster();

                                        nesne_durum2=kullanicitas2.durumGuncelle(kagit_etkisi);

                                        //kullanici için
                                        tas_etkisi=kullanicitas2.etkiHesapla("Kağıt"); 
                                        nesne_durum1=bilgisayarkagit4.durumGuncelle(tas_etkisi);

                                        //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum2==1)
                                        {
                                            secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                            bilgisayarkagit4.seviyePuanimiGuncelle();
                                        }
                                        //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum1==1)
                                        {
                                            bilgisayar.nesneSil(bilgisayarNesneIndex);
                                            kullanicitas2.seviyePuanimiGuncelle();
                                        }

                                        //Puanları yazdır
                                        kullanicitas2.nesnePuaniGoster();
                                        bilgisayarkagit4.nesnePuaniGoster();

                                        //Ekrana yazdır
                                         //bilgisayar
                                         hamleler[roundSayaci][5]=Integer.toString(bilgisayarkagit4.getDayaniklilik());
                                         hamleler[roundSayaci][6]=Integer.toString(bilgisayarkagit4.getSeviyePuani());

                                         //kullanici
                                         hamleler[roundSayaci][2]=Integer.toString(kullanicitas2.getDayaniklilik());
                                         hamleler[roundSayaci][3]=Integer.toString(kullanicitas2.getSeviyePuani());
                                    }
                                    else if("Taş3".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                    {
                                        bilgisayarkagit4.nesnePuaniGoster();
                                        kullanicitas3.nesnePuaniGoster();

                                        nesne_durum2=kullanicitas3.durumGuncelle(kagit_etkisi);

                                        //kullanici için
                                        tas_etkisi=kullanicitas3.etkiHesapla("Kağıt"); 
                                        nesne_durum1=bilgisayarkagit4.durumGuncelle(tas_etkisi);

                                        //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum2==1)
                                        {
                                            secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                            bilgisayarkagit4.seviyePuanimiGuncelle();
                                        }
                                        //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum1==1)
                                        {
                                            bilgisayar.nesneSil(bilgisayarNesneIndex);
                                            kullanicitas3.seviyePuanimiGuncelle();
                                        }

                                        //Puanları yazdır
                                        kullanicitas3.nesnePuaniGoster();
                                        bilgisayarkagit4.nesnePuaniGoster();

                                        //Ekrana yazdır
                                         //bilgisayar
                                         hamleler[roundSayaci][5]=Integer.toString(bilgisayarkagit4.getDayaniklilik());
                                         hamleler[roundSayaci][6]=Integer.toString(bilgisayarkagit4.getSeviyePuani());

                                         //kullanici
                                         hamleler[roundSayaci][2]=Integer.toString(kullanicitas3.getDayaniklilik());
                                         hamleler[roundSayaci][3]=Integer.toString(kullanicitas3.getSeviyePuani());

                                    }
                                    else if("Taş4".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                    {
                                        bilgisayarkagit4.nesnePuaniGoster();
                                        kullanicitas4.nesnePuaniGoster();

                                        nesne_durum2=kullanicitas4.durumGuncelle(kagit_etkisi);

                                        //kullanici için
                                        tas_etkisi=kullanicitas4.etkiHesapla("Kağıt"); 
                                        nesne_durum1=bilgisayarkagit4.durumGuncelle(tas_etkisi);

                                        //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum2==1)
                                        {
                                            secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                            bilgisayarkagit4.seviyePuanimiGuncelle();
                                        }
                                        //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum1==1)
                                        {
                                            bilgisayar.nesneSil(bilgisayarNesneIndex);
                                            kullanicitas4.seviyePuanimiGuncelle();
                                        }

                                        //Puanları yazdır
                                        kullanicitas4.nesnePuaniGoster();
                                        bilgisayarkagit4.nesnePuaniGoster();

                                        //Ekrana yazdır
                                         //bilgisayar
                                         hamleler[roundSayaci][5]=Integer.toString(bilgisayarkagit4.getDayaniklilik());
                                         hamleler[roundSayaci][6]=Integer.toString(bilgisayarkagit4.getSeviyePuani());

                                         //kullanici
                                         hamleler[roundSayaci][2]=Integer.toString(kullanicitas4.getDayaniklilik());
                                         hamleler[roundSayaci][3]=Integer.toString(kullanicitas4.getSeviyePuani());
                                    }
                                    else if("Taş5".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                    {
                                        bilgisayarkagit4.nesnePuaniGoster();
                                        kullanicitas5.nesnePuaniGoster();

                                        nesne_durum2=kullanicitas5.durumGuncelle(kagit_etkisi);

                                        //kullanici için
                                        tas_etkisi=kullanicitas5.etkiHesapla("Kağıt"); 
                                        nesne_durum1=bilgisayarkagit4.durumGuncelle(tas_etkisi);

                                        //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum2==1)
                                        {
                                            secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                            bilgisayarkagit4.seviyePuanimiGuncelle();
                                        }
                                        //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum1==1)
                                        {
                                            bilgisayar.nesneSil(bilgisayarNesneIndex);
                                            kullanicitas5.seviyePuanimiGuncelle();
                                        }

                                        //Puanları yazdır
                                        kullanicitas5.nesnePuaniGoster();
                                        bilgisayarkagit4.nesnePuaniGoster();

                                        //Ekrana yazdır
                                         //bilgisayar
                                         hamleler[roundSayaci][5]=Integer.toString(bilgisayarkagit4.getDayaniklilik());
                                         hamleler[roundSayaci][6]=Integer.toString(bilgisayarkagit4.getSeviyePuani());

                                         //kullanici
                                         hamleler[roundSayaci][2]=Integer.toString(kullanicitas5.getDayaniklilik());
                                         hamleler[roundSayaci][3]=Integer.toString(kullanicitas5.getSeviyePuani());
                                    }
                                }
                                else if("Kağıt5".equals(bilgisayar.nesneListesiAdresleri.get(bilgisayarNesneIndex)))
                                {
                                 /*
                                 Kağıt5 Taş1
                                 Kağıt5 Taş2
                                 Kağıt5 Taş3
                                 Kağıt5 Taş4
                                 Kağıt5 Taş5
                                 */
                                    kagit_etkisi=bilgisayarkagit5.etkiHesapla("Taş");   
                                    if("Taş1".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                    {
                                        bilgisayarkagit5.nesnePuaniGoster();
                                        kullanicitas1.nesnePuaniGoster();

                                        nesne_durum2=kullanicitas1.durumGuncelle(kagit_etkisi);

                                        //kullanici için
                                        tas_etkisi=kullanicitas1.etkiHesapla("Kağıt"); 
                                        nesne_durum1=bilgisayarkagit5.durumGuncelle(tas_etkisi);

                                        //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum2==1)
                                        {
                                            secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                            bilgisayarkagit5.seviyePuanimiGuncelle();
                                        }
                                        //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum1==1)
                                        {
                                            bilgisayar.nesneSil(bilgisayarNesneIndex);
                                            kullanicitas1.seviyePuanimiGuncelle();
                                        }

                                        //Puanları yazdır
                                        kullanicitas1.nesnePuaniGoster();
                                        bilgisayarkagit5.nesnePuaniGoster();

                                        //Ekrana yazdır
                                         //bilgisayar
                                         hamleler[roundSayaci][5]=Integer.toString(bilgisayarkagit5.getDayaniklilik());
                                         hamleler[roundSayaci][6]=Integer.toString(bilgisayarkagit5.getSeviyePuani());

                                         //kullanici
                                         hamleler[roundSayaci][2]=Integer.toString(kullanicitas1.getDayaniklilik());
                                         hamleler[roundSayaci][3]=Integer.toString(kullanicitas1.getSeviyePuani());

                                    }
                                    else if("Taş2".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                    {
                                        bilgisayarkagit5.nesnePuaniGoster();
                                        kullanicitas2.nesnePuaniGoster();

                                        nesne_durum2=kullanicitas2.durumGuncelle(kagit_etkisi);

                                        //kullanici için
                                        tas_etkisi=kullanicitas2.etkiHesapla("Kağıt"); 
                                        nesne_durum1=bilgisayarkagit5.durumGuncelle(tas_etkisi);

                                        //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum2==1)
                                        {
                                           secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                           bilgisayarkagit5.seviyePuanimiGuncelle();
                                        }
                                        //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum1==1)
                                        {
                                            bilgisayar.nesneSil(bilgisayarNesneIndex);
                                            kullanicitas2.seviyePuanimiGuncelle();
                                        }

                                        //Puanları yazdır
                                        kullanicitas2.nesnePuaniGoster();
                                        bilgisayarkagit5.nesnePuaniGoster();

                                        //Ekrana yazdır
                                         //bilgisayar
                                         hamleler[roundSayaci][5]=Integer.toString(bilgisayarkagit5.getDayaniklilik());
                                         hamleler[roundSayaci][6]=Integer.toString(bilgisayarkagit5.getSeviyePuani());

                                         //kullanici
                                         hamleler[roundSayaci][2]=Integer.toString(kullanicitas2.getDayaniklilik());
                                         hamleler[roundSayaci][3]=Integer.toString(kullanicitas2.getSeviyePuani());
                                    }
                                    else if("Taş3".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                    {
                                        bilgisayarkagit5.nesnePuaniGoster();
                                        kullanicitas3.nesnePuaniGoster();

                                        nesne_durum2=kullanicitas3.durumGuncelle(kagit_etkisi);

                                        //kullanici için
                                        tas_etkisi=kullanicitas3.etkiHesapla("Kağıt"); 
                                        nesne_durum1=bilgisayarkagit5.durumGuncelle(tas_etkisi);

                                        //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum2==1)
                                        {
                                           secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                            bilgisayarkagit5.seviyePuanimiGuncelle();
                                        }
                                        //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum1==1)
                                        {
                                            bilgisayar.nesneSil(bilgisayarNesneIndex);
                                            kullanicitas3.seviyePuanimiGuncelle();
                                        }

                                        //Puanları yazdır
                                        kullanicitas3.nesnePuaniGoster();
                                        bilgisayarkagit5.nesnePuaniGoster();

                                        //Ekrana yazdır
                                         //bilgisayar
                                         hamleler[roundSayaci][5]=Integer.toString(bilgisayarkagit5.getDayaniklilik());
                                         hamleler[roundSayaci][6]=Integer.toString(bilgisayarkagit5.getSeviyePuani());

                                         //kullanici
                                         hamleler[roundSayaci][2]=Integer.toString(kullanicitas3.getDayaniklilik());
                                         hamleler[roundSayaci][3]=Integer.toString(kullanicitas3.getSeviyePuani());

                                    }
                                    else if("Taş4".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                    {
                                        bilgisayarkagit5.nesnePuaniGoster();
                                        kullanicitas4.nesnePuaniGoster();

                                        nesne_durum2=kullanicitas4.durumGuncelle(kagit_etkisi);

                                        //kullanici için
                                        tas_etkisi=kullanicitas4.etkiHesapla("Kağıt"); 
                                        nesne_durum1=bilgisayarkagit5.durumGuncelle(tas_etkisi);

                                        //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum2==1)
                                        {
                                           secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                           bilgisayarkagit5.seviyePuanimiGuncelle();
                                        }
                                        //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum1==1)
                                        {
                                            bilgisayar.nesneSil(bilgisayarNesneIndex);
                                            kullanicitas4.seviyePuanimiGuncelle();
                                        }

                                        //Puanları yazdır
                                        kullanicitas4.nesnePuaniGoster();
                                        bilgisayarkagit5.nesnePuaniGoster();

                                        //Ekrana yazdır
                                         //bilgisayar
                                         hamleler[roundSayaci][5]=Integer.toString(bilgisayarkagit5.getDayaniklilik());
                                         hamleler[roundSayaci][6]=Integer.toString(bilgisayarkagit5.getSeviyePuani());

                                         //kullanici
                                         hamleler[roundSayaci][2]=Integer.toString(kullanicitas4.getDayaniklilik());
                                         hamleler[roundSayaci][3]=Integer.toString(kullanicitas4.getSeviyePuani());
                                    }
                                    else if("Taş5".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                    {
                                        bilgisayarkagit5.nesnePuaniGoster();
                                        kullanicitas5.nesnePuaniGoster();

                                        nesne_durum2=kullanicitas5.durumGuncelle(kagit_etkisi);

                                        //kullanici için
                                        tas_etkisi=kullanicitas5.etkiHesapla("Kağıt"); 
                                        nesne_durum1=bilgisayarkagit5.durumGuncelle(tas_etkisi);

                                        //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum2==1)
                                        {
                                           secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                            bilgisayarkagit5.seviyePuanimiGuncelle();
                                        }
                                        //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                        if(nesne_durum1==1)
                                        {
                                            bilgisayar.nesneSil(bilgisayarNesneIndex);
                                            kullanicitas5.seviyePuanimiGuncelle();
                                        }

                                        //Puanları yazdır
                                        kullanicitas5.nesnePuaniGoster();
                                        bilgisayarkagit5.nesnePuaniGoster();

                                        //Ekrana yazdır
                                         //bilgisayar
                                         hamleler[roundSayaci][5]=Integer.toString(bilgisayarkagit5.getDayaniklilik());
                                         hamleler[roundSayaci][6]=Integer.toString(bilgisayarkagit5.getSeviyePuani());

                                         //kullanici
                                         hamleler[roundSayaci][2]=Integer.toString(kullanicitas5.getDayaniklilik());
                                         hamleler[roundSayaci][3]=Integer.toString(kullanicitas5.getSeviyePuani());
                                    }
                                }


                            }
                            else if("Kağıt".equals(bilgisayar.nesneListesi.get(bilgisayarNesneIndex)) && "Makas".equals(secilenNesnelerAsil.get(kullaniciNesneIndex))) {
                                System.out.println("Kağıt-Makas");
                                bilgisayarNesneLabelText="Kağıt";
                                hamleler[roundSayaci][0]="Round "+(roundSayaci+1);
                                hamleler[roundSayaci][1]="Makas";
                                hamleler[roundSayaci][4]="Kağıt";


                                if("Kağıt1".equals(bilgisayar.nesneListesiAdresleri.get(bilgisayarNesneIndex)))
                                {
                                /*
                                Kağıt1 Makas1
                                Kağıt1 Makas2
                                Kağıt1 Makas3
                                Kağıt1 Makas4
                                Kağıt1 Makas5
                                */   
                                   kagit_etkisi=bilgisayarkagit1.etkiHesapla("Makas");   
                                   if("Makas1".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                   {
                                       bilgisayarkagit1.nesnePuaniGoster();
                                       kullanicimakas1.nesnePuaniGoster();

                                       nesne_durum2=kullanicimakas1.durumGuncelle(kagit_etkisi);

                                       //kullanici için
                                       makas_etkisi=kullanicimakas1.etkiHesapla("Kağıt"); 
                                       nesne_durum1=bilgisayarkagit1.durumGuncelle(makas_etkisi);

                                       //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum2==1)
                                       {
                                           secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                           bilgisayarkagit1.seviyePuanimiGuncelle();
                                       }
                                       //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum1==1)
                                       {
                                           bilgisayar.nesneSil(bilgisayarNesneIndex);
                                           kullanicimakas1.seviyePuanimiGuncelle();
                                       }

                                       //Puanları yazdır
                                       kullanicimakas1.nesnePuaniGoster();
                                       bilgisayarkagit1.nesnePuaniGoster();

                                       //Ekrana yazdır
                                        //bilgisayar
                                        hamleler[roundSayaci][5]=Integer.toString(bilgisayarkagit1.getDayaniklilik());
                                        hamleler[roundSayaci][6]=Integer.toString(bilgisayarkagit1.getSeviyePuani());

                                        //kullanici
                                        hamleler[roundSayaci][2]=Integer.toString(kullanicimakas1.getDayaniklilik());
                                        hamleler[roundSayaci][3]=Integer.toString(kullanicimakas1.getSeviyePuani());
                                   }
                                   else if("Makas2".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                   {
                                       bilgisayarkagit1.nesnePuaniGoster();
                                       kullanicimakas2.nesnePuaniGoster();

                                       nesne_durum2=kullanicimakas2.durumGuncelle(kagit_etkisi);

                                       //kullanici için
                                       makas_etkisi=kullanicimakas2.etkiHesapla("Kağıt"); 
                                       nesne_durum1=bilgisayarkagit1.durumGuncelle(makas_etkisi);

                                       //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum2==1)
                                       {
                                           secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                           bilgisayarkagit1.seviyePuanimiGuncelle();
                                       }
                                       //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum1==1)
                                       {
                                           bilgisayar.nesneSil(bilgisayarNesneIndex);
                                           kullanicimakas2.seviyePuanimiGuncelle();
                                       }

                                       //Puanları yazdır
                                       kullanicimakas2.nesnePuaniGoster();
                                       bilgisayarkagit1.nesnePuaniGoster();

                                       //Ekrana yazdır
                                        //bilgisayar
                                        hamleler[roundSayaci][5]=Integer.toString(bilgisayarkagit1.getDayaniklilik());
                                        hamleler[roundSayaci][6]=Integer.toString(bilgisayarkagit1.getSeviyePuani());

                                        //kullanici
                                        hamleler[roundSayaci][2]=Integer.toString(kullanicimakas2.getDayaniklilik());
                                        hamleler[roundSayaci][3]=Integer.toString(kullanicimakas2.getSeviyePuani());

                                   }
                                   else if("Makas3".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                   {
                                       bilgisayarkagit1.nesnePuaniGoster();
                                       kullanicimakas3.nesnePuaniGoster();

                                       nesne_durum2=kullanicimakas3.durumGuncelle(kagit_etkisi);

                                       //kullanici için
                                       makas_etkisi=kullanicimakas3.etkiHesapla("Kağıt"); 
                                       nesne_durum1=bilgisayarkagit1.durumGuncelle(makas_etkisi);

                                       //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum2==1)
                                       {
                                           secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                            bilgisayarkagit1.seviyePuanimiGuncelle();
                                       }
                                       //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum1==1)
                                       {
                                           bilgisayar.nesneSil(bilgisayarNesneIndex);
                                           kullanicimakas3.seviyePuanimiGuncelle();
                                       }

                                       //Puanları yazdır
                                       kullanicimakas3.nesnePuaniGoster();
                                       bilgisayarkagit1.nesnePuaniGoster();

                                       //Ekrana yazdır
                                        //bilgisayar
                                        hamleler[roundSayaci][5]=Integer.toString(bilgisayarkagit1.getDayaniklilik());
                                        hamleler[roundSayaci][6]=Integer.toString(bilgisayarkagit1.getSeviyePuani());

                                        //kullanici
                                        hamleler[roundSayaci][2]=Integer.toString(kullanicimakas3.getDayaniklilik());
                                        hamleler[roundSayaci][3]=Integer.toString(kullanicimakas3.getSeviyePuani());

                                   }
                                   else if("Makas4".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                   {
                                       bilgisayarkagit1.nesnePuaniGoster();
                                       kullanicimakas4.nesnePuaniGoster();

                                       nesne_durum2=kullanicimakas4.durumGuncelle(kagit_etkisi);

                                       //kullanici için
                                       makas_etkisi=kullanicimakas4.etkiHesapla("Kağıt"); 
                                       nesne_durum1=bilgisayarkagit1.durumGuncelle(makas_etkisi);

                                       //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum2==1)
                                       {
                                           secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                            bilgisayarkagit1.seviyePuanimiGuncelle();
                                       }
                                       //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum1==1)
                                       {
                                           bilgisayar.nesneSil(bilgisayarNesneIndex);
                                           kullanicimakas4.seviyePuanimiGuncelle();
                                       }

                                       //Puanları yazdır
                                       kullanicimakas4.nesnePuaniGoster();
                                       bilgisayarkagit1.nesnePuaniGoster();

                                       //Ekrana yazdır
                                        //bilgisayar
                                        hamleler[roundSayaci][5]=Integer.toString(bilgisayarkagit1.getDayaniklilik());
                                        hamleler[roundSayaci][6]=Integer.toString(bilgisayarkagit1.getSeviyePuani());

                                        //kullanici
                                        hamleler[roundSayaci][2]=Integer.toString(kullanicimakas4.getDayaniklilik());
                                        hamleler[roundSayaci][3]=Integer.toString(kullanicimakas4.getSeviyePuani());
                                   }
                                   else if("Makas5".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                   {
                                       bilgisayarkagit1.nesnePuaniGoster();
                                       kullanicimakas5.nesnePuaniGoster();

                                       nesne_durum2=kullanicimakas5.durumGuncelle(kagit_etkisi);

                                       //kullanici için
                                       makas_etkisi=kullanicimakas5.etkiHesapla("Kağıt"); 
                                       nesne_durum1=bilgisayarkagit1.durumGuncelle(makas_etkisi);

                                       //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum2==1)
                                       {
                                           secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                           bilgisayarkagit1.seviyePuanimiGuncelle();
                                       }
                                       //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum1==1)
                                       {
                                           bilgisayar.nesneSil(bilgisayarNesneIndex);
                                           kullanicimakas5.seviyePuanimiGuncelle();
                                       }

                                       //Puanları yazdır
                                       kullanicimakas5.nesnePuaniGoster();
                                       bilgisayarkagit1.nesnePuaniGoster();

                                       //Ekrana yazdır
                                        //bilgisayar
                                        hamleler[roundSayaci][5]=Integer.toString(bilgisayarkagit1.getDayaniklilik());
                                        hamleler[roundSayaci][6]=Integer.toString(bilgisayarkagit1.getSeviyePuani());

                                        //kullanici
                                        hamleler[roundSayaci][2]=Integer.toString(kullanicimakas5.getDayaniklilik());
                                        hamleler[roundSayaci][3]=Integer.toString(kullanicimakas5.getSeviyePuani());
                                   }

                                }
                                else if("Kağıt2".equals(bilgisayar.nesneListesiAdresleri.get(bilgisayarNesneIndex)))
                                {
                                /*
                                Kağıt2 Makas1
                                Kağıt2 Makas2
                                Kağıt2 Makas3
                                Kağıt2 Makas4
                                Kağıt2 Makas5
                                */   
                                   kagit_etkisi=bilgisayarkagit2.etkiHesapla("Makas");   
                                   if("Makas1".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                   {
                                       bilgisayarkagit2.nesnePuaniGoster();
                                       kullanicimakas1.nesnePuaniGoster();

                                       nesne_durum2=kullanicimakas1.durumGuncelle(kagit_etkisi);

                                       //kullanici için
                                       makas_etkisi=kullanicimakas1.etkiHesapla("Kağıt"); 
                                       nesne_durum1=bilgisayarkagit2.durumGuncelle(makas_etkisi);

                                       //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum2==1)
                                       {
                                           secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                           bilgisayarkagit2.seviyePuanimiGuncelle();
                                       }
                                       //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum1==1)
                                       {
                                           bilgisayar.nesneSil(bilgisayarNesneIndex);
                                           kullanicimakas1.seviyePuanimiGuncelle();
                                       }

                                       //Puanları yazdır
                                       kullanicimakas1.nesnePuaniGoster();
                                       bilgisayarkagit2.nesnePuaniGoster();

                                       //Ekrana yazdır
                                        //bilgisayar
                                        hamleler[roundSayaci][5]=Integer.toString(bilgisayarkagit2.getDayaniklilik());
                                        hamleler[roundSayaci][6]=Integer.toString(bilgisayarkagit2.getSeviyePuani());

                                        //kullanici
                                        hamleler[roundSayaci][2]=Integer.toString(kullanicimakas1.getDayaniklilik());
                                        hamleler[roundSayaci][3]=Integer.toString(kullanicimakas1.getSeviyePuani());

                                   }
                                   else if("Makas2".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                   {
                                       bilgisayarkagit2.nesnePuaniGoster();
                                       kullanicimakas2.nesnePuaniGoster();

                                       nesne_durum2=kullanicimakas2.durumGuncelle(kagit_etkisi);

                                       //kullanici için
                                       makas_etkisi=kullanicimakas2.etkiHesapla("Kağıt"); 
                                       nesne_durum1=bilgisayarkagit2.durumGuncelle(makas_etkisi);

                                       //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum2==1)
                                       {
                                           secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                           bilgisayarkagit2.seviyePuanimiGuncelle();
                                       }
                                       //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum1==1)
                                       {
                                           bilgisayar.nesneSil(bilgisayarNesneIndex);
                                           kullanicimakas2.seviyePuanimiGuncelle();
                                       }

                                       //Puanları yazdır
                                       kullanicimakas2.nesnePuaniGoster();
                                       bilgisayarkagit2.nesnePuaniGoster();

                                       //Ekrana yazdır
                                        //bilgisayar
                                        hamleler[roundSayaci][5]=Integer.toString(bilgisayarkagit2.getDayaniklilik());
                                        hamleler[roundSayaci][6]=Integer.toString(bilgisayarkagit2.getSeviyePuani());

                                        //kullanici
                                        hamleler[roundSayaci][2]=Integer.toString(kullanicimakas2.getDayaniklilik());
                                        hamleler[roundSayaci][3]=Integer.toString(kullanicimakas2.getSeviyePuani());

                                   }
                                   else if("Makas3".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                   {
                                       bilgisayarkagit2.nesnePuaniGoster();
                                       kullanicimakas3.nesnePuaniGoster();

                                       nesne_durum2=kullanicimakas3.durumGuncelle(kagit_etkisi);

                                       //kullanici için
                                       makas_etkisi=kullanicimakas3.etkiHesapla("Kağıt"); 
                                       nesne_durum1=bilgisayarkagit2.durumGuncelle(makas_etkisi);

                                       //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum2==1)
                                       {
                                           secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                           bilgisayarkagit2.seviyePuanimiGuncelle();
                                       }
                                       //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum1==1)
                                       {
                                           bilgisayar.nesneSil(bilgisayarNesneIndex);
                                           kullanicimakas3.seviyePuanimiGuncelle();
                                       }

                                       //Puanları yazdır
                                       kullanicimakas3.nesnePuaniGoster();
                                       bilgisayarkagit2.nesnePuaniGoster();

                                       //Ekrana yazdır
                                        //bilgisayar
                                        hamleler[roundSayaci][5]=Integer.toString(bilgisayarkagit2.getDayaniklilik());
                                        hamleler[roundSayaci][6]=Integer.toString(bilgisayarkagit2.getSeviyePuani());

                                        //kullanici
                                        hamleler[roundSayaci][2]=Integer.toString(kullanicimakas3.getDayaniklilik());
                                        hamleler[roundSayaci][3]=Integer.toString(kullanicimakas3.getSeviyePuani());

                                   }
                                   else if("Makas4".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                   {
                                       bilgisayarkagit2.nesnePuaniGoster();
                                       kullanicimakas4.nesnePuaniGoster();

                                       nesne_durum2=kullanicimakas4.durumGuncelle(kagit_etkisi);

                                       //kullanici için
                                       makas_etkisi=kullanicimakas4.etkiHesapla("Kağıt"); 
                                       nesne_durum1=bilgisayarkagit2.durumGuncelle(makas_etkisi);

                                       //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum2==1)
                                       {
                                           secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                           bilgisayarkagit2.seviyePuanimiGuncelle();
                                       }
                                       //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum1==1)
                                       {
                                           bilgisayar.nesneSil(bilgisayarNesneIndex);
                                           kullanicimakas4.seviyePuanimiGuncelle();
                                       }

                                       //Puanları yazdır
                                       kullanicimakas4.nesnePuaniGoster();
                                       bilgisayarkagit2.nesnePuaniGoster();

                                       //Ekrana yazdır
                                        //bilgisayar
                                        hamleler[roundSayaci][5]=Integer.toString(bilgisayarkagit2.getDayaniklilik());
                                        hamleler[roundSayaci][6]=Integer.toString(bilgisayarkagit2.getSeviyePuani());

                                        //kullanici
                                        hamleler[roundSayaci][2]=Integer.toString(kullanicimakas4.getDayaniklilik());
                                        hamleler[roundSayaci][3]=Integer.toString(kullanicimakas4.getSeviyePuani());
                                   }
                                   else if("Makas5".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                   {
                                       bilgisayarkagit2.nesnePuaniGoster();
                                       kullanicimakas5.nesnePuaniGoster();

                                       nesne_durum2=kullanicimakas5.durumGuncelle(kagit_etkisi);

                                       //kullanici için
                                       makas_etkisi=kullanicimakas5.etkiHesapla("Kağıt"); 
                                       nesne_durum1=bilgisayarkagit2.durumGuncelle(makas_etkisi);

                                       //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum2==1)
                                       {
                                           secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                           bilgisayarkagit2.seviyePuanimiGuncelle();
                                       }
                                       //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum1==1)
                                       {
                                           bilgisayar.nesneSil(bilgisayarNesneIndex);
                                           kullanicimakas5.seviyePuanimiGuncelle();
                                       }

                                       //Puanları yazdır
                                       kullanicimakas5.nesnePuaniGoster();
                                       bilgisayarkagit2.nesnePuaniGoster();

                                       //Ekrana yazdır
                                        //bilgisayar
                                        hamleler[roundSayaci][5]=Integer.toString(bilgisayarkagit2.getDayaniklilik());
                                        hamleler[roundSayaci][6]=Integer.toString(bilgisayarkagit2.getSeviyePuani());

                                        //kullanici
                                        hamleler[roundSayaci][2]=Integer.toString(kullanicimakas5.getDayaniklilik());
                                        hamleler[roundSayaci][3]=Integer.toString(kullanicimakas5.getSeviyePuani());
                                   }
                                }
                                else if("Kağıt3".equals(bilgisayar.nesneListesiAdresleri.get(bilgisayarNesneIndex)))
                                {
                                /*
                                Kağıt3 Makas1
                                Kağıt3 Makas2
                                Kağıt3 Makas3
                                Kağıt3 Makas4
                                Kağıt3 Makas5
                                */  
                                   kagit_etkisi=bilgisayarkagit3.etkiHesapla("Makas");   
                                   if("Makas1".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                   {
                                       bilgisayarkagit3.nesnePuaniGoster();
                                       kullanicimakas1.nesnePuaniGoster();

                                       nesne_durum2=kullanicimakas1.durumGuncelle(kagit_etkisi);

                                       //kullanici için
                                       makas_etkisi=kullanicimakas1.etkiHesapla("Kağıt"); 
                                       nesne_durum1=bilgisayarkagit3.durumGuncelle(makas_etkisi);

                                       //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum2==1)
                                       {
                                           secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                           bilgisayarkagit3.seviyePuanimiGuncelle();
                                       }
                                       //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum1==1)
                                       {
                                           bilgisayar.nesneSil(bilgisayarNesneIndex);
                                           kullanicimakas1.seviyePuanimiGuncelle();
                                       }

                                       //Puanları yazdır
                                       kullanicimakas1.nesnePuaniGoster();
                                       bilgisayarkagit3.nesnePuaniGoster();

                                       //Ekrana yazdır
                                        //bilgisayar
                                        hamleler[roundSayaci][5]=Integer.toString(bilgisayarkagit3.getDayaniklilik());
                                        hamleler[roundSayaci][6]=Integer.toString(bilgisayarkagit3.getSeviyePuani());

                                        //kullanici
                                        hamleler[roundSayaci][2]=Integer.toString(kullanicimakas1.getDayaniklilik());
                                        hamleler[roundSayaci][3]=Integer.toString(kullanicimakas1.getSeviyePuani());
                                   }
                                   else if("Makas2".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                   {
                                       bilgisayarkagit3.nesnePuaniGoster();
                                       kullanicimakas2.nesnePuaniGoster();

                                       nesne_durum2=kullanicimakas2.durumGuncelle(kagit_etkisi);

                                       //kullanici için
                                       makas_etkisi=kullanicimakas2.etkiHesapla("Kağıt"); 
                                       nesne_durum1=bilgisayarkagit3.durumGuncelle(makas_etkisi);

                                       //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum2==1)
                                       {
                                           secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                           bilgisayarkagit3.seviyePuanimiGuncelle();
                                       }
                                       //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum1==1)
                                       {
                                           bilgisayar.nesneSil(bilgisayarNesneIndex);
                                           kullanicimakas2.seviyePuanimiGuncelle();
                                       }

                                       //Puanları yazdır
                                       kullanicimakas2.nesnePuaniGoster();
                                       bilgisayarkagit3.nesnePuaniGoster();

                                       //Ekrana yazdır
                                        //bilgisayar
                                        hamleler[roundSayaci][5]=Integer.toString(bilgisayarkagit3.getDayaniklilik());
                                        hamleler[roundSayaci][6]=Integer.toString(bilgisayarkagit3.getSeviyePuani());

                                        //kullanici
                                        hamleler[roundSayaci][2]=Integer.toString(kullanicimakas2.getDayaniklilik());
                                        hamleler[roundSayaci][3]=Integer.toString(kullanicimakas2.getSeviyePuani());

                                   }
                                   else if("Makas3".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                   {
                                       bilgisayarkagit3.nesnePuaniGoster();
                                       kullanicimakas3.nesnePuaniGoster();

                                       nesne_durum2=kullanicimakas3.durumGuncelle(kagit_etkisi);

                                       //kullanici için
                                       makas_etkisi=kullanicimakas3.etkiHesapla("Kağıt"); 
                                       nesne_durum1=bilgisayarkagit3.durumGuncelle(makas_etkisi);

                                       //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum2==1)
                                       {
                                           secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                           bilgisayarkagit3.seviyePuanimiGuncelle();
                                       }
                                       //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum1==1)
                                       {
                                           bilgisayar.nesneSil(bilgisayarNesneIndex);
                                           kullanicimakas3.seviyePuanimiGuncelle();
                                       }

                                       //Puanları yazdır
                                       kullanicimakas3.nesnePuaniGoster();
                                       bilgisayarkagit3.nesnePuaniGoster();

                                       //Ekrana yazdır
                                        //bilgisayar
                                        hamleler[roundSayaci][5]=Integer.toString(bilgisayarkagit3.getDayaniklilik());
                                        hamleler[roundSayaci][6]=Integer.toString(bilgisayarkagit3.getSeviyePuani());

                                        //kullanici
                                        hamleler[roundSayaci][2]=Integer.toString(kullanicimakas3.getDayaniklilik());
                                        hamleler[roundSayaci][3]=Integer.toString(kullanicimakas3.getSeviyePuani());

                                   }
                                   else if("Makas4".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                   {
                                       bilgisayarkagit3.nesnePuaniGoster();
                                       kullanicimakas4.nesnePuaniGoster();

                                       nesne_durum2=kullanicimakas4.durumGuncelle(kagit_etkisi);

                                       //kullanici için
                                       makas_etkisi=kullanicimakas4.etkiHesapla("Kağıt"); 
                                       nesne_durum1=bilgisayarkagit3.durumGuncelle(makas_etkisi);

                                       //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum2==1)
                                       {
                                           secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                           bilgisayarkagit3.seviyePuanimiGuncelle();
                                       }
                                       //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum1==1)
                                       {
                                           bilgisayar.nesneSil(bilgisayarNesneIndex);
                                           kullanicimakas4.seviyePuanimiGuncelle();
                                       }

                                       //Puanları yazdır
                                       kullanicimakas4.nesnePuaniGoster();
                                       bilgisayarkagit3.nesnePuaniGoster();

                                       //Ekrana yazdır
                                        //bilgisayar
                                        hamleler[roundSayaci][5]=Integer.toString(bilgisayarkagit3.getDayaniklilik());
                                        hamleler[roundSayaci][6]=Integer.toString(bilgisayarkagit3.getSeviyePuani());

                                        //kullanici
                                        hamleler[roundSayaci][2]=Integer.toString(kullanicimakas4.getDayaniklilik());
                                        hamleler[roundSayaci][3]=Integer.toString(kullanicimakas4.getSeviyePuani());
                                   }
                                   else if("Makas5".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                   {
                                       bilgisayarkagit3.nesnePuaniGoster();
                                       kullanicimakas5.nesnePuaniGoster();

                                       nesne_durum2=kullanicimakas5.durumGuncelle(kagit_etkisi);

                                       //kullanici için
                                       makas_etkisi=kullanicimakas5.etkiHesapla("Kağıt"); 
                                       nesne_durum1=bilgisayarkagit3.durumGuncelle(makas_etkisi);

                                       //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum2==1)
                                       {
                                           secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                           bilgisayarkagit3.seviyePuanimiGuncelle();
                                       }
                                       //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum1==1)
                                       {
                                           bilgisayar.nesneSil(bilgisayarNesneIndex);
                                           kullanicimakas5.seviyePuanimiGuncelle();
                                       }

                                       //Puanları yazdır
                                       kullanicimakas5.nesnePuaniGoster();
                                       bilgisayarkagit3.nesnePuaniGoster();

                                       //Ekrana yazdır
                                        //bilgisayar
                                        hamleler[roundSayaci][5]=Integer.toString(bilgisayarkagit3.getDayaniklilik());
                                        hamleler[roundSayaci][6]=Integer.toString(bilgisayarkagit3.getSeviyePuani());

                                        //kullanici
                                        hamleler[roundSayaci][2]=Integer.toString(kullanicimakas5.getDayaniklilik());
                                        hamleler[roundSayaci][3]=Integer.toString(kullanicimakas5.getSeviyePuani());
                                   }

                                }
                                else if("Kağıt4".equals(bilgisayar.nesneListesiAdresleri.get(bilgisayarNesneIndex)))
                                {
                                /*
                                Kağıt4 Makas1
                                Kağıt4 Makas2
                                Kağıt4 Makas3
                                Kağıt4 Makas4
                                Kağıt4 Makas5
                                */  
                                   kagit_etkisi=bilgisayarkagit4.etkiHesapla("Makas");   
                                   if("Makas1".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                   {
                                       bilgisayarkagit4.nesnePuaniGoster();
                                       kullanicimakas1.nesnePuaniGoster();

                                       nesne_durum2=kullanicimakas1.durumGuncelle(kagit_etkisi);

                                       //kullanici için
                                       makas_etkisi=kullanicimakas1.etkiHesapla("Kağıt"); 
                                       nesne_durum1=bilgisayarkagit4.durumGuncelle(makas_etkisi);

                                       //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum2==1)
                                       {
                                           secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                           bilgisayarkagit4.seviyePuanimiGuncelle();
                                       }
                                       //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum1==1)
                                       {
                                           bilgisayar.nesneSil(bilgisayarNesneIndex);
                                           kullanicimakas1.seviyePuanimiGuncelle();
                                       }

                                       //Puanları yazdır
                                       kullanicimakas1.nesnePuaniGoster();
                                       bilgisayarkagit4.nesnePuaniGoster();

                                       //Ekrana yazdır
                                        //bilgisayar
                                        hamleler[roundSayaci][5]=Integer.toString(bilgisayarkagit4.getDayaniklilik());
                                        hamleler[roundSayaci][6]=Integer.toString(bilgisayarkagit4.getSeviyePuani());

                                        //kullanici
                                        hamleler[roundSayaci][2]=Integer.toString(kullanicimakas1.getDayaniklilik());
                                        hamleler[roundSayaci][3]=Integer.toString(kullanicimakas1.getSeviyePuani());
                                   }
                                   else if("Makas2".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                   {
                                       bilgisayarkagit4.nesnePuaniGoster();
                                       kullanicimakas2.nesnePuaniGoster();

                                       nesne_durum2=kullanicimakas2.durumGuncelle(kagit_etkisi);

                                       //kullanici için
                                       makas_etkisi=kullanicimakas2.etkiHesapla("Kağıt"); 
                                       nesne_durum1=bilgisayarkagit4.durumGuncelle(makas_etkisi);

                                       //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum2==1)
                                       {
                                           secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                           bilgisayarkagit4.seviyePuanimiGuncelle();
                                       }
                                       //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum1==1)
                                       {
                                           bilgisayar.nesneSil(bilgisayarNesneIndex);
                                           kullanicimakas2.seviyePuanimiGuncelle();
                                       }

                                       //Puanları yazdır
                                       kullanicimakas2.nesnePuaniGoster();
                                       bilgisayarkagit4.nesnePuaniGoster();

                                       //Ekrana yazdır
                                        //bilgisayar
                                        hamleler[roundSayaci][5]=Integer.toString(bilgisayarkagit4.getDayaniklilik());
                                        hamleler[roundSayaci][6]=Integer.toString(bilgisayarkagit4.getSeviyePuani());

                                        //kullanici
                                        hamleler[roundSayaci][2]=Integer.toString(kullanicimakas2.getDayaniklilik());
                                        hamleler[roundSayaci][3]=Integer.toString(kullanicimakas2.getSeviyePuani());

                                   }
                                   else if("Makas3".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                   {
                                       bilgisayarkagit4.nesnePuaniGoster();
                                       kullanicimakas3.nesnePuaniGoster();

                                       nesne_durum2=kullanicimakas3.durumGuncelle(kagit_etkisi);

                                       //kullanici için
                                       makas_etkisi=kullanicimakas3.etkiHesapla("Kağıt"); 
                                       nesne_durum1=bilgisayarkagit4.durumGuncelle(makas_etkisi);

                                       //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum2==1)
                                       {
                                           secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                           bilgisayarkagit4.seviyePuanimiGuncelle();
                                       }
                                       //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum1==1)
                                       {
                                           bilgisayar.nesneSil(bilgisayarNesneIndex);
                                           kullanicimakas3.seviyePuanimiGuncelle();
                                       }

                                       //Puanları yazdır
                                       kullanicimakas3.nesnePuaniGoster();
                                       bilgisayarkagit4.nesnePuaniGoster();

                                       //Ekrana yazdır
                                        //bilgisayar
                                        hamleler[roundSayaci][5]=Integer.toString(bilgisayarkagit4.getDayaniklilik());
                                        hamleler[roundSayaci][6]=Integer.toString(bilgisayarkagit4.getSeviyePuani());

                                        //kullanici
                                        hamleler[roundSayaci][2]=Integer.toString(kullanicimakas3.getDayaniklilik());
                                        hamleler[roundSayaci][3]=Integer.toString(kullanicimakas3.getSeviyePuani());
                                   }
                                   else if("Makas4".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                   {
                                       bilgisayarkagit4.nesnePuaniGoster();
                                       kullanicimakas4.nesnePuaniGoster();

                                       nesne_durum2=kullanicimakas4.durumGuncelle(kagit_etkisi);

                                       //kullanici için
                                       makas_etkisi=kullanicimakas4.etkiHesapla("Kağıt"); 
                                       nesne_durum1=bilgisayarkagit4.durumGuncelle(makas_etkisi);

                                       //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum2==1)
                                       {
                                           secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                           bilgisayarkagit4.seviyePuanimiGuncelle();
                                       }
                                       //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum1==1)
                                       {
                                           bilgisayar.nesneSil(bilgisayarNesneIndex);
                                           kullanicimakas4.seviyePuanimiGuncelle();
                                       }

                                       //Puanları yazdır
                                       kullanicimakas4.nesnePuaniGoster();
                                       bilgisayarkagit4.nesnePuaniGoster();

                                       //Ekrana yazdır
                                        //bilgisayar
                                        hamleler[roundSayaci][5]=Integer.toString(bilgisayarkagit4.getDayaniklilik());
                                        hamleler[roundSayaci][6]=Integer.toString(bilgisayarkagit4.getSeviyePuani());

                                        //kullanici
                                        hamleler[roundSayaci][2]=Integer.toString(kullanicimakas4.getDayaniklilik());
                                        hamleler[roundSayaci][3]=Integer.toString(kullanicimakas4.getSeviyePuani());
                                   }
                                   else if("Makas5".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                   {
                                       bilgisayarkagit4.nesnePuaniGoster();
                                       kullanicimakas5.nesnePuaniGoster();

                                       nesne_durum2=kullanicimakas5.durumGuncelle(kagit_etkisi);

                                       //kullanici için
                                       makas_etkisi=kullanicimakas5.etkiHesapla("Kağıt"); 
                                       nesne_durum1=bilgisayarkagit4.durumGuncelle(makas_etkisi);

                                       //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum2==1)
                                       {
                                           secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                           bilgisayarkagit4.seviyePuanimiGuncelle();
                                       }
                                       //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum1==1)
                                       {
                                           bilgisayar.nesneSil(bilgisayarNesneIndex);
                                           kullanicimakas5.seviyePuanimiGuncelle();
                                       }

                                       //Puanları yazdır
                                       kullanicimakas5.nesnePuaniGoster();
                                       bilgisayarkagit4.nesnePuaniGoster();

                                       //Ekrana yazdır
                                        //bilgisayar
                                        hamleler[roundSayaci][5]=Integer.toString(bilgisayarkagit4.getDayaniklilik());
                                        hamleler[roundSayaci][6]=Integer.toString(bilgisayarkagit4.getSeviyePuani());

                                        //kullanici
                                        hamleler[roundSayaci][2]=Integer.toString(kullanicimakas5.getDayaniklilik());
                                        hamleler[roundSayaci][3]=Integer.toString(kullanicimakas5.getSeviyePuani());
                                   }
                                }
                                else if("Kağıt5".equals(bilgisayar.nesneListesiAdresleri.get(bilgisayarNesneIndex)))
                                {
                                /*
                                Kağıt5 Makas1
                                Kağıt5 Makas2
                                Kağıt5 Makas3
                                Kağıt5 Makas4
                                Kağıt5 Makas5
                                */  
                                   kagit_etkisi=bilgisayarkagit5.etkiHesapla("Makas");   
                                   if("Makas1".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                   {
                                       bilgisayarkagit5.nesnePuaniGoster();
                                       kullanicimakas1.nesnePuaniGoster();

                                       nesne_durum2=kullanicimakas1.durumGuncelle(kagit_etkisi);

                                       //kullanici için
                                       makas_etkisi=kullanicimakas1.etkiHesapla("Kağıt"); 
                                       nesne_durum1=bilgisayarkagit5.durumGuncelle(makas_etkisi);

                                       //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum2==1)
                                       {
                                           secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                           bilgisayarkagit5.seviyePuanimiGuncelle();
                                       }
                                       //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum1==1)
                                       {
                                           bilgisayar.nesneSil(bilgisayarNesneIndex);
                                           kullanicimakas1.seviyePuanimiGuncelle();
                                       }

                                       //Puanları yazdır
                                       kullanicimakas1.nesnePuaniGoster();
                                       bilgisayarkagit5.nesnePuaniGoster();

                                       //Ekrana yazdır
                                        //bilgisayar
                                        hamleler[roundSayaci][5]=Integer.toString(bilgisayarkagit5.getDayaniklilik());
                                        hamleler[roundSayaci][6]=Integer.toString(bilgisayarkagit5.getSeviyePuani());

                                        //kullanici
                                        hamleler[roundSayaci][2]=Integer.toString(kullanicimakas1.getDayaniklilik());
                                        hamleler[roundSayaci][3]=Integer.toString(kullanicimakas1.getSeviyePuani());
                                   }
                                   else if("Makas2".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                   {
                                       bilgisayarkagit5.nesnePuaniGoster();
                                       kullanicimakas2.nesnePuaniGoster();

                                       nesne_durum2=kullanicimakas2.durumGuncelle(kagit_etkisi);

                                       //kullanici için
                                       makas_etkisi=kullanicimakas2.etkiHesapla("Kağıt"); 
                                       nesne_durum1=bilgisayarkagit5.durumGuncelle(makas_etkisi);

                                       //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum2==1)
                                       {
                                           secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                           bilgisayarkagit5.seviyePuanimiGuncelle();
                                       }
                                       //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum1==1)
                                       {
                                           bilgisayar.nesneSil(bilgisayarNesneIndex);
                                           kullanicimakas2.seviyePuanimiGuncelle();
                                       }

                                       //Puanları yazdır
                                       kullanicimakas2.nesnePuaniGoster();
                                       bilgisayarkagit5.nesnePuaniGoster();

                                       //Ekrana yazdır
                                        //bilgisayar
                                        hamleler[roundSayaci][5]=Integer.toString(bilgisayarkagit5.getDayaniklilik());
                                        hamleler[roundSayaci][6]=Integer.toString(bilgisayarkagit5.getSeviyePuani());

                                        //kullanici
                                        hamleler[roundSayaci][2]=Integer.toString(kullanicimakas2.getDayaniklilik());
                                        hamleler[roundSayaci][3]=Integer.toString(kullanicimakas2.getSeviyePuani());

                                   }
                                   else if("Makas3".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                   {
                                       bilgisayarkagit5.nesnePuaniGoster();
                                       kullanicimakas3.nesnePuaniGoster();

                                       nesne_durum2=kullanicimakas3.durumGuncelle(kagit_etkisi);

                                       //kullanici için
                                       makas_etkisi=kullanicimakas3.etkiHesapla("Kağıt"); 
                                       nesne_durum1=bilgisayarkagit5.durumGuncelle(makas_etkisi);

                                       //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum2==1)
                                       {
                                           secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                           bilgisayarkagit5.seviyePuanimiGuncelle();
                                       }
                                       //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum1==1)
                                       {
                                           bilgisayar.nesneSil(bilgisayarNesneIndex);
                                           kullanicimakas3.seviyePuanimiGuncelle();
                                       }

                                       //Puanları yazdır
                                       kullanicimakas3.nesnePuaniGoster();
                                       bilgisayarkagit5.nesnePuaniGoster();

                                       //Ekrana yazdır
                                        //bilgisayar
                                        hamleler[roundSayaci][5]=Integer.toString(bilgisayarkagit5.getDayaniklilik());
                                        hamleler[roundSayaci][6]=Integer.toString(bilgisayarkagit5.getSeviyePuani());

                                        //kullanici
                                        hamleler[roundSayaci][2]=Integer.toString(kullanicimakas3.getDayaniklilik());
                                        hamleler[roundSayaci][3]=Integer.toString(kullanicimakas3.getSeviyePuani());
                                   }
                                   else if("Makas4".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                   {
                                       bilgisayarkagit5.nesnePuaniGoster();
                                       kullanicimakas4.nesnePuaniGoster();

                                       nesne_durum2=kullanicimakas4.durumGuncelle(kagit_etkisi);

                                       //kullanici için
                                       makas_etkisi=kullanicimakas4.etkiHesapla("Kağıt"); 
                                       nesne_durum1=bilgisayarkagit5.durumGuncelle(makas_etkisi);

                                       //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum2==1)
                                       {
                                           secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                           bilgisayarkagit5.seviyePuanimiGuncelle();
                                       }
                                       //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum1==1)
                                       {
                                           bilgisayar.nesneSil(bilgisayarNesneIndex);
                                           kullanicimakas4.seviyePuanimiGuncelle();
                                       }

                                       //Puanları yazdır
                                       kullanicimakas4.nesnePuaniGoster();
                                       bilgisayarkagit5.nesnePuaniGoster();

                                       //Ekrana yazdır
                                        //bilgisayar
                                        hamleler[roundSayaci][5]=Integer.toString(bilgisayarkagit5.getDayaniklilik());
                                        hamleler[roundSayaci][6]=Integer.toString(bilgisayarkagit5.getSeviyePuani());

                                        //kullanici
                                        hamleler[roundSayaci][2]=Integer.toString(kullanicimakas4.getDayaniklilik());
                                        hamleler[roundSayaci][3]=Integer.toString(kullanicimakas4.getSeviyePuani());

                                   }
                                   else if("Makas5".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                   {
                                       bilgisayarkagit5.nesnePuaniGoster();
                                       kullanicimakas5.nesnePuaniGoster();

                                       nesne_durum2=kullanicimakas5.durumGuncelle(kagit_etkisi);

                                       //kullanici için
                                       makas_etkisi=kullanicimakas5.etkiHesapla("Kağıt"); 
                                       nesne_durum1=bilgisayarkagit5.durumGuncelle(makas_etkisi);

                                       //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum2==1)
                                       {
                                           secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                           bilgisayarkagit5.seviyePuanimiGuncelle();
                                       }
                                       //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum1==1)
                                       {
                                           bilgisayar.nesneSil(bilgisayarNesneIndex);
                                           kullanicimakas5.seviyePuanimiGuncelle();
                                       }

                                       //Puanları yazdır
                                       kullanicimakas5.nesnePuaniGoster();
                                       bilgisayarkagit5.nesnePuaniGoster();

                                       //Ekrana yazdır
                                        //bilgisayar
                                        hamleler[roundSayaci][5]=Integer.toString(bilgisayarkagit5.getDayaniklilik());
                                        hamleler[roundSayaci][6]=Integer.toString(bilgisayarkagit5.getSeviyePuani());

                                        //kullanici
                                        hamleler[roundSayaci][2]=Integer.toString(kullanicimakas5.getDayaniklilik());
                                        hamleler[roundSayaci][3]=Integer.toString(kullanicimakas5.getSeviyePuani());
                                   }  
                                }


                            }
                            else if("Makas".equals(bilgisayar.nesneListesi.get(bilgisayarNesneIndex)) && "Taş".equals(secilenNesnelerAsil.get(kullaniciNesneIndex))) 
                            {
                                System.out.println("Makas-Taş");
                                bilgisayarNesneLabelText="Makas";
                                hamleler[roundSayaci][0]="Round "+(roundSayaci+1);
                                hamleler[roundSayaci][1]="Taş";
                                hamleler[roundSayaci][4]="Makas";


                                if("Makas1".equals(bilgisayar.nesneListesiAdresleri.get(bilgisayarNesneIndex)))
                                {
                                /*
                                Makas1 Taş1
                                Makas1 Taş2
                                Makas1 Taş3
                                Makas1 Taş4
                                Makas1 Taş5
                                */   
                                   makas_etkisi=bilgisayarmakas1.etkiHesapla("Taş");   
                                   if("Taş1".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                   {
                                       kullanicitas1.nesnePuaniGoster();
                                       bilgisayarmakas1.nesnePuaniGoster();

                                       nesne_durum2=kullanicitas1.durumGuncelle(makas_etkisi);

                                       //kullanici için
                                       tas_etkisi=kullanicitas1.etkiHesapla("Makas"); 
                                       nesne_durum1=bilgisayarmakas1.durumGuncelle(tas_etkisi);

                                       //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum2==1)
                                       {
                                           secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                           bilgisayarmakas1.seviyePuanimiGuncelle();
                                       }
                                       //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum1==1)
                                       {
                                           bilgisayar.nesneSil(bilgisayarNesneIndex);
                                           kullanicitas1.seviyePuanimiGuncelle();
                                       }

                                       //Puanları yazdır
                                       kullanicitas1.nesnePuaniGoster();
                                       bilgisayarmakas1.nesnePuaniGoster();

                                       //Ekrana yazdır
                                        //bilgisayar
                                        hamleler[roundSayaci][5]=Integer.toString(bilgisayarmakas1.getDayaniklilik());
                                        hamleler[roundSayaci][6]=Integer.toString(bilgisayarmakas1.getSeviyePuani());

                                        //kullanici
                                        hamleler[roundSayaci][2]=Integer.toString(kullanicitas1.getDayaniklilik());
                                        hamleler[roundSayaci][3]=Integer.toString(kullanicitas1.getSeviyePuani());
                                   }
                                   else if("Taş2".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                   {
                                       kullanicitas2.nesnePuaniGoster();
                                       bilgisayarmakas1.nesnePuaniGoster();

                                       nesne_durum2=kullanicitas2.durumGuncelle(makas_etkisi);

                                       //kullanici için
                                       tas_etkisi=kullanicitas2.etkiHesapla("Makas"); 
                                       nesne_durum1=bilgisayarmakas1.durumGuncelle(tas_etkisi);

                                       //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum2==1)
                                       {
                                           secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                           bilgisayarmakas1.seviyePuanimiGuncelle();
                                       }
                                       //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum1==1)
                                       {
                                           bilgisayar.nesneSil(bilgisayarNesneIndex);
                                           kullanicitas2.seviyePuanimiGuncelle();
                                       }

                                       //Puanları yazdır
                                       kullanicitas2.nesnePuaniGoster();
                                       bilgisayarmakas1.nesnePuaniGoster();

                                       //Ekrana yazdır
                                        //bilgisayar
                                        hamleler[roundSayaci][5]=Integer.toString(bilgisayarmakas1.getDayaniklilik());
                                        hamleler[roundSayaci][6]=Integer.toString(bilgisayarmakas1.getSeviyePuani());

                                        //kullanici
                                        hamleler[roundSayaci][2]=Integer.toString(kullanicitas2.getDayaniklilik());
                                        hamleler[roundSayaci][3]=Integer.toString(kullanicitas2.getSeviyePuani());
                                   }
                                   else if("Taş3".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                   {
                                       kullanicitas3.nesnePuaniGoster();
                                       bilgisayarmakas1.nesnePuaniGoster();

                                       nesne_durum2=kullanicitas3.durumGuncelle(makas_etkisi);

                                       //kullanici için
                                       tas_etkisi=kullanicitas3.etkiHesapla("Makas"); 
                                       nesne_durum1=bilgisayarmakas1.durumGuncelle(tas_etkisi);

                                       //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum2==1)
                                       {
                                           secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                           bilgisayarmakas1.seviyePuanimiGuncelle();
                                       }
                                       //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum1==1)
                                       {
                                           bilgisayar.nesneSil(bilgisayarNesneIndex);
                                           kullanicitas3.seviyePuanimiGuncelle();
                                       }

                                       //Puanları yazdır
                                       kullanicitas3.nesnePuaniGoster();
                                       bilgisayarmakas1.nesnePuaniGoster();

                                       //Ekrana yazdır
                                        //bilgisayar
                                        hamleler[roundSayaci][5]=Integer.toString(bilgisayarmakas1.getDayaniklilik());
                                        hamleler[roundSayaci][6]=Integer.toString(bilgisayarmakas1.getSeviyePuani());

                                        //kullanici
                                        hamleler[roundSayaci][2]=Integer.toString(kullanicitas3.getDayaniklilik());
                                        hamleler[roundSayaci][3]=Integer.toString(kullanicitas3.getSeviyePuani());
                                   }
                                   else if("Taş4".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                   {
                                       kullanicitas4.nesnePuaniGoster();
                                       bilgisayarmakas1.nesnePuaniGoster();

                                       nesne_durum2=kullanicitas4.durumGuncelle(makas_etkisi);

                                       //kullanici için
                                       tas_etkisi=kullanicitas4.etkiHesapla("Makas"); 
                                       nesne_durum1=bilgisayarmakas1.durumGuncelle(tas_etkisi);

                                       //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum2==1)
                                       {
                                           secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                           bilgisayarmakas1.seviyePuanimiGuncelle();
                                       }
                                       //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum1==1)
                                       {
                                           bilgisayar.nesneSil(bilgisayarNesneIndex);
                                           kullanicitas4.seviyePuanimiGuncelle();
                                       }

                                       //Puanları yazdır
                                       kullanicitas4.nesnePuaniGoster();
                                       bilgisayarmakas1.nesnePuaniGoster();

                                       //Ekrana yazdır
                                        //bilgisayar
                                        hamleler[roundSayaci][5]=Integer.toString(bilgisayarmakas1.getDayaniklilik());
                                        hamleler[roundSayaci][6]=Integer.toString(bilgisayarmakas1.getSeviyePuani());

                                        //kullanici
                                        hamleler[roundSayaci][2]=Integer.toString(kullanicitas4.getDayaniklilik());
                                        hamleler[roundSayaci][3]=Integer.toString(kullanicitas4.getSeviyePuani());
                                   }
                                   else if("Taş5".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                   {
                                       kullanicitas5.nesnePuaniGoster();
                                       bilgisayarmakas1.nesnePuaniGoster();

                                       nesne_durum2=kullanicitas5.durumGuncelle(makas_etkisi);

                                       //kullanici için
                                       tas_etkisi=kullanicitas5.etkiHesapla("Makas"); 
                                       nesne_durum1=bilgisayarmakas1.durumGuncelle(tas_etkisi);

                                       //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum2==1)
                                       {
                                           secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                           bilgisayarmakas1.seviyePuanimiGuncelle();
                                       }
                                       //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum1==1)
                                       {
                                           bilgisayar.nesneSil(bilgisayarNesneIndex);
                                           kullanicitas5.seviyePuanimiGuncelle();
                                       }

                                       //Puanları yazdır
                                       kullanicitas5.nesnePuaniGoster();
                                       bilgisayarmakas1.nesnePuaniGoster();

                                       //Ekrana yazdır
                                        //bilgisayar
                                        hamleler[roundSayaci][5]=Integer.toString(bilgisayarmakas1.getDayaniklilik());
                                        hamleler[roundSayaci][6]=Integer.toString(bilgisayarmakas1.getSeviyePuani());

                                        //kullanici
                                        hamleler[roundSayaci][2]=Integer.toString(kullanicitas5.getDayaniklilik());
                                        hamleler[roundSayaci][3]=Integer.toString(kullanicitas5.getSeviyePuani());
                                   }

                                }
                                else if("Makas2".equals(bilgisayar.nesneListesiAdresleri.get(bilgisayarNesneIndex)))
                                {
                                /*
                                Makas2 Taş1
                                Makas2 Taş2
                                Makas2 Taş3
                                Makas2 Taş4
                                Makas2 Taş5
                                */   
                                   makas_etkisi=bilgisayarmakas2.etkiHesapla("Taş");   
                                   if("Taş1".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                   {
                                       kullanicitas1.nesnePuaniGoster();
                                       bilgisayarmakas2.nesnePuaniGoster();

                                       nesne_durum2=kullanicitas1.durumGuncelle(makas_etkisi);

                                       //kullanici için
                                       tas_etkisi=kullanicitas1.etkiHesapla("Makas"); 
                                       nesne_durum1=bilgisayarmakas2.durumGuncelle(tas_etkisi);

                                       //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum2==1)
                                       {
                                           secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                           bilgisayarmakas2.seviyePuanimiGuncelle();
                                       }
                                       //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum1==1)
                                       {
                                           bilgisayar.nesneSil(bilgisayarNesneIndex);
                                           kullanicitas1.seviyePuanimiGuncelle();
                                       }

                                       //Puanları yazdır
                                       kullanicitas1.nesnePuaniGoster();
                                       bilgisayarmakas2.nesnePuaniGoster();

                                       //Ekrana yazdır
                                        //bilgisayar
                                        hamleler[roundSayaci][5]=Integer.toString(bilgisayarmakas2.getDayaniklilik());
                                        hamleler[roundSayaci][6]=Integer.toString(bilgisayarmakas2.getSeviyePuani());

                                        //kullanici
                                        hamleler[roundSayaci][2]=Integer.toString(kullanicitas1.getDayaniklilik());
                                        hamleler[roundSayaci][3]=Integer.toString(kullanicitas1.getSeviyePuani());
                                   }
                                   else if("Taş2".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                   {
                                       kullanicitas2.nesnePuaniGoster();
                                       bilgisayarmakas2.nesnePuaniGoster();

                                       nesne_durum2=kullanicitas2.durumGuncelle(makas_etkisi);

                                       //kullanici için
                                       tas_etkisi=kullanicitas2.etkiHesapla("Makas"); 
                                       nesne_durum1=bilgisayarmakas2.durumGuncelle(tas_etkisi);

                                       //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum2==1)
                                       {
                                           secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                           bilgisayarmakas2.seviyePuanimiGuncelle();
                                       }
                                       //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum1==1)
                                       {
                                           bilgisayar.nesneSil(bilgisayarNesneIndex);
                                           kullanicitas2.seviyePuanimiGuncelle();
                                       }

                                       //Puanları yazdır
                                       kullanicitas2.nesnePuaniGoster();
                                       bilgisayarmakas2.nesnePuaniGoster();

                                       //Ekrana yazdır
                                        //bilgisayar
                                        hamleler[roundSayaci][5]=Integer.toString(bilgisayarmakas2.getDayaniklilik());
                                        hamleler[roundSayaci][6]=Integer.toString(bilgisayarmakas2.getSeviyePuani());

                                        //kullanici
                                        hamleler[roundSayaci][2]=Integer.toString(kullanicitas2.getDayaniklilik());
                                        hamleler[roundSayaci][3]=Integer.toString(kullanicitas2.getSeviyePuani());
                                   }
                                   else if("Taş3".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                   {
                                       kullanicitas3.nesnePuaniGoster();
                                       bilgisayarmakas2.nesnePuaniGoster();

                                       nesne_durum2=kullanicitas3.durumGuncelle(makas_etkisi);

                                       //kullanici için
                                       tas_etkisi=kullanicitas3.etkiHesapla("Makas"); 
                                       nesne_durum1=bilgisayarmakas2.durumGuncelle(tas_etkisi);

                                       //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum2==1)
                                       {
                                           secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                           bilgisayarmakas2.seviyePuanimiGuncelle();
                                       }
                                       //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum1==1)
                                       {
                                           bilgisayar.nesneSil(bilgisayarNesneIndex);
                                           kullanicitas3.seviyePuanimiGuncelle();
                                       }

                                       //Puanları yazdır
                                       kullanicitas3.nesnePuaniGoster();
                                       bilgisayarmakas2.nesnePuaniGoster();

                                       //Ekrana yazdır
                                        //bilgisayar
                                        hamleler[roundSayaci][5]=Integer.toString(bilgisayarmakas2.getDayaniklilik());
                                        hamleler[roundSayaci][6]=Integer.toString(bilgisayarmakas2.getSeviyePuani());

                                        //kullanici
                                        hamleler[roundSayaci][2]=Integer.toString(kullanicitas3.getDayaniklilik());
                                        hamleler[roundSayaci][3]=Integer.toString(kullanicitas3.getSeviyePuani());
                                   }
                                   else if("Taş4".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                   {
                                       kullanicitas4.nesnePuaniGoster();
                                       bilgisayarmakas2.nesnePuaniGoster();

                                       nesne_durum2=kullanicitas4.durumGuncelle(makas_etkisi);

                                       //kullanici için
                                       tas_etkisi=kullanicitas4.etkiHesapla("Makas"); 
                                       nesne_durum1=bilgisayarmakas2.durumGuncelle(tas_etkisi);

                                       //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum2==1)
                                       {
                                           secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                           bilgisayarmakas2.seviyePuanimiGuncelle();
                                       }
                                       //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum1==1)
                                       {
                                           bilgisayar.nesneSil(bilgisayarNesneIndex);
                                           kullanicitas4.seviyePuanimiGuncelle();
                                       }

                                       //Puanları yazdır
                                       kullanicitas4.nesnePuaniGoster();
                                       bilgisayarmakas2.nesnePuaniGoster();

                                       //Ekrana yazdır
                                        //bilgisayar
                                        hamleler[roundSayaci][5]=Integer.toString(bilgisayarmakas2.getDayaniklilik());
                                        hamleler[roundSayaci][6]=Integer.toString(bilgisayarmakas2.getSeviyePuani());

                                        //kullanici
                                        hamleler[roundSayaci][2]=Integer.toString(kullanicitas4.getDayaniklilik());
                                        hamleler[roundSayaci][3]=Integer.toString(kullanicitas4.getSeviyePuani());

                                   }
                                   else if("Taş5".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                   {
                                       kullanicitas5.nesnePuaniGoster();
                                       bilgisayarmakas2.nesnePuaniGoster();

                                       nesne_durum2=kullanicitas5.durumGuncelle(makas_etkisi);

                                       //kullanici için
                                       tas_etkisi=kullanicitas5.etkiHesapla("Makas"); 
                                       nesne_durum1=bilgisayarmakas2.durumGuncelle(tas_etkisi);

                                       //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum2==1)
                                       {
                                           secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                           bilgisayarmakas2.seviyePuanimiGuncelle();
                                       }
                                       //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum1==1)
                                       {
                                           bilgisayar.nesneSil(bilgisayarNesneIndex);
                                           kullanicitas5.seviyePuanimiGuncelle();
                                       }

                                       //Puanları yazdır
                                       kullanicitas5.nesnePuaniGoster();
                                       bilgisayarmakas2.nesnePuaniGoster();

                                       //Ekrana yazdır
                                        //bilgisayar
                                        hamleler[roundSayaci][5]=Integer.toString(bilgisayarmakas2.getDayaniklilik());
                                        hamleler[roundSayaci][6]=Integer.toString(bilgisayarmakas2.getSeviyePuani());

                                        //kullanici
                                        hamleler[roundSayaci][2]=Integer.toString(kullanicitas5.getDayaniklilik());
                                        hamleler[roundSayaci][3]=Integer.toString(kullanicitas5.getSeviyePuani());
                                   }
                                }
                                else if("Makas3".equals(bilgisayar.nesneListesiAdresleri.get(bilgisayarNesneIndex)))
                                {
                                /*
                                Makas3 Taş1
                                Makas3 Taş2
                                Makas3 Taş3
                                Makas3 Taş4
                                Makas3 Taş5
                                */   
                                   makas_etkisi=bilgisayarmakas3.etkiHesapla("Taş");   
                                   if("Taş1".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                   {
                                       kullanicitas1.nesnePuaniGoster();
                                       bilgisayarmakas3.nesnePuaniGoster();

                                       nesne_durum2=kullanicitas1.durumGuncelle(makas_etkisi);

                                       //kullanici için
                                       tas_etkisi=kullanicitas1.etkiHesapla("Makas"); 
                                       nesne_durum1=bilgisayarmakas3.durumGuncelle(tas_etkisi);

                                       //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum2==1)
                                       {
                                           secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                           bilgisayarmakas3.seviyePuanimiGuncelle();
                                       }
                                       //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum1==1)
                                       {
                                           bilgisayar.nesneSil(bilgisayarNesneIndex);
                                           kullanicitas1.seviyePuanimiGuncelle();
                                       }

                                       //Puanları yazdır
                                       kullanicitas1.nesnePuaniGoster();
                                       bilgisayarmakas3.nesnePuaniGoster();

                                       //Ekrana yazdır
                                        //bilgisayar
                                        hamleler[roundSayaci][5]=Integer.toString(bilgisayarmakas3.getDayaniklilik());
                                        hamleler[roundSayaci][6]=Integer.toString(bilgisayarmakas3.getSeviyePuani());

                                        //kullanici
                                        hamleler[roundSayaci][2]=Integer.toString(kullanicitas1.getDayaniklilik());
                                        hamleler[roundSayaci][3]=Integer.toString(kullanicitas1.getSeviyePuani());
                                   }
                                   else if("Taş2".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                   {
                                       kullanicitas2.nesnePuaniGoster();
                                       bilgisayarmakas3.nesnePuaniGoster();

                                       nesne_durum2=kullanicitas2.durumGuncelle(makas_etkisi);

                                       //kullanici için
                                       tas_etkisi=kullanicitas2.etkiHesapla("Makas"); 
                                       nesne_durum1=bilgisayarmakas3.durumGuncelle(tas_etkisi);

                                       //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum2==1)
                                       {
                                           secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                           bilgisayarmakas3.seviyePuanimiGuncelle();
                                       }
                                       //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum1==1)
                                       {
                                           bilgisayar.nesneSil(bilgisayarNesneIndex);
                                           kullanicitas2.seviyePuanimiGuncelle();
                                       }

                                       //Puanları yazdır
                                       kullanicitas2.nesnePuaniGoster();
                                       bilgisayarmakas3.nesnePuaniGoster();

                                       //Ekrana yazdır
                                        //bilgisayar
                                        hamleler[roundSayaci][5]=Integer.toString(bilgisayarmakas3.getDayaniklilik());
                                        hamleler[roundSayaci][6]=Integer.toString(bilgisayarmakas3.getSeviyePuani());

                                        //kullanici
                                        hamleler[roundSayaci][2]=Integer.toString(kullanicitas2.getDayaniklilik());
                                        hamleler[roundSayaci][3]=Integer.toString(kullanicitas2.getSeviyePuani());
                                   }
                                   else if("Taş3".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                   {
                                       kullanicitas3.nesnePuaniGoster();
                                       bilgisayarmakas3.nesnePuaniGoster();

                                       nesne_durum2=kullanicitas3.durumGuncelle(makas_etkisi);

                                       //kullanici için
                                       tas_etkisi=kullanicitas3.etkiHesapla("Makas"); 
                                       nesne_durum1=bilgisayarmakas3.durumGuncelle(tas_etkisi);

                                       //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum2==1)
                                       {
                                           secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                           bilgisayarmakas3.seviyePuanimiGuncelle();
                                       }
                                       //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum1==1)
                                       {
                                           bilgisayar.nesneSil(bilgisayarNesneIndex);
                                           kullanicitas3.seviyePuanimiGuncelle();
                                       }

                                       //Puanları yazdır
                                       kullanicitas3.nesnePuaniGoster();
                                       bilgisayarmakas3.nesnePuaniGoster();

                                       //Ekrana yazdır
                                        //bilgisayar
                                        hamleler[roundSayaci][5]=Integer.toString(bilgisayarmakas3.getDayaniklilik());
                                        hamleler[roundSayaci][6]=Integer.toString(bilgisayarmakas3.getSeviyePuani());

                                        //kullanici
                                        hamleler[roundSayaci][2]=Integer.toString(kullanicitas3.getDayaniklilik());
                                        hamleler[roundSayaci][3]=Integer.toString(kullanicitas3.getSeviyePuani());
                                   }
                                   else if("Taş4".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                   {
                                       kullanicitas4.nesnePuaniGoster();
                                       bilgisayarmakas3.nesnePuaniGoster();

                                       nesne_durum2=kullanicitas4.durumGuncelle(makas_etkisi);

                                       //kullanici için
                                       tas_etkisi=kullanicitas4.etkiHesapla("Makas"); 
                                       nesne_durum1=bilgisayarmakas3.durumGuncelle(tas_etkisi);

                                       //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum2==1)
                                       {
                                           secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                           bilgisayarmakas3.seviyePuanimiGuncelle();
                                       }
                                       //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum1==1)
                                       {
                                           bilgisayar.nesneSil(bilgisayarNesneIndex);
                                           kullanicitas4.seviyePuanimiGuncelle();
                                       }

                                       //Puanları yazdır
                                       kullanicitas4.nesnePuaniGoster();
                                       bilgisayarmakas3.nesnePuaniGoster();

                                       //Ekrana yazdır
                                        //bilgisayar
                                        hamleler[roundSayaci][5]=Integer.toString(bilgisayarmakas3.getDayaniklilik());
                                        hamleler[roundSayaci][6]=Integer.toString(bilgisayarmakas3.getSeviyePuani());

                                        //kullanici
                                        hamleler[roundSayaci][2]=Integer.toString(kullanicitas4.getDayaniklilik());
                                        hamleler[roundSayaci][3]=Integer.toString(kullanicitas4.getSeviyePuani());
                                   }
                                   else if("Taş5".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                   {
                                       kullanicitas5.nesnePuaniGoster();
                                       bilgisayarmakas3.nesnePuaniGoster();

                                       nesne_durum2=kullanicitas5.durumGuncelle(makas_etkisi);

                                       //kullanici için
                                       tas_etkisi=kullanicitas5.etkiHesapla("Makas"); 
                                       nesne_durum1=bilgisayarmakas3.durumGuncelle(tas_etkisi);

                                       //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum2==1)
                                       {
                                           secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                           bilgisayarmakas3.seviyePuanimiGuncelle();
                                       }
                                       //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum1==1)
                                       {
                                           bilgisayar.nesneSil(bilgisayarNesneIndex);
                                           kullanicitas5.seviyePuanimiGuncelle();
                                       }

                                       //Puanları yazdır
                                       kullanicitas5.nesnePuaniGoster();
                                       bilgisayarmakas3.nesnePuaniGoster();

                                       //Ekrana yazdır
                                        //bilgisayar
                                        hamleler[roundSayaci][5]=Integer.toString(bilgisayarmakas3.getDayaniklilik());
                                        hamleler[roundSayaci][6]=Integer.toString(bilgisayarmakas3.getSeviyePuani());

                                        //kullanici
                                        hamleler[roundSayaci][2]=Integer.toString(kullanicitas5.getDayaniklilik());
                                        hamleler[roundSayaci][3]=Integer.toString(kullanicitas5.getSeviyePuani());
                                   }

                                }
                                else if("Makas4".equals(bilgisayar.nesneListesiAdresleri.get(bilgisayarNesneIndex)))
                                {
                                /*
                                Makas4 Taş1
                                Makas4 Taş2
                                Makas4 Taş3
                                Makas4 Taş4
                                Makas4 Taş5
                                */   
                                   makas_etkisi=bilgisayarmakas4.etkiHesapla("Taş");   
                                   if("Taş1".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                   {
                                       kullanicitas1.nesnePuaniGoster();
                                       bilgisayarmakas4.nesnePuaniGoster();

                                       nesne_durum2=kullanicitas1.durumGuncelle(makas_etkisi);

                                       //kullanici için
                                       tas_etkisi=kullanicitas1.etkiHesapla("Makas"); 
                                       nesne_durum1=bilgisayarmakas4.durumGuncelle(tas_etkisi);

                                       //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum2==1)
                                       {
                                           secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                           bilgisayarmakas4.seviyePuanimiGuncelle();
                                       }
                                       //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum1==1)
                                       {
                                           bilgisayar.nesneSil(bilgisayarNesneIndex);
                                           kullanicitas1.seviyePuanimiGuncelle();
                                       }

                                       //Puanları yazdır
                                       kullanicitas1.nesnePuaniGoster();
                                       bilgisayarmakas4.nesnePuaniGoster();

                                       //Ekrana yazdır
                                        //bilgisayar
                                        hamleler[roundSayaci][5]=Integer.toString(bilgisayarmakas4.getDayaniklilik());
                                        hamleler[roundSayaci][6]=Integer.toString(bilgisayarmakas4.getSeviyePuani());

                                        //kullanici
                                        hamleler[roundSayaci][2]=Integer.toString(kullanicitas1.getDayaniklilik());
                                        hamleler[roundSayaci][3]=Integer.toString(kullanicitas1.getSeviyePuani());
                                   }
                                   else if("Taş2".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                   {
                                       kullanicitas2.nesnePuaniGoster();
                                       bilgisayarmakas4.nesnePuaniGoster();

                                       nesne_durum2=kullanicitas2.durumGuncelle(makas_etkisi);

                                       //kullanici için
                                       tas_etkisi=kullanicitas2.etkiHesapla("Makas"); 
                                       nesne_durum1=bilgisayarmakas4.durumGuncelle(tas_etkisi);

                                       //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum2==1)
                                       {
                                           secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                           bilgisayarmakas4.seviyePuanimiGuncelle();
                                       }
                                       //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum1==1)
                                       {
                                           bilgisayar.nesneSil(bilgisayarNesneIndex);
                                           kullanicitas2.seviyePuanimiGuncelle();
                                       }

                                       //Puanları yazdır
                                       kullanicitas2.nesnePuaniGoster();
                                       bilgisayarmakas4.nesnePuaniGoster();

                                       //Ekrana yazdır
                                        //bilgisayar
                                        hamleler[roundSayaci][5]=Integer.toString(bilgisayarmakas4.getDayaniklilik());
                                        hamleler[roundSayaci][6]=Integer.toString(bilgisayarmakas4.getSeviyePuani());

                                        //kullanici
                                        hamleler[roundSayaci][2]=Integer.toString(kullanicitas2.getDayaniklilik());
                                        hamleler[roundSayaci][3]=Integer.toString(kullanicitas2.getSeviyePuani());

                                   }
                                   else if("Taş3".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                   {
                                       kullanicitas3.nesnePuaniGoster();
                                       bilgisayarmakas4.nesnePuaniGoster();

                                       nesne_durum2=kullanicitas3.durumGuncelle(makas_etkisi);

                                       //kullanici için
                                       tas_etkisi=kullanicitas3.etkiHesapla("Makas"); 
                                       nesne_durum1=bilgisayarmakas4.durumGuncelle(tas_etkisi);

                                       //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum2==1)
                                       {
                                           secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                           bilgisayarmakas4.seviyePuanimiGuncelle();
                                       }
                                       //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum1==1)
                                       {
                                           bilgisayar.nesneSil(bilgisayarNesneIndex);
                                           kullanicitas3.seviyePuanimiGuncelle();
                                       }

                                       //Puanları yazdır
                                       kullanicitas3.nesnePuaniGoster();
                                       bilgisayarmakas4.nesnePuaniGoster();

                                       //Ekrana yazdır
                                        //bilgisayar
                                        hamleler[roundSayaci][5]=Integer.toString(bilgisayarmakas4.getDayaniklilik());
                                        hamleler[roundSayaci][6]=Integer.toString(bilgisayarmakas4.getSeviyePuani());

                                        //kullanici
                                        hamleler[roundSayaci][2]=Integer.toString(kullanicitas3.getDayaniklilik());
                                        hamleler[roundSayaci][3]=Integer.toString(kullanicitas3.getSeviyePuani());

                                   }
                                   else if("Taş4".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                   {
                                       kullanicitas4.nesnePuaniGoster();
                                       bilgisayarmakas4.nesnePuaniGoster();

                                       nesne_durum2=kullanicitas4.durumGuncelle(makas_etkisi);

                                       //kullanici için
                                       tas_etkisi=kullanicitas4.etkiHesapla("Makas"); 
                                       nesne_durum1=bilgisayarmakas4.durumGuncelle(tas_etkisi);

                                       //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum2==1)
                                       {
                                           secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                           bilgisayarmakas4.seviyePuanimiGuncelle();
                                       }
                                       //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum1==1)
                                       {
                                           bilgisayar.nesneSil(bilgisayarNesneIndex);
                                           kullanicitas4.seviyePuanimiGuncelle();
                                       }

                                       //Puanları yazdır
                                       kullanicitas4.nesnePuaniGoster();
                                       bilgisayarmakas4.nesnePuaniGoster();

                                       //Ekrana yazdır
                                        //bilgisayar
                                        hamleler[roundSayaci][5]=Integer.toString(bilgisayarmakas4.getDayaniklilik());
                                        hamleler[roundSayaci][6]=Integer.toString(bilgisayarmakas4.getSeviyePuani());

                                        //kullanici
                                        hamleler[roundSayaci][2]=Integer.toString(kullanicitas4.getDayaniklilik());
                                        hamleler[roundSayaci][3]=Integer.toString(kullanicitas4.getSeviyePuani());
                                   }
                                   else if("Taş5".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                   {
                                       kullanicitas5.nesnePuaniGoster();
                                       bilgisayarmakas4.nesnePuaniGoster();

                                       nesne_durum2=kullanicitas5.durumGuncelle(makas_etkisi);

                                       //kullanici için
                                       tas_etkisi=kullanicitas5.etkiHesapla("Makas"); 
                                       nesne_durum1=bilgisayarmakas4.durumGuncelle(tas_etkisi);

                                       //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum2==1)
                                       {
                                           secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                           bilgisayarmakas4.seviyePuanimiGuncelle();
                                       }
                                       //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum1==1)
                                       {
                                           bilgisayar.nesneSil(bilgisayarNesneIndex);
                                           kullanicitas5.seviyePuanimiGuncelle();
                                       }

                                       //Puanları yazdır
                                       kullanicitas5.nesnePuaniGoster();
                                       bilgisayarmakas4.nesnePuaniGoster();

                                       //Ekrana yazdır
                                        //bilgisayar
                                        hamleler[roundSayaci][5]=Integer.toString(bilgisayarmakas4.getDayaniklilik());
                                        hamleler[roundSayaci][6]=Integer.toString(bilgisayarmakas4.getSeviyePuani());

                                        //kullanici
                                        hamleler[roundSayaci][2]=Integer.toString(kullanicitas5.getDayaniklilik());
                                        hamleler[roundSayaci][3]=Integer.toString(kullanicitas5.getSeviyePuani());
                                   }
                                }
                                else if("Makas5".equals(bilgisayar.nesneListesiAdresleri.get(bilgisayarNesneIndex)))
                                {
                                /*
                                Makas5 Taş1
                                Makas5 Taş2
                                Makas5 Taş3
                                Makas5 Taş4
                                Makas5 Taş5
                                */   
                                   makas_etkisi=bilgisayarmakas5.etkiHesapla("Taş");   
                                   if("Taş1".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                   {
                                       kullanicitas1.nesnePuaniGoster();
                                       bilgisayarmakas5.nesnePuaniGoster();

                                       nesne_durum2=kullanicitas1.durumGuncelle(makas_etkisi);

                                       //kullanici için
                                       tas_etkisi=kullanicitas1.etkiHesapla("Makas"); 
                                       nesne_durum1=bilgisayarmakas5.durumGuncelle(tas_etkisi);

                                       //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum2==1)
                                       {
                                           secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                           bilgisayarmakas5.seviyePuanimiGuncelle();
                                       }
                                       //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum1==1)
                                       {
                                           bilgisayar.nesneSil(bilgisayarNesneIndex);
                                           kullanicitas1.seviyePuanimiGuncelle();
                                       }

                                       //Puanları yazdır
                                       kullanicitas1.nesnePuaniGoster();
                                       bilgisayarmakas5.nesnePuaniGoster();

                                       //Ekrana yazdır
                                        //bilgisayar
                                        hamleler[roundSayaci][5]=Integer.toString(bilgisayarmakas5.getDayaniklilik());
                                        hamleler[roundSayaci][6]=Integer.toString(bilgisayarmakas5.getSeviyePuani());

                                        //kullanici
                                        hamleler[roundSayaci][2]=Integer.toString(kullanicitas1.getDayaniklilik());
                                        hamleler[roundSayaci][3]=Integer.toString(kullanicitas1.getSeviyePuani());
                                   }
                                   else if("Taş2".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                   {
                                       kullanicitas2.nesnePuaniGoster();
                                       bilgisayarmakas5.nesnePuaniGoster();

                                       nesne_durum2=kullanicitas2.durumGuncelle(makas_etkisi);

                                       //kullanici için
                                       tas_etkisi=kullanicitas2.etkiHesapla("Makas"); 
                                       nesne_durum1=bilgisayarmakas5.durumGuncelle(tas_etkisi);

                                       //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum2==1)
                                       {
                                           secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                           bilgisayarmakas5.seviyePuanimiGuncelle();
                                       }
                                       //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum1==1)
                                       {
                                           bilgisayar.nesneSil(bilgisayarNesneIndex);
                                           kullanicitas2.seviyePuanimiGuncelle();
                                       }

                                       //Puanları yazdır
                                       kullanicitas2.nesnePuaniGoster();
                                       bilgisayarmakas5.nesnePuaniGoster();

                                       //Ekrana yazdır
                                        //bilgisayar
                                        hamleler[roundSayaci][5]=Integer.toString(bilgisayarmakas5.getDayaniklilik());
                                        hamleler[roundSayaci][6]=Integer.toString(bilgisayarmakas5.getSeviyePuani());

                                        //kullanici
                                        hamleler[roundSayaci][2]=Integer.toString(kullanicitas2.getDayaniklilik());
                                        hamleler[roundSayaci][3]=Integer.toString(kullanicitas2.getSeviyePuani());

                                   }
                                   else if("Taş3".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                   {
                                       kullanicitas3.nesnePuaniGoster();
                                       bilgisayarmakas5.nesnePuaniGoster();

                                       nesne_durum2=kullanicitas3.durumGuncelle(makas_etkisi);

                                       //kullanici için
                                       tas_etkisi=kullanicitas3.etkiHesapla("Makas"); 
                                       nesne_durum1=bilgisayarmakas5.durumGuncelle(tas_etkisi);

                                       //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum2==1)
                                       {
                                           secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                           bilgisayarmakas5.seviyePuanimiGuncelle();
                                       }
                                       //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum1==1)
                                       {
                                           bilgisayar.nesneSil(bilgisayarNesneIndex);
                                           kullanicitas3.seviyePuanimiGuncelle();
                                       }

                                       //Puanları yazdır
                                       kullanicitas3.nesnePuaniGoster();
                                       bilgisayarmakas5.nesnePuaniGoster();

                                       //Ekrana yazdır
                                        //bilgisayar
                                        hamleler[roundSayaci][5]=Integer.toString(bilgisayarmakas5.getDayaniklilik());
                                        hamleler[roundSayaci][6]=Integer.toString(bilgisayarmakas5.getSeviyePuani());

                                        //kullanici
                                        hamleler[roundSayaci][2]=Integer.toString(kullanicitas3.getDayaniklilik());
                                        hamleler[roundSayaci][3]=Integer.toString(kullanicitas3.getSeviyePuani());
                                   }
                                   else if("Taş4".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                   {
                                       kullanicitas4.nesnePuaniGoster();
                                       bilgisayarmakas5.nesnePuaniGoster();

                                       nesne_durum2=kullanicitas4.durumGuncelle(makas_etkisi);

                                       //kullanici için
                                       tas_etkisi=kullanicitas4.etkiHesapla("Makas"); 
                                       nesne_durum1=bilgisayarmakas5.durumGuncelle(tas_etkisi);

                                       //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum2==1)
                                       {
                                           secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                           bilgisayarmakas5.seviyePuanimiGuncelle();
                                       }
                                       //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum1==1)
                                       {
                                           bilgisayar.nesneSil(bilgisayarNesneIndex);
                                           kullanicitas4.seviyePuanimiGuncelle();
                                       }

                                       //Puanları yazdır
                                       kullanicitas4.nesnePuaniGoster();
                                       bilgisayarmakas5.nesnePuaniGoster();

                                       //Ekrana yazdır
                                        //bilgisayar
                                        hamleler[roundSayaci][5]=Integer.toString(bilgisayarmakas5.getDayaniklilik());
                                        hamleler[roundSayaci][6]=Integer.toString(bilgisayarmakas5.getSeviyePuani());

                                        //kullanici
                                        hamleler[roundSayaci][2]=Integer.toString(kullanicitas4.getDayaniklilik());
                                        hamleler[roundSayaci][3]=Integer.toString(kullanicitas4.getSeviyePuani());
                                   }
                                   else if("Taş5".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                   {
                                       kullanicitas5.nesnePuaniGoster();
                                       bilgisayarmakas5.nesnePuaniGoster();

                                       nesne_durum2=kullanicitas5.durumGuncelle(makas_etkisi);

                                       //kullanici için
                                       tas_etkisi=kullanicitas5.etkiHesapla("Makas"); 
                                       nesne_durum1=bilgisayarmakas5.durumGuncelle(tas_etkisi);

                                       //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum2==1)
                                       {
                                           secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                           bilgisayarmakas5.seviyePuanimiGuncelle();
                                       }
                                       //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum1==1)
                                       {
                                           bilgisayar.nesneSil(bilgisayarNesneIndex);
                                           kullanicitas5.seviyePuanimiGuncelle();
                                       }

                                       //Puanları yazdır
                                       kullanicitas5.nesnePuaniGoster();
                                       bilgisayarmakas5.nesnePuaniGoster();

                                       //Ekrana yazdır
                                        //bilgisayar
                                        hamleler[roundSayaci][5]=Integer.toString(bilgisayarmakas5.getDayaniklilik());
                                        hamleler[roundSayaci][6]=Integer.toString(bilgisayarmakas5.getSeviyePuani());

                                        //kullanici
                                        hamleler[roundSayaci][2]=Integer.toString(kullanicitas5.getDayaniklilik());
                                        hamleler[roundSayaci][3]=Integer.toString(kullanicitas5.getSeviyePuani());
                                   } 
                                }


                            }
                            else if("Makas".equals(bilgisayar.nesneListesi.get(bilgisayarNesneIndex)) && "Kağıt".equals(secilenNesnelerAsil.get(kullaniciNesneIndex))) {
                                System.out.println("Makas-Kağıt");
                                bilgisayarNesneLabelText="Makas";
                                hamleler[roundSayaci][0]="Round "+(roundSayaci+1);
                                hamleler[roundSayaci][1]="Kağıt";
                                hamleler[roundSayaci][4]="Makas";


                                if("Makas1".equals(bilgisayar.nesneListesiAdresleri.get(bilgisayarNesneIndex)))
                                {
                                /*
                                Makas1 Kağıt1
                                Makas1 Kağıt2
                                Makas1 Kağıt3
                                Makas1 Kağıt4
                                Makas1 Kağıt5
                                */   
                                   makas_etkisi=bilgisayarmakas1.etkiHesapla("Kağıt");   
                                   if("Kağıt1".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                   {
                                       kullanicikagit1.nesnePuaniGoster();
                                       bilgisayarmakas1.nesnePuaniGoster();

                                       nesne_durum2=kullanicikagit1.durumGuncelle(makas_etkisi);

                                       //kullanici için
                                       kagit_etkisi=kullanicikagit1.etkiHesapla("Makas"); 
                                       nesne_durum1=bilgisayarmakas1.durumGuncelle(kagit_etkisi);

                                       //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum2==1)
                                       {
                                           secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                           bilgisayarmakas1.seviyePuanimiGuncelle();
                                       }
                                       //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum1==1)
                                       {
                                           bilgisayar.nesneSil(bilgisayarNesneIndex);
                                           kullanicikagit1.seviyePuanimiGuncelle();
                                       }

                                       //Puanları yazdır
                                       kullanicikagit1.nesnePuaniGoster();
                                       bilgisayarmakas1.nesnePuaniGoster();

                                       //Ekrana yazdır
                                        //bilgisayar
                                        hamleler[roundSayaci][5]=Integer.toString(bilgisayarmakas1.getDayaniklilik());
                                        hamleler[roundSayaci][6]=Integer.toString(bilgisayarmakas1.getSeviyePuani());

                                        //kullanici
                                        hamleler[roundSayaci][2]=Integer.toString(kullanicikagit1.getDayaniklilik());
                                        hamleler[roundSayaci][3]=Integer.toString(kullanicikagit1.getSeviyePuani());
                                   }
                                   else if("Kağıt2".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                   {
                                       kullanicikagit2.nesnePuaniGoster();
                                       bilgisayarmakas1.nesnePuaniGoster();

                                       nesne_durum2=kullanicikagit2.durumGuncelle(makas_etkisi);

                                       //kullanici için
                                       kagit_etkisi=kullanicikagit2.etkiHesapla("Makas"); 
                                       nesne_durum1=bilgisayarmakas1.durumGuncelle(kagit_etkisi);

                                       //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum2==1)
                                       {
                                           secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                           bilgisayarmakas1.seviyePuanimiGuncelle();
                                       }
                                       //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum1==1)
                                       {
                                           bilgisayar.nesneSil(bilgisayarNesneIndex);
                                           kullanicikagit2.seviyePuanimiGuncelle();
                                       }

                                       //Puanları yazdır
                                       kullanicikagit2.nesnePuaniGoster();
                                       bilgisayarmakas1.nesnePuaniGoster();

                                       //Ekrana yazdır
                                        //bilgisayar
                                        hamleler[roundSayaci][5]=Integer.toString(bilgisayarmakas1.getDayaniklilik());
                                        hamleler[roundSayaci][6]=Integer.toString(bilgisayarmakas1.getSeviyePuani());

                                        //kullanici
                                        hamleler[roundSayaci][2]=Integer.toString(kullanicikagit2.getDayaniklilik());
                                        hamleler[roundSayaci][3]=Integer.toString(kullanicikagit2.getSeviyePuani());
                                   }
                                   else if("Kağıt3".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                   {
                                       kullanicikagit3.nesnePuaniGoster();
                                       bilgisayarmakas1.nesnePuaniGoster();

                                       nesne_durum2=kullanicikagit3.durumGuncelle(makas_etkisi);

                                       //kullanici için
                                       kagit_etkisi=kullanicikagit3.etkiHesapla("Makas"); 
                                       nesne_durum1=bilgisayarmakas1.durumGuncelle(kagit_etkisi);

                                       //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum2==1)
                                       {
                                           secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                           bilgisayarmakas1.seviyePuanimiGuncelle();
                                       }
                                       //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum1==1)
                                       {
                                           bilgisayar.nesneSil(bilgisayarNesneIndex);
                                           kullanicikagit3.seviyePuanimiGuncelle();
                                       }

                                       //Puanları yazdır
                                       kullanicikagit3.nesnePuaniGoster();
                                       bilgisayarmakas1.nesnePuaniGoster();

                                       //Ekrana yazdır
                                        //bilgisayar
                                        hamleler[roundSayaci][5]=Integer.toString(bilgisayarmakas1.getDayaniklilik());
                                        hamleler[roundSayaci][6]=Integer.toString(bilgisayarmakas1.getSeviyePuani());

                                        //kullanici
                                        hamleler[roundSayaci][2]=Integer.toString(kullanicikagit3.getDayaniklilik());
                                        hamleler[roundSayaci][3]=Integer.toString(kullanicikagit3.getSeviyePuani());
                                   }
                                   else if("Kağıt4".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                   {
                                       kullanicikagit4.nesnePuaniGoster();
                                       bilgisayarmakas1.nesnePuaniGoster();

                                       nesne_durum2=kullanicikagit4.durumGuncelle(makas_etkisi);

                                       //kullanici için
                                       kagit_etkisi=kullanicikagit4.etkiHesapla("Makas"); 
                                       nesne_durum1=bilgisayarmakas1.durumGuncelle(kagit_etkisi);

                                       //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum2==1)
                                       {
                                           secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                           bilgisayarmakas1.seviyePuanimiGuncelle();
                                       }
                                       //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum1==1)
                                       {
                                           bilgisayar.nesneSil(bilgisayarNesneIndex);
                                           kullanicikagit4.seviyePuanimiGuncelle();
                                       }

                                       //Puanları yazdır
                                       kullanicikagit4.nesnePuaniGoster();
                                       bilgisayarmakas1.nesnePuaniGoster();

                                       //Ekrana yazdır
                                        //bilgisayar
                                        hamleler[roundSayaci][5]=Integer.toString(bilgisayarmakas1.getDayaniklilik());
                                        hamleler[roundSayaci][6]=Integer.toString(bilgisayarmakas1.getSeviyePuani());

                                        //kullanici
                                        hamleler[roundSayaci][2]=Integer.toString(kullanicikagit4.getDayaniklilik());
                                        hamleler[roundSayaci][3]=Integer.toString(kullanicikagit4.getSeviyePuani());
                                   }
                                   else if("Kağıt5".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                   {
                                       kullanicikagit5.nesnePuaniGoster();
                                       bilgisayarmakas1.nesnePuaniGoster();

                                       nesne_durum2=kullanicikagit5.durumGuncelle(makas_etkisi);

                                       //kullanici için
                                       kagit_etkisi=kullanicikagit5.etkiHesapla("Makas"); 
                                       nesne_durum1=bilgisayarmakas1.durumGuncelle(kagit_etkisi);

                                       //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum2==1)
                                       {
                                           secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                           bilgisayarmakas1.seviyePuanimiGuncelle();
                                       }
                                       //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum1==1)
                                       {
                                           bilgisayar.nesneSil(bilgisayarNesneIndex);
                                           kullanicikagit5.seviyePuanimiGuncelle();
                                       }

                                       //Puanları yazdır
                                       kullanicikagit5.nesnePuaniGoster();
                                       bilgisayarmakas1.nesnePuaniGoster();

                                       //Ekrana yazdır
                                        //bilgisayar
                                        hamleler[roundSayaci][5]=Integer.toString(bilgisayarmakas1.getDayaniklilik());
                                        hamleler[roundSayaci][6]=Integer.toString(bilgisayarmakas1.getSeviyePuani());

                                        //kullanici
                                        hamleler[roundSayaci][2]=Integer.toString(kullanicikagit5.getDayaniklilik());
                                        hamleler[roundSayaci][3]=Integer.toString(kullanicikagit5.getSeviyePuani());
                                   }

                                }
                                else if("Makas2".equals(bilgisayar.nesneListesiAdresleri.get(bilgisayarNesneIndex)))
                                {
                                /*
                                Makas2 Kağıt1
                                Makas2 Kağıt2
                                Makas2 Kağıt3
                                Makas2 Kağıt4
                                Makas2 Kağıt5
                                */   
                                   makas_etkisi=bilgisayarmakas2.etkiHesapla("Kağıt");   
                                   if("Kağıt1".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                   {
                                       kullanicikagit1.nesnePuaniGoster();
                                       bilgisayarmakas2.nesnePuaniGoster();

                                       nesne_durum2=kullanicikagit1.durumGuncelle(makas_etkisi);

                                       //kullanici için
                                       kagit_etkisi=kullanicikagit1.etkiHesapla("Makas"); 
                                       nesne_durum1=bilgisayarmakas2.durumGuncelle(kagit_etkisi);

                                       //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum2==1)
                                       {
                                           secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                           bilgisayarmakas2.seviyePuanimiGuncelle();
                                       }
                                       //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum1==1)
                                       {
                                           bilgisayar.nesneSil(bilgisayarNesneIndex);
                                           kullanicikagit1.seviyePuanimiGuncelle();
                                       }

                                       //Puanları yazdır
                                       kullanicikagit1.nesnePuaniGoster();
                                       bilgisayarmakas2.nesnePuaniGoster();

                                       //Ekrana yazdır
                                        //bilgisayar
                                        hamleler[roundSayaci][5]=Integer.toString(bilgisayarmakas2.getDayaniklilik());
                                        hamleler[roundSayaci][6]=Integer.toString(bilgisayarmakas2.getSeviyePuani());

                                        //kullanici
                                        hamleler[roundSayaci][2]=Integer.toString(kullanicikagit1.getDayaniklilik());
                                        hamleler[roundSayaci][3]=Integer.toString(kullanicikagit1.getSeviyePuani());
                                   }
                                   else if("Kağıt2".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                   {
                                       kullanicikagit2.nesnePuaniGoster();
                                       bilgisayarmakas2.nesnePuaniGoster();

                                       nesne_durum2=kullanicikagit2.durumGuncelle(makas_etkisi);

                                       //kullanici için
                                       kagit_etkisi=kullanicikagit2.etkiHesapla("Makas"); 
                                       nesne_durum1=bilgisayarmakas2.durumGuncelle(kagit_etkisi);

                                       //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum2==1)
                                       {
                                           secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                           bilgisayarmakas2.seviyePuanimiGuncelle();
                                       }
                                       //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum1==1)
                                       {
                                           bilgisayar.nesneSil(bilgisayarNesneIndex);
                                           kullanicikagit2.seviyePuanimiGuncelle();
                                       }

                                       //Puanları yazdır
                                       kullanicikagit2.nesnePuaniGoster();
                                       bilgisayarmakas2.nesnePuaniGoster();

                                       //Ekrana yazdır
                                        //bilgisayar
                                        hamleler[roundSayaci][5]=Integer.toString(bilgisayarmakas2.getDayaniklilik());
                                        hamleler[roundSayaci][6]=Integer.toString(bilgisayarmakas2.getSeviyePuani());

                                        //kullanici
                                        hamleler[roundSayaci][2]=Integer.toString(kullanicikagit2.getDayaniklilik());
                                        hamleler[roundSayaci][3]=Integer.toString(kullanicikagit2.getSeviyePuani());
                                   }
                                   else if("Kağıt3".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                   {
                                       kullanicikagit3.nesnePuaniGoster();
                                       bilgisayarmakas2.nesnePuaniGoster();

                                       nesne_durum2=kullanicikagit3.durumGuncelle(makas_etkisi);

                                       //kullanici için
                                       kagit_etkisi=kullanicikagit3.etkiHesapla("Makas"); 
                                       nesne_durum1=bilgisayarmakas2.durumGuncelle(kagit_etkisi);

                                       //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum2==1)
                                       {
                                           secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                           bilgisayarmakas2.seviyePuanimiGuncelle();
                                       }
                                       //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum1==1)
                                       {
                                           bilgisayar.nesneSil(bilgisayarNesneIndex);
                                           kullanicikagit3.seviyePuanimiGuncelle();
                                       }

                                       //Puanları yazdır
                                       kullanicikagit3.nesnePuaniGoster();
                                       bilgisayarmakas2.nesnePuaniGoster();

                                       //Ekrana yazdır
                                        //bilgisayar
                                        hamleler[roundSayaci][5]=Integer.toString(bilgisayarmakas2.getDayaniklilik());
                                        hamleler[roundSayaci][6]=Integer.toString(bilgisayarmakas2.getSeviyePuani());

                                        //kullanici
                                        hamleler[roundSayaci][2]=Integer.toString(kullanicikagit3.getDayaniklilik());
                                        hamleler[roundSayaci][3]=Integer.toString(kullanicikagit3.getSeviyePuani());
                                   }
                                   else if("Kağıt4".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                   {
                                       kullanicikagit4.nesnePuaniGoster();
                                       bilgisayarmakas2.nesnePuaniGoster();

                                       nesne_durum2=kullanicikagit4.durumGuncelle(makas_etkisi);

                                       //kullanici için
                                       kagit_etkisi=kullanicikagit4.etkiHesapla("Makas"); 
                                       nesne_durum1=bilgisayarmakas2.durumGuncelle(kagit_etkisi);

                                       //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum2==1)
                                       {
                                           secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                           bilgisayarmakas2.seviyePuanimiGuncelle();
                                       }
                                       //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum1==1)
                                       {
                                           bilgisayar.nesneSil(bilgisayarNesneIndex);
                                           kullanicikagit4.seviyePuanimiGuncelle();
                                       }

                                       //Puanları yazdır
                                       kullanicikagit4.nesnePuaniGoster();
                                       bilgisayarmakas2.nesnePuaniGoster();

                                       //Ekrana yazdır
                                        //bilgisayar
                                        hamleler[roundSayaci][5]=Integer.toString(bilgisayarmakas2.getDayaniklilik());
                                        hamleler[roundSayaci][6]=Integer.toString(bilgisayarmakas2.getSeviyePuani());

                                        //kullanici
                                        hamleler[roundSayaci][2]=Integer.toString(kullanicikagit4.getDayaniklilik());
                                        hamleler[roundSayaci][3]=Integer.toString(kullanicikagit4.getSeviyePuani());
                                   }
                                   else if("Kağıt5".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                   {
                                       kullanicikagit5.nesnePuaniGoster();
                                       bilgisayarmakas2.nesnePuaniGoster();

                                       nesne_durum2=kullanicikagit5.durumGuncelle(makas_etkisi);

                                       //kullanici için
                                       kagit_etkisi=kullanicikagit5.etkiHesapla("Makas"); 
                                       nesne_durum1=bilgisayarmakas2.durumGuncelle(kagit_etkisi);

                                       //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum2==1)
                                       {
                                           secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                           bilgisayarmakas2.seviyePuanimiGuncelle();
                                       }
                                       //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum1==1)
                                       {
                                           bilgisayar.nesneSil(bilgisayarNesneIndex);
                                           kullanicikagit5.seviyePuanimiGuncelle();
                                       }

                                       //Puanları yazdır
                                       kullanicikagit5.nesnePuaniGoster();
                                       bilgisayarmakas2.nesnePuaniGoster();

                                       //Ekrana yazdır
                                        //bilgisayar
                                        hamleler[roundSayaci][5]=Integer.toString(bilgisayarmakas2.getDayaniklilik());
                                        hamleler[roundSayaci][6]=Integer.toString(bilgisayarmakas2.getSeviyePuani());

                                        //kullanici
                                        hamleler[roundSayaci][2]=Integer.toString(kullanicikagit5.getDayaniklilik());
                                        hamleler[roundSayaci][3]=Integer.toString(kullanicikagit5.getSeviyePuani());
                                   }
                                }
                                else if("Makas3".equals(bilgisayar.nesneListesiAdresleri.get(bilgisayarNesneIndex)))
                                {
                                /*
                                Makas3 Kağıt1
                                Makas3 Kağıt2
                                Makas3 Kağıt3
                                Makas3 Kağıt4
                                Makas3 Kağıt5
                                */   
                                   makas_etkisi=bilgisayarmakas3.etkiHesapla("Kağıt");   
                                   if("Kağıt1".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                   {
                                       kullanicikagit1.nesnePuaniGoster();
                                       bilgisayarmakas3.nesnePuaniGoster();

                                       nesne_durum2=kullanicikagit1.durumGuncelle(makas_etkisi);

                                       //kullanici için
                                       kagit_etkisi=kullanicikagit1.etkiHesapla("Makas"); 
                                       nesne_durum1=bilgisayarmakas3.durumGuncelle(kagit_etkisi);

                                       //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum2==1)
                                       {
                                           secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                           bilgisayarmakas3.seviyePuanimiGuncelle();
                                       }
                                       //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum1==1)
                                       {
                                           bilgisayar.nesneSil(bilgisayarNesneIndex);
                                           kullanicikagit1.seviyePuanimiGuncelle();
                                       }

                                       //Puanları yazdır
                                       kullanicikagit1.nesnePuaniGoster();
                                       bilgisayarmakas3.nesnePuaniGoster();

                                       //Ekrana yazdır
                                        //bilgisayar
                                        hamleler[roundSayaci][5]=Integer.toString(bilgisayarmakas3.getDayaniklilik());
                                        hamleler[roundSayaci][6]=Integer.toString(bilgisayarmakas3.getSeviyePuani());

                                        //kullanici
                                        hamleler[roundSayaci][2]=Integer.toString(kullanicikagit1.getDayaniklilik());
                                        hamleler[roundSayaci][3]=Integer.toString(kullanicikagit1.getSeviyePuani());
                                   }
                                   else if("Kağıt2".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                   {
                                       kullanicikagit2.nesnePuaniGoster();
                                       bilgisayarmakas3.nesnePuaniGoster();

                                       nesne_durum2=kullanicikagit2.durumGuncelle(makas_etkisi);

                                       //kullanici için
                                       kagit_etkisi=kullanicikagit2.etkiHesapla("Makas"); 
                                       nesne_durum1=bilgisayarmakas3.durumGuncelle(kagit_etkisi);

                                       //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum2==1)
                                       {
                                           secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                           bilgisayarmakas3.seviyePuanimiGuncelle();
                                       }
                                       //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum1==1)
                                       {
                                           bilgisayar.nesneSil(bilgisayarNesneIndex);
                                           kullanicikagit2.seviyePuanimiGuncelle();
                                       }

                                       //Puanları yazdır
                                       kullanicikagit2.nesnePuaniGoster();
                                       bilgisayarmakas3.nesnePuaniGoster();

                                       //Ekrana yazdır
                                        //bilgisayar
                                        hamleler[roundSayaci][5]=Integer.toString(bilgisayarmakas3.getDayaniklilik());
                                        hamleler[roundSayaci][6]=Integer.toString(bilgisayarmakas3.getSeviyePuani());

                                        //kullanici
                                        hamleler[roundSayaci][2]=Integer.toString(kullanicikagit2.getDayaniklilik());
                                        hamleler[roundSayaci][3]=Integer.toString(kullanicikagit2.getSeviyePuani());
                                   }
                                   else if("Kağıt3".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                   {
                                       kullanicikagit3.nesnePuaniGoster();
                                       bilgisayarmakas3.nesnePuaniGoster();

                                       nesne_durum2=kullanicikagit3.durumGuncelle(makas_etkisi);

                                       //kullanici için
                                       kagit_etkisi=kullanicikagit3.etkiHesapla("Makas"); 
                                       nesne_durum1=bilgisayarmakas3.durumGuncelle(kagit_etkisi);

                                       //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum2==1)
                                       {
                                           secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                           bilgisayarmakas3.seviyePuanimiGuncelle();
                                       }
                                       //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum1==1)
                                       {
                                           bilgisayar.nesneSil(bilgisayarNesneIndex);
                                           kullanicikagit3.seviyePuanimiGuncelle();
                                       }

                                       //Puanları yazdır
                                       kullanicikagit3.nesnePuaniGoster();
                                       bilgisayarmakas3.nesnePuaniGoster();

                                       //Ekrana yazdır
                                        //bilgisayar
                                        hamleler[roundSayaci][5]=Integer.toString(bilgisayarmakas3.getDayaniklilik());
                                        hamleler[roundSayaci][6]=Integer.toString(bilgisayarmakas3.getSeviyePuani());

                                        //kullanici
                                        hamleler[roundSayaci][2]=Integer.toString(kullanicikagit3.getDayaniklilik());
                                        hamleler[roundSayaci][3]=Integer.toString(kullanicikagit3.getSeviyePuani());
                                   }
                                   else if("Kağıt4".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                   {
                                       kullanicikagit4.nesnePuaniGoster();
                                       bilgisayarmakas3.nesnePuaniGoster();

                                       nesne_durum2=kullanicikagit4.durumGuncelle(makas_etkisi);

                                       //kullanici için
                                       kagit_etkisi=kullanicikagit4.etkiHesapla("Makas"); 
                                       nesne_durum1=bilgisayarmakas3.durumGuncelle(kagit_etkisi);

                                       //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum2==1)
                                       {
                                           secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                           bilgisayarmakas3.seviyePuanimiGuncelle();
                                       }
                                       //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum1==1)
                                       {
                                           bilgisayar.nesneSil(bilgisayarNesneIndex);
                                           kullanicikagit4.seviyePuanimiGuncelle();
                                       }

                                       //Puanları yazdır
                                       kullanicikagit4.nesnePuaniGoster();
                                       bilgisayarmakas3.nesnePuaniGoster();

                                       //Ekrana yazdır
                                        //bilgisayar
                                        hamleler[roundSayaci][5]=Integer.toString(bilgisayarmakas3.getDayaniklilik());
                                        hamleler[roundSayaci][6]=Integer.toString(bilgisayarmakas3.getSeviyePuani());

                                        //kullanici
                                        hamleler[roundSayaci][2]=Integer.toString(kullanicikagit4.getDayaniklilik());
                                        hamleler[roundSayaci][3]=Integer.toString(kullanicikagit4.getSeviyePuani());
                                   }
                                   else if("Kağıt5".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                   {
                                       kullanicikagit5.nesnePuaniGoster();
                                       bilgisayarmakas3.nesnePuaniGoster();

                                       nesne_durum2=kullanicikagit5.durumGuncelle(makas_etkisi);

                                       //kullanici için
                                       kagit_etkisi=kullanicikagit5.etkiHesapla("Makas"); 
                                       nesne_durum1=bilgisayarmakas3.durumGuncelle(kagit_etkisi);

                                       //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum2==1)
                                       {
                                           secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                           bilgisayarmakas3.seviyePuanimiGuncelle();
                                       }
                                       //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum1==1)
                                       {
                                           bilgisayar.nesneSil(bilgisayarNesneIndex);
                                           kullanicikagit5.seviyePuanimiGuncelle();
                                       }

                                       //Puanları yazdır
                                       kullanicikagit5.nesnePuaniGoster();
                                       bilgisayarmakas3.nesnePuaniGoster();

                                       //Ekrana yazdır
                                        //bilgisayar
                                        hamleler[roundSayaci][5]=Integer.toString(bilgisayarmakas3.getDayaniklilik());
                                        hamleler[roundSayaci][6]=Integer.toString(bilgisayarmakas3.getSeviyePuani());

                                        //kullanici
                                        hamleler[roundSayaci][2]=Integer.toString(kullanicikagit5.getDayaniklilik());
                                        hamleler[roundSayaci][3]=Integer.toString(kullanicikagit5.getSeviyePuani());
                                   }

                                }
                                else if("Makas4".equals(bilgisayar.nesneListesiAdresleri.get(bilgisayarNesneIndex)))
                                {
                                /*
                                Makas4 Kağıt1
                                Makas4 Kağıt2
                                Makas4 Kağıt3
                                Makas4 Kağıt4
                                Makas4 Kağıt5
                                */   
                                   makas_etkisi=bilgisayarmakas4.etkiHesapla("Kağıt");   
                                   if("Kağıt1".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                   {
                                       kullanicikagit1.nesnePuaniGoster();
                                       bilgisayarmakas4.nesnePuaniGoster();

                                       nesne_durum2=kullanicikagit1.durumGuncelle(makas_etkisi);

                                       //kullanici için
                                       kagit_etkisi=kullanicikagit1.etkiHesapla("Makas"); 
                                       nesne_durum1=bilgisayarmakas4.durumGuncelle(kagit_etkisi);

                                       //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum2==1)
                                       {
                                           secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                           bilgisayarmakas4.seviyePuanimiGuncelle();
                                       }
                                       //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum1==1)
                                       {
                                           bilgisayar.nesneSil(bilgisayarNesneIndex);
                                           kullanicikagit1.seviyePuanimiGuncelle();
                                       }

                                       //Puanları yazdır
                                       kullanicikagit1.nesnePuaniGoster();
                                       bilgisayarmakas4.nesnePuaniGoster();

                                       //Ekrana yazdır
                                        //bilgisayar
                                        hamleler[roundSayaci][5]=Integer.toString(bilgisayarmakas4.getDayaniklilik());
                                        hamleler[roundSayaci][6]=Integer.toString(bilgisayarmakas4.getSeviyePuani());

                                        //kullanici
                                        hamleler[roundSayaci][2]=Integer.toString(kullanicikagit1.getDayaniklilik());
                                        hamleler[roundSayaci][3]=Integer.toString(kullanicikagit1.getSeviyePuani());
                                   }
                                   else if("Kağıt2".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                   {
                                       kullanicikagit2.nesnePuaniGoster();
                                       bilgisayarmakas4.nesnePuaniGoster();

                                       nesne_durum2=kullanicikagit2.durumGuncelle(makas_etkisi);

                                       //kullanici için
                                       kagit_etkisi=kullanicikagit2.etkiHesapla("Makas"); 
                                       nesne_durum1=bilgisayarmakas4.durumGuncelle(kagit_etkisi);

                                       //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum2==1)
                                       {
                                           secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                           bilgisayarmakas4.seviyePuanimiGuncelle();
                                       }
                                       //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum1==1)
                                       {
                                           bilgisayar.nesneSil(bilgisayarNesneIndex);
                                           kullanicikagit2.seviyePuanimiGuncelle();
                                       }

                                       //Puanları yazdır
                                       kullanicikagit2.nesnePuaniGoster();
                                       bilgisayarmakas4.nesnePuaniGoster();

                                       //Ekrana yazdır
                                        //bilgisayar
                                        hamleler[roundSayaci][5]=Integer.toString(bilgisayarmakas4.getDayaniklilik());
                                        hamleler[roundSayaci][6]=Integer.toString(bilgisayarmakas4.getSeviyePuani());

                                        //kullanici
                                        hamleler[roundSayaci][2]=Integer.toString(kullanicikagit2.getDayaniklilik());
                                        hamleler[roundSayaci][3]=Integer.toString(kullanicikagit2.getSeviyePuani());
                                   }
                                   else if("Kağıt3".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                   {
                                       kullanicikagit3.nesnePuaniGoster();
                                       bilgisayarmakas4.nesnePuaniGoster();

                                       nesne_durum2=kullanicikagit3.durumGuncelle(makas_etkisi);

                                       //kullanici için
                                       kagit_etkisi=kullanicikagit3.etkiHesapla("Makas"); 
                                       nesne_durum1=bilgisayarmakas4.durumGuncelle(kagit_etkisi);

                                       //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum2==1)
                                       {
                                           secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                           bilgisayarmakas4.seviyePuanimiGuncelle();
                                       }
                                       //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum1==1)
                                       {
                                           bilgisayar.nesneSil(bilgisayarNesneIndex);
                                           kullanicikagit3.seviyePuanimiGuncelle();
                                       }

                                       //Puanları yazdır
                                       kullanicikagit3.nesnePuaniGoster();
                                       bilgisayarmakas4.nesnePuaniGoster();

                                       //Ekrana yazdır
                                        //bilgisayar
                                        hamleler[roundSayaci][5]=Integer.toString(bilgisayarmakas4.getDayaniklilik());
                                        hamleler[roundSayaci][6]=Integer.toString(bilgisayarmakas4.getSeviyePuani());

                                        //kullanici
                                        hamleler[roundSayaci][2]=Integer.toString(kullanicikagit3.getDayaniklilik());
                                        hamleler[roundSayaci][3]=Integer.toString(kullanicikagit3.getSeviyePuani());
                                   }
                                   else if("Kağıt4".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                   {
                                       kullanicikagit4.nesnePuaniGoster();
                                       bilgisayarmakas4.nesnePuaniGoster();

                                       nesne_durum2=kullanicikagit4.durumGuncelle(makas_etkisi);

                                       //kullanici için
                                       kagit_etkisi=kullanicikagit4.etkiHesapla("Makas"); 
                                       nesne_durum1=bilgisayarmakas4.durumGuncelle(kagit_etkisi);

                                       //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum2==1)
                                       {
                                           secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                           bilgisayarmakas4.seviyePuanimiGuncelle();
                                       }
                                       //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum1==1)
                                       {
                                           bilgisayar.nesneSil(bilgisayarNesneIndex);
                                           kullanicikagit4.seviyePuanimiGuncelle();
                                       }

                                       //Puanları yazdır
                                       kullanicikagit4.nesnePuaniGoster();
                                       bilgisayarmakas4.nesnePuaniGoster();

                                       //Ekrana yazdır
                                        //bilgisayar
                                        hamleler[roundSayaci][5]=Integer.toString(bilgisayarmakas4.getDayaniklilik());
                                        hamleler[roundSayaci][6]=Integer.toString(bilgisayarmakas4.getSeviyePuani());

                                        //kullanici
                                        hamleler[roundSayaci][2]=Integer.toString(kullanicikagit4.getDayaniklilik());
                                        hamleler[roundSayaci][3]=Integer.toString(kullanicikagit4.getSeviyePuani());
                                   }
                                   else if("Kağıt5".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                   {
                                       kullanicikagit5.nesnePuaniGoster();
                                       bilgisayarmakas4.nesnePuaniGoster();

                                       nesne_durum2=kullanicikagit5.durumGuncelle(makas_etkisi);

                                       //kullanici için
                                       kagit_etkisi=kullanicikagit5.etkiHesapla("Makas"); 
                                       nesne_durum1=bilgisayarmakas4.durumGuncelle(kagit_etkisi);

                                       //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum2==1)
                                       {
                                           secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                           bilgisayarmakas4.seviyePuanimiGuncelle();
                                       }
                                       //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum1==1)
                                       {
                                           bilgisayar.nesneSil(bilgisayarNesneIndex);
                                           kullanicikagit5.seviyePuanimiGuncelle();
                                       }

                                       //Puanları yazdır
                                       kullanicikagit5.nesnePuaniGoster();
                                       bilgisayarmakas4.nesnePuaniGoster();

                                       //Ekrana yazdır
                                        //bilgisayar
                                        hamleler[roundSayaci][5]=Integer.toString(bilgisayarmakas4.getDayaniklilik());
                                        hamleler[roundSayaci][6]=Integer.toString(bilgisayarmakas4.getSeviyePuani());

                                        //kullanici
                                        hamleler[roundSayaci][2]=Integer.toString(kullanicikagit5.getDayaniklilik());
                                        hamleler[roundSayaci][3]=Integer.toString(kullanicikagit5.getSeviyePuani());
                                   }
                                }
                                else if("Makas5".equals(bilgisayar.nesneListesiAdresleri.get(bilgisayarNesneIndex)))
                                {
                                /*
                                Makas5 Kağıt1
                                Makas5 Kağıt2
                                Makas5 Kağıt3
                                Makas5 Kağıt4
                                Makas5 Kağıt5
                                */   
                                   makas_etkisi=bilgisayarmakas5.etkiHesapla("Kağıt");   
                                   if("Kağıt1".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                   {
                                       kullanicikagit1.nesnePuaniGoster();
                                       bilgisayarmakas5.nesnePuaniGoster();

                                       nesne_durum2=kullanicikagit1.durumGuncelle(makas_etkisi);

                                       //kullanici için
                                       kagit_etkisi=kullanicikagit1.etkiHesapla("Makas"); 
                                       nesne_durum1=bilgisayarmakas5.durumGuncelle(kagit_etkisi);

                                       //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum2==1)
                                       {
                                           secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                           bilgisayarmakas5.seviyePuanimiGuncelle();
                                       }
                                       //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum1==1)
                                       {
                                           bilgisayar.nesneSil(bilgisayarNesneIndex);
                                           kullanicikagit1.seviyePuanimiGuncelle();
                                       }

                                       //Puanları yazdır
                                       kullanicikagit1.nesnePuaniGoster();
                                       bilgisayarmakas5.nesnePuaniGoster();

                                       //Ekrana yazdır
                                        //bilgisayar
                                        hamleler[roundSayaci][5]=Integer.toString(bilgisayarmakas5.getDayaniklilik());
                                        hamleler[roundSayaci][6]=Integer.toString(bilgisayarmakas5.getSeviyePuani());

                                        //kullanici
                                        hamleler[roundSayaci][2]=Integer.toString(kullanicikagit1.getDayaniklilik());
                                        hamleler[roundSayaci][3]=Integer.toString(kullanicikagit1.getSeviyePuani());
                                   }
                                   else if("Kağıt2".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                   {
                                       kullanicikagit2.nesnePuaniGoster();
                                       bilgisayarmakas5.nesnePuaniGoster();

                                       nesne_durum2=kullanicikagit2.durumGuncelle(makas_etkisi);

                                       //kullanici için
                                       kagit_etkisi=kullanicikagit2.etkiHesapla("Makas"); 
                                       nesne_durum1=bilgisayarmakas5.durumGuncelle(kagit_etkisi);

                                       //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum2==1)
                                       {
                                           secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                           bilgisayarmakas5.seviyePuanimiGuncelle();
                                       }
                                       //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum1==1)
                                       {
                                           bilgisayar.nesneSil(bilgisayarNesneIndex);
                                           kullanicikagit2.seviyePuanimiGuncelle();
                                       }

                                       //Puanları yazdır
                                       kullanicikagit2.nesnePuaniGoster();
                                       bilgisayarmakas5.nesnePuaniGoster();

                                       //Ekrana yazdır
                                        //bilgisayar
                                        hamleler[roundSayaci][5]=Integer.toString(bilgisayarmakas5.getDayaniklilik());
                                        hamleler[roundSayaci][6]=Integer.toString(bilgisayarmakas5.getSeviyePuani());

                                        //kullanici
                                        hamleler[roundSayaci][2]=Integer.toString(kullanicikagit2.getDayaniklilik());
                                        hamleler[roundSayaci][3]=Integer.toString(kullanicikagit2.getSeviyePuani());
                                   }
                                   else if("Kağıt3".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                   {
                                       kullanicikagit3.nesnePuaniGoster();
                                       bilgisayarmakas5.nesnePuaniGoster();

                                       nesne_durum2=kullanicikagit3.durumGuncelle(makas_etkisi);

                                       //kullanici için
                                       kagit_etkisi=kullanicikagit3.etkiHesapla("Makas"); 
                                       nesne_durum1=bilgisayarmakas5.durumGuncelle(kagit_etkisi);

                                       //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum2==1)
                                       {
                                           secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                           bilgisayarmakas5.seviyePuanimiGuncelle();
                                       }
                                       //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum1==1)
                                       {
                                           bilgisayar.nesneSil(bilgisayarNesneIndex);
                                           kullanicikagit3.seviyePuanimiGuncelle();
                                       }

                                       //Puanları yazdır
                                       kullanicikagit3.nesnePuaniGoster();
                                       bilgisayarmakas5.nesnePuaniGoster();

                                       //Ekrana yazdır
                                        //bilgisayar
                                        hamleler[roundSayaci][5]=Integer.toString(bilgisayarmakas5.getDayaniklilik());
                                        hamleler[roundSayaci][6]=Integer.toString(bilgisayarmakas5.getSeviyePuani());

                                        //kullanici
                                        hamleler[roundSayaci][2]=Integer.toString(kullanicikagit3.getDayaniklilik());
                                        hamleler[roundSayaci][3]=Integer.toString(kullanicikagit3.getSeviyePuani());
                                   }
                                   else if("Kağıt4".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                   {
                                       kullanicikagit4.nesnePuaniGoster();
                                       bilgisayarmakas5.nesnePuaniGoster();

                                       nesne_durum2=kullanicikagit4.durumGuncelle(makas_etkisi);

                                       //kullanici için
                                       kagit_etkisi=kullanicikagit4.etkiHesapla("Makas"); 
                                       nesne_durum1=bilgisayarmakas5.durumGuncelle(kagit_etkisi);

                                       //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum2==1)
                                       {
                                           secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                           bilgisayarmakas5.seviyePuanimiGuncelle();
                                       }
                                       //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum1==1)
                                       {
                                           bilgisayar.nesneSil(bilgisayarNesneIndex);
                                           kullanicikagit4.seviyePuanimiGuncelle();
                                       }

                                       //Puanları yazdır
                                       kullanicikagit4.nesnePuaniGoster();
                                       bilgisayarmakas5.nesnePuaniGoster();

                                       //Ekrana yazdır
                                        //bilgisayar
                                        hamleler[roundSayaci][5]=Integer.toString(bilgisayarmakas5.getDayaniklilik());
                                        hamleler[roundSayaci][6]=Integer.toString(bilgisayarmakas5.getSeviyePuani());

                                        //kullanici
                                        hamleler[roundSayaci][2]=Integer.toString(kullanicikagit4.getDayaniklilik());
                                        hamleler[roundSayaci][3]=Integer.toString(kullanicikagit4.getSeviyePuani());
                                   }
                                   else if("Kağıt5".equals(secilenNesnelerAdresleri.get(kullaniciNesneIndex)))
                                   {
                                       kullanicikagit5.nesnePuaniGoster();
                                       bilgisayarmakas5.nesnePuaniGoster();

                                       nesne_durum2=kullanicikagit5.durumGuncelle(makas_etkisi);

                                       //kullanici için
                                       kagit_etkisi=kullanicikagit5.etkiHesapla("Makas"); 
                                       nesne_durum1=bilgisayarmakas5.durumGuncelle(kagit_etkisi);

                                       //Eğer bilgisayar in nesnesi kullanici nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum2==1)
                                       {
                                           bilgisayarmakas5.seviyePuanimiGuncelle();
                                           secilenNesnelerNedenSilindi.set(kullaniciNesneIndex, "Silindi");
                                       }
                                       //Eğer kullanici in nesnesi bilgisayar nin nesnesinin dayanıklılığının 0 ın altına indirdiyse
                                       if(nesne_durum1==1)
                                       {
                                           bilgisayar.nesneSil(bilgisayarNesneIndex);
                                           kullanicikagit5.seviyePuanimiGuncelle();
                                       }

                                       //Puanları yazdır
                                       kullanicikagit5.nesnePuaniGoster();
                                       bilgisayarmakas5.nesnePuaniGoster();

                                       //Ekrana yazdır
                                        //bilgisayar
                                        hamleler[roundSayaci][5]=Integer.toString(bilgisayarmakas5.getDayaniklilik());
                                        hamleler[roundSayaci][6]=Integer.toString(bilgisayarmakas5.getSeviyePuani());

                                        //kullanici
                                        hamleler[roundSayaci][2]=Integer.toString(kullanicikagit5.getDayaniklilik());
                                        hamleler[roundSayaci][3]=Integer.toString(kullanicikagit5.getSeviyePuani());
                                   }
                                }



                            }  
                       }
                        System.out.println("\n"); 

  
                        
                        //bilgisayarın eleman var mı
                        if(bilgisayar.nesneListesi.isEmpty())
                        {
                            System.out.println("Bilgisayarın elemanları bitti. "+oyuncuAdi+" kazandı.");
                            sonucMetni="Bilgisayarın elemanları bitti. "+oyuncuAdi+" kazandı.";
                            oyuncularinElindekiNesnelerBittimi=1;
                            break;
                        }
                        //kullanıcının eleman var mı
                        if(secilenNesnelerAsil.isEmpty())
                        {
                            System.out.println(oyuncuAdi+" nin elemanları bitti. Bilgisayar kazandı.");
                            sonucMetni=oyuncuAdi+" nin elemanları bitti. Bilgisayar kazandı.";
                            oyuncularinElindekiNesnelerBittimi=1;
                            break;
                        }
                            
                        panel.add(oyuncuadiLabel);

                        if(roundSayaci>4)
                        {
                            list.removeAll();
                            for(int y=0;y<secilenNesnelerNedenSilindi.size();y++)
                            {
                                if("Silindi".equals(secilenNesnelerNedenSilindi.get(y)))
                                {
                                    secilenNesnelerAsil.remove(y);
                                    secilenNesnelerAdresleri.remove(y);
                                    secilenNesnelerNedenSilindi.remove(y);
                                }
                            }
                        }
                        if(roundSayaci<4)
                        {
                         //Comboboxı güncelle
                         list.removeAll();
                         for(int k=0;k<secilenNesnelerAsil.size();k++)
                         {
                             if(kullaniciNesneIndex==k && !("Silindi".equals(secilenNesnelerNedenSilindi.get(k))))
                             {
                                 secilenNesnelerNedenSilindi.set(k,"Erişilemez");
                             }
                             else if(!"Erişilemez".equals(secilenNesnelerNedenSilindi.get(k)) && !"Silindi".equals(secilenNesnelerNedenSilindi.get(k)) && kullaniciNesneIndex !=k)
                             {
                                 secilenNesnelerNedenSilindi.set(k, secilenNesnelerAsil.get(k));
                             }
                         }
                        }
                        
                        if(roundSayaci==4)//5. hamlede
                        {
                            list.removeAll();
                            for(int y=0;y<secilenNesnelerNedenSilindi.size();y++)
                            {
                                if("Erişilemez".equals(secilenNesnelerNedenSilindi.get(y)))
                                {
                                    secilenNesnelerNedenSilindi.set(y, secilenNesnelerAsil.get(y));
                                }
                            }
                            for(int y=0;y<secilenNesnelerNedenSilindi.size();y++)
                            {
                                if("Silindi".equals(secilenNesnelerNedenSilindi.get(y)))
                                {
                                    secilenNesnelerAsil.remove(y);
                                    secilenNesnelerAdresleri.remove(y);
                                    secilenNesnelerNedenSilindi.remove(y);
                                }
                            }                            
                        }
                        
                        if(roundSayaci==4)//5. hamlede
                        {
                            while(secilenNesnelerNedenSilindi.contains("Silindi"))
                            {
                                list.removeAll();
                                for(int y=0;y<secilenNesnelerNedenSilindi.size();y++)
                                {
                                    if("Erişilemez".equals(secilenNesnelerNedenSilindi.get(y)))
                                    {
                                        secilenNesnelerNedenSilindi.set(y, secilenNesnelerAsil.get(y));
                                    }
                                }
                                for(int y=0;y<secilenNesnelerNedenSilindi.size();y++)
                                {
                                    if("Silindi".equals(secilenNesnelerNedenSilindi.get(y)))
                                    {
                                        secilenNesnelerAsil.remove(y);
                                        secilenNesnelerAdresleri.remove(y);
                                        secilenNesnelerNedenSilindi.remove(y);
                                    }
                                }                            
                                }
                            }
                                                
                        //bilgisayarın eleman var mı
                        if(bilgisayar.nesneListesi.isEmpty())
                        {
                            System.out.println("Bilgisayarın elemanları bitti. "+oyuncuAdi+" kazandı.");
                            sonucMetni="Bilgisayarın elemanları bitti. "+oyuncuAdi+" kazandı.";
                            oyuncularinElindekiNesnelerBittimi=1;
                            break;
                        }
                        //kullanıcının eleman var mı
                        if(secilenNesnelerAsil.isEmpty())
                        {
                            System.out.println(oyuncuAdi+" nin elemanları bitti. Bilgisayar kazandı.");
                            sonucMetni=oyuncuAdi+" nin elemanları bitti. Bilgisayar kazandı.";
                            oyuncularinElindekiNesnelerBittimi=1;
                            break;
                        }
                        
                        if(roundSayaci==9)
                        {
                            //Bilgisayar in elindeki nesnelerin toplam dayanıklılıkları
                            int bilgisayarSkor=0;
                            for(int n=0;n<bilgisayar.nesneListesiAdresleri.size();n++)
                            {
                                if("Taş1".equals(bilgisayar.nesneListesiAdresleri.get(n)))
                                {
                                    bilgisayarSkor += bilgisayartas1.getDayaniklilik();
                                }
                                if("Taş2".equals(bilgisayar.nesneListesiAdresleri.get(n)))
                                {
                                    bilgisayarSkor += bilgisayartas2.getDayaniklilik();
                                }
                                if("Taş3".equals(bilgisayar.nesneListesiAdresleri.get(n)))
                                {
                                    bilgisayarSkor += bilgisayartas3.getDayaniklilik();
                                }
                                if("Taş4".equals(bilgisayar.nesneListesiAdresleri.get(n)))
                                {
                                    bilgisayarSkor += bilgisayartas4.getDayaniklilik();
                                }
                                if("Taş5".equals(bilgisayar.nesneListesiAdresleri.get(n)))
                                {
                                    bilgisayarSkor += bilgisayartas5.getDayaniklilik();
                                }
                                if("Kağıt1".equals(bilgisayar.nesneListesiAdresleri.get(n)))
                                {
                                    bilgisayarSkor += bilgisayarkagit1.getDayaniklilik();
                                }
                                if("Kağıt2".equals(bilgisayar.nesneListesiAdresleri.get(n)))
                                {
                                    bilgisayarSkor += bilgisayarkagit2.getDayaniklilik();
                                }
                                if("Kağıt3".equals(bilgisayar.nesneListesiAdresleri.get(n)))
                                {
                                    bilgisayarSkor += bilgisayarkagit3.getDayaniklilik();
                                }
                                if("Kağıt4".equals(bilgisayar.nesneListesiAdresleri.get(n)))
                                {
                                    bilgisayarSkor += bilgisayarkagit4.getDayaniklilik();
                                }
                                if("Kağıt5".equals(bilgisayar.nesneListesiAdresleri.get(n)))
                                {
                                    bilgisayarSkor += bilgisayarkagit5.getDayaniklilik();
                                }
                                if("Makas1".equals(bilgisayar.nesneListesiAdresleri.get(n)))
                                {
                                    bilgisayarSkor += bilgisayarmakas1.getDayaniklilik();
                                }
                                if("Makas2".equals(bilgisayar.nesneListesiAdresleri.get(n)))
                                {
                                    bilgisayarSkor += bilgisayarmakas2.getDayaniklilik();
                                }
                                if("Makas3".equals(bilgisayar.nesneListesiAdresleri.get(n)))
                                {
                                    bilgisayarSkor += bilgisayarmakas3.getDayaniklilik();
                                }
                                if("Makas4".equals(bilgisayar.nesneListesiAdresleri.get(n)))
                                {
                                    bilgisayarSkor += bilgisayarmakas4.getDayaniklilik();
                                }
                                if("Makas5".equals(bilgisayar.nesneListesiAdresleri.get(n)))
                                {
                                    bilgisayarSkor += bilgisayarmakas5.getDayaniklilik();
                                }
                            }

                            //Kullanıcının in elindeki nesnelerin toplam dayanıklılıkları
                            int kullaniciSkor=0;
                            for(int n=0;n<secilenNesnelerAdresleri.size();n++)
                            {
                                if("Taş1".equals(secilenNesnelerAdresleri.get(n)))
                                {
                                    kullaniciSkor += kullanicitas1.getDayaniklilik();
                                }
                                if("Taş2".equals(secilenNesnelerAdresleri.get(n)))
                                {
                                    kullaniciSkor += kullanicitas2.getDayaniklilik();
                                }
                                if("Taş3".equals(secilenNesnelerAdresleri.get(n)))
                                {
                                    kullaniciSkor += kullanicitas3.getDayaniklilik();
                                }
                                if("Taş4".equals(secilenNesnelerAdresleri.get(n)))
                                {
                                    kullaniciSkor += kullanicitas4.getDayaniklilik();
                                }
                                if("Taş5".equals(secilenNesnelerAdresleri.get(n)))
                                {
                                    kullaniciSkor += kullanicitas5.getDayaniklilik();
                                }
                                if("Kağıt1".equals(secilenNesnelerAdresleri.get(n)))
                                {
                                    kullaniciSkor += kullanicikagit1.getDayaniklilik();
                                }
                                if("Kağıt2".equals(secilenNesnelerAdresleri.get(n)))
                                {
                                    kullaniciSkor += kullanicikagit2.getDayaniklilik();
                                }
                                if("Kağıt3".equals(secilenNesnelerAdresleri.get(n)))
                                {
                                    kullaniciSkor += kullanicikagit3.getDayaniklilik();
                                }
                                if("Kağıt4".equals(secilenNesnelerAdresleri.get(n)))
                                {
                                    kullaniciSkor += kullanicikagit4.getDayaniklilik();
                                }
                                if("Kağıt5".equals(secilenNesnelerAdresleri.get(n)))
                                {
                                    kullaniciSkor += kullanicikagit5.getDayaniklilik();
                                }
                                if("Makas1".equals(secilenNesnelerAdresleri.get(n)))
                                {
                                    kullaniciSkor += kullanicimakas1.getDayaniklilik();
                                }
                                if("Makas2".equals(secilenNesnelerAdresleri.get(n)))
                                {
                                    kullaniciSkor += kullanicimakas2.getDayaniklilik();
                                }
                                if("Makas3".equals(secilenNesnelerAdresleri.get(n)))
                                {
                                    kullaniciSkor += kullanicimakas3.getDayaniklilik();
                                }
                                if("Makas4".equals(secilenNesnelerAdresleri.get(n)))
                                {
                                    kullaniciSkor += kullanicimakas4.getDayaniklilik();
                                }
                                if("Makas5".equals(secilenNesnelerAdresleri.get(n)))
                                {
                                    kullaniciSkor += kullanicimakas5.getDayaniklilik();
                                }
                            }

                            System.out.println("10 Hamle yapıldı");
                            if(bilgisayarSkor>kullaniciSkor)
                            {
                                System.out.println("10 hamle yapıldı. Bilgisayar Skor: "+bilgisayarSkor+" | "+oyuncuAdi+" Skor: "+kullaniciSkor+" | Kazanan Bilgisayar");
                                sonucMetni="10 hamle yapıldı. Bilgisayar Skor: "+bilgisayarSkor+" | "+oyuncuAdi+" Skor: "+kullaniciSkor+" | Kazanan Bilgisayar";
                            }
                            else
                            {
                                System.out.println("10 hamle yapıldı. Bilgisayar Skor: "+bilgisayarSkor+" | Kullanıcı Skor: "+kullaniciSkor+" | Kazanan "+oyuncuAdi);
                                sonucMetni="10 hamle yapıldı. Bilgisayar skor: "+bilgisayarSkor+" | Kullanıcı Skor: "+kullaniciSkor+" | Kazanan "+oyuncuAdi;
                            }

                            oyunKazananLabel.setText(sonucMetni);
                            btn.setEnabled(false);
                        }

                        panel.add(list);
                        panel.add(btn);
                        panel.add(sp);
                        panel.add(bilgisayarYazisiLabel);
                        bilgisayarNesneLabel.setText(bilgisayarNesneLabelText);
                        panel.add(bilgisayarNesneLabel);
                        panel.add(sonucLabel);
                        panel.add(aciklamaLabel);
                        panel.add(oyunKazananLabel);
                        roundSayaci++;


                        System.out.print(oyuncuAdi+": ");
                        for(int n=0;n<secilenNesnelerAsil.size();n++)
                        {
                            System.out.print(secilenNesnelerAsil.get(n)+",");
                        }
                        System.out.println("\n");
                        System.out.print(oyuncuAdi+": ");
                        for(int n=0;n<secilenNesnelerNedenSilindi.size();n++)
                        {
                            System.out.print(secilenNesnelerNedenSilindi.get(n)+",");
                        }
                        System.out.println("\n");


                        //1 kere dön ve çık, devam et dediğinde tekar gir
                        break;


                    }
                    if(oyuncularinElindekiNesnelerBittimi==1)
                    {
                        oyunKazananLabel.setText(sonucMetni);
                        panel.add(list);
                        panel.add(btn);
                        panel.add(sp);
                        panel.add(bilgisayarYazisiLabel);
                        bilgisayarNesneLabel.setText(bilgisayarNesneLabelText);
                        panel.add(bilgisayarNesneLabel);
                        panel.add(sonucLabel);
                        panel.add(aciklamaLabel);
                        panel.add(oyunKazananLabel);
                    }
                                    
                }
                
                btn.setEnabled(true);
            }
        });

       panel.add(oyuncuadiLabel);
       panel.add(list);
       panel.add(btn);
       panel.add(sp);
       panel.add(bilgisayarYazisiLabel);
       panel.add(bilgisayarNesneLabel);
       panel.add(sonucLabel);
       panel.add(aciklamaLabel);
       frame.add(panel);
       frame.setSize(800,600);
       frame.setVisible(true);

    }


}
