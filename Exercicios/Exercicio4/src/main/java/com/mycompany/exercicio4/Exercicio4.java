//EduardoSalamonSchimmel//
package com.mycompany.exercicio4;

import javax.swing.JOptionPane;


public class Exercicio4 {

    public static void main(String[] args) {
        int numero1, porcentagem;
        numero1= Integer.parseInt(JOptionPane.showInputDialog("Qual numero 1"));
        
        porcentagem= numero1 - (numero1 * 10 /100);
        
                
        JOptionPane.showMessageDialog(null, porcentagem );
    }
}



   