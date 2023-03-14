
package Plantillas;

public class Personas {
    private int numeroId;
    private String nombre;
    private String telefono;
    private String correo;
    private boolean dispo;

    public Personas() {
    }

    public Personas(int numeroId, String nombre, String telefono, String correo, boolean dispo) {
        this.numeroId = numeroId;
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
        this.dispo = dispo;
    }

    public boolean isDispo() {
        return dispo;
    }

    public void setDispo(boolean dispo) {
        this.dispo = dispo;
    }

    public int getNumeroId() {
        return numeroId;
    }

    public void setNumeroId(int numeroId) {
        this.numeroId = numeroId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Personas{" + "numeroId=" + numeroId + ", nombre=" + nombre + ", telefono=" + telefono + ", correo=" + correo + ", dispo=" + dispo + '}';
    }

}
