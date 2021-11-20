//1. Escreva o código fonte da classe Pessoa conforme apresentado no diagrama. a) incluir os atributos nome (String) e nascimento (LocalDate); b) incluir um método construtor que não recebe argumentos, incluir um método construtor que recebe argumentos para definir valores iniciais aos atributos; c) incluir os métodos de acesso get/set aos respectivos atributos, incluir a sobrecarga do método toString da classe Object.

import java.time.LocalDate;

public class Pessoa {
    private String nome;
    private LocalDate nascimento;

    public Pessoa() {
        this.nome = "";
        this.nascimento = LocalDate.now();
    }

    public Pessoa(String nome, LocalDate nascimento) {
        this.nome = nome;
        this.nascimento = nascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    @Override
    public String toString() {
        return "[nome: " + this.nome + ", nascimento: " + this.nascimento + "]";
    }
}