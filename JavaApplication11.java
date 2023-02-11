/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication11;

import javax.swing.JOptionPane;

/**
 *
 * @author hhern
 */
public class JavaApplication11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    boolean control;
    control=true;
        while (control==true) { 
            String opcion;
            opcion=JOptionPane.showInputDialog("Bienvenido a la calculadora v1"+"\n"+"1-Sumar"+"\n"+"2-Restar"+"\n"+"3-Multiplicar"+"\n"+"4-Dividir"+"\n"+"5-Salir");
            Integer opcionI;
            opcionI=Integer.parseInt(opcion);
            switch (opcionI) {
                case 1:
                    String num1,num2;
                    num1=JOptionPane.showInputDialog("Inserte el primer numero:");
                    Double num1D;
                    num1D=Double.parseDouble(num1);
                    num2=JOptionPane.showInputDialog("Inserte el segundo numero:");
                    Double num2D;
                    num2D=Double.parseDouble(num2);
                    JOptionPane.showMessageDialog(null, "El resultado es:"+(num1D+num2D));
                    break;
                case 2:
                    String num3,num4;
                    num3=JOptionPane.showInputDialog("Inserte el primer numero:");
                    Double num3D;
                    num3D=Double.parseDouble(num3);
                    num4=JOptionPane.showInputDialog("Inserte el segundo numero:");
                    Double num4D;
                    num4D=Double.parseDouble(num4);
                    JOptionPane.showMessageDialog(null, "El resultado es:"+(num3D-num4D));
                    break;
                case 3:
                    String num5,num6;
                    num5=JOptionPane.showInputDialog("Inserte el primer numero:");
                    Double num5D;
                    num5D=Double.parseDouble(num5);
                    num6=JOptionPane.showInputDialog("Inserte el segundo numero:");
                    Double num6D;
                    num6D=Double.parseDouble(num6);
                    JOptionPane.showMessageDialog(null, "El resultado es:"+(num5D*num6D));
                    break;
                case 4:
                    String num7,num8;
                    num7=JOptionPane.showInputDialog("Inserte el primer numero:");
                    Double num7D;
                    num7D=Double.parseDouble(num7);
                    num8=JOptionPane.showInputDialog("Inserte el segundo numero:");
                    Double num8D;
                    num8D=Double.parseDouble(num8);
                    if (num8D==0) {
                        JOptionPane.showMessageDialog(null, "Sintax Error");
                        break;
                    }
                    JOptionPane.showMessageDialog(null, "El resultado es:"+(num7D/num8D));
                    break;
                case 5:
                    control=false;
                    
        }
    
        }
    
    }
    
}
