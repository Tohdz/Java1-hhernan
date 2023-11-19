/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.avance1estructuradatos;

/**
 *
 * @author hhern
 */
public class NodoCola {
    private Clientes elemento;
    private NodoCola Atras;

    public NodoCola() {
    }

    public NodoCola(Clientes elemento, NodoCola Atras) {
        this.elemento = elemento;
        this.Atras = Atras;
    }

    public Clientes getElemento() {
        return elemento;
    }

    public void setElemento(Clientes elemento) {
        this.elemento = elemento;
    }

    public NodoCola getAtras() {
        return Atras;
    }

    public void setAtras(NodoCola Atras) {
        this.Atras = Atras;
    }

    @Override
    public String toString() {
        return "elemento = " + elemento + ", Atras = " + Atras ;
    }
    
    
}
