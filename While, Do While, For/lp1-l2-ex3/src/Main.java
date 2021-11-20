//Escreva um programa em linguagem de programação Java que apresente todos os números pares entre 1 e 200.

class Main {
    public static void main(String[] args) {

        for(int i = 1; i <= 200; ++i) {
            if( i % 2 == 0)
                System.out.println(i);
        }
    }
}