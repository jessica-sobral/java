import java.util.List;
import java.util.ArrayList;

public class Ator {
    private String nome;
    private List<Papel> papeis;

    public Ator(String nome) {
        this.nome = nome;
        this.papeis = new ArrayList<>();
    }

    public String getNome() {
        return this.nome;
    }

    public void adicionarPapel(Papel papeis) {
        this.papeis.add(papeis);
    }

    public List<Papel> getPapeis() {
        return this.papeis;
    }
}