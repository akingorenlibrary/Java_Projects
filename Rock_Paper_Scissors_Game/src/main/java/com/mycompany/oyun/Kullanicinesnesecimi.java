/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oyun;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Unknow
 */
public class Kullanicinesnesecimi {
   public DefaultListModel<String> secilenNesneler = new DefaultListModel<>();
   public static String oyuncuAdi;

   public void kullanicinesnesecimifonksiyonu()
   {
      JFrame frame2=new JFrame("Nesne Seçimi");
      JPanel mainPanel = new JPanel(); // main panel
      mainPanel.setLayout(new GridLayout(2, 3));
      JList<String> list = new JList<>(secilenNesneler);    
      
      JButton tasBtn=new JButton(new ImageIcon("src/img/tas.png"));    
      JButton kagitBtn=new JButton(new ImageIcon("src/img/kagit.jpg"));
      JButton makasBtn=new JButton(new ImageIcon("src/img/makas.png"));
      JButton silBtn=new JButton("Sil");
      JButton kaydetBtn=new JButton("Kaydet");
      
      tasBtn.addActionListener(new ActionListener(){
          @Override
          public void actionPerformed(ActionEvent e) {
              if(secilenNesneler.size()<5)
              secilenNesneler.addElement("Taş");
          }
          
      });
      
      kagitBtn.addActionListener(new ActionListener(){
          @Override
          public void actionPerformed(ActionEvent e) {
              if(secilenNesneler.size()<5)
             secilenNesneler.addElement("Kağıt"); 
          }
          
      });
     
      makasBtn.addActionListener(new ActionListener(){
          @Override
          public void actionPerformed(ActionEvent e) {
              if(secilenNesneler.size()<5)
              secilenNesneler.addElement("Makas");
          }
          
      });
        
      silBtn.addActionListener(new ActionListener(){
          @Override
          public void actionPerformed(ActionEvent e) {
              secilenNesneler.clear();
          }
          
      });
      
      kaydetBtn.addActionListener(new ActionListener(){
          @Override
          public void actionPerformed(ActionEvent e) {
              if(secilenNesneler.size()<5)
              {
                  JOptionPane.showMessageDialog(frame2, "Lütfen 5 nense seçiniz.");
              }
              else
              {
                  while(true)
                  {
                      //Frame i kapatalım
                      frame2.dispose();
                      
                      
                      //Oyuncunu adını allalım
                      oyuncuAdi = (String)JOptionPane.showInputDialog(
                      frame2,
                      "Adınızı girin", 
                      "Kullanıcı - Bilgisayar",            
                      JOptionPane.PLAIN_MESSAGE,
                      null,            
                      null, 
                     null
                      );

                      if(!(oyuncuAdi != null && oyuncuAdi.length() > 0)){
                          JOptionPane.showMessageDialog(frame2, "Lütfen isimizi giriniz.");
                      }
                      else
                      {
                          Kullanicivspc klpc=new Kullanicivspc();
                          klpc.kullaniciwarpc(secilenNesneler);
                          break;
                      }

                  }
              }
              
          }
          
      });
      
      mainPanel.add(tasBtn);
      mainPanel.add(kagitBtn);
      mainPanel.add(makasBtn);
      mainPanel.add(silBtn);
      mainPanel.add(list);
      mainPanel.add(kaydetBtn);
      frame2.add(mainPanel);
      frame2.setSize(400, 300);
      frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame2.setLocationRelativeTo(null);
      frame2.setVisible(true);
   }
}
