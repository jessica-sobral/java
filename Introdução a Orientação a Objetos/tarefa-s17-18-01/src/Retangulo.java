public class Retangulo {
    private double base;
    private double altura;

    public Retangulo() {

    }

    public Retangulo(double base) {
        this.setBase(base);
    }

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea() {
        return base*altura;
    }

    public double calcularPerimetro() {
        return 2 * (base + altura);
    }

    public void setBase(double base) {
        if(base > 0)
            this.base = base;
        else
            throw new IllegalArgumentException("A base do triângulo deve ser maior que zero.");
    }

    public double getBase() {
        return base;
    }

    public void setAltura(double altura) {
        if(altura > 0)
            this.altura = altura;
        else
            throw new IllegalArgumentException("A altura do triângulo deve ser maior que zero.");
    }

    public double getAltura() {
        return altura;
    }
}