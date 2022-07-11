import java.util.ArrayList;
import java.util.List;

public class BebidaCafe extends Bebida{
    @Override
    public List<String> obterIngredientes() {

        List<String> listaIngredientes = new ArrayList<>();
        listaIngredientes.add("cafe");

        return listaIngredientes;
    }

    @Override
    public Double obterPreco() {
        return 5.35;
    }
}
