package com.udemy.seleniumdesign.srp.main;

import com.udemy.seleniumdesign.srp.common.AbstractComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Cookies extends AbstractComponent {

    @FindBy(xpath = "//div[normalize-space()='Zaakceptuj wszystko']")
    private WebElement acceptCookies;

    public Cookies(WebDriver driver) {
        super(driver);
    }

    public void acceptCookies() {
        try {
            this.acceptCookies.click();
        } catch (Exception e) {
            System.out.println("Accept Cookies not found");
        }
    }

    @Override
    public boolean isDisplayed() {
        return this.wait.until((d) -> this.acceptCookies.isDisplayed());
    }
}
