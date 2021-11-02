//Associação reflexiva.

public class Main {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario ("João");
        Funcionario f2 = new Funcionario ("Pedro");
        Funcionario f3 = new Funcionario ("Maria");
        Funcionario f4 = new Funcionario ("Lucas");
        Funcionario f5 = new Funcionario ("Alice");
        Funcionario f6 = new Funcionario ("Ellie");
        //Funcionario f7 = new Funcionario ("Mário");

        f1.addSubordinado(f2);
        f1.addSubordinado(f3);
        f1.addSubordinado(f4);
        f1.addSubordinado(f5);
        f1.addSubordinado(f6);
        //f1.addSubordinado(f7);

        System.out.println("f1, " + f1.isChefe());
        System.out.println("f2, " + f2.isChefe());
        System.out.println("f3, " + f3.isChefe());
        System.out.println("f4, " + f4.isChefe());
        System.out.println("f5, " + f5.isChefe());
        System.out.println("f6, " + f6.isChefe() + "\n");
        //System.out.println("f7" + f7.isChefe());

        for(Funcionario f : f1.getSubordinados()) {
            System.out.println(f.getNome());
        }

        System.out.println(f1.getQuantidadeSubordinados());
    }
}