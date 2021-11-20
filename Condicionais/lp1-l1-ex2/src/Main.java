//As maçãs custam R$ 0,30 cada se forem compradas menos do que uma dúzia, e R$ 0,25 se forem compradas pelo menos doze. Escreva um programa que leia o número de maçãs compradas, calcule e escreva o valor total da compra.

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("-VALOR TOTAL DA COMPRA DE MAÇAS-");
        System.out.println("Entre com o número de maças:");
        int macasCompradas = sc.nextInt();

        double valor;
        if(macasCompradas < 12) {
            valor = macasCompradas * 0.30;
        }
        else {
            valor = macasCompradas * 0.25;
        }

        System.out.println(String.format("Valor total da compra: %.2f", valor));

        sc.close();
    }
}