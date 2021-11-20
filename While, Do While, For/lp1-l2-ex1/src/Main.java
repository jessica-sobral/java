//Faça um programa em linguagem de programação Java que leia números inteiros maiores que zero. Quando for digitado o número zero, o programa deverá apresentar quantos números foram digitados e a média destes.

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer numero = 0;
        int quantidade = 0, soma = 0;
        double media = 0;

        do {
            System.out.println("Digite um número maior que zero ou zero para sair: ");
            numero = sc.nextInt();

            if(numero > 0) {
                soma += numero;
                ++quantidade;
            }

        } while (numero != 0);

        media = soma / quantidade;

        System.out.println("\nQuantidade de números digitados: " + quantidade);
        System.out.println("Média: " + media);

        sc.close();
    }
}