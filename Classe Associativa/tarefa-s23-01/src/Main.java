public class Main {
    public static void main(String[] args) {
        Ator a1 = new Ator("Elle Fanning");
        Ator a2 = new Ator("Justice Smith");
        Ator a3 = new Ator("Mavis");
        Ator a4 = new Ator("Jhonny");
        Ator a5 = new Ator("Drácula");

        Filme f1 = new Filme("Por lugares incríveis", 2012);
        Filme f2 = new Filme("Hotel transilvânia", 2020);

        System.out.println(f1.getTitulo() + ", " + f1.getAno());
        System.out.println(f2.getTitulo() + ", " + f2.getAno() + "\n");

        Papel p1 = new Papel("Violet Markey", a1, f1);
        Papel p2 = new Papel("Theodore Finch", a2, f1);
        Papel p3 = new Papel("Mavis", a3, f2);
        Papel p4 = new Papel("Jhonny", a4, f2);
        Papel p5 = new Papel("Drácula", a5, f2);

        a1.adicionarPapel(p1);
        a2.adicionarPapel(p2);
        a3.adicionarPapel(p3);
        a4.adicionarPapel(p4);
        a5.adicionarPapel(p5);

        f1.adicionarPapel(p1);
        f1.adicionarPapel(p2);
        f2.adicionarPapel(p3);
        f2.adicionarPapel(p4);
        f2.adicionarPapel(p5);

        System.out.println("PAPEIS DO FILME: " + f1.getTitulo());
        for(Papel p : f1.getPapeis()) {
            System.out.println("Papel " + p.getNome() + ", Ator " + p.getAtor().getNome() + ", Filme " + p.getFilme().getTitulo());
        }
        System.out.println();

        System.out.println("PAPEIS DO FILME: " + f2.getTitulo());
        for(Papel p : f2.getPapeis()) {
            System.out.println("Papel " + p.getNome() + ", Ator " + p.getAtor().getNome() + ", Filme " + p.getFilme().getTitulo());
        }
    }
}