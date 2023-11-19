/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.avance1estructuradatos;

/**
 *
 * @author hhern
 */
public class Desayuno {
    private int id;
    private String descripcion;
    private String tipo;
    private int cantCalorias;

    public Desayuno() {
    }

    public Desayuno(int id, String descripcion, String tipo, int cantCalorias) {
        this.id = id;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.cantCalorias = cantCalorias;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCantCalorias() {
        return cantCalorias;
    }

    public void setCantCalorias(int cantCalorias) {
        this.cantCalorias = cantCalorias;
    }

    @Override
    public String toString() {
        return "id=" + id + ", descripcion=" + descripcion + ", tipo=" + tipo + ", cantCalorias=" + cantCalorias + "==>";
    }
    
    
}
