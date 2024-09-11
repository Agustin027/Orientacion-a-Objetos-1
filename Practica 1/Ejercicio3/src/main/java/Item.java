import java.time.LocalDate;

public class Item {
    private String Detalle;
    private int Cantidad;
    private double CostoUnitario;

    public Item() {
    }

    public Item(String detalle, int cantidad, double costoUnitario) {
        Detalle = detalle;
        Cantidad = cantidad;
        CostoUnitario = costoUnitario;
    }

    public String getDetalle() {
        return Detalle;
    }

    public void setDetalle(String detalle) {
        Detalle = detalle;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int cantidad) {
        Cantidad = cantidad;
    }

    public double getCostoUnitario() {
        return CostoUnitario;
    }

    public void setCostoUnitario(double costoUnitario) {
        CostoUnitario = costoUnitario;
    }

    public double costo(){
        return Cantidad * CostoUnitario;
    }
}
