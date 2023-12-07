/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.avance1estructuradatos;

/**
 *
 * @author hhern
 */
public class NodoArbol {
    Clientes cliente;
    NodoArbol izquierda, derecha;

    public NodoArbol(Clientes cli) {
        cliente=cli;
        izquierda = derecha = null;
    }

    public Clientes getCliente() {
        return cliente;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }

    public NodoArbol getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(NodoArbol izquierda) {
        this.izquierda = izquierda;
    }

    public NodoArbol getDerecha() {
        return derecha;
    }

    public void setDerecha(NodoArbol derecha) {
        this.derecha = derecha;
    }

    @Override
    public String toString() {
        return "cliente=" + cliente + "==>";
    }
    
    
    
}
