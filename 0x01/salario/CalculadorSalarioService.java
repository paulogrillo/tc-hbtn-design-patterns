import java.util.UUID;

public class CalculadorSalarioService {

    private static CalculadorSalarioService instancia = null;
    public UUID uuid = UUID.randomUUID();
    private CalculadorSalarioService() {
    }

    public static CalculadorSalarioService getCalculadorSalarioService(){
        if (instancia == null) {
            instancia = new CalculadorSalarioService();
        }
        return instancia;
    }

    public Double calcularSalarioLiquido(double salarioBruto, double valorDescontos, double valorVendas, double percentualComissao){
        return salarioBruto - valorDescontos + (valorVendas * (percentualComissao / 100));
    }

    public UUID getUuid() {
        return uuid;
    }

}
