//EduardoSalamon//
package com.mycompany.exercicios;

import javax.swing.JOptionPane;



public class Exercicios {

    public static void main(String[] args) {
        int numero1, numero2, soma;
    numero1 = Integer.parseInt(JOptionPane.showInputDialog("Qual o primeiro numero"));
    numero2= Integer.parseInt(JOptionPane.showInputDialog("Qual o segundo numero"));
    
    soma = numero1 - numero2;
    JOptionPane.showMessageDialog(null, soma);
    }
}
