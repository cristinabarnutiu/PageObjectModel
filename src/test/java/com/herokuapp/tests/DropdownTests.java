package com.herokuapp.tests;

import com.herokuapp.pages.DropdownPage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.herokuapp.pages.DropdownPage.DROPDOWN_URL;

public class DropdownTests extends BaseTest {
    @Test(testName = "select Option1")
    public void selectFirstOptionInDropDown() {
        driver = new ChromeDriver();
        driver.get(DROPDOWN_URL);
        DropdownPage dropdownPage = new DropdownPage(driver);
        //dropdownPage.selectFirstOption();
        dropdownPage.selectOption("Option 1");
        Assert.assertTrue(dropdownPage.checkThatFirstOptionIsSelected());
    }

    @Test(testName="select Option 2")
    public void selectSecondOptionInDropDown(){
        driver = new ChromeDriver();
        driver.get(DROPDOWN_URL);
        DropdownPage dropdownPage = new DropdownPage(driver);

    }
}
