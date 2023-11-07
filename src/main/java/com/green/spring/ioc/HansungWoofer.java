package com.green.spring.ioc;

import com.green.spring.Woofer;

public class HansungWoofer implements Woofer {
    @Override
    public void soundBase() {
        System.out.println("Hansung Woofer");
    }
}
