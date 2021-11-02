import java.util.List;
import java.util.ArrayList;

public class Aviao {
    private int numero;
    private double limiteMaximoPeso;
    private List<Carga> cargas;

    public Aviao(int numero, double limiteMaximoPeso, Carga carga) {
        this.numero = numero;
        this.limiteMaximoPeso = limiteMaximoPeso;
        this.cargas = new ArrayList<>();
        this.cargas.add(carga);
    }

    public int getNumero() {
        return numero;
    }

    public double getLimiteMaximoPeso() {
        return limiteMaximoPeso;
    }

    public void adicionarCarga(Carga carga) {
        if(carga.getPeso() < this.getTotalDisponivel()) {
            cargas.add(carga);
        }else
            throw new IllegalArgumentException("Não é possível adicionar a carga devido o limite de peso do avião.");
    }

    public List<Carga> getCargas() {
        return cargas;
    }

    public double getTotalPeso() {
        double soma = 0.0;
        for (Carga c : getCargas()) {
            soma += c.getPeso();
        }
        return soma;
    }

    public double getTotalDisponivel() {
        double soma = 0.0;
        for (Carga c : getCargas()) {
            soma += c.getPeso();
        }
        return limiteMaximoPeso - soma;
    }
}