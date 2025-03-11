package creation.abstractFactory;

public class TextoFixoDecoderFactory extends DecoderFactory {
    @Override
    public RegistrarClienteDecoder createRegistrarClienteDecoder() {
        return null;
    }

    @Override
    public RegistrarContaDecoder createRegistrarContaDecoder() {
        return null;
    }
}
