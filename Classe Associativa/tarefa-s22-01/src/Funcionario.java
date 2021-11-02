import java.util.List;
import java.util.ArrayList;

public class Funcionario {
    private String nome;
    private List<Funcionario> subordinados;

    public Funcionario(String nome) {
        this.nome = nome;
        this.subordinados = new ArrayList<>();
    }

    public void addSubordinado(Funcionario funcionario) {
        if(getSubordinados().size() < 5) {
            this.subordinados.add(funcionario);
        } else
            throw new IllegalArgumentException("Um funcionário pode ter no máximo 5 funcionários.");
    }

    public List<Funcionario> getSubordinados() {
        return subordinados;
    }

    public boolean isChefe() {
        return subordinados.size() > 0;
    }

    public String getNome() {
        return this.nome;
    }

    public int getQuantidadeSubordinados() {
        return getSubordinados().size();
    }
}