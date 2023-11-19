/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.avance1estructuradatos;

/**
 *
 * @author hhern
 */
public class NodoListaDobleCircular {
    private Actividad elemento;
    private NodoListaDobleCircular anterior;
    private NodoListaDobleCircular siguiente;

    public NodoListaDobleCircular() {
    }

    public NodoListaDobleCircular(Actividad elemento) {
        this.elemento = elemento;
    }

    

    public Actividad getElemento() {
        return elemento;
    }

    public void setElemento(Actividad elemento) {
        this.elemento = elemento;
    }

    public NodoListaDobleCircular getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoListaDobleCircular anterior) {
        this.anterior = anterior;
    }

    public NodoListaDobleCircular getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoListaDobleCircular siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        return "elemento=" + elemento + ", anterior=" + anterior + ", siguiente=" + siguiente + '}';
    }

    
    
    
}
