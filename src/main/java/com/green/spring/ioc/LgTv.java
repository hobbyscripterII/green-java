package com.green.spring.ioc;

import com.green.spring.Speaker;

public class LgTv extends Tv {
    public LgTv(Speaker speaker) {
        System.out.println("CREATE LG TV");
        this.speaker = speaker;
    }
}
