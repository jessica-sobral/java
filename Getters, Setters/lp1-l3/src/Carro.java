//4. Escreva o código fonte da classe Carro, incluir os atributos marca (String), modelo (String) e motor (Motor), incluir dois métodos construtores, incluir os métodos de acesso get/set aos atributos.

public class Carro {
    private String marca;
    private String modelo;
    private Motor motor;

    public Carro() {
        this.marca = "";
        this.modelo = "";
        this.motor = new Motor();
    }

    public Carro(String ma, String mo, Motor mot) {
        this.marca = ma;
        this.modelo = mo;
        this.motor = mot;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }
}