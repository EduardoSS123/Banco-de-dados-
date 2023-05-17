

package com.mycompany.parimpar;

import javax.swing.JOptionPane;


public class Parimpar {

    public static void main(String[] args) {
    
    int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero."));
    
    
        JOptionPane.showMessageDialog(null, (numero %2 == 0)? "Este numero é par": "Este numero é impar" );
    

        
   
    
    }
}
