package com.n11.functions.login_page;

import com.n11.functions.base.BaseStepDefinitions;
import com.n11.utilities.Driver;
import com.n11.utilities.Pages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import java.util.concurrent.TimeUnit;

public class LoginPageStepDef extends BaseStepDefinitions {

    public LoginPageStepDef(Driver driver, Pages pages) {
        super(driver, pages);
    }

    @Then("Verify login page")
    public void verify_login_page() {
        Assert.assertEquals(getPages().getLoginPage().verifyLoginPage.getText(),"Giriş Yap");
    }

    @When("Click to Sign Up with Facebook Button")
    public void click_to_sign_up_with_facebook_button() {
        getDriver().driver().manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
        getPages().getLoginPage().loginWithFacebook.click();
    }

    @Then("Go to Facebook login page")
    public void go_to_facebook_login_page() {
        getDriver().switchToWindow("Facebook");
        getDriver().driver().manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
        getPages().getLoginPage().allowCookiesButton.click();
    }

    @When("customer enters valid credentials")
    public void customer_enters_valid_credentials() {
        getPages().getLoginPage().enterValidCredentialsForFacebook();
    }

    @And("Press the login button")
    public void press_the_login_button() {
        getPages().getLoginPage().loginToFacebook();
        getDriver().driver().manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
        getDriver().switchToMainWindow();
    }

}
