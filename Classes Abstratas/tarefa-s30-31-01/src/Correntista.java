import java.util.ArrayList;
import java.util.List;

public class Correntista {
    private int codigo;
    private String nome;
    private List<Conta> contas;

    public Correntista(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
        this.contas = new ArrayList<>();
    }

    public double totalTarifas() {
        double total = 0.0;

        for(Conta c : contas) {
            total += c.calcularTarifa();
        }
        return total;
    }

    public void adicionarConta(Conta contas) {
        this.contas.add(contas);
    }

    public List<Conta> getContas() {
        return this.contas;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public String getNome() {
        return this.nome;
    }

    @Override
    public String toString() {
        return "[código: " + this.codigo + ", nome: " + this.nome + "]";
    }
}