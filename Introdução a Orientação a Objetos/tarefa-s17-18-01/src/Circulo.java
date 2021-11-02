public class Circulo {
    private double raio;

    public Circulo() {

    }

    public Circulo(double raio) {
        this.setRaio(raio);
    }

    public double calcularArea() {
        return Math.PI * raio * raio;
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }

    public void setRaio(double raio) {
        if(raio > 0)
            this.raio = raio;
        else
            throw new IllegalArgumentException("O raio do círculo deve ser maior que zero.");
    }

    public double getRaio() {
        return raio;
    }
}