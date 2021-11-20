//3. Escreva o código fonte da classe Bolsista e considerar que a classe Bolsista herda características da classe Aluno. a) incluir o atributo valor (Double); b) incluir um método construtor que não recebe argumentos, incluir um método construtor que recebe argumentos para definir valores iniciais aos atributos; c) incluir métodos de acesso get/set aos respectivos atributos, incluir a sobrecarga do método toString da classe Object.

import java.time.LocalDate;

public class Bolsista extends Aluno {
    private Double valor;

    public Bolsista() {
        super();
        this.valor = 0.0;
    }

    public Bolsista(String nome, LocalDate nascimento, String prontuario, String email, Double valor) {
        super(nome, nascimento, prontuario, email);
        this.valor = valor;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return super.toString() + ", [valor: " + this.valor + "]";
    }
}