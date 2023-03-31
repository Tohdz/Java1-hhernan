/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Plantillas;

/**
 *
 * @author hhern
 */
public class Usuarios {
    private String idU;
    private String codigoU;
    private String clave;

    public Usuarios() {
    }

    public Usuarios(String idU, String codigoU, String clave) {
        this.idU = idU;
        this.codigoU = codigoU;
        this.clave = clave;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getIdU() {
        return idU;
    }

    public void setIdU(String idU) {
        this.idU = idU;
    }

    public String getCodigoU() {
        return codigoU;
    }

    public void setCodigoU(String codigoU) {
        this.codigoU = codigoU;
    }

    @Override
    public String toString() {
        return "Usuarios{" + "idU=" + idU + ", codigoU=" + codigoU + ", clave=" + clave + '}';
    }
}
