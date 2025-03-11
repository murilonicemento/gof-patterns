package creation.singleton;

import creation.abstractFactory.RegistrarClienteDecoder;
import creation.abstractFactory.RegistrarContaDecoder;

import java.util.HashMap;

public abstract class DecoderFactory {

    private static final HashMap<String, DecoderFactory> factoryMap = new HashMap<>();

    static {
        factoryMap.put("X", XMLDecoderFactory.getInstance());
        factoryMap.put("Y", CSVDecoderFactory.getInstance());
        factoryMap.put("Z", TextoLivreDecoderFactory.getInstance());
    }

    public static DecoderFactory getInstance() {
        return factoryMap.get(origem);
    }

    public abstract RegistrarClienteDecoder createRegistrarClienteDecoder();

    public abstract RegistrarContaDecoder createRegistrarContaDecoder();
}