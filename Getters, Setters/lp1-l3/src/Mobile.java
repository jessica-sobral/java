//2. Escreva o código fonte da classe Mobile, incluir os atributos modelo(String), marca(String) e cartao(CartaoSim), incluir dois métodos construtores, incluir os métodos de acesso get/set aos atributos.

public class Mobile {
    private String modelo;
    private String marca;
    private CartaoSIM cartao;

    public Mobile() {
        this.modelo = "";
        this.marca = "";
        this.cartao = new CartaoSIM();
    }

    public Mobile(String mo, String ma, CartaoSIM ca) {
        this.modelo = mo;
        this.marca = ma;
        this.cartao = ca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public CartaoSIM getCartao() {
        return cartao;
    }

    public void setCartao(CartaoSIM cartao) {
        this.cartao = cartao;
    }
}