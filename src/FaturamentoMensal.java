public class FaturamentoMensal {
    private double [] faturamentoDiario;


    public FaturamentoMensal(double [] faturamentoDiario) {
        this.faturamentoDiario = faturamentoDiario;
    }
    public double calcularMenorFaturamento(){
        double menorValor = Double.MAX_VALUE;
        for(double valor : faturamentoDiario){
            if(valor >0 && valor <menorValor){
                menorValor = valor;
            }
        }
        return menorValor;
    }
    public double calcularMaiorFaturamento() {
        double maiorValor = Double.MIN_VALUE;
        for (double valor : faturamentoDiario) {
            if (valor > maiorValor) {
                maiorValor = valor;
            }
        }
        return maiorValor;
    }

    public int calcularDiasAcimaMedia() {
        double somaFaturamento = 0;
        int diasComFaturamento = 0;
        for (double valor : faturamentoDiario) {
            if (valor > 0) {
                somaFaturamento += valor;
                diasComFaturamento++;
            }
        }
        double mediaMensal = somaFaturamento / diasComFaturamento;

        int diasAcimaMedia = 0;
        for (double valor : faturamentoDiario) {
            if (valor > mediaMensal) {
                diasAcimaMedia++;
            }
        }
        return diasAcimaMedia;
    }
}
