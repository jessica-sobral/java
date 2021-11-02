class Estatistica {
    public static double calcularMedia(double[] valores) {
        double soma = 0.0;

        for(double valor : valores) {
            soma += valor;
        }
        return soma/valores.length;
    }

    public static double calcularMaiorNota(double[] valores){
        double maiorNota = valores[1];

        for(int i = 0; i < valores.length; ++i){
            if(valores[i] > maiorNota)
                maiorNota = valores[i];
        }
        return maiorNota;
    }

    public static double calcularMenorNota(double[] valores){
        double menorNota = valores[1];

        for(int i = 0; i < valores.length; ++i){
            if(valores[i] < menorNota)
                menorNota = valores[i];
        }
        return menorNota;
    }
}