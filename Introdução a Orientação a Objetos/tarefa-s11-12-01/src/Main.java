public class Main {
    public static void main(String[] args) {
        System.out.println("QUADRADOS\n");
        //Criando 3 objetos (instâncias) da classe Quadrado

        Quadrado q1 = new Quadrado();
        //Atribuindo valor 5 para o atributo lado
        q1.lado = 5;
        System.out.println(q1.lado);
        System.out.println(q1.calcularArea());
        System.out.println(q1.calcularPerimetro() + "\n");

        Quadrado q2 = new Quadrado();
        q2.lado = 10;
        System.out.println(q2.lado);
        System.out.println(q2.calcularArea());
        System.out.println(q2.calcularPerimetro() + "\n");

        Quadrado q3 = new Quadrado();
        q3.lado = 15;
        System.out.println(q3.lado);
        System.out.println(q3.calcularArea());
        System.out.println(q3.calcularPerimetro());


        System.out.println("---------------------");
        System.out.println("RETÂNGULOS\n");
        //Criando 3 objetos (instâncias) da classe Retângulo

        Retangulo r1 = new Retangulo();
        //Atribuindo valor 10 para o atributo base e 5 para o atributo altura
        r1.base = 5;
        r1.altura = 10;
        System.out.println(r1.base + "\n" + r1.altura);
        System.out.println(r1.calcularArea());
        System.out.println(r1.calcularPerimetro() + "\n");

        Retangulo r2 = new Retangulo();
        r2.base = 15;
        r2.altura = 20;
        System.out.println(r2.base + "\n" + r2.altura);
        System.out.println(r2.calcularArea());
        System.out.println(r2.calcularPerimetro() + "\n");

        Retangulo r3 = new Retangulo();
        r3.base = 25;
        r3.altura = 30;
        System.out.println(r3.base + "\n" + r3.altura);
        System.out.println(r3.calcularArea());
        System.out.println(r3.calcularPerimetro());

        System.out.println("---------------------");
        System.out.println("CÍRCULOS\n");
        //Criando 3 objetos (instâncias) da classe Circulo

        Circulo c1 = new Circulo();
        //Atribuindo o valor 5 para o atributo raio
        c1.raio = 5;
        System.out.println(c1.raio);
        System.out.println(c1.calcularArea());
        System.out.println(c1.calcularPerimetro() + "\n");

        Circulo c2 = new Circulo();
        c2.raio = 10;
        System.out.println(c2.raio);
        System.out.println(c2.calcularArea());
        System.out.println(c2.calcularPerimetro() + "\n");

        Circulo c3 = new Circulo();
        c3.raio = 15;
        System.out.println(c3.raio);
        System.out.println(c3.calcularArea());
        System.out.println(c3.calcularPerimetro());
    }
}
