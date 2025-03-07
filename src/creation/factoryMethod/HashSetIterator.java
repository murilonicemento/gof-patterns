package creation.factoryMethod;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetIterator implements Iterator<ItemPedido> {
    public HashSetIterator(HashSet<ItemPedido> itens) {
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
