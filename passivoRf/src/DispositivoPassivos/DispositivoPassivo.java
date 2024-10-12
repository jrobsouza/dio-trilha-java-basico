package DispositivoPassivos;

public class DispositivoPassivo {
    protected double perdaInsercao;
    protected double perdaTap;

    public double calcularAtenuacao(double sinalEntrada, double perda) {
        // Conversão de dB para razão e cálculo da atenuação
        double razao = Math.pow(10, -perda/10);
        return sinalEntrada * razao;
    }
}
