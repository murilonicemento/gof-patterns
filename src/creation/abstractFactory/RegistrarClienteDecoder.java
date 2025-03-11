package creation.abstractFactory;

public class RegistrarClienteDecoder {
    public MsgRegistrarCliente decode(String textoMsg) {
        return new MsgRegistrarCliente();
    }
}
