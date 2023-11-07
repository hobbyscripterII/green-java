package com.green.spring.nomal;

public class AppleSpeaker {
    private HansungWoofer hansungWoofer;
    private HanilWoofer hanilWoofer;

    public AppleSpeaker() {
//        hansungWoofer = new HansungWoofer();
        hanilWoofer = new HanilWoofer();
    }

    public void sound() {
        System.out.println("Apple Speaker");
//        hansungWoofer.soundBase();
        hanilWoofer.soundBase();
    }
}
