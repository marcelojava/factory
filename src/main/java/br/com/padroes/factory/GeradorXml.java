package br.com.padroes.factory;

import java.util.logging.Logger;

public class GeradorXml implements Gerador{
    private static final Logger LOGGER = Logger.getLogger("GeradorXml");

    @Override
    public void gerar() {
        LOGGER.info("GERANDO ARQUIVO DO TIPO XML");
    }
}
