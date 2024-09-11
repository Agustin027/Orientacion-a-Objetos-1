import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Presupuesto {
    private LocalDate fecha = LocalDate.now();
    private String cliente;
    private List<Item> items = new ArrayList<>();

    public Presupuesto(String cliente) {
        this.fecha = fecha;
        this.cliente = cliente;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public void agregarItem(Item item){
        items.add(item);
    }
    public double calcularTotal(){
        return items.stream().mapToDouble(Item::costo).sum();
    }
}
