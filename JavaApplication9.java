/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication9;

import javax.swing.JOptionPane;

/**
 *
 * @author hhern
 */
public class JavaApplication9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//    int i=1;
//    String dias="";
//        while (i<=7) {
//            switch (i) {
//                case 1:
//                    dias=dias+"domingo"+"\n";
//                    break;
//                case 2:
//                    dias=dias+"Lunes"+"\n";
//                    break;
//                case 3:
//                    dias=dias+"martes"+"\n";
//                    break;
//                case 4:
//                    dias=dias+"miercoles"+"\n";
//                    break;
//                case 5:
//                    dias=dias+"jueves"+"\n";
//                    break;
//                case 6:
//                    dias=dias+"viernes"+"\n";
//                    break;
//                case 7:
//                    dias=dias+"sabado"+"\n";
//                    break;
//            }
//            i++;     
//            
//        }
//     JOptionPane.showMessageDialog(null, dias);
       int  i=1;
       String dia="";
        do {            
            switch (i) {
                case 1:
                    dia=dia+"domingo"+"\n";
                    break;
                case 2:
                    dia=dia+"Lunes"+"\n";
                    break;
                case 3:
                    dia=dia+"martes"+"\n";
                    break;
                case 4:
                    dia=dia+"miercoles"+"\n";
                    break;
                case 5:
                    dia=dia+"jueves"+"\n";
                    break;
                case 6:
                    dia=dia+"viernes"+"\n";
                    break;
                case 7:
                    dia=dia+"sabado"+"\n";
                    break;
            }
            i++;
        } while (i<=7);
       JOptionPane.showMessageDialog(null, dia);
    }
    
}
