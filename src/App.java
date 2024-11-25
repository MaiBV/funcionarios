import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);

        Funcionario vendedor = new Vendedores("João", 123456789, 1000.00, 500.00);
        Funcionario consultor = new Consultores("Maria", 987654321, 50.00, 40);

        vendedor.calcularSalario();
        consultor.calcularSalario();
    }
}
