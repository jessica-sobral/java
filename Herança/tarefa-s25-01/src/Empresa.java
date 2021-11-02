import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String cnpj;
    private String nome;
    private final List<ContaSalario> contasSalario;

    public Empresa(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.contasSalario = new ArrayList<>();
    }

    public void adicionarContaSalario(ContaSalario contasSalario) {
        this.contasSalario.add(contasSalario);
    }

    public List<ContaSalario> getContasSalario() {
        return this.contasSalario;
    }

    @Override
    public String toString() {
        return "[empresa: " + this.nome + ", cnpj: " + this.cnpj + "]";
    }
}