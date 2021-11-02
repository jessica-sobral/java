public class Retangulo {
    public int base;
    public int altura;

    public int calcularArea() {
        return base*altura;
    }

    public int calcularPerimetro() {
        return 2*(base+altura);
    }
}