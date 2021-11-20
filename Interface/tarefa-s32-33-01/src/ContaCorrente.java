import java.time.LocalDate;

public class ContaCorrente extends Conta implements CalculoTarifa {
    private double limite;

    //método construtor de ContaCorrente
    public ContaCorrente(int numero, LocalDate dataAbertura, double tarifa, double limite) {
        super(numero, dataAbertura, tarifa);
        this.limite =  limite;
    }

    //sobrescrita, implementação do método calcularTarifa
    @Override
    public double calcularTarifa() {
        return this.tarifa * 1.5;
    }

    //sobrecarga do método sacar
    @Override
    public boolean sacar(double valor) {
        if(this.saldo >= valor) {
            this.saldo -= valor;

            return true;
        }
        else if(this.saldo + this.limite >= valor) {
            this.limite = (this.saldo + this.limite) - valor;
            this.saldo -= valor;

            return true;
        }
        else return false;
    }

    //getters e setters

    //sobrecarga do método toString
    @Override
    public String toString() {
        return super.toString() + ", [limite: " + this.limite + "]";
    }
}