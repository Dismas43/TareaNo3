/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.crono;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
/**
 *
 * @author juliotobar
 */
public class Ventana extends JPanel implements ActionListener {
    
     private JLabel Tiempo;
     private JButton iniciar;
        
          int contador=0;
   static int minutos,segundos;
   static boolean InciarHilos=true;
     boolean Corriendo=false;
   
     public Ventana(){
    setBackground(Color.blue);
    this.setSize(200, 200);
    
     Tiempo=new JLabel("00:00");
     Tiempo.setFont(new Font("New Roman",Font.PLAIN,30));
    Tiempo.setBounds(60, 60, 137, 45);
    this.add(Tiempo);
    
    
    iniciar=new JButton("Iniciar");
    iniciar.setBounds(119, 54, 89, 23);
     iniciar.addActionListener(this);
     add(iniciar);
     
    /*    Parar=new JButton("Parar");
    Parar.setBounds(119, 54, 89, 23);
     Parar.addActionListener(this);
     add(Parar);*/
     
  
     
     
     
     }

    @Override
    public void actionPerformed(ActionEvent e) {
      
      
        if (contador==0){
    if(e.getSource()==iniciar){
        if(Corriendo==false){
        InciarHilos=true;
        Corriendo=true;
        
            contador++;
            IniciarHiloCronometro();
        }
        
    }
        }
        else {
          InciarCronometro Cronos= new InciarCronometro();
         Cronos.stop();
        Corriendo=false;
    InciarHilos=false;
      
    contador=0;
        }
 /*   if(e.getSource()==Parar){
    Corriendo=false;
    InciarHilos=false;
 

    }*/
    }

    public void IniciarHiloCronometro() {
       
       
          InciarCronometro Cronos= new InciarCronometro(Tiempo);
         Cronos.start();
        
    } 
}
