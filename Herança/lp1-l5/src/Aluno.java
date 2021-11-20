//2. Escreva o código fonte da classe Aluno e considerar que a classe Aluno herda características da classe Pessoa. a) incluir os atributos prontuário (String) e email (String); b) incluir um método construtor que não recebe argumentos, incluir um método construtor que recebe argumentos para definir valores iniciais aos atributos; c) incluir métodos de acesso get/set aos respectivos atributos, incluir a sobrecarga do método toString da classe Object.

import java.time.LocalDate;

public class Aluno extends Pessoa {
    private String prontuario;
    private String email;

    public Aluno() {
        super();
        this.prontuario = "";
        this.email = "";
    }

    public Aluno(String nome, LocalDate nascimento, String prontuario, String email) {
        super(nome, nascimento);
        this.prontuario = prontuario;
        this.email = email;
    }

    public String getProntuario() {
        return prontuario;
    }

    public void setProntuario(String prontuario) {
        this.prontuario = prontuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return super.toString() + ", [prontuário: " + this.prontuario + ", e-mail: " + this.email + "]";
    }
}