package com.n11.functions.login_page;

import com.n11.functions.base.BasePage;
import com.n11.utilities.ConfigurationReader;
import com.n11.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    public LoginPage(Driver driver, ConfigurationReader configurationReader) {
        super(driver, configurationReader);
    }

    @FindBy(xpath = "//div[@data-connecturl]")
    public WebElement loginWithFacebook;

    @FindBy(tagName = "h2")
    public WebElement verifyLoginPage;

    @FindBy(xpath = "//button[@value='1']")
    public WebElement allowCookiesButton;

    @FindBy(id = "email")
    public WebElement facebookLoginEmail;

    @FindBy(id = "pass")
    public WebElement facebookLoginPass;

    @FindBy(name = "login")
    public WebElement facebookLoginButton;

    public void enterValidCredentialsForFacebook() {
        facebookLoginEmail.sendKeys(getConfigurationReader().getProperty("email"));
        facebookLoginPass.sendKeys(getConfigurationReader().getProperty("pass"));
    }

    public void loginToFacebook() {
        facebookLoginButton.click();
    }



}
