public class Ordenacao {
    // Isolar o método bubbleSort em uma classe Ordenacao
    public static int[] bubbleSort(int[] vetor) {
        vetor = VetorUtil.copiar(vetor);

        int aux;

        for(int i = 0; i < vetor.length; i++) {
            for(int j = 0; j < vetor.length - 1; j++) {
                if(vetor[j] > vetor[j+1]) {
                    aux = vetor[j];
                    vetor[j] = vetor[j+1];
                    vetor[j+1] = aux;
                }
            }
        }
        return vetor;
    }

    // Pesquisar e implementar na classe Ordenacao o algoritmo Insertion Sort
    public static int[] insertionSort(int[] vetor) {
        vetor = VetorUtil.copiar(vetor);

        int auxiliar, j;
        for (int i = 1; i < vetor.length; i++) {
            j = i;
            while ((j > 0) && (vetor[j] < vetor[j-1])) {
                auxiliar = vetor[j];
                vetor[j] = vetor[j-1];
                vetor[j-1] = auxiliar;
                --j;
            }
        }
        return vetor;
    }
}