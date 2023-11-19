/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.avance1estructuradatos;

/**
 *
 * @author hhern
 */
public class Clientes {
    private int id;
    private String nombre;
    private int edad;
    private String membresia;
    private String fechaReserva;

    public Clientes() {
    }

    public Clientes(int id, String nombre, int edad, String membresia, String fechaReserva) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.membresia = membresia;
        this.fechaReserva = fechaReserva;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getMembresia() {
        return membresia;
    }

    public void setMembresia(String membresia) {
        this.membresia = membresia;
    }

    public String getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(String fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    @Override
    public String toString() {
        return "Identificacion = " + id + ", Nombre = " + nombre + ", Edad = " + edad + ", Membresia = " + membresia + ", Fecha de Reserva = " + fechaReserva+" => => ";
    }
    
    
    
}
