import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        ContaCorrente cc1 = new ContaCorrente(1, LocalDate.now(), 5.0, 500.00);

        ContaPoupanca cp1 = new ContaPoupanca(1, LocalDate.now(), 200.00, 3.0, LocalDate.now());

        System.out.println(cc1.toString() + "\n");
        System.out.println(cp1.toString() + "\n");
    }
}