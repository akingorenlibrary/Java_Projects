/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.oyun;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Unknow
 */
public class Oyun {

    public static void main(String[] args) {
        JFrame frame=new JFrame("Oyun");
        JPanel panel=new JPanel();
        panel.setLayout(new FlowLayout());
       
        JButton btn1=new JButton(new ImageIcon("src/img/pcvspc.png"));    
        JButton btn2=new JButton(new ImageIcon("src/img/humanvspc.png"));
        
        btn1.setBackground(Color.GRAY);
        btn2.setBackground(Color.GRAY);
        
        btn1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
                Pcvspc pcvspcframe=new Pcvspc();
                pcvspcframe.pcwarpc();
            }
        });
        
        btn2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
                Kullanicinesnesecimi kl=new Kullanicinesnesecimi();
                kl.kullanicinesnesecimifonksiyonu();
            }
        });
        
        panel.add(btn1);
        panel.add(btn2);
        frame.add(panel);
        frame.setSize(800,600);
        frame.setVisible(true);
    }

}

