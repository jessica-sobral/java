import java.time.LocalDate;

public abstract class Conta {
    private int numero;
    private LocalDate dataAbertura;
    protected double saldo;
    protected double tarifa;

    //sobrecarga de Conta, método construtor herdado por ContaPoupanca
    public Conta(int numero, LocalDate dataAbertura, double saldo, double tarifa) {
        this.numero = numero;
        this.dataAbertura = dataAbertura;
        this.saldo = saldo;
        this.tarifa = tarifa;
    }

    //sobrecarga de Conta, método construtor herdado por ContaCorrente
    public Conta(int numero, LocalDate dataAbertura, double tarifa) {
        this.numero = numero;
        this.dataAbertura = dataAbertura;
        this.tarifa = tarifa;
    }

    //método sacar
    public boolean sacar(double valor) {
        this.saldo -= valor;
        return false;
    }

    //método depositar
    public boolean depositar(double valor) {
        if(valor > 0.0) {
            this.saldo += valor;
            return true;
        }
        else return false;
    }

    //getters e setters

    //sobrecarga do método toString
    @Override
    public String toString() {
        return "[número: " + this.numero + ", data de abertura: " + this.dataAbertura + ", saldo: " + this.saldo + ", tarifa: " + this.tarifa + "]";
    }
}