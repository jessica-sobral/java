import java.time.LocalDate;

public class ContaPoupanca extends Conta {
    private LocalDate aniversario;

    public ContaPoupanca(int numero, LocalDate dataAbertura, double saldo, double tarifa, Correntista correntista, LocalDate aniversario) {
        super(numero, dataAbertura, saldo, tarifa, correntista);
        this.aniversario = aniversario;
    }

    @Override
    public double calcularTarifa() {
        return this.tarifa;
    }

    public LocalDate getAniversario() {
        return this.aniversario;
    }

    @Override
    public String toString() {
        return super.toString() + ", [aniversário: " + this.aniversario + "]";
    }
}