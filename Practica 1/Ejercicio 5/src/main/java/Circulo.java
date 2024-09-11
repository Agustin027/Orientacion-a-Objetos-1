public class Circulo extends Figura {
    private double radio;

    public double getRadio() {
        return radio;
    }
    public void setRadio(double radio) {
        this.radio = radio;
    }
    public double getDiametro() {
        return 2 * radio;
    }

    public void setDiametro(double diametro) {
        this.radio = diametro / 2;
    }

    @Override
    public double getArea() {
        return Math.PI * radio * radio;
    }
    public double getPerimetro() {
        return 2 * Math.PI * radio;
    }
}
