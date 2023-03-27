package com.n11.functions.base;

import com.n11.utilities.ConfigurationReader;
import com.n11.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    private final Driver driver;
    private final ConfigurationReader configurationReader;


    public BasePage(Driver driver, ConfigurationReader configurationReader) {
        this.driver = driver;
        this.configurationReader = configurationReader;
        PageFactory.initElements(getDriver().driver(), this);
    }

    public Driver getDriver() {
        return driver;
    }

    public ConfigurationReader getConfigurationReader() {
        return configurationReader;
    }

    @FindBy(xpath = "//a[@title='Giriş Yap']")
    public WebElement signUpBtn;

    @FindBy(id = "searchData")
    public WebElement searchBox;

    @FindBy(xpath = "//a[@class='menuLink user']")
    public WebElement accountHolderName;

    @FindBy(xpath = "//a[@title='Favorilerim / Listelerim']")
    public WebElement myFavoritesLists;

    @FindBy(xpath = "//a[@title='Çıkış Yap']")
    public WebElement signOut;

    @FindBy(className = "myAccount")
    public WebElement accountHover;

    public void searchItem(String item) {
        searchBox.sendKeys(item + Keys.ENTER);
    }

    public void setAccountHover() {
        Actions actions = new Actions(getDriver().driver());
        actions.moveToElement(accountHover).perform();
    }


}
