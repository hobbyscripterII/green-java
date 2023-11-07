package com.green.spring.nomal2;

import com.green.spring.Speaker;

public abstract class Tv {
    protected boolean isMute;
    protected Speaker speaker;

    public void toggleMute() {
        isMute = !isMute;
    }

    public void sound() {
        if(!isMute) {
            speaker.sound();
        }
    }
}
