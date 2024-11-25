public abstract class Funcionario {
    private String nome;
    private int cpf;

    public Funcionario(String nome, int cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public abstract void calcularSalario();

    public String getNome() {
        return nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }



}
