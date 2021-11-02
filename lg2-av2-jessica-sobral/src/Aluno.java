public class Aluno {
    private String prontuario;
    private String nome;

    public Aluno() {

    }

    public Aluno(String prontuario, String nome) {
        this.setProntuario(prontuario.trim());
        this.setNome(nome.trim());
    }

    public void setProntuario(String prontuario) {
        if(prontuario.charAt(0) == 's' || prontuario.charAt(0) == 'S' && prontuario.charAt(1) == 'p' || prontuario.charAt(1) == 'P') {
            if(prontuario.length() == 8)
                this.prontuario = prontuario;
            else
                throw new IllegalArgumentException("O prontuário deve conter 8 caracteres e começar com 'SP'.");
        }
        else
            throw new IllegalArgumentException("O prontuário deve conter 8 caracteres e começar com 'SP'.");
    }

    public String getProntuario() {
        return prontuario;
    }

    public void setNome(String nome) {
        if(nome.trim().length() >= 5 && nome.trim().length() <= 100) {
            this.nome = nome;
        }
        else
            throw new IllegalArgumentException("O nome deve conter no mínimo 5 e máximo 100 caracteres e não é permitido só caracteres de espaço.");
    }

    public String getNome() {
        return nome;
    }
}