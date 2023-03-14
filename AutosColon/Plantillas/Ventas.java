
package Plantillas;


public class Ventas {
    private String chasis;
    private int idComprador;
    private int precioVenta;
    private String fechaVenta;
    private double iva=0.13;
    private int ventaTotal;

    public Ventas() {
    }

    public Ventas(String chasis, int idComprador, int precioVenta, String fechaVenta, int ventaTotal) {
        this.chasis = chasis;
        this.idComprador = idComprador;
        this.precioVenta = precioVenta;
        this.fechaVenta = fechaVenta;
        this.ventaTotal = ventaTotal;
    }

    public int getVentaTotal() {
        return ventaTotal;
    }

    public void setVentaTotal(int ventaTotal) {
        this.ventaTotal = ventaTotal;
    }

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public int getIdComprador() {
        return idComprador;
    }

    public void setIdComprador(int idComprador) {
        this.idComprador = idComprador;
    }

    public int getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(int precioVenta) {
        this.precioVenta = precioVenta;
    }

    public String getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    @Override
    public String toString() {
        return "Ventas{" + "chasis=" + chasis + ", idComprador=" + idComprador + ", precioVenta=" + precioVenta + ", fechaVenta=" + fechaVenta + ", iva=" + iva + ", ventaTotal=" + ventaTotal + '}';
    }
    
    
    
}
