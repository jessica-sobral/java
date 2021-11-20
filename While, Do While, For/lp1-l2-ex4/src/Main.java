//Escreva um programa em Java que solicita 10 números ao usuário, através de um laço while, e ao final mostre qual destes números é o maior.

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer numero;
        int maior = 0;
        int i = 1;

        while(i <= 10) {
            System.out.println("Entre com o número " + i + ": ");
            numero = sc.nextInt();

            if(numero > maior) {
                maior = numero;
            }

            ++i;
        }

        System.out.println("Dentre os 10 números, este é o maior: " + maior);

        sc.close();
    }
}