package com.hrm.setup.base;

import com.hrm.pages.BasePage;
import com.hrm.pages.LoginPageHrm;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    protected WebDriver driver;
    protected BasePage basePage;
    protected LoginPageHrm loginPage;
    private String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

    @BeforeClass
    public void setUp() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();

//        driver.get(url);
//        basePage = new BasePage();
//        basePage.setDriver(driver);
//        loginPage = new LoginPageHrm();
//        Thread.sleep(2000);
    }

    @BeforeMethod
    public void loadWebApplication() throws InterruptedException {
        driver.get(url);
        basePage = new BasePage();
        basePage.setDriver(driver);
        loginPage = new LoginPageHrm();
        Thread.sleep(2000);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

}
