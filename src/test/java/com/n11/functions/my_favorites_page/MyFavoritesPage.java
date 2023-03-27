package com.n11.functions.my_favorites_page;

import com.n11.functions.base.BasePage;
import com.n11.utilities.ConfigurationReader;
import com.n11.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MyFavoritesPage extends BasePage {


    public MyFavoritesPage(Driver driver, ConfigurationReader configurationReader) {
        super(driver, configurationReader);
    }

    @FindBy(className = "deleteProFromFavorites")
    public WebElement deleteFavoritesBtns;

    @FindBy(xpath = "//span[@class='btn btnBlack confirm']")
    public WebElement alertOKBtn;

    @FindBy(className = "listItemTitle")
    public WebElement favorites;

    @FindBy(className = "emptyWatchList")
    public WebElement verifyDeletionFavorites;

    public void setVerifyDeletionFavorites() {
        Assert.assertEquals(verifyDeletionFavorites.getText(),"İzlediğiniz bir ürün bulunmamaktadır.");
    }

}
