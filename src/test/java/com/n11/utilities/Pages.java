package com.n11.utilities;

import com.n11.functions.base.BasePage;
import com.n11.functions.login_page.LoginPage;
import com.n11.functions.main_page.MainPage;
import com.n11.functions.my_favorites_lists_page.MyFavoritesListsPage;
import com.n11.functions.my_favorites_page.MyFavoritesPage;
import com.n11.functions.search_result_page.SearchResultPage;

public class Pages {

    private final LoginPage loginPage;
    private final MainPage mainPage;
    private final MyFavoritesListsPage myFavoritesListsPage;
    private final MyFavoritesPage myFavoritesPage;
    private final SearchResultPage searchResultPage;
    private final BasePage basePage;


    public Pages(Driver driver, ConfigurationReader configurationReader) {
        this.loginPage = new LoginPage(driver,configurationReader);
        this.mainPage = new MainPage(driver,configurationReader);
        this.myFavoritesListsPage = new MyFavoritesListsPage(driver,configurationReader);
        this.myFavoritesPage = new MyFavoritesPage(driver,configurationReader);
        this.searchResultPage = new SearchResultPage(driver,configurationReader);
        this.basePage = new BasePage(driver,configurationReader);
    }

    public LoginPage getLoginPage() {
        return loginPage;
    }

    public MainPage getMainPage() {
        return mainPage;
    }

    public MyFavoritesListsPage getMyFavoritesListsPage() {
        return myFavoritesListsPage;
    }

    public MyFavoritesPage getMyFavoritesPage() {
        return myFavoritesPage;
    }

    public SearchResultPage getSearchResultPage() {
        return searchResultPage;
    }

    public BasePage getBasePage() {
        return basePage;
    }
}
