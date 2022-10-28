package com.udemy.seleniumdesign.template.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonProductDescriptonPage {

    private WebDriver driver;
    private WebDriverWait wait;
    @FindBy(xpath = "//div[@data-csa-c-content-id='corePriceDisplay_desktop']//span[@class='a-price-whole']")
    private WebElement price;

    public AmazonProductDescriptonPage(final WebDriver driver) {
        this.driver=  driver;
        this.wait = new WebDriverWait(driver, 30);
        PageFactory.initElements(driver, this);
    }

    public void buy() {
        this.wait.until((d) -> this.price.isDisplayed());
        System.out.println(
                this.price.getText()
        );
    }
}
