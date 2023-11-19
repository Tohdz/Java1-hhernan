/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.avance1estructuradatos;

/**
 *
 * @author hhern
 */
public class NodoPila {
    private Estacionamiento elemento;
    private NodoPila siguienteElemento;

    public NodoPila() {
    }

    public NodoPila(NodoPila siguienteElemento) {
        this.siguienteElemento = siguienteElemento;
    }

    public Estacionamiento getElemento() {
        return elemento;
    }

    public void setElemento(Estacionamiento elemento) {
        this.elemento = elemento;
    }

    public NodoPila getSiguienteElemento() {
        return siguienteElemento;
    }

    public void setSiguienteElemento(NodoPila siguienteElemento) {
        this.siguienteElemento = siguienteElemento;
    }
    
    
}
