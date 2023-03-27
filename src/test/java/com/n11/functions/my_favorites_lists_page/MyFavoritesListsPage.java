package com.n11.functions.my_favorites_lists_page;

import com.n11.functions.base.BasePage;
import com.n11.utilities.ConfigurationReader;
import com.n11.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MyFavoritesListsPage extends BasePage {


    public MyFavoritesListsPage(Driver driver, ConfigurationReader configurationReader) {
        super(driver, configurationReader);
    }

    @FindBy(linkText = "https://www.n11.com/hesabim/favorilerim")
    public WebElement myFavoritesBtn;


}
