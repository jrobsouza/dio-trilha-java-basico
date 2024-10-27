public class ContaCDI extends Conta {
    public ContaCDI(Cliente cliente) {
        super(cliente);


    }
    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Investimento CDI ===");
        super.imprimirInfosComuns();
    }
}
