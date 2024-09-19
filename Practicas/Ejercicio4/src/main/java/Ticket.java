import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Ticket {
    private List<Producto> productos;
    private LocalDate fecha;

    public Ticket() {
        this.productos = new ArrayList<>();
        this.fecha = LocalDate.now();
    }

    public Integer getCantidadDeProductos() {
        return productos.size();
    }

    public  void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
    public List<Producto> getProductos() {
        return productos;
    }

    public double getPrecioTotal() {
        return productos.stream()
                .peek(producto -> System.out.println("Precio por Kilo: " + producto.getPrecioPorKilo() + ", Peso: " + producto.getPeso()))
                .mapToDouble(producto -> producto.getPrecioPorKilo() * producto.getPeso())
                .peek(precio -> System.out.println("Precio Total Producto: " + precio))
                .sum();
    }



    public double getPesoTotal() {

        return this.productos.stream().mapToDouble(Producto::getPeso).sum();
    }


    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public double impuesto() {
        return this.getPrecioTotal() * 0.21;
    }
}
