package hooks;

import io.cucumber.java.Before;

import static utilities.MedunnaBaseUrl.setUp;

public class Hooks {
    @Before("@api")
    public void before_api(){
        setUp();
    }
}
