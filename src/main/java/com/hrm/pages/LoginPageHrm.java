package com.hrm.pages;
import org.openqa.selenium.By;

public class LoginPageHrm extends BasePage {

    private By usernameField = By.name("username");
    private By passwordField = By.name("password");
    private By btnLogin = By.cssSelector(".oxd-button");
    private By errorMsg = By.cssSelector(".oxd-alert-content-text");
    // Dashboard.
    private By bnrLocationCard = By.xpath("xpath=//p[contains(.,'Employee Distribution by Location')]");


    public void setInputUsrName(String userName) {
        set(usernameField, userName);
    }
    public void setInputPassword(String password) {
        set(passwordField, password);
    }
    public DashboardPage clickLoginButton() {
        click(btnLogin);
        return new DashboardPage();
    }

    public DashboardPage logIntoApplication(String userName, String password) {
        setInputUsrName(userName);
        setInputPassword(password);
        return clickLoginButton();
    }
    public String getErrorMsg() {
        return find(errorMsg).getText();
    }

    // Dashboard
    public DashboardPage goToLocationCard (){
        click(bnrLocationCard);
        return new DashboardPage();
    }
}










