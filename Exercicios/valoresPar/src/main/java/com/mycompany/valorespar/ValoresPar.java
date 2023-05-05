
package com.mycompany.valorespar;

import javax.swing.JOptionPane;


public class ValoresPar {

    public static void main(String[] args) {
       int v1, v2, v3, v4;
       
       v1  = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero"));
       v2  = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero"));
       v3  = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro numero"));
       v4  = Integer.parseInt(JOptionPane.showInputDialog("Digite o quarto numero"));
       
       
       if(v1 % 2 == 0 ){
           JOptionPane.showMessageDialog(null, v1 + "é divisivel por 2.");
       }
    
    if(v2 % 2 == 0 ){
           JOptionPane.showMessageDialog(null, v2 + "é divisivel por 2.");
       }
    if(v3 % 2 == 0 ){
           JOptionPane.showMessageDialog(null, v3 + "é divisivel por 2.");
       }
    if(v4 % 2 == 0 ){
           JOptionPane.showMessageDialog(null, v4 + "é divisivel por 2.");
       }
    
    
    }
}
