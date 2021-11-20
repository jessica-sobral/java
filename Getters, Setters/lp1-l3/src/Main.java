class Main {
    public static void main(String[] args) {
        //1. teste cartão
        CartaoSIM cs1 = new CartaoSIM("\nTim", "nano", 988888888);

        System.out.println(cs1.getOperadora() + " - " + cs1.getTamanho() + " - " + cs1.getNumero());

        //2. teste mobile
        Mobile mb1 = new Mobile("\nXuxuzin", "Xuxuzão", new CartaoSIM("Tim", "nano", 988888888));

        System.out.println(mb1.getModelo() + " - " + mb1.getMarca() + " - " + mb1.getCartao().getOperadora() + " - " + mb1.getCartao().getTamanho() + " - " + mb1.getCartao().getNumero());

        //3. teste Motor
        Motor m1 = new Motor("\ngasolina", 1.0);

        System.out.println(m1.getTipo() + " - " + m1.getTamanho());

        //4. teste Carro
        Carro c1 = new Carro("\nBMW", "série 5", new Motor("gasolina", 1.0));

        System.out.println(c1.getMarca() + " - " + c1.getModelo() + " - " + c1.getMotor().getTipo() + " - " + c1.getMotor().getTamanho());
    }
}