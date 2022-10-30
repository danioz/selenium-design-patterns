package com.udemy.seleniumdesign.proxy;

import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class OrderComponentProxy implements IOrderComponent {

    private static final List<String> EXCLUDED = Arrays.asList("PROD", "STAGING");
    private IOrderComponent orderComponent;

    public OrderComponentProxy(final WebDriver driver) {
        String currentEnv = System.getProperty("env"); //DEV / QA / PROD
        if (!EXCLUDED.contains(currentEnv)) {
            this.orderComponent = new OrderComponentReal(driver);
        }
    }

    @Override
    public String placeOrder() {
        if (Objects.nonNull(this.orderComponent)) {
            return this.orderComponent.placeOrder();
        } else {
            return "SKIPPED";
        }
    }
}
