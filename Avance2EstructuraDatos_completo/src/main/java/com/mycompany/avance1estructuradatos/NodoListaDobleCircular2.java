/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.avance1estructuradatos;

/**
 *
 * @author hhern
 */
public class NodoListaDobleCircular2 {
    private Habitaciones habitacion;
    private NodoListaDobleCircular2 anterior;
    private NodoListaDobleCircular2 siguiente;

    public NodoListaDobleCircular2() {
    }

    public NodoListaDobleCircular2(Habitaciones habitacion, NodoListaDobleCircular2 anterior, NodoListaDobleCircular2 siguiente) {
        this.habitacion = habitacion;
        this.anterior = anterior;
        this.siguiente = siguiente;
    }

    public Habitaciones getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitaciones habitacion) {
        this.habitacion = habitacion;
    }

    public NodoListaDobleCircular2 getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoListaDobleCircular2 anterior) {
        this.anterior = anterior;
    }

    public NodoListaDobleCircular2 getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoListaDobleCircular2 siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        return "habitacion=" + habitacion + ", anterior=" + anterior + ", siguiente=" + siguiente + '}';
    }

    
    
    
}
