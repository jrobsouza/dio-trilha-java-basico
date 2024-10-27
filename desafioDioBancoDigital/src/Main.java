//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cliente roberto = new Cliente();
        roberto.setNome("roberto");

        Conta cc = new ContaCorrente(roberto);
        Conta poupanca = new ContaPoupanca(roberto);
        Conta cdi = new ContaCDI(roberto);

        cc.depositar(100);
        cc.transferir(100, poupanca);
        cdi.investir(200);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
        cdi.imprimirExtrato();
    }

}