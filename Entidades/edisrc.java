/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author hhern
 */
public class edisrc {
    private Integer numero_ID;
    private String nombre;
    private Integer area_construccion;
  
    public edisrc() {
    }

    public edisrc(Integer numero_ID,String nombre, Integer area_construccion) {
        this.numero_ID = numero_ID;
        this.nombre = nombre;
        this.area_construccion = area_construccion;
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

    public Integer getArea_construccion() {
        return area_construccion;
    }

    public void setArea_construccion(Integer area_construccion) {
        this.area_construccion = area_construccion;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("edisrc{");
        sb.append("numero_ID=").append(numero_ID);
        sb.append(", nombre=").append(nombre);
        sb.append(", area_construccion=").append(area_construccion);
        sb.append('}');
        return sb.toString();
    }
    
}

