public class Impressao {

    private int paginasTotais;
    private int paginasColoridas;
    private boolean ehFrenteVerso;
    private double valorColoridasFrenteVerso;
    private double valorPretoBrancoFrenteVerso;
    private double valorColoridasFrenteApenas;
    private double valorPretoBrancoFrenteApenas;
    private double valorTotal;
    private TamanhoImpressao tamanhoImpressao;
    private int paginasBrancoPreto;

    public Impressao(TamanhoImpressao tamanhoImpressao, int totalPaginas, int qtdColoridas, boolean freteVerso) {
        this.tamanhoImpressao = tamanhoImpressao;
        this.paginasTotais = totalPaginas;
        this.paginasColoridas = qtdColoridas;
        this.ehFrenteVerso = freteVerso;
        this.paginasBrancoPreto = totalPaginas - qtdColoridas;
    }


    public int getPaginasTotais() {
        return paginasTotais;
    }

    public void setPaginasTotais(int paginasTotais) {
        this.paginasTotais = paginasTotais;
    }

    public int getPaginasColoridas() {
        return paginasColoridas;
    }

    public void setPaginasColoridas(int paginasColoridas) {
        this.paginasColoridas = paginasColoridas;
    }

    public boolean isEhFrenteVerso() {
        return ehFrenteVerso;
    }

    public void setEhFrenteVerso(boolean ehFrenteVerso) {
        this.ehFrenteVerso = ehFrenteVerso;
    }

    public double getValorColoridasFrenteVerso() {
        return valorColoridasFrenteVerso;
    }

    public void setValorColoridasFrenteVerso(double valorColoridasFrenteVerso) {
        this.valorColoridasFrenteVerso = valorColoridasFrenteVerso;
    }

    public double getValorPretoBrancoFrenteVerso() {
        return valorPretoBrancoFrenteVerso;
    }

    public void setValorPretoBrancoFrenteVerso(double valorPretoBrancoFrenteVerso) {
        this.valorPretoBrancoFrenteVerso = valorPretoBrancoFrenteVerso;
    }

    public double getValorColoridasFrenteApenas() {
        return valorColoridasFrenteApenas;
    }

    public void setValorColoridasFrenteApenas(double valorColoridasFrenteApenas) {
        this.valorColoridasFrenteApenas = valorColoridasFrenteApenas;
    }

    public double getValorPretoBrancoFrenteApenas() {
        return valorPretoBrancoFrenteApenas;
    }

    public void setValorPretoBrancoFrenteApenas(double valorPretoBrancoFrenteApenas) {
        this.valorPretoBrancoFrenteApenas = valorPretoBrancoFrenteApenas;
    }

    public Impressao(int paginasTotais, int paginasColoridas, boolean ehFrenteVerso, double valorColoridasFrenteVerso, double valorPretoBrancoFrenteVerso, double valorColoridasFrenteApenas, double valorPretoBrancoFrenteApenas) {
        this.paginasTotais = paginasTotais;
        this.paginasColoridas = paginasColoridas;
        this.ehFrenteVerso = ehFrenteVerso;
        this.valorColoridasFrenteVerso = valorColoridasFrenteVerso;
        this.valorPretoBrancoFrenteVerso = valorPretoBrancoFrenteVerso;
        this.valorColoridasFrenteApenas = valorColoridasFrenteApenas;
        this.valorPretoBrancoFrenteApenas = valorPretoBrancoFrenteApenas;
    }

    public double calcularTotal() {

        if (tamanhoImpressao == TamanhoImpressao.A2 && ehFrenteVerso == false){
            valorPretoBrancoFrenteApenas = 0.22;
            valorColoridasFrenteApenas = 0.32;
            valorTotal =  (paginasBrancoPreto*valorPretoBrancoFrenteApenas) + (paginasColoridas*valorColoridasFrenteApenas);
        }else if(tamanhoImpressao == TamanhoImpressao.A2 && ehFrenteVerso == true){
            valorPretoBrancoFrenteVerso = 0.18;
            valorColoridasFrenteVerso = 0.28;
            valorTotal = (paginasBrancoPreto*valorPretoBrancoFrenteVerso) + (paginasColoridas*valorColoridasFrenteVerso);
        }else if(tamanhoImpressao == TamanhoImpressao.A3 && ehFrenteVerso == false){
            valorPretoBrancoFrenteApenas = 0.20;
            valorColoridasFrenteApenas = 0.30;
            valorTotal =  (paginasBrancoPreto*valorPretoBrancoFrenteApenas) + (paginasColoridas*valorColoridasFrenteApenas);
        }else if(tamanhoImpressao == TamanhoImpressao.A3 && ehFrenteVerso == true){
            valorPretoBrancoFrenteVerso = 0.15;
            valorColoridasFrenteVerso = 0.25;
            valorTotal = (paginasBrancoPreto*valorPretoBrancoFrenteVerso) + (paginasColoridas*valorColoridasFrenteVerso);
        }else if(tamanhoImpressao == TamanhoImpressao.A4 && ehFrenteVerso == false) {
            valorPretoBrancoFrenteApenas = 0.15;
            valorColoridasFrenteApenas = 0.25;
            valorTotal = (paginasBrancoPreto * valorPretoBrancoFrenteApenas) + (paginasColoridas * valorColoridasFrenteApenas);
        } else if(tamanhoImpressao == TamanhoImpressao.A4 && ehFrenteVerso == true) {
            valorPretoBrancoFrenteVerso = 0.10;
            valorColoridasFrenteVerso = 0.20;
            valorTotal = (paginasBrancoPreto * valorPretoBrancoFrenteVerso) + (paginasColoridas * valorColoridasFrenteVerso);
        }
        return valorTotal;
    }

    @Override
    public String toString() {

        String frenteVerso;
        if (ehFrenteVerso == true){
            frenteVerso = "frente e verso";
        }else {
            frenteVerso = "frente apenas";
        }
        return String.format("total de paginas: %d, total coloridas: %d, total preto e branco: %d, %s. total: R$ %.2f", getPaginasTotais(), getPaginasColoridas(), getPaginasTotais() - getPaginasColoridas(),frenteVerso,calcularTotal());
    }

}