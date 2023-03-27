package com.n11.functions.main_page;

import com.n11.functions.base.BaseStepDefinitions;
import com.n11.utilities.Driver;
import com.n11.utilities.Pages;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class MainPageStepDef extends BaseStepDefinitions {


    public MainPageStepDef(Driver driver, Pages pages) {
        super(driver, pages);
    }

    @Given("Go to main page")
    public void go_to_main_page() {
        getPages().getMainPage().goToMainPage();
        getDriver().driver().manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
        Assert.assertEquals(getPages().getMainPage().logoTitle.getAttribute("title"),"hayat sana gelir");
    }

    @When("Click to Sign Up button")
    public void click_to_sign_up_button() {
        getPages().getMainPage().clickToSignUpButton();
        getDriver().switchToWindow("Facebook");
    }

    @Then("User signed up successfully {string}")
    public void user_signed_up_successfully(String accountHolderName) {
        Assert.assertEquals(getPages().getBasePage().accountHolderName.getText(),accountHolderName);
    }

    @When("User types in the search box {string} and press the enter")
    public void user_types_in_the_search_box_and_press_the_enter(String item) {
        getPages().getBasePage().searchItem(item);
    }


}
