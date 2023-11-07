package com.green.spring.ioc;

import com.green.spring.Speaker;
import com.green.spring.Woofer;

public class HarmanSpeaker implements Speaker {
    private Woofer woofer;

    // 1. 외부에서 woofer를 받도록 변경한다.
    public HarmanSpeaker(Woofer woofer) {
        this.woofer = woofer;
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
