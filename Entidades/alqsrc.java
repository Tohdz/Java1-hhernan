/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author hhern
 */
public class alqsrc {
    private Integer ID_edificio;
    private Integer ID_inquilino;
    private Integer numero_contrato;
    private Integer fecha_inicio;
    private Integer vencimiento;
    private Integer mesualidad;
   
    public alqsrc() {
    }

    public alqsrc(Integer ID_edificio, Integer ID_inquilino, Integer numero_contrato, Integer fecha_inicio, Integer vencimiento, Integer mesualidad) {
        this.ID_edificio = ID_edificio;
        this.ID_inquilino = ID_inquilino;
        this.numero_contrato = numero_contrato;
        this.fecha_inicio = fecha_inicio;
        this.vencimiento = vencimiento;
        this.mesualidad = mesualidad;
    }
    
    
    public Integer getID_edificio() {
        return ID_edificio;
    }

    public void setID_edificio(Integer ID_edificio) {
        this.ID_edificio = ID_edificio;
    }

    public Integer getID_inquilino() {
        return ID_inquilino;
    }

    public void setID_inquilino(Integer ID_inquilino) {
        this.ID_inquilino = ID_inquilino;
    }

    public Integer getNumero_contrato() {
        return numero_contrato;
    }

    public void setNumero_contrato(Integer numero_contrato) {
        this.numero_contrato = numero_contrato;
    }

    public Integer getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(Integer fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public Integer getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(Integer vencimiento) {
        this.vencimiento = vencimiento;
    }

    public Integer getMesualidad() {
        return mesualidad;
    }

    public void setMesualidad(Integer mesualidad) {
        this.mesualidad = mesualidad;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("alqsrc{");
        sb.append("ID_edificio=").append(ID_edificio);
        sb.append(", ID_inquilino=").append(ID_inquilino);
        sb.append(", numero_contrato=").append(numero_contrato);
        sb.append(", fecha_inicio=").append(fecha_inicio);
        sb.append(", vencimiento=").append(vencimiento);
        sb.append(", mesualidad=").append(mesualidad);
        sb.append('}');
        return sb.toString();
    }
    
}
