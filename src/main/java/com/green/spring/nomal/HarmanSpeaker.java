package com.green.spring.nomal;

public class HarmanSpeaker {
    private HanilWoofer hanilWoofer;

    public HarmanSpeaker() {
        hanilWoofer = new HanilWoofer();
    }

    public void speak() {
        System.out.println("Harman Speaker!!");
        hanilWoofer.soundBase();
    }
}
