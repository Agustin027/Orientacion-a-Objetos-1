public class Cuadrado extends Figura {
    private double lado;

    public double getLado() {
        return lado;
    }
    public void setLado(double lado) {
        this.lado = lado;
    }
    public double getArea() {
        return lado * lado;
    }
    public double getPerimetro() {
        return 4 * lado;
    }
}
