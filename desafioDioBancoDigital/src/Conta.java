import static java.lang.System.*;

public abstract class Conta implements IConta {

        private static final int AGENCIA_PADRAO = 1;
        private static int SEQUENCIAL = 1;

        protected int agencia;
        protected int numero;
        protected double saldo;
        protected Cliente cliente;
        protected double saldoCDI;


    public Conta(Cliente cliente) {
            this.agencia = Conta.AGENCIA_PADRAO;
            this.numero = SEQUENCIAL++;
            this.cliente = cliente;
        }

        @Override
        public void sacar(double valor) {
            saldo -= valor;
        }

        @Override
        public void depositar(double valor) {
            saldo += valor;
        }

        @Override
        public void transferir(double valor, IConta contaDestino) {
            this.sacar(valor);
            contaDestino.depositar(valor);
        }
        @Override
        public void investir(double valor) {
            saldoCDI+=valor;

        }


            public int getAgencia() {
            return agencia;
        }

        public int getNumero() {
            return numero;
        }

        public double getSaldo() {
            return saldo;
        }

    public double getSaldoCDI() {
        return saldoCDI;
    }


    protected void imprimirInfosComuns() {
            out.println(String.format("Titular: %s", this.cliente.getNome()));
            out.println(String.format("Agencia: %d", this.agencia));
            out.println(String.format("Numero: %d", this.numero));
            out.println(String.format("Saldo: %.2f", this.saldo));
            out.println(String.format("Saldo CDI: %.2f", this.saldoCDI));
        }
    }
