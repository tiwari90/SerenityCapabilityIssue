package starter.steps;

import net.thucydides.core.steps.ScenarioSteps;
import starter.LoginPage;

public class AtLoginPage extends ScenarioSteps {

    LoginPage loginPage;

    public void enterCredentials() {
        loginPage.open();
    loginPage.entercreds();
    }
}
