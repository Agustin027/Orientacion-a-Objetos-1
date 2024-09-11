import java.time.LocalDate;

public class Ticket {
    private int cantidadDeProductos;
    private double precioTotal;
    private double pesoTotal;
    private LocalDate fecha;

    public Ticket() {
        this.cantidadDeProductos = 0;
        this.precioTotal = 0.0;
        this.pesoTotal = 0.0;
        this.fecha = LocalDate.now();
    }

    public Integer getCantidadDeProductos() {
        return cantidadDeProductos;
    }

    public void setCantidadDeProductos(Integer cantidadDeProductos) {
        this.cantidadDeProductos = cantidadDeProductos;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    public double getPesoTotal() {
        return pesoTotal;
    }

    public void setPesoTotal(double pesoTotal) {
        this.pesoTotal = pesoTotal;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public double impuesto() {
        return this.precioTotal * 0.21;
    }
}
