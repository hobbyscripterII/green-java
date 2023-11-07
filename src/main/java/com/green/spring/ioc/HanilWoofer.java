package com.green.spring.ioc;

import com.green.spring.Woofer;

public class HanilWoofer implements Woofer {
    @Override
    public void soundBase() {
        System.out.println("Hanil Woofer!");
    }
}
