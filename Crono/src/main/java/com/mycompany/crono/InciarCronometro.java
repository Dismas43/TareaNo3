/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.crono;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author juliotobar
 */
public class InciarCronometro extends Thread{
    JLabel ti;
    public InciarCronometro (JLabel Tiempo)
    
    {
    ti=Tiempo;
    }

    public InciarCronometro() {
    }
    
    
    public void run(){
        try {
    int x=0;
    while( Ventana.InciarHilos==true){
      
            Thread.sleep(1000);
       System.out.println(x+"-"+Thread.currentThread().getName());
            ejecutarCrono(x);     
       x++;
     
    }
     }
      catch (InterruptedException ex) {
            Logger.getLogger(InciarCronometro.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    }

    private void ejecutarCrono(int x) {
        Ventana.segundos++;
        if(Ventana.segundos>59){
        Ventana.segundos=0;
         Ventana.minutos++;
        
        }
        
        String seg="";
        String min="";
       seg+=Ventana.segundos;
       min+=Ventana.minutos;
       String reloj= min+": "+seg;
        ti.setText(reloj);
    }

  
}
