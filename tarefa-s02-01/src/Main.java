import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("-CÁLCULO DE MÉDIA-");

        double media = 0;

        System.out.println("Entre com a quantidade de notas:");
        int qtdadeNotas = sc.nextInt();

        double[] nota = new double[qtdadeNotas];

        int i;
        for(i = 0; i < qtdadeNotas; ++i) {
            System.out.println("Entre com a nota " + (i+1));
            nota[i] = sc.nextDouble();
        }

        for(i = 0; i <qtdadeNotas; ++i) {
            media += nota[i];
        }

        media /= qtdadeNotas;

        System.out.println(String.format("Média: %.2f", media));

        sc.close();
    }
}