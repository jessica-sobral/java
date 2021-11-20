//4. Escreva o código fonte da classe Atleta e considerar que a classe Atleta herda características da classe Aluno. a) inclui o atributo modalidade (String); b) incluir um método construtor que não recebe argumentos, incluir um método construtor que recebe argumentos para definir valores iniciais aos atributos; c) incluir métodos de acesso get/set aos respectivos atributos, incluir a sobrecarga do método toString da classe Object.

import java.time.LocalDate;

public class Atleta extends Aluno {
    private String modalidade;

    public Atleta() {
        super();
        this.modalidade = "";
    }

    public Atleta(String nome, LocalDate nascimento, String prontuario, String email, String modalidade) {
        super(nome, nascimento, prontuario, email);
        this.modalidade = modalidade;
    }

    public String getModalidade() {
        return modalidade;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }

    @Override
    public String toString() {
        return super.toString() + ", [modalidade: " + this.modalidade + "]";
    }
}