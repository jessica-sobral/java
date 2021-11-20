//Escreva um programa Java que pergunta um número ao usuário, e mostra sua tabuada completa (de 1 até 10).

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        int total;

        System.out.println("\nDigite um número: ");
        numero = sc.nextInt();

        int i = 1;

        while(i <= 10) {
            total = numero * i;

            System.out.println(+ numero + " X " + i + " = " + total);

            ++i;
        }

        sc.close();
    }
}