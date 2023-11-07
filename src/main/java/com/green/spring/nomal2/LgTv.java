package com.green.spring.nomal2;

import com.green.spring.Speaker;

public class LgTv extends Tv {
    public LgTv() {
        speaker = new AppleSpeaker();
    }
}

//public class LgTv {
//    private boolean isMute;
//    private Speaker speaker;
//
//    public LgTv() {
//        speaker = new AppleSpeaker();
//    }
//
//    public void toggleMute() {
//        isMute = !isMute;
//    }
//
//    public void sound() {
//        if(isMute) {
//            return;
//        }
//        speaker.sound();
//    }
//}
