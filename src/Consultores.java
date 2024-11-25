public class Consultores extends Funcionario {
    private double valorHora;
    private int horasTrabalhadas;

    public Consultores(String nome, int cpf, double valorHora, int horasTrabalhadas) {
        super(nome, cpf);
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public void calcularSalario() {
        double salario = valorHora * horasTrabalhadas;
        System.out.printf("Salário do consultor: %.2f%n", salario);
    }

    public double getValorHora() {
        return valorHora;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

}
