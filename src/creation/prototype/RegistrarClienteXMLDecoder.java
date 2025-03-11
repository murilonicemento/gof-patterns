package creation.prototype;

import creation.abstractFactory.MsgRegistrarCliente;

import java.util.HashMap;

public class RegistrarClienteXMLDecoder {

    private HashMap<String, MsgRegistrarCliente> prototypes;

    public RegistrarClienteXMLDecoder(HashMap<String, MsgRegistrarCliente> prototypes) {
        this.prototypes = prototypes;
    }

    public MsgRegistrarCliente decode(String textoMsg, String origem) {
        MsgRegistrarCliente prototype = prototypes.get(origem);

        if (prototype == null) {
            throw new IllegalArgumentException("Origem desconhecida: " + origem);
        }

        MsgRegistrarCliente msg = (MsgRegistrarCliente) prototype.clone();

        // Aqui viria o código de decodificação e preenchimento dos atributos
        // do objeto MsgRegistrarCliente

        return msg;
    }
}
