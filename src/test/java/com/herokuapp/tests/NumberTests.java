package com.herokuapp.tests;

import com.herokuapp.pages.NumberPage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static com.herokuapp.pages.NumberPage.NUMBER_URL;


public class NumberTests extends BaseTest{
        @Test
        public void numberInputsTest(){
            driver = new ChromeDriver();
            driver.get(NUMBER_URL);
            NumberPage numberPage = new NumberPage(driver);
            numberPage.enterNumberInInput("123456");




    }

}
