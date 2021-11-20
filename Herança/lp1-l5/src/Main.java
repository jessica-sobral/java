import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Bruno", LocalDate.now());
        System.out.println(p1.toString());
        System.out.println();

        Aluno a1 = new Aluno("Beatriz", LocalDate.now(), "SP6478596", "bia@gmail.com");
        System.out.println(a1.toString());
        System.out.println();

        Bolsista b1 = new Bolsista("Jorel", LocalDate.now(), "SP5263562", "jorelzinho@gmail.com", 240.99);
        System.out.println(b1.toString());
        System.out.println();

        Atleta at1 = new Atleta("Rafaella", LocalDate.now(), "SP7896425", "rafinha@gmail.com", "Salto triplo");
        System.out.println(at1.toString());

    }
}