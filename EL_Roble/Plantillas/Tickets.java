/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Plantillas;

/**
 *
 * @author hhern
 */
public class Tickets {
    private String idVT;
    private int cantidad;
    private int precioV;
    private String fechaV;
    private int totaliva;

    public Tickets() {
    }

    public Tickets(String idVT, int cantidad, int precioV, String fechaV, int totaliva) {
        this.idVT = idVT;
        this.cantidad = cantidad;
        this.precioV = precioV;
        this.fechaV = fechaV;
        this.totaliva = totaliva;
    }

    public String getIdVT() {
        return idVT;
    }

    public void setIdVT(String idVT) {
        this.idVT = idVT;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecioV() {
        return precioV;
    }

    public void setPrecioV(int precioV) {
        this.precioV = precioV;
    }

    public String getFechaV() {
        return fechaV;
    }

    public void setFechaV(String fechaV) {
        this.fechaV = fechaV;
    }

    public int getTotaliva() {
        return totaliva;
    }

    public void setTotaliva(int totaliva) {
        this.totaliva = totaliva;
    }

    @Override
    public String toString() {
        return "Tickets{" + "idVT=" + idVT + ", cantidad=" + cantidad + ", precioV=" + precioV + ", fechaV=" + fechaV + ", totaliva=" + totaliva + '}';
    } 
}
