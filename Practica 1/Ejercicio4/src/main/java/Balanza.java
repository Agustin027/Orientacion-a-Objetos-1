import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Balanza {
    private List<Producto> productos;

    public Balanza() {
        this.productos = new ArrayList<>();
    }
    public int getCantidadDeProductos(){
        return productos.size();
    }
    public double getPrecioTotal(){
        return productos.stream().mapToDouble(producto -> producto.getPrecioPorKilo() * producto.getPeso()).sum();
    }

    public double getPesoTotal() {
        return this.productos.stream().mapToDouble(Producto::getPeso).sum();
    }


    public void ponerEnCero() {
        this.productos.clear();
    }

    public void agregarProducto(Producto producto) {
        this.productos.add(producto);
    }

    public List<Producto> getProductos() {
        return this.productos;
    }

    public Ticket emitirTicket() {
        Ticket ticket = new Ticket();
        // Tengo que hacer una copia de los productos para que no se modifiquen los productos del ticket,
        // por que si hago ticket.setProductos(this.productos) los productos del ticket se modifican si se
        // modifican los productos de la balanza
        List<Producto> copiaProductos =  this.productos.stream().map(Producto::new).collect(Collectors.toList());
        ticket.setProductos(copiaProductos);
        return ticket;
    }

}
