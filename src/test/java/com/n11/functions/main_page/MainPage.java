package com.n11.functions.main_page;

import com.n11.functions.base.BasePage;
import com.n11.utilities.ConfigurationReader;
import com.n11.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage {


    public MainPage(Driver driver, ConfigurationReader configurationReader) {
        super(driver, configurationReader);
    }

    @FindBy(xpath = "//a[@title='hayat sana gelir']")
    public WebElement logoTitle;

    public void goToMainPage() {
        getDriver().driver().get(getConfigurationReader().getProperty("url"));
    }

    public void clickToSignUpButton() {
        signUpBtn.click();
    }



}
