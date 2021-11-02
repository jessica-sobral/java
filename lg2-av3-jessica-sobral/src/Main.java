public class Main {
    public static void main(String[] args) {
        Curso c1 = new Curso("lógica 2", "lg2");
        Projeto p1 = new Projeto("c++", true, c1);
        Projeto p2 = new Projeto("java", true, c1);
        Projeto p3 = new Projeto("python", false, c1);

        Professor prof1 = new Professor("SP1025486", "lourival", "info");
        Aluno a1 = new Aluno("SP4267596", "joana", true);
        Aluno a2 = new Aluno("SP4561238", "nilson", true);
        Aluno a3 = new Aluno("SP4865236", "sara", true);

        p1.adicionarParticipante(a1);
        p2.adicionarParticipante(a1);
        p2.adicionarParticipante(a2);
        p2.adicionarParticipante(a3);
        //p3.adicionarParticipante(a3);

        System.out.println("\nprojetos de lg2: " + c1.getNumeroProjetos());//System.out.println("projetos ativos de lg2: " + c1.getNumeroProjetosAtivos());

        System.out.println("\nprojetos ativos de lg2: " + c1.getProjetosAtivos());

        System.out.println("\nparticipantes de c++: " + p1.getNumeroParticipantes());
        System.out.println("\nparticipantes de java: " + p2.getNumeroParticipantes());
        System.out.println("\nparticipantes de python: " + p3.getNumeroParticipantes());
    }
}
