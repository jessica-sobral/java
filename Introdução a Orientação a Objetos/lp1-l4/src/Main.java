public class Main {
    public static void main(String[] args) {
        System.out.println("-TESTE CALCULADORA-");

        Calculadora c1 = new Calculadora();
        System.out.println(c1.multiplicar(10, 10));

        Calculadora c2 = new Calculadora();
        System.out.println(c1.multiplicar(10.5, 10.5));

        Calculadora c3 = new Calculadora();
        System.out.println(c3.cubo(10));

        Calculadora c4 = new Calculadora();
        System.out.println(c4.parimpar(10));

        Calculadora c5 = new Calculadora();
        System.out.println(c5.parimpar(0));

        System.out.println("\n-TESTE MÍNIMO ENTRE 3-");

        Java j1 = new Java();
        System.out.println(j1.min3(10, 5, 2));

        Java j2 = new Java();
        System.out.println(j2.min3(10.5, 0.05, 2.0));

        System.out.println("\n-TESTE TEMPO-");

        Tempo t1 = new Tempo(5, 10, 3);
        t1.tempoFormatado();
        System.out.println(t1.horasEmSegundos());
        System.out.println(t1.minutosEmSegundos());
    }
}