/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.avance1estructuradatos;

/**
 *
 * @author hhern
 */
public class NodoListaCircular {
    Desayuno desa;
    NodoListaCircular siguiente;

    public NodoListaCircular() {
    }

    public NodoListaCircular(Desayuno desa) {
        this.desa = desa;
    }

    public Desayuno getDesa() {
        return desa;
    }

    public void setDesa(Desayuno desa) {
        this.desa = desa;
    }

    public NodoListaCircular getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoListaCircular siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        return "desa=" + desa + ", siguiente=" + siguiente + '}';
    }
    
    
    
    
}
