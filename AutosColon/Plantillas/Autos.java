
package Plantillas;

public class Autos {
    private String numeroChasis;
    private String marca;
    private String estilo;
    private String modelo;
    private String color;
    private int precio;
    private boolean dispo;

    public Autos() {
    }

    public Autos(String numeroChasis, String marca, String estilo, String modelo, String color, int precio, boolean dispo) {
        this.numeroChasis = numeroChasis;
        this.marca = marca;
        this.estilo = estilo;
        this.modelo = modelo;
        this.color = color;
        this.precio = precio;
        this.dispo = dispo;
    }

    public boolean isDispo() {
        return dispo;
    }

    public void setDispo(boolean dispo) {
        this.dispo = dispo;
    }

    public String getNumeroChasis() {
        return numeroChasis;
    }

    public void setNumeroChasis(String numeroChasis) {
        this.numeroChasis = numeroChasis;
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

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Autos{" + "numeroChasis=" + numeroChasis + ", marca=" + marca + ", estilo=" + estilo + ", modelo=" + modelo + ", color=" + color + ", precio=" + precio + ", dispo=" + dispo + '}';
    }

}

    
    

   

    
    
    

