package passivoDC;

public class DispositivoDC6 {
   private double valorAlto;
   private double valorBaixo;
   private double valorTx;
   private double valorRx;

   private final double perdaInsercao = 2.5; // perda constante de 2,5 dB
    private final double perdaTap = 6.0; // perda constante de 6 dB

        // Métodos para definir os valores de entrada RF
        public void setValoresRF(double alto, double baixo, double tx, double rx) {
            this.valorAlto = alto;
            this.valorBaixo = baixo;
            this.valorTx = tx;
            this.valorRx = rx;
        }

        // Métodos para obter as saídas com as perdas
        public double getSaidaInsercaoAlto() {
            return this.valorAlto - this.perdaInsercao;
        }

        public double getSaidaInsercaoBaixo() {
            return this.valorBaixo - this.perdaInsercao;
        }

        public double getSaidaInsercaoTx() {
            return this.valorTx + this.perdaInsercao;
        }

        public double getSaidaInsercaoRx() {
            return this.valorRx - this.perdaInsercao;
        }

        public double getSaidaTapAlto() {
            return this.valorAlto - this.perdaTap;
        }

        public double getSaidaTapBaixo() {
            return this.valorBaixo - this.perdaTap;
        }

        public double getSaidaTapTx() {
            return this.valorTx + this.perdaTap;
        }

        public double getSaidaTapRx() {
            return this.valorRx - this.perdaTap;
        }

        public static void main(String[] args) {
            passivoDC.DispositivoDC6 dispositivo = new passivoDC.DispositivoDC6();
            dispositivo.setValoresRF(38.0, 33.0, 17.0, 37.0); // Exemplo de valores de entrada RF

            System.out.println("Saída de Inserção (Alto): " + dispositivo.getSaidaInsercaoAlto() + " dB");
            System.out.println("Saída de Inserção (Baixo): " + dispositivo.getSaidaInsercaoBaixo() + " dB");
            System.out.println("Saída de Inserção (TX): " + dispositivo.getSaidaInsercaoTx() + " dB");
            System.out.println("Saída de Inserção (RX): " + dispositivo.getSaidaInsercaoRx() + " dB");

            System.out.println("Saída Tap (Alto): " + dispositivo.getSaidaTapAlto() + " dB");
            System.out.println("Saída Tap (Baixo): " + dispositivo.getSaidaTapBaixo() + " dB");
            System.out.println("Saída Tap (TX): " + dispositivo.getSaidaTapTx() + " dB");
            System.out.println("Saída Tap (RX): " + dispositivo.getSaidaTapRx() + " dB");
        }
    }


