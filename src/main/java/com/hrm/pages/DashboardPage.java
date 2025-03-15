package com.hrm.pages;

import org.openqa.selenium.By;

public class DashboardPage extends BasePage{

    private By dashboardHeader = By.cssSelector(".oxd-text--h6");

    public boolean isDashboardHeaderDisplayed() {
        return find(dashboardHeader).isDisplayed();
    }



}
