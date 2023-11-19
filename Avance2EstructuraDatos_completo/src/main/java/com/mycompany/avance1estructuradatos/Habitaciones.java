/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.avance1estructuradatos;

/**
 *
 * @author hhern
 */
public class Habitaciones {
    private int id;
    private String tipo;
    private int cantCamas;
    private boolean dispo;
    private double precio;

    public Habitaciones() {
    }

    public Habitaciones(int id, String tipo, int cantCamas, boolean dispo,double precio) {
        this.id = id;
        this.tipo = tipo;
        this.cantCamas = cantCamas;
        this.dispo = dispo;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCantCamas() {
        return cantCamas;
    }

    public void setCantCamas(int cantCamas) {
        this.cantCamas = cantCamas;
    }

    public boolean isDispo() {
        return dispo;
    }

    public void setDispo(boolean dispo) {
        this.dispo = dispo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    @Override
    public String toString() {
        return "id=" + id + ", tipo=" + tipo + ", cantCamas=" + cantCamas +", Precio"+ precio + ", dispo=" + dispo + "==>";
    }
    
    
}
