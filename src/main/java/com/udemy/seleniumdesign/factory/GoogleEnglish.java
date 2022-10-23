package com.udemy.seleniumdesign.factory;

import com.google.common.util.concurrent.Uninterruptibles;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

class GoogleEnglish extends GooglePage {

    @FindBy(css = "button[id='L2AGLb'] div")
    private WebElement acceptCookies;

    @FindBy(name = "q")
    private WebElement searchBox;

    @FindBy(name = "btnK")
    private WebElement searchButton;

    @FindBy(css = "div.g")
    private List<WebElement> results;

    public GoogleEnglish(final WebDriver driver) {
        super(driver);
    }

    @Override
    public void launchSite() {
        this.driver.get("https://www.google.com");
        this.acceptCookies();
    }

    @Override
    public void acceptCookies() {
        try {
            this.acceptCookies.click();
        } catch (Exception e) {
            System.out.println("Accept Cookies not found");
        }
    }

    @Override
    public void search(String keyword) {
        for(char ch : keyword.toCharArray()){
            Uninterruptibles.sleepUninterruptibly(5, TimeUnit.MILLISECONDS);
            this.searchBox.sendKeys(ch + "");
        }
        this.wait.until((d) -> this.searchButton.isDisplayed());
        this.searchButton.click();
    }

    @Override
    public int getResultsCount() {
        this.wait.until((d) -> this.results.size()>1);
        return this.results.size();
    }
}
