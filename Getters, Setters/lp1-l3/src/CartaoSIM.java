//1. Escreva o código fonte da classe CartaoSIM, incluir os atributos operadora (String), tamanho (String) e numero (Integer), incluir dois métodos construtores e incluir os métodos de acesso get/set aos atributos. Por exemplo: cartãoSim – Tim, nano, 98888-8888.

public class CartaoSIM {
    private String operadora;
    private String tamanho;
    private Integer numero;

    public CartaoSIM() {
        this.operadora = "";
        this.tamanho = "";
        this.numero = 0;
    }

    public CartaoSIM(String op, String ta, Integer nu) {
        this.operadora = op;
        this.tamanho = ta;
        this.numero = nu;
    }

    public String getOperadora() {
        return operadora;
    }

    public void setOperadora(String operadora) {
        this.operadora = operadora;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }
}