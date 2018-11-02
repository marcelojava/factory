import br.com.padroes.factory.*;
import org.junit.Assert;
import org.junit.Test;

public class FabricaGeradorTest {

    @Test
    public void deveRetornarGeradorPdf() {
        FabricaGerador fabricaGerador = new FabricaGerador();
        Gerador gerador = fabricaGerador.getGerador(TipoGerador.PDF);

        Assert.assertEquals(gerador.getClass(), GeradorPdf.class);
    }

    @Test
    public void deveRetornarGeradorXML() {
        FabricaGerador fabricaGerador = new FabricaGerador();
        Gerador gerador = fabricaGerador.getGerador(TipoGerador.XML);

        Assert.assertEquals(gerador.getClass(), GeradorXml.class);
    }

    @Test
    public void deveRetornarNull() {
        FabricaGerador fabricaGerador = new FabricaGerador();
        Gerador gerador = fabricaGerador.getGerador(null);

        Assert.assertEquals(gerador, null);
    }
}
