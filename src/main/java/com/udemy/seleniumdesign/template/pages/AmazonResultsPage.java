package com.udemy.seleniumdesign.template.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonResultsPage {

    private WebDriver driver;
    private WebDriverWait wait;

    @FindBy(xpath = "//span[contains(@class,'a-size-base-plus a-color-base a-text-normal')][position()=1]")
    private WebElement item;

    public AmazonResultsPage(final WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 30);
        PageFactory.initElements(driver, this);
    }

    public void selectProduct() {
        this.wait.until((d) -> this.item.isDisplayed());
        this.item.click();
    }
}
