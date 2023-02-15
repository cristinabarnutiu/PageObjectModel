package com.herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    public final static String LOGIN_URL = BASE_URL+"login";
    @FindBy (id="username") private WebElement usernameInput;
    @FindBy (id="password") private WebElement passwordInput;
    @FindBy (css="i.fa-sign-in") private WebElement loginButton;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void enterUsername(){
        usernameInput.sendKeys("tomsmith");
    }

    public void enterPassword(){
        passwordInput.sendKeys("SuperSecretPassword!");
    }

    public void clickLogin(){
        loginButton.click();
    }

}
