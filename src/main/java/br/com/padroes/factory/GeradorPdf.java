package br.com.padroes.factory;

import java.util.logging.Logger;

public class GeradorPdf implements Gerador{

    private static final Logger LOGGER = Logger.getLogger("GeradorPdf");

    @Override
    public void gerar() {
        LOGGER.info("GERANDO ARQUIVO DO TIPO PDF");
    }
}
