package com.herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class DropdownPage extends BasePage{
    public final static String DROPDOWN_URL = BASE_URL+"dropdown";
    @FindBy(id="dropdown") private WebElement dropdown;
    Select select = new Select(dropdown);

    @FindBy(xpath="//*[@id=\"dropdown\"]/option[2]") private WebElement firstOption;
    @FindBy(xpath="//*[@id=\"dropdown\"]/option[3]") private WebElement secondOption;

    public DropdownPage(WebDriver driver) {
        super(driver);
    }

    public void selectFirstOption(){
        dropdown.click();
        firstOption.click();
    }

    public void selectOption(String optionValue){
        select.selectByVisibleText(optionValue);
    }

    public boolean checkThatFirstOptionIsSelected(){
        return firstOption.isSelected();
    }


}
