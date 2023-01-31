/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;

import javax.swing.JOptionPane;

/**
 *
 * @author hhern
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    String edad;
    edad=JOptionPane.showInputDialog("Digite su edad: ");
    Double edadD;
    edadD=Double.parseDouble(edad);
    JOptionPane.showMessageDialog(null,"Dentro de 5 años tendra: "+(edadD+5));
    }
    
}
