
package com.mycompany.exercicionumero1;

import javax.swing.JOptionPane;


public class Exercicionumero1 {

    public static void main(String[] args) {
      int  v1;
     v1 = Integer.parseInt(JOptionPane.showInputDialog("digite um valor"));
     
     if (v1 <=9 ) {
         JOptionPane.showMessageDialog(null, v1 + "O valor está na faixa permitida");
     
     } else{
    JOptionPane.showMessageDialog(null, v1 + "O valor não está na faixa permitida");
     }
    }
}
