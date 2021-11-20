//Um comerciante comprou um produto e quer vendê-lo com um lucro de 45% se o valor da compra for menor que R$ 20,00; caso contrário, o lucro será de 30%. Elabore um programa que leia o valor do produto e imprima o valor de venda para o produto.

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("-VENDA-");
        System.out.println("Digite o valor do produto:");
        double valor = sc.nextDouble();

        double valorVenda;
        if(valor < 20.00) {
            valorVenda = valor * 1.45;
        }
        else {
            valorVenda = valor * 1.30;
        }

        System.out.println("Valor de venda para o produto:" + valorVenda);

        sc.close();
    }
}