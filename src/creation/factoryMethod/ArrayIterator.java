package creation.factoryMethod;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayIterator implements Iterator<ItemPedido> {
    public ArrayIterator(ArrayList<ItemPedido> itens) {
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public ItemPedido next() {
        return null;
    }
}
