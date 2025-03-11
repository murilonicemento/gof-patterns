package creation.singleton;

import creation.abstractFactory.RegistrarClienteDecoder;
import creation.abstractFactory.RegistrarClienteXMLDecoder;
import creation.abstractFactory.RegistrarContaDecoder;
import creation.abstractFactory.RegistrarContaXMLDecoder;

public class XMLDecoderFactory extends DecoderFactory {

    private static XMLDecoderFactory factory = null;

    private XMLDecoderFactory() {
    }

    public static synchronized XMLDecoderFactory getFactory() {
        if (factory == null) {
            factory = new XMLDecoderFactory();
        }
        return factory;
    }

    @Override
    public RegistrarClienteDecoder createRegistrarClienteDecoder() {
        return new RegistrarClienteXMLDecoder();
    }

    @Override
    public RegistrarContaDecoder createRegistrarContaDecoder() {
        return new RegistrarContaXMLDecoder();
    }
}