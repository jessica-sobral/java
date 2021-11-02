class VetorUtil {
    public static int[] vetorSemZeros (int[] vetor) {
        int quantidade = 0;
        for(int i = 0; i < vetor.length; ++i) {
            if(vetor[i] != 0) {
                ++quantidade;
            }
        }

        int[] novoVetor = new int[quantidade];
        int j = 0;
        for(int i = 0; i < vetor.length; ++i) {
            if(vetor[i] != 0) {
                novoVetor[j] = vetor[i];
                ++j;
            }
        }

        return novoVetor;
    }

    public static int[] posicoesNumeroRepetido (int[] vetor, int numero) {
        int contador = 0;
        for(int i = 0; i < vetor.length; ++i) {
            if(vetor[i] == numero) {
                ++contador;
            }
        }

        int[] novoVetor = new int[contador];
        int j = 0;
        for(int i = 0; i < vetor.length; ++i) {
            if(vetor[i] == numero) {
                novoVetor[j] = i;
                ++j;
            }
        }

        return novoVetor;
    }

    public static int[] interseccaoVetores (int[] vetor1, int[] vetor2) {
        int[] novoVetor = new int[vetor1.length+vetor2.length];
        int contador = 0;

        for(int i = 0; i < vetor1.length; ++i) {
            for (int j = 0; j< vetor2.length; ++j) {
                if(vetor1[i] == vetor2[j]) {
                    boolean teste = true;
                    for(int k = 0; k < novoVetor.length; ++k) {
                        if(vetor1[i] == novoVetor[k]) {
                            teste = false;
                        }
                    }
                    if(teste == true){
                        novoVetor[contador] = vetor1[i];
                        ++contador;
                    }
                }
            }
        }

        return VetorUtil.vetorSemZeros(novoVetor);
    }

    public static void imprimirVetor (int[] vetor) {
        if(vetor.length == 0) {
            System.out.println("null");
        } else {
            for(int i = 0; i < vetor.length; ++i) {
                System.out.println(vetor[i]);
            }
        }
        System.out.println("-----------------");
    }
}