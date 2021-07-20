package starter.math;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import starter.steps.AtLoginPage;

@RunWith(SerenityRunner.class)
public class LoginTests {

    @Managed
    private WebDriver driver;

    @Steps AtLoginPage loginPage;

    @Test
    public void verifyLogin(){
        loginPage.enterCredentials();
    }

}
