package creation.abstractFactory;

public abstract class DecoderFactory {
    public abstract RegistrarClienteDecoder createRegistrarClienteDecoder();

    public abstract RegistrarContaDecoder createRegistrarContaDecoder();

    public static DecoderFactory fabricaParaOrigem(String origem) {
        if ("X".equals(origem)) {
            return new XMLDecoderFactory();
        } else if ("Y".equals(origem)) {
            return new CSVDecoderFactory();
        } else if ("Z".equals(origem)) {
            return new TextoFixoDecoderFactory();
        }
        return null; // Retorno caso a origem não seja reconhecida
    }
}