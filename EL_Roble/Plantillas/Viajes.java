/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Plantillas;

/**
 *
 * @author hhern
 */
public class Viajes {

    private String idV;
    private String placaV;
    private String idChof;
    private String fechaV;
    private String destino;
    private int capacidad;
    private int precio;

    public Viajes() {
    }

    public Viajes(String idV, String placaV, String idChof, String fechaV, String destino, int capacidad, int precio) {
        this.idV = idV;
        this.placaV = placaV;
        this.idChof = idChof;
        this.fechaV = fechaV;
        this.destino = destino;
        this.capacidad = capacidad;
        this.precio = precio;
    }

    public String getIdV() {
        return idV;
    }

    public void setIdV(String idV) {
        this.idV = idV;
    }

    public String getPlacaV() {
        return placaV;
    }

    public void setPlacaV(String placaV) {
        this.placaV = placaV;
    }

    public String getIdChof() {
        return idChof;
    }

    public void setIdChof(String idChof) {
        this.idChof = idChof;
    }

    public String getFechaV() {
        return fechaV;
    }

    public void setFechaV(String fechaV) {
        this.fechaV = fechaV;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Viajes{" + "idV=" + idV + ", placaV=" + placaV + ", idChof=" + idChof + ", fechaV=" + fechaV + ", destino=" + destino + ", capacidad=" + capacidad + ", precio=" + precio + '}';
    }
}
