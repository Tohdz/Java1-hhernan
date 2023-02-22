/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;



/**
 *
 * @author hhern
 */
public class perssrc {
    private Integer numero_ID;
    private String nombre;
    private Integer numero_telefono;
    private String correo;
    
    

    public perssrc() {
    }

    public perssrc(Integer numero_ID, String nombre, Integer numero_telefono, String correo) {
        this.numero_ID = numero_ID;
        this.nombre = nombre;
        this.numero_telefono = numero_telefono;
        this.correo = correo;
    }
    

    public Integer getNumero_ID() {
        return numero_ID;
    }

    public void setNumero_ID(Integer numero_ID) {
        this.numero_ID = numero_ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getNumero_telefono() {
        return numero_telefono;
    }

    public void setNumero_telefono(Integer numero_telefono) {
        this.numero_telefono = numero_telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("perssrc{");
        sb.append("numero_ID=").append(numero_ID);
        sb.append(", nombre=").append(nombre);
        sb.append(", numero_telefono=").append(numero_telefono);
        sb.append(", correo=").append(correo);
        sb.append('}');
        return sb.toString();
    }
    
    
}
