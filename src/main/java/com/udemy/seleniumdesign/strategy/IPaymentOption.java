package com.udemy.seleniumdesign.strategy;

import java.util.Map;

public interface IPaymentOption {
    void enterPaymentInformation(Map<String, String> paymentDetails);
}
