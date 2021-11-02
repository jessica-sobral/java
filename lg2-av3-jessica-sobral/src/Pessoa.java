public class Pessoa {
    protected String prontuario;
    protected String nome;

    public Pessoa(String prontuario, String nome) {
        this.prontuario = prontuario;
        this.nome = nome;
    }

    public String getProntuario() {
        return prontuario;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "[prontuario: " + this.prontuario + ", nome: " + this.nome + "]";
    }
}
