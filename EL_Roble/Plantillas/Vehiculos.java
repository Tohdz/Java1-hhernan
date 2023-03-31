/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Plantillas;

/**
 *
 * @author hhern
 */
public class Vehiculos {
    private String placa;
    private String marca;
    private String estilo;
    private String año;
    private int pasajeros;

    public Vehiculos() {
    }

    public Vehiculos(String placa, String marca, String estilo, String año, int pasajeros) {
        this.placa = placa;
        this.marca = marca;
        this.estilo = estilo;
        this.año = año;
        this.pasajeros = pasajeros;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    @Override
    public String toString() {
        return "Vehiculos{" + "placa=" + placa + ", marca=" + marca + ", estilo=" + estilo + ", a\u00f1o=" + año + ", pasajeros=" + pasajeros + '}';
    }
}
