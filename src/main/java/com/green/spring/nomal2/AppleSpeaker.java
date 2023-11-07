package com.green.spring.nomal2;

import com.green.spring.Speaker;
import com.green.spring.Woofer;

public class AppleSpeaker implements Speaker {
    // before
//    private HansungWoofer hansungWoofer;
//    private HanilWoofer hanilWoofer;

    // after
    private Woofer woofer; // `woofer`는 인터페이스를 참조한다.

    public AppleSpeaker() {
//        hansungWoofer = new HansungWoofer();
        woofer = new HanilWoofer(); // `interface` 를 호출함으로써 객체 호출이 편리해졌다.
    }

    public void sound() {
        System.out.println("Apple Speaker");
//        hansungWoofer.soundBase();
        woofer.soundBase();
    }
}
