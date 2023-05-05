
//EduardoSalamonSchimmel//
package com.mycompany.exercicio2;

import javax.swing.JOptionPane;


public class Exercicio2 {

    public static void main(String[] args) {
        int numero1, numero2, numero3, media;
        numero1= Integer.parseInt(JOptionPane.showInputDialog("Qual numero 1"));
        numero2= Integer.parseInt(JOptionPane.showInputDialog("Qual numero 2"));
        numero3= Integer.parseInt(JOptionPane.showInputDialog("Qual numero 3"));
        
                media= (numero1 + numero2 +numero3) / 3 ;
        JOptionPane.showMessageDialog(null, media );
    }
}
