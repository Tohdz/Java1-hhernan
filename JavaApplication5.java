/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication5;

import javax.swing.JOptionPane;

/**
 *
 * @author hhern
 */
public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    String num1,num2,num3,num4;
    num1=JOptionPane.showInputDialog("Ingrese un numero: ");
    num2=JOptionPane.showInputDialog("Ingrese un numero: ");
    num3=JOptionPane.showInputDialog("Ingrese un numero: ");
    num4=JOptionPane.showInputDialog("Ingrese un numero: ");
    Integer num1D,num2D,num3D,num4D;
    num1D=Integer.parseInt(num1);
    num2D=Integer.parseInt(num2);
    num3D=Integer.parseInt(num3);
    num4D=Integer.parseInt(num4);
    Integer ope;
    ope=(num1D+num2D+num3D+num4D)/4;
    JOptionPane.showMessageDialog(null,"El resultado es:"+ope);
    }
    
}
