/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Plantillas;

/**
 *
 * @author hhern
 */
public class Choferes {
    private String idC;
    private String vencimientoL;

    public Choferes() {
    }

    public Choferes(String idC, String vencimientoL) {
        this.idC = idC;
        this.vencimientoL = vencimientoL;
    }

    public String getVencimientoL() {
        return vencimientoL;
    }

    public void setVencimientoL(String vencimientoL) {
        this.vencimientoL = vencimientoL;
    }

    public String getIdC() {
        return idC;
    }

    public void setIdC(String idC) {
        this.idC = idC;
    }

    @Override
    public String toString() {
        return "Choferes{" + "idC=" + idC + ", vencimientoL=" + vencimientoL + '}';
    }
}
