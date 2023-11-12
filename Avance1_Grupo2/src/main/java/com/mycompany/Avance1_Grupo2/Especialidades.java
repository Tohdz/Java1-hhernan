/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Avance1_Grupo2;



/**
 *
 * @author hhern
 */
public class Especialidades {
    
    String nombreCliente;
    String Placa;
    String nombreMec;
    String subEspec;
    int valorRep;

    public Especialidades() {
    }

    public Especialidades(String nombreCliente, String Placa, String nombreMec, String subEspec, int valorRep) {
        this.nombreCliente = nombreCliente;
        this.Placa = Placa;
        this.nombreMec = nombreMec;
        this.subEspec = subEspec;
        this.valorRep = valorRep;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }

    public String getNombreMec() {
        return nombreMec;
    }

    public void setNombreMec(String nombreMec) {
        this.nombreMec = nombreMec;
    }

    public String getSubEspec() {
        return subEspec;
    }

    public void setSubEspec(String subEspec) {
        this.subEspec = subEspec;
    }

    public int getValorRep() {
        return valorRep;
    }

    public void setValorRep(int valorRep) {
        this.valorRep = valorRep;
    }

    @Override
    public String toString() {
        return "Nombre del cliente: " + nombreCliente + ", Placa: " + Placa + ", Nombre del mecanico: " + nombreMec + ", Sub especialidad: " + subEspec + ", valor de Reparacion: " + valorRep + "==>";
    }
   
}
