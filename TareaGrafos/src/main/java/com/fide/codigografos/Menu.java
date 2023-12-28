/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fide.codigografos;

import javax.swing.JOptionPane;

/**
 *
 * @author hhern
 */
public class Menu {
    static Grafo graf = new Grafo();
    public static void menu() {
        precarga();
        boolean control = true;
        while (control == true) {
            String[] opciones = {"Imprimir nodos", "Imprimir matriz de adyacencia","Ruta mas corta", "Salir"};
            int opcion = JOptionPane.showOptionDialog(null, "Práctica programada 5", "Seleccionar", 0, JOptionPane.QUESTION_MESSAGE, null, opciones, "Imprimir nodos");
            switch (opcion) {
                case 0:
                    graf.imprimirNodos();
                    break;
                case 1:
                    graf.ImprimirMatrizAdyacencia();
                    break;
                case 2:
                    graf.Ruta();
                    break;
                case 3:
                    control = false;
                    break;
            }
        }
    }
    
    public static void precarga(){
        graf.InsertarNodo("A", "B", 7);
        graf.InsertarNodo("A", "D", 5);
        graf.InsertarNodo("B", "C", 8);
        graf.InsertarNodo("B", "D", 9);
        graf.InsertarNodo("B", "E", 7);
        graf.InsertarNodo("C", "E", 5);
        graf.InsertarNodo("D", "E", 15);
        graf.InsertarNodo("D", "F", 6);
        graf.InsertarNodo("E", "F", 8);
        graf.InsertarNodo("E", "G", 9);
        graf.InsertarNodo("F", "G", 11);
    }
}
