package DispositivoPassivos;

public class main {
    public static void main(String[] args) {
        // Valores de entrada (exemplo)
        double sinalAlto = 38;
        double sinalBaixo = 33;
        double sinalTx = 17;
        double sinalRx = 37;

        // Criação dos dispositivos
        DC9 dc9 = new DC9();
        DC6 dc6 = new DC6();
        DSU8 dsu8 = new DSU8();

        // Cálculo das saídas
        double saidaInsercaoDC9 = dc9.calcularAtenuacao(sinalAlto, dc9.perdaInsercao);
        double saidaTapDC9 = dc9.calcularAtenuacao(sinalAlto, dc9.perdaTap);

        double saidaInsercaoDC6 = dc6.calcularAtenuacao(saidaInsercaoDC9, dc6.perdaInsercao);
        // ... outros cálculos para as demais saídas ...

        // Saídas do DSU8
        double[] saidasDSU8 = new double[8];
        for (int i = 0; i < 8; i++) {
            saidasDSU8[i] = dsu8.calcularAtenuacao(saidaTapDC9, dsu8.perdaInsercao);
        }

        // Impressão dos resultados
        System.out.println("Saída de Inserção DC9: " + saidaInsercaoDC9);
        System.out.println("Saída de Inserção DC6: " + saidaInsercaoDC6);
        System.out.println("Saída de Tap DC9: " + saidaTapDC9);
        System.out.println("Saída Inserção DSU8 (qualquer saída): " + saidasDSU8[0]);
    }
}