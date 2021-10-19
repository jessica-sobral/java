import java.time.LocalDate;

public class ContaCorrente extends Conta {
    private double limite;

    public ContaCorrente(int numero, LocalDate dataAbertura, double tarifa, Correntista correntista, double limite) {
        super(numero, dataAbertura, tarifa, correntista);
        this.limite =  limite;
    }

    @Override
    public double calcularTarifa() {
        return 5;
    }

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

    public void setLimite(double limite) {
        if(limite > 0)
            this.limite = limite;
        else
            throw new IllegalArgumentException("O limite da conta deve ser maior que zero.");
    }

    public double getLimite() {
        return this.limite;
    }

    @Override
    public String toString() {
        return super.toString() + ", [limite: " + this.limite + "]";
    }
}