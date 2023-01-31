/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;

import javax.swing.JOptionPane;

/**
 *
 * @author hhern
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    String ingreso;
            String porcentaje;
            ingreso=JOptionPane.showInputDialog("Ingrese el monto por concepto de ingreso:");
            porcentaje=JOptionPane.showInputDialog("Ingrese el porcentaje por concepto de alimentacion:");
            Double ingresoD;
            ingresoD=Double.parseDouble(ingreso);
            Double porcentajeD;
            porcentajeD=Double.parseDouble(porcentaje);
            Double cal;
            cal=ingresoD*(porcentajeD/100);
            JOptionPane.showMessageDialog(null, "Gasto en alimentacion: "+cal+" monto resante:"+(ingresoD-cal));
    }
    
}
