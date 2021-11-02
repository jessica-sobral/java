class Main {
    public static void main(String[] args) {
        int[] numeros = {11, 22, 33, 44, 55, 66};

        System.out.println("\nSoma recursiva:" + somaRecursiva(numeros, numeros.length));
        System.out.println("\nSoma iterativa:" + somaIterativa(numeros));
    }

    public static int somaRecursiva(int[] numeros, int qtdElementos) {
        if(qtdElementos == 1) {
            return numeros[qtdElementos - 1];
        }
        return numeros[qtdElementos - 1] + somaRecursiva(numeros, qtdElementos - 1);
    }

    public static int somaIterativa(int[] numeros) {
        int soma = 0;

        for(int i = 0; i < numeros.length; ++i) {
            soma += numeros[i];
        }
        return soma;
    }
}