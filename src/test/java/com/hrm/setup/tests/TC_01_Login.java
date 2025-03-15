package com.hrm.setup.tests;

import com.hrm.setup.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_01_Login extends BaseTest {

    @Test
        public void testLoginErrorMsg() throws InterruptedException {
        loginPage.setInputUsrName("InvalidUserName");
        loginPage.setInputPassword("invalidP@$$w0rd");
        loginPage.clickLoginButton();
        Thread.sleep(3000);
        String actualMsg = loginPage.getErrorMsg();
        Assert.assertTrue(actualMsg.contains("Invalid credentials"));
//        Assert.assertFalse(actualMsg.contains("Invalid credentials"));

    }

}
