package starter;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class LoginPage extends PageObject {

    @FindBy(id="login_field")
    private WebElementFacade logintxt;

    @FindBy(id="password")
    private WebElementFacade passwordtxt;

    public void entercreds(){
        logintxt.type("UserName");
        passwordtxt.type("Password");
    }
}
