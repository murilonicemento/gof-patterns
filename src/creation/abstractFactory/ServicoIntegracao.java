package creation.abstractFactory;

public class ServicoIntegracao {

    public void registrarCliente(String textoMsg, String origem) {
        DecoderFactory decoderFactory = DecoderFactory.fabricaParaOrigem(origem);
        RegistrarClienteDecoder msgDecoder = decoderFactory.createRegistrarClienteDecoder();
        MsgRegistrarCliente msg = msgDecoder.decode(textoMsg);
        // código para o tratamento da mensagem recebida
    }

    public void registrarConta(String textoMsg, String origem) {
        DecoderFactory decoderFactory = DecoderFactory.fabricaParaOrigem(origem);
        RegistrarContaDecoder msgDecoder = decoderFactory.createRegistrarContaDecoder();
        MsgRegistrarConta msg = msgDecoder.decode(textoMsg);
        // código para tratamento da mensagem MsgRegistrarConta
    }

    // operações para recepção e tratamento das demais mensagens
}
