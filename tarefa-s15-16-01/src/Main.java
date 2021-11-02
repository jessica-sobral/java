class Main {
    public static void main(String[] args) {
        //foi utilizado o Debugger para fazer os testes

        //instanciando os objetos q1 e q2 da classe Quadrado

        Quadrado q1 = new Quadrado();
        q1.lado = 5;

        Quadrado q2 = new Quadrado(10);

        //instanciando os objetos r1 e r2 da classe Retangulo

        Retangulo r1 = new Retangulo();
        r1.base = 5;
        r1.altura = 10;

        Retangulo r2 = new Retangulo(15, 20);

        //instanciando os objetos c1 e c2 da classe Circulo

        Circulo c1 = new Circulo();
        c1.raio = 5;

        Circulo c2 = new Circulo(10);

        //instanciando os objetos co1 e co2 da classe Conta

        Conta co1 = new Conta();
        co1.codigo = 1;
        co1.saldo = 0.0;
        co1.limite = 150.00;

        Conta co2 = new Conta(2, 100.00, 150.00);

        System.out.println(" ");
    }
}