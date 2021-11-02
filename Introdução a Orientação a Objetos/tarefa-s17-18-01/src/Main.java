public class Main {
    public static void main(String[] args) {
        //também foi utilizado o Debugger para fazer os testes

        System.out.println("QUADRADOS\n");
        //instanciando os objetos q1 e q2 da classe Quadrado

        Quadrado q1 = new Quadrado();
        q1.setLado(5);
        System.out.println(q1.getLado() + "\n");

        Quadrado q2 = new Quadrado(10);
        System.out.println(q2.getLado());

        System.out.println("---------------------");
        System.out.println("RETÂNGULOS\n");
        //instanciando os objetos r1 e r2 da classe Retangulo

        Retangulo r1 = new Retangulo();
        r1.setBase(5);
        r1.setAltura(10);
        System.out.println(r1.getBase());
        System.out.println(r1.getAltura() + "\n");

        Retangulo r2 = new Retangulo(15, 20);
        System.out.println(r2.getBase());
        System.out.println(r2.getAltura());

        System.out.println("---------------------");
        System.out.println("CÍRCULOS\n");
        //instanciando os objetos c1 e c2 da classe Circulo

        Circulo c1 = new Circulo();
        c1.setRaio(5);
        System.out.println(c1.getRaio() + "\n");

        Circulo c2 = new Circulo(10);
        System.out.println(c2.getRaio());

        System.out.println("---------------------");
        System.out.println("CONTAS\n");
        //instanciando os objetos co1 e co2 da classe Conta

        Conta co1 = new Conta();
        co1.setCodigo(1);
        co1.setLimite(150.00);
        co1.depositar(35.50);
        System.out.println(co1.getCodigo());
        System.out.println(co1.getSaldo());
        System.out.println(co1.getLimite() + "\n");

        Conta co2 = new Conta(2, 150.00);
        co2.depositar(50.00);
        System.out.println(co2.getCodigo());
        System.out.println(co2.getSaldo());
        System.out.println(co2.getLimite());

        System.out.println(" ");
    }
}