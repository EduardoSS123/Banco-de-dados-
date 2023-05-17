
package com.mycompany.tarefa;

import javax.swing.JOptionPane;


public class Tarefa {

    public static void main(String[] args) {
        float peso, altura;
       peso = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do seu peso"));
       altura = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do sua altura"));
       double imc = peso / (altura * altura);
       
       JOptionPane.showMessageDialog(null,imc);
       
    }
}
