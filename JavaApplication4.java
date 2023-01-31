/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication4;

import javax.swing.JOptionPane;

/**
 *
 * @author hhern
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    String nombre, salario;
    nombre=JOptionPane.showInputDialog("Ingrese su nombre: ");
    salario=JOptionPane.showInputDialog("Ingrese su salario semanal: ");
    Double salarioD;
    salarioD=Double.parseDouble(salario);
    Double bruto;
    bruto=salarioD*4;
    Double deducciones;
    deducciones=bruto*0.0934;
    Double neto;
    neto=bruto-deducciones;
    JOptionPane.showMessageDialog(null,"Estimado,"+nombre+" el salario de este mes se desglosa de la siguiente manera:"+" Salario bruto: "+bruto+" Deducciones: "+deducciones+" Salario neto: "+neto);
    
            
    
         
    
    
    }
    
}
