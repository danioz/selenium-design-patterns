package com.udemy.seleniumdesign.proxy;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class PaymentOptionFactory {

    private static final Supplier<IPaymentOption> CC = () -> new CreditCard();
    private static final Supplier<IPaymentOption> NB = () -> new NetBanking();
    private static final Supplier<IPaymentOption> PP = () -> new PayPal();

    private static final Map<String, Supplier<IPaymentOption>> MAP = new HashMap<>();

    static {
        MAP.put("CC", CC);
        MAP.put("NB", NB);
        MAP.put("PP", PP);
    }

    public static IPaymentOption get(String option) {
        return MAP.get(option).get();
    }
}
