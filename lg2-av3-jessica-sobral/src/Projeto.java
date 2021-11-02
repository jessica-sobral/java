import java.util.ArrayList;
import java.util.List;

public class Projeto {
    private String titulo;
    private boolean ativo;
    private Curso curso;
    private List<Pessoa> participantes;

    public Projeto(String titulo, boolean ativo, Curso curso) {
        this.titulo = titulo;
        this.ativo = ativo;
        this.curso = curso;
        curso.adicionarProjeto(this);
        this.participantes = new ArrayList<>();
    }

    public Projeto(String titulo, boolean ativo) {
        this.titulo = titulo;
        this.ativo = ativo;
    }

    public void adicionarParticipante(Pessoa participante) {
        if(this.ativo) {
            this.participantes.add(participante);
        } else
            throw new IllegalArgumentException("Não é possível adicionar participante em um projeto não ativo.");
    }

    public int getNumeroParticipantes() {
        int total = 0;

        for(Pessoa p : participantes) {
            ++total;
        }
        return total;
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public Curso getCurso() {
        return curso;
    }

    @Override
    public String toString() {
        return "[titulo: " + this.titulo + ", ativo: " + this.ativo + "]";
    }
}
