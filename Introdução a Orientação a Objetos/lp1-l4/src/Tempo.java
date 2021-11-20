//3. Crie uma classe Tempo com três atributos: horas, minutos e segundos. Crie dois construtores: um para inicializar os atributos com valor zero e outro para inicializar os atributos com valores passados como argumentos. Crie métodos para: a) métodos de acesso get/set para os atributos; b) método para imprimir os atributos no formato hh:mm:ss; c) método horasemsegundos que não recebe argumentos e caso o valor do atributo horas seja maior que zero retorna o valor da quantidade de horas em segundos, caso contrário retorna o valor zero; d) método minutosemsegundos que não recebe argumentos e caso o valor do atributo minutos seja maior que zero retorna o valor da quantidade de minutos em segundos, caso contrário retorna o valor zero;

public class Tempo{
    private int horas;
    private int minutos;
    private int segundos;

    public Tempo() {
        this.horas = 0;
        this.minutos = 0;
        this.segundos = 0;
    }

    public Tempo(int hh, int mm, int ss) {
        this.horas = hh;
        this.minutos = mm;
        this.segundos = ss;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int hh) {
        this.horas = hh;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int mm) {
        this.minutos = mm;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int ss) {
        this.segundos = ss;
    }

    public void tempoFormatado() {
        System.out.println(String.format("%02d:%02d:%02d", horas, minutos, segundos));
    }

    public int horasEmSegundos() {
        if(horas > 0) {
            return 3600 * horas;
        } else return 0;
    }

    public int minutosEmSegundos() {
        if(minutos > 0) {
            return 60 * minutos;
        } else return 0;
    }
}