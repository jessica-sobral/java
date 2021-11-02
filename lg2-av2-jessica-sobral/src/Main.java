class Main {
    public static void main(String[] args) {
        Aluno a1 = new Aluno(" SP654782", " Joana Silva ");
        System.out.println(a1.getProntuario() + ", " + a1.getNome() + "\n");

        Aluno a2 = new Aluno("sP465798", "Marquinhos Freire");
        System.out.println(a2.getProntuario() + ", " + a2.getNome() + "\n");

        Aluno a3 = new Aluno("s64862", "Roberto Cunha");
        System.out.println(a3.getProntuario() + ", " + a3.getNome() + "\n");

        Aluno a4 = new Aluno("673845", "      ");
        System.out.println(a4.getProntuario() + ", " + a4.getNome() + "\n");

        Aluno a5 = new Aluno("Sp222567", "Joao da Silva Santos Gomes Pereira Morae Alves Oliveira Silva de Sales Gomes de Lamor Alfaiate Junior");
        System.out.println(a5.getProntuario() + ", " + a5.getNome() + "\n");
    }
}