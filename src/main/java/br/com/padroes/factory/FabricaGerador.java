package br.com.padroes.factory;

public class FabricaGerador {

    public Gerador getGerador(TipoGerador tipoGerador) {
        if (TipoGerador.PDF.equals(tipoGerador)) {
            return new GeradorPdf();
        } else if (TipoGerador.XML.equals(tipoGerador)){
            return new GeradorXml();
        }
        return null;
    }
}
