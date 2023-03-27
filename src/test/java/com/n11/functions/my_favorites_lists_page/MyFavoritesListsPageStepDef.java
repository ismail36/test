package com.n11.functions.my_favorites_lists_page;

import com.n11.functions.base.BaseStepDefinitions;
import com.n11.utilities.Driver;
import com.n11.utilities.Pages;
import io.cucumber.java.en.Then;

public class MyFavoritesListsPageStepDef extends BaseStepDefinitions {

    public MyFavoritesListsPageStepDef(Driver driver, Pages pages) {
        super(driver, pages);
    }

    @Then("Verify that the My favorites page is opened")
    public void verify_that_the_my_favorites_page_is_opened() {

    }

}
