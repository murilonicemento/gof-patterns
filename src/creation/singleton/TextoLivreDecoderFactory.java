package creation.singleton;

import creation.abstractFactory.DecoderFactory;
import creation.abstractFactory.RegistrarClienteDecoder;
import creation.abstractFactory.RegistrarContaDecoder;

public class TextoLivreDecoderFactory {
    public static creation.singleton.DecoderFactory getInstance() {
        return new DecoderFactory() {
            @Override
            public RegistrarClienteDecoder createRegistrarClienteDecoder() {
                return null;
            }

            @Override
            public RegistrarContaDecoder createRegistrarContaDecoder() {
                return null;
            }
        };
    }
}
