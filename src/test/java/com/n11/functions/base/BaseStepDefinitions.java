package com.n11.functions.base;

import com.n11.utilities.Driver;
import com.n11.utilities.Pages;

public class BaseStepDefinitions {

    private final Driver driver;
    private final Pages pages;


    public BaseStepDefinitions(Driver driver, Pages pages) {
        this.driver = driver;
        this.pages = pages;
    }

    public Driver getDriver() {
        return driver;
    }

    public Pages getPages() {
        return pages;
    }

}
