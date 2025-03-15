package com.hrm.setup.tests;

import com.hrm.pages.DashboardPage;
import com.hrm.setup.base.BaseTest;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

public class TC_02_Dashboard extends BaseTest {

    @Test
    public void testMyInfoIsDisplayed() throws InterruptedException {
        DashboardPage dashboardP = loginPage.logIntoApplication("Admin","admin123");
        Thread.sleep(3000);
        assertTrue(dashboardP.isDashboardHeaderDisplayed(), "\n MY INFO PAGE is not visible \n");
//        Assert.assertFalse(infoPage.isDashboardHeaderDisplayed(), "\n MY INFO OPTION is not visible \n");

    }
}
