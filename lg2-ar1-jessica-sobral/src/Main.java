public class Main {
    public static void main(String[] args) {
        int[] vetor1 = {0, 1, 0, 9, 3, 5};
        int[] resultado1 = VetorUtil.vetorSemZeros(vetor1);
        VetorUtil.imprimirVetor(resultado1);

        int[] vetor2 = {6, 8, 3, 8, 8, 8};
        int numero = 8;
        int[] resultado2 = VetorUtil.posicoesNumeroRepetido(vetor2, numero);
        VetorUtil.imprimirVetor(resultado2);

        int[] vetorA = {3, 6, 8, 7, 1, 6};
        int[] vetorB = {3, 9, 6, 1, 7, 3};
        int[] resultado3 = VetorUtil.interseccaoVetores(vetorA, vetorB);
        VetorUtil.imprimirVetor(resultado3);
    }
}
