public class Quadrado {
    private double lado;

    public Quadrado() {

    }

    public Quadrado(double lado) {
        this.setLado(lado);
    }

    public double calcularArea() {
        return lado * lado;
    }

    public double calcularPerimetro() {
        return 4 * lado;
    }

    public void setLado(double lado) {
        if(lado > 0)
            this.lado = lado;
        else
            throw new IllegalArgumentException("O lado do quadrado deve ser maior que zero.");
    }

    public double getLado() {
        return lado;
    }
}