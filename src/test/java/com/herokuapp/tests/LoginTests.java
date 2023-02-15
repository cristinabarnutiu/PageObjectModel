package com.herokuapp.tests;

import com.herokuapp.pages.LoginPage;
import com.herokuapp.pages.SecurePage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.herokuapp.pages.LoginPage.LOGIN_URL;

public class LoginTests extends BaseTest{
    @Test
    public void positiveLogin(){
        driver = new ChromeDriver();
        driver.get(LOGIN_URL);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername();
        loginPage.enterPassword();
        loginPage.clickLogin();
        SecurePage securePage = new SecurePage(driver);
        Assert.assertTrue(securePage.checkIfAlertSuccessIsDisplayed());
    }



}
