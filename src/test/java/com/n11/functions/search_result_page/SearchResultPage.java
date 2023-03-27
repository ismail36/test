package com.n11.functions.search_result_page;

import com.n11.functions.base.BasePage;
import com.n11.utilities.ConfigurationReader;
import com.n11.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResultPage extends BasePage {


    public SearchResultPage(Driver driver, ConfigurationReader configurationReader) {
        super(driver, configurationReader);
    }


    @FindBy(linkText = "2")
    public WebElement goToSecondPage;

    @FindBy(xpath = "(//span[@title='Favorilere ekle'])[3]")
    public WebElement selectThirdItem;

    @FindBy(xpath = "//div[@class='resultText ']/h1")
    public WebElement verifySearchedItem;



}
