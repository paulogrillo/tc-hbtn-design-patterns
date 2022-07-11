import java.util.ArrayList;
import java.util.List;
public abstract class Bebida {
    public abstract  List<String> obterIngredientes();
    public abstract Double obterPreco();

    @Override
    public String toString() {
        return String.format("Preco: %.2f - Ingredientes: %s", obterPreco(), obterIngredientes());
    }
}
