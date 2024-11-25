public class Vendedores extends Funcionario {

    private double salarioMinimo;
    private double comissao;

    public Vendedores(String nome, int cpf, double salarioMinimo, double comissao) {
        super(nome, cpf);
        this.salarioMinimo = salarioMinimo;
        this.comissao = comissao;
    }

    public void calcularSalario() {
        double salario = salarioMinimo + comissao;
        System.out.printf("Salário do vendedor: %.2f%n", salario);
    }

    public double getValorVendas() {
        return salarioMinimo;
    }

    public double getComissao() {
        return comissao;
    }

    public void setValorVendas(double salarioMinimo) {
        this.salarioMinimo = salarioMinimo;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

}
