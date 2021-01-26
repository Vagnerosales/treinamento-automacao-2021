package testes;

import Utils.Browser;
import Utils.Utils;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class SetupTest extends BaseTestes{

    @Test
    public void testingOpeningBrowserAndLoadingPage(){
        assertTrue(Browser.getCurrentDriver ().getCurrentUrl().contains(Utils.getBaseUrl()));
        System.out.println("Abrimos o navegador e carregamos a url");
    }
}
