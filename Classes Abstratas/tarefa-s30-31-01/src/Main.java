import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Correntista cor1 = new Correntista(1, "Maria");
        Empresa e1 = new Empresa("Google", "52.426.759/0001-62");

        ContaCorrente cc1 = new ContaCorrente(1, LocalDate.now(), 5.0, cor1, 500.00);
        cc1.depositar(2.00);

        ContaPoupanca cp1 = new ContaPoupanca(1, LocalDate.now(), 200.00, 3.0, cor1, LocalDate.now());
        cp1.depositar(20.00);

        ContaSalario cs1 =new ContaSalario(1, LocalDate.now(), 1000.00, 0.0, cor1, e1);
        cs1.sacar(12.00);

        System.out.println("\n[total tarifas: " + cor1.totalTarifas() + "]\n");

        System.out.println(cor1.toString() + "\n");
        System.out.println(e1.toString() + "\n");
        System.out.println(cc1.toString() + "\n");
        System.out.println(cp1.toString() + "\n");
        System.out.println(cs1.toString() + "\n");
    }
}