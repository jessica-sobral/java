//1. Escreva o código fonte da classe Calculadora. Crie métodos estáticos para: a) método multiplicar que recebe dois argumentos do tipo Integer e retorna o valor da multiplicação dos valores; b) sobrecarregue o método multiplicar que receba dois argumentos do tipo Double e retorna o valor da multiplicação dos valores; c) método cubo que recebe um argumento do tipo Integer e retorna o valor elevado ao cubo; d) método parimpar que recebe um argumento do tipo Integer e retorna a String “Par” caso o número seja par, ou a String “Impar” caso o número seja impar, ou retorne a String “Zero” caso o número seja igual a zero.

public class Calculadora{
    public Integer numero1;
    public Integer numero2;
    public Double numero3;
    public Double numero4;

    public static Integer multiplicar(Integer a, Integer b) {
        return a * b;
    }

    public static Double multiplicar(Double a, Double b) {
        return a * b;
    }

    public static Integer cubo(Integer c) {
        return c * c * c;
    }

    public static String parimpar(Integer d) {
        if(d == 0) {
            return "Zero";
        }
        if(d % 2 == 0) {
            return "Par";
        }
        else {
            return "Impar";
        }
    }
}