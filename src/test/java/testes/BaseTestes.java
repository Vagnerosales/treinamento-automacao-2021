package testes;

import Utils.Browser;
import Utils.Utils;
import org.junit.After;
import org.junit.Before;

public class BaseTestes {

    @Before
    public void setup(){
        Browser.loadpage(Utils.getBaseUrl());
    }
    @After
    public void tearDown(){
        Browser.close();
    }
}

