import java.time.LocalDate;

public class ContaPoupanca extends Conta implements CalculoTarifa {
    private LocalDate aniversario;

    //método construtor de ContaPoupanca
    public ContaPoupanca(int numero, LocalDate dataAbertura, double saldo, double tarifa, LocalDate aniversario) {
        super(numero, dataAbertura, saldo, tarifa);
        this.aniversario = aniversario;
    }

    //sobrescrita, implementação do método calcularTarifa
    @Override
    public double calcularTarifa() {
        return this.tarifa;
    }

    //getters e setters

    //sobrecarga do método toString
    @Override
    public String toString() {
        return super.toString() + ", [aniversário: " + this.aniversario + "]";
    }
}