/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.avance1estructuradatos;

/**
 *
 * @author hhern
 */
public class Estacionamiento {
    private String placa;
    private String color;
    private int cantidadPuertas;

    public Estacionamiento() {
    }

    public Estacionamiento(String placa, String color, int cantidadPuertas) {
        this.placa = placa;
        this.color = color;
        this.cantidadPuertas = cantidadPuertas;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCantidadPuertas() {
        return cantidadPuertas;
    }

    public void setCantidadPuertas(int cantidadPuertas) {
        this.cantidadPuertas = cantidadPuertas;
    }

    @Override
    public String toString() {
        return "Estacionamiento{" + "placa=" + placa + ", color=" + color + ", cantidadPuertas=" + cantidadPuertas + '}';
    }
    
    
    
    
}
