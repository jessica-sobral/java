public class Conta {
    private int codigo;
    private double saldo;
    private double limite;

    public Conta() {

    }

    public Conta(int codigo, double limite) {
        this.setCodigo(codigo);
        this.setLimite(limite);
    }

    public String consultarSaldo () {
        return "\nConta: " + codigo + "\nSaldo: " + saldo;
    }

    public boolean depositar(double valor) {
        if(valor > 0.0) {
            saldo = saldo + valor;
            return true;
        }
        else {
            return false;
        }
    }

    public boolean sacar(double valor) {
        if(saldo >= valor) {
            saldo = saldo - valor;

            return true;
        }
        else if(saldo + limite >= valor) {
            limite = (saldo + limite) - valor;
            saldo = saldo - valor;

            return true;
        }
        else {
            return false;
        }
    }

    public boolean transferir(Conta conta, double valor) {
        if(saldo >= valor) {
            saldo = saldo - valor;
            conta.saldo = conta.saldo + valor;

            return true;
        }
        else if(saldo + limite >= valor) {
            limite = (saldo + limite) - valor;
            saldo = saldo - valor;
            conta.saldo = conta.saldo + valor;

            return true;
        }
        else {
            return false;
        }
    }

    public void setCodigo(int codigo) {
        if(codigo > 0)
            this.codigo = codigo;
        else
            throw new IllegalArgumentException("O código da conta deve ser maior que zero.");
    }

    public int getCodigo() {
        return codigo;
    }

    public void setLimite(double limite) {
        if(limite > 0)
            this.limite = limite;
        else
            throw new IllegalArgumentException("O limite da conta deve ser maior que zero.");
    }

    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return saldo;
    }
}