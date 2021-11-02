public class Retangulo {
    public int base;
    public int altura;

    public Retangulo() {

    }

    public Retangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int calcularArea() {
        return base*altura;
    }

    public int calcularPerimetro() {
        return 2*(base+altura);
    }
}