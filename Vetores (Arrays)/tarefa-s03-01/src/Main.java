import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("-MAIOR E MENOR VALOR-");

        System.out.println("Entre com a quantidade de elementos:");
        int qtdElementos = sc.nextInt();

        int[] elemento = new int[qtdElementos];

        for(int i = 0; i < qtdElementos; ++i){
            System.out.println("Entre com o elemento " + (i+1));
            elemento[i] = sc.nextInt();
        }

        int maior = elemento[0];
        for(int i = 0; i < qtdElementos; ++i) {
            if(elemento[i] > maior) {
                maior = elemento[i];
            }
        }

        System.out.println("Maior número:" + maior);

        int menor = elemento[0];
        for(int i = 0; i < qtdElementos; ++i) {
            if(elemento[i] < menor) {
                menor = elemento[i];
            }
        }

        System.out.println("Menor número:" + menor);

        sc.close();
    }
}
