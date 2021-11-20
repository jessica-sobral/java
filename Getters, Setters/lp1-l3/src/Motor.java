//3. Escreva o código fonte da classe Motor, incluir os atributos tipo (String), tamanho (Double), incluir dois métodos construtores, incluir os métodos de acesso get/set aos atributos. Por exemplo: motor - tipo: gasolina, tamanho: 1.0.

public class Motor {
    private String tipo;
    private Double tamanho;

    public Motor() {
        this.tipo = "";
        this.tamanho = 0.0;
    }

    public Motor(String ti, Double ta) {
        this.tipo = ti;
        this.tamanho = ta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getTamanho() {
        return tamanho;
    }

    public void setTamanho(Double tamanho) {
        this.tamanho = tamanho;
    }
}