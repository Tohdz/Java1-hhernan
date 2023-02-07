/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication8;

import javax.swing.JOptionPane;

/**
 *
 * @author hhern
 */
public class JavaApplication8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String diassemana="";
        for (int i = 1; i <= 7; i++) {
            switch (i) {
                case 1 :
                    diassemana=diassemana+"Domingo"+"\n";
                    break;
                case 2 :
                    diassemana=diassemana+"Lunes"+"\n";
                    break;
                case 3 :
                    diassemana=diassemana+"Martes"+"\n";
                    break;
                case 4 :
                    diassemana=diassemana+"Miercoles"+"\n";
                    break;
                case 5 :
                    diassemana=diassemana+"Jueves"+"\n";
                    break;
                case 6 :
                    diassemana=diassemana+"Viernes"+"\n";
                    break;
                case 7 :
                    diassemana=diassemana+"Sabado"+"\n";
                    break;
            }
        }  
        JOptionPane.showMessageDialog(null,diassemana);
        }
    
}
