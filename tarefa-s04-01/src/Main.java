// javac Main.java
// java Main
// java Main "Joao da Silva" 10.0 9.5 9.5 7.5
// java Main "Maria dos Santos" 7.0 6.5 10.0

class Main {
    public static void main(String[] args) {
        String nome = args[0];

        if(args.length > 2){
            double notas[] = new double[args.length - 1];
            for(int i = 0; i < args.length - 1; ++i) {
                notas[i] = Double.parseDouble(args[i+1]);
            }

            double media = Estatistica.calcularMedia(notas);
            double maiorNota = Estatistica.calcularMaiorNota(notas);
            double menorNota = Estatistica.calcularMenorNota(notas);

            exibirNota(nome, media, maiorNota, menorNota);
        }
        else{
            System.out.println("É necessário mais de duas notas para calcular as estatísticas!");
        }
    }

    // "João da Silva tem média 9.5"
    public static void exibirNota(String nome, double media, double maiorNota, double menorNota) {
        System.out.println(nome + " tem média " + String.format("%.2f", media));
        System.out.println("Maior nota:" + maiorNota);
        System.out.println("Menor nota:" + menorNota);
    }
}