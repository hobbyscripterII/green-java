package com.green.spring.nomal2;

import com.green.spring.Speaker;
import com.green.spring.Woofer;

public class HarmanSpeaker implements Speaker {
    //    private HanilWoofer hanilWoofer;
    private Woofer woofer;

    public HarmanSpeaker() {
        woofer = new HanilWoofer();
    }

    // 자체 `규격`에 맞춘다.
//    public void speak() {
//        System.out.println("Harman Speaker!!");
//        woofer.soundBase();
//    }

    // 공통 `규격`에 맞춘다.
    @Override
    public void sound() {
        System.out.println("Harman Speaker!!");
        woofer.soundBase();
    }
}
