import java.time.LocalDate;

public class Conta {
    private int numero;
    private LocalDate dataAbertura;
    protected double saldo;
    protected double tarifa;
    private Correntista correntista;

    public Conta(int numero, LocalDate dataAbertura, double saldo, double tarifa, Correntista correntista) {
        this.numero = numero;
        this.dataAbertura = dataAbertura;
        this.saldo = saldo;
        this.tarifa = tarifa;
        this.correntista = correntista;
        this.correntista.adicionarConta(this);
    }

    public Conta(int numero, LocalDate dataAbertura, double tarifa, Correntista correntista) {
        this.numero = numero;
        this.dataAbertura = dataAbertura;
        this.tarifa = tarifa;
        this.correntista = correntista;
        this.correntista.adicionarConta(this);
    }

    public boolean sacar(double valor) {
        this.saldo -= valor;
        return false;
    }

    public boolean depositar(double valor) {
        if(valor > 0.0) {
            this.saldo += valor;
            return true;
        }
        else return false;
    }

    public double calcularTarifa() {
        return 0;
    }

    public int getNumero() {
        return this.numero;
    }

    public LocalDate getDataAbertura() {
        return this.dataAbertura;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public double getTarifa() {
        return this.tarifa;
    }

    @Override
    public String toString() {
        return "[número: " + this.numero + ", data de abertura: " + this.dataAbertura + ", saldo: " + this.saldo + ", tarifa: " + this.tarifa + ", correntista: " + this.correntista + "]";
    }
}