package com.green.spring.ioc;

import com.green.spring.Speaker;

public class SamsungTv extends Tv {
    public SamsungTv(Speaker speaker) {
        System.out.println("CREATE SAMSUNG TV");
        this.speaker = speaker;
    }
}