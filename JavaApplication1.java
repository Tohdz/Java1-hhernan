/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

import javax.swing.JOptionPane;

/**
 *
 * @author hhern
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre;
        String saludo; 
//        nombre="daniel";
//        saludo="Hola mundo";
//        System.out.println(saludo+" "+nombre);
//        JOptionPane.showMessageDialog(null,saludo);
//          nombre=JOptionPane.showInputDialog("Ingrese nombre");
//          saludo=JOptionPane.showInputDialog("Ingrese saludo");
//          JOptionPane.showMessageDialog(null, saludo+""+nombre);
//          String inputPrecio;
//          inputPrecio=JOptionPane.showInputDialog("Ingrese Precio");
//          Double precio;
//          precio=Double.parseDouble(inputPrecio);
//          Double totalIVA;
//          totalIVA=precio*0.13;
//           JOptionPane.showMessageDialog(null, "total IVA"+totalIVA);
//          
            String edad;
            String salario;
            nombre=JOptionPane.showInputDialog("Ingrese nombre");
            edad=JOptionPane.showInputDialog("Ingrese edad");
            salario=JOptionPane.showInputDialog("Ingrese salario");
            JOptionPane.showMessageDialog(null, "El nombre de la persona es: "+nombre+",tiene "+edad+"de edad,"+"recibe "+salario+"de salario.");
            
            
    }
    
}
