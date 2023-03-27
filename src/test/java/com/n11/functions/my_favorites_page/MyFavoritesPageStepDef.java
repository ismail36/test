package com.n11.functions.my_favorites_page;

import com.n11.functions.base.BaseStepDefinitions;
import com.n11.utilities.Driver;
import com.n11.utilities.Pages;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyFavoritesPageStepDef extends BaseStepDefinitions {

    public MyFavoritesPageStepDef(Driver driver, Pages pages) {
        super(driver, pages);
    }

    @When("The added product is deleted from the favorites")
    public void the_added_product_is_deleted_from_the_favorites() {
        getPages().getMyFavoritesPage().favorites.click();
        getPages().getMyFavoritesPage().deleteFavoritesBtns.click();
        getPages().getMyFavoritesPage().alertOKBtn.click();
    }

    @Then("Verify the deletion process")
    public void verify_the_deletion_process() {
        getPages().getMyFavoritesPage().setVerifyDeletionFavorites();
    }
    @Then("Log out process is done")
    public void log_out_process_is_done() {
        getPages().getBasePage().setAccountHover();
        getPages().getBasePage().signOut.click();
        getDriver().closeDriver();
    }

}
