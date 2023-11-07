package com.green.spring.ioc;

import com.green.spring.Speaker;
import com.green.spring.Woofer;

public class AppleSpeaker implements Speaker {
    // * 외부에서 들어온 값을 그대로 쓰겠다.(외부에 맡기겠다)
    private Woofer woofer;

    // `생성자`에서 객체를 생성하면 안된다.(new)
    // 외부에서 woofer를 받도록 변경한다.
    public AppleSpeaker(Woofer woofer) {
        this.woofer = woofer;
    }

    public void sound() {
        System.out.println("Apple Speaker");
        woofer.soundBase();
    }
}
