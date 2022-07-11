import java.util.HashSet;

public class Pedido {

    private HashSet<ItemPedido> itensDentroCaixa = new HashSet<>();

    private HashSet<ItemPedido> itensForaCaixa = new HashSet<>();

    public void adicionarItemDentroCaixa(ItemPedido item){
        itensDentroCaixa.add(item);
    }


    public void adicionarItemForaCaixa(ItemPedido item) {
        itensForaCaixa.add(item);
    }

    public HashSet<ItemPedido> getItensDentroCaixa() {
        return itensDentroCaixa;
    }

    public HashSet<ItemPedido> getItensForaCaixa() {
        return itensForaCaixa;
    }

    @Override
    public String toString() {
        String foraDaCaixa = "\tFora da Caixa:\n";

        for (ItemPedido item : itensForaCaixa){
            foraDaCaixa += String.format("\t\t- %s %s\n", item.getTipo(), item.getNome());
        }

        String dentroDaCaixa = "\tDentro da Caixa:\n";

        for (ItemPedido item : itensDentroCaixa){
            dentroDaCaixa += String.format("\t\t- %s %s\n", item.getTipo(), item.getNome());
        }

        return foraDaCaixa + dentroDaCaixa;
    }


}
