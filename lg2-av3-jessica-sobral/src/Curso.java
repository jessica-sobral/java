import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nome;
    private String sigla;
    private List<Projeto> projetos;

    public Curso(String nome, String sigla) {
        this.nome = nome;
        this.sigla = sigla;
        this.projetos = new ArrayList<>();
    }

    public void adicionarProjeto(Projeto projetos) {
        this.projetos.add(projetos);
    }

    public int getNumeroProjetos() {
        int total = 0;

        for(Projeto p : projetos) {
            ++total;
        }
        return total;
    }

    public List<Projeto> getProjetosAtivos() {
        List<Projeto> projetosAtivos = new ArrayList<>();

        for(Projeto p : projetos) {
            if(p.getAtivo()) {
                projetosAtivos.add(p);
            }
        }
        return projetosAtivos;
    }

    public int getNumeroProjetosAtivos() {
        int total = 0;

        for(Projeto p : getProjetosAtivos()) {
            ++ total;
        }
        return total;
    }

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }

    @Override
    public String toString() {
        return "[nome: " + this.nome + ", sigla: " + this.sigla + "]";
    }
}
