public class Producto {
    private double peso;
    private double precioPorKilo;
    private String descripcion;

    public Producto() {
        this.descripcion = "";
        this.peso = 0.0;
        this.precioPorKilo = 0.0;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPrecioPorKilo() {
        return precioPorKilo;
    }

    public void setPrecioPorKilo(double precioPorKilo) {
        this.precioPorKilo = precioPorKilo;
    }

    public double getPrecio() {
        return this.peso * this.precioPorKilo;
    }
}
