package creation.abstractFactory;

public class XMLDecoderFactory extends DecoderFactory {
    @Override
    public RegistrarClienteDecoder createRegistrarClienteDecoder() {
        return new RegistrarClienteXMLDecoder();
    }

    @Override
    public RegistrarContaDecoder createRegistrarContaDecoder() {
        return new RegistrarContaXMLDecoder();
    }
}