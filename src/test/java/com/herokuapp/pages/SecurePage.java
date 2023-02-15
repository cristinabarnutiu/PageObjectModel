package com.herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SecurePage extends BasePage{
    @FindBy (id="flash") WebElement alertSuccess;
    public SecurePage(WebDriver driver) {
        super(driver);
    }
    public boolean checkIfAlertSuccessIsDisplayed(){
        return alertSuccess.isDisplayed();
    }
}
