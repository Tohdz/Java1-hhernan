/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Plantillas;

/**
 *
 * @author hhern
 */
public class Canciones {
    private int id;
    private String titulo;
    private String autor;
    private String duracion;
    private int año;
    
    private static int nuevoId;
    public static void setNuevoId() {
        nuevoId++;        
    }
    

    public Canciones() {
    }

    public Canciones(String titulo, String autor, String duracion, int año) {
        setNuevoId();
        this.id = nuevoId;
        this.titulo = titulo;
        this.autor = autor;
        this.duracion = duracion;
        this.año = año;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Canciones{");
        sb.append("id=").append(id);
        sb.append(", titulo=").append(titulo);
        sb.append(", autor=").append(autor);
        sb.append(", duracion=").append(duracion);
        sb.append(", a\u00f1o=").append(año);
        sb.append('}');
        return sb.toString();
    }
}
