package com.herokuapp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage {
    public final static String LOGIN_URL = BASE_URL+"login";
    @FindBy (id="username") private WebElement usernameInput;

    @FindBy (id="password") private WebElement passwordInput;
    @FindBy (css="i.fa-sign-in") private WebElement loginButton;
    @FindBy (id="flash") private WebElement alertLogout;

    //WebElement loginButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("i.fa-sign-in")));





    public LoginPage(WebDriver driver) {super(driver);}

    public void enterUsername(String username){usernameInput.sendKeys(username);}

    public void enterPassword(String password){passwordInput.sendKeys(password);}

    public void clickLogin(){loginButton.click();}
    public void loginWithUsernameAndPassword(String username, String password){
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginButton.click();
    }

    public boolean checkIfLogoutAlertIsDisplayed(){
        return alertLogout.isDisplayed();
    }

    public String getAlertMessageText(){
        return alertLogout.getText();
    }



}
