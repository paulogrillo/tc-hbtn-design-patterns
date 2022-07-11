import java.util.ArrayList;
import java.util.List;

public class BebidaComAcucar extends  BebidaDecorator{

    public BebidaComAcucar(Bebida bebidaDecorada) {
        super(bebidaDecorada);
    }

    @Override
    public List<String> obterIngredientes() {
        List<String> listaIngredientes = super.obterIngredientes();
        listaIngredientes.add("acucar");

        return listaIngredientes;
    }

    @Override
    public Double obterPreco() {
        return super.obterPreco() + 1.9;
    }
}
