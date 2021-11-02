//Programa para organizar o transporte de cargas aéreo.

class Main {
    public static void main(String[] args) {
        Carga c1 = new Carga(1, 400);
        Carga c2 = new Carga(2, 200);
        Carga c3 = new Carga(3, 200);
        //Carga c4 = new Carga(4, 275);

        Aviao a1 = new Aviao(1, 1000, c1);
        a1.adicionarCarga(c2);
        a1.adicionarCarga(c3);
        //a1.adicionarCarga(c4);

        System.out.println("Avião " + a1.getNumero() + ", " + a1.getLimiteMaximoPeso() + "\n");
        //System.out.println("c1, " + c1.getNumeroCarga() + ", " + c1. getPeso());

        for(Carga c : a1.getCargas()) {
            System.out.println("Carga " + c.getNumeroCarga() + ", " + c.getPeso());
        }

        System.out.println("\nPeso total " + a1.getTotalPeso());
        System.out.println("Peso disponível " + a1.getTotalDisponivel());
    }
}