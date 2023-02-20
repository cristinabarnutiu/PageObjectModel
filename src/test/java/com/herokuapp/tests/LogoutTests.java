package com.herokuapp.tests;

import com.herokuapp.pages.LoginPage;
import com.herokuapp.pages.SecurePage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static com.herokuapp.pages.LoginPage.LOGIN_URL;

public class LogoutTests extends BaseTest{
    @Parameters({"user","pass", "successLogoutMessage"})
    @Test()
    public void loginAndLogout(String username, String password, String successLogout){
        driver = new ChromeDriver();
        driver.get(LOGIN_URL);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginWithUsernameAndPassword(username,password);
        SecurePage securePage = new SecurePage(driver);
        securePage.clickLogoutButton();
        Assert.assertTrue(loginPage.checkIfLogoutAlertIsDisplayed());
        Assert.assertTrue(loginPage.getAlertMessageText().contains(successLogout));

    }

}
