/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.crono;

import javax.swing.JFrame;

/**
 *
 * @author juliotobar
 */
public class Crono  extends JFrame{

    
    private void CargarVentana(){
        this.setTitle("Cronometro:");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           Ventana VentanaCrono=new Ventana();
           this.getContentPane().add(VentanaCrono);
           pack();
           setLocationRelativeTo(null);
           setVisible(true);
      
       
    }  
    
    
    
    public static void main(String[] args) {
        new Crono().CargarVentana();
        
        
    }


}
