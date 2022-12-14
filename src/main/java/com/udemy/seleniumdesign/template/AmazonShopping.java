package com.udemy.seleniumdesign.template;

import com.udemy.seleniumdesign.template.pages.AmazonProductDescriptonPage;
import com.udemy.seleniumdesign.template.pages.AmazonResultsPage;
import com.udemy.seleniumdesign.template.pages.AmazonSearchPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AmazonShopping extends ShoppingTemplate{

    private WebDriver driver;
    private String product;

    private AmazonSearchPage amazonSearchPage;
    private AmazonResultsPage amazonResultsPage;
    private AmazonProductDescriptonPage amazonProductDescriptonPage;


    public AmazonShopping(final WebDriver driver, String product) {
        this.driver = driver;
        this.product = product;
        this.amazonSearchPage = PageFactory.initElements(driver, AmazonSearchPage.class);
        this.amazonResultsPage = PageFactory.initElements(driver, AmazonResultsPage.class);
        this.amazonProductDescriptonPage = PageFactory.initElements(driver, AmazonProductDescriptonPage.class);
    }

    @Override
    public void launchSite() {
        this.amazonSearchPage.goTo();
    }

    @Override
    public void searchForProduct() {
        this.amazonSearchPage.search(this.product);
    }

    @Override
    public void selectProduct() {
        this.amazonResultsPage.selectProduct();
    }

    @Override
    public void buy() {
        this.amazonProductDescriptonPage.buy();
    }
}
