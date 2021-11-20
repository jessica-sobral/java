//Escreva um programa na linguagem de programação Java que recebe um número inteiro do usuário e informe se o número é par ou ímpar.

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("-PAR OU ÍMPAR?-");
        System.out.println("Digite um número inteiro:");
        int numero = sc.nextInt();

        if(numero % 2 == 0) {
            System.out.println("O número é par!");
        }
        else {
            System.out.println("O número é ímpar!");
        }

        sc.close();
    }
}