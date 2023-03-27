package com.n11.functions.search_result_page;

import com.n11.functions.base.BaseStepDefinitions;
import com.n11.utilities.Driver;
import com.n11.utilities.Pages;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SearchResultStepDef extends BaseStepDefinitions {


    public SearchResultStepDef(Driver driver, Pages pages) {
        super(driver, pages);
    }

    @Then("Verify that {string} is searched")
    public void verify_that_is_searched(String string) {
        Assert.assertEquals(getPages().getSearchResultPage().verifySearchedItem.getText(),string);
    }

    @When("Go to the 2nd page on the search result page")
    public void go_to_the_2nd_page_on_the_search_result_page() {
        getPages().getSearchResultPage().goToSecondPage.click();
    }

    @When("The 3rd product on the page is added to favourites")
    public void the_3rd_product_on_the_page_is_added_to_favourites() {
        getPages().getSearchResultPage().selectThirdItem.click();
    }

    @When("Go to My Favorites and Lists page")
    public void go_to_my_favorites_and_lists_page() {
        getPages().getBasePage().setAccountHover();
        getPages().getBasePage().myFavoritesLists.click();
    }


}
