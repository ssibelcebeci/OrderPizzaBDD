package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utilities.BaseDriver;

public class Hooks {

    @Before
    public void setUp() {
        BaseDriver.setUp();
    }

    @After
    public void tearDown() {
        BaseDriver.tearDown();
    }
}
