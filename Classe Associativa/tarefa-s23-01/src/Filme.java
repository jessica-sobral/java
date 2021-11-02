import java.util.List;
import java.util.ArrayList;

public class Filme {
    private String titulo;
    private int ano;
    private List<Papel> papeis;

    public Filme(String titulo, int ano) {
        this.titulo = titulo;
        this.ano = ano;
        this.papeis = new ArrayList<>();
    }

    public String getTitulo() {
        return this.titulo;
    }

    public int getAno() {
        return this.ano;
    }

    public void adicionarPapel(Papel papeis) {
        this.papeis.add(papeis);
    }

    public List<Papel> getPapeis() {
        return this.papeis;
    }
}