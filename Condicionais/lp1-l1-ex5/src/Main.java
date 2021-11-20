//Faça um programa Java que solicita a idade de uma pessoa e informa se ela pode votar (idade>=16).

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("-VOTO-");
        System.out.println("Qual sua idade?");
        int idade = sc.nextInt();

        if(idade >= 16) {
            System.out.println("Você já pode votar!");
        }
        else {
            System.out.println("Você ainda não pode votar!");
        }

        sc.close();
    }
}