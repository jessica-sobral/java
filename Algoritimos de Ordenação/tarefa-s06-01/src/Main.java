public class Main {
    public static void main(String[] args) {
        int[] numeros = {4, 7, 8, 2, 11, 3, 9, 1};
        int[] numerosOrdenados = Ordenacao.bubbleSort(numeros);

        VetorUtil.imprimirVetor(numeros);
        VetorUtil.imprimirVetor(numerosOrdenados);

        int[] numeros2 = {13, 5, 10, 6, 12, 14, 33};
        int[] numerosOrdenados2 = Ordenacao.insertionSort(numeros2);

        VetorUtil.imprimirVetor(numeros2);
        VetorUtil.imprimirVetor(numerosOrdenados2);
    }
}