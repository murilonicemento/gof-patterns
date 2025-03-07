package creation.factoryMethod;

import java.util.Collection;
import java.util.Iterator;

public class ItemPedido {
    private Produto produto;
    private int quantidade;
    private int precoUnitarioEmCentavos;

    public ItemPedido(Produto produto, int quantidade, int valorEmCentavos) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.precoUnitarioEmCentavos = valorEmCentavos;
    }

    public int valor() {
        return quantidade * precoUnitarioEmCentavos;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getPrecoUnitarioEmCentavos() {
        return precoUnitarioEmCentavos;
    }

    public void setPrecoUnitarioEmCentavos(int precoUnitarioEmCentavos) {
        this.precoUnitarioEmCentavos = precoUnitarioEmCentavos;
    }

    public void removerItensInvalidos(Collection<ItemPedido> itens) {
        Iterator<ItemPedido> iterator = itens.iterator();

        while (iterator.hasNext()) {
            ItemPedido item = iterator.next();

            if (!isValido(item)) iterator.remove();
        }
    }

    public boolean isValido(ItemPedido item) {
        return item.getQuantidade() > 0 && item.getQuantidade() < 100;
    }
}

