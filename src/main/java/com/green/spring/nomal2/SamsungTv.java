package com.green.spring.nomal2;

import com.green.spring.Speaker;

public class SamsungTv extends Tv {
    public SamsungTv() {
        // `TV` 를 상속받았기 때문에 `TV` 객체에 있는 `speaker`를 호출할 수 있다.
        speaker = new HarmanSpeaker();
    }
}

//public class SamsungTv {
//    // before
//    private AppleSpeaker appleSpeaker;
//    //    private HarmanSpeaker harmanSpeaker;
//    private Speaker speaker; // after
//    private boolean isMute; // 무음
//
//    public SamsungTv() {
//        // before
////        appleSpeaker = new AppleSpeaker();
////        harmanSpeaker = new HarmanSpeaker();
//        speaker = new AppleSpeaker(); // after
//    }
//
//    public void toggleMute() {
//        isMute = !isMute;
//    }
//
//    public void sound() {
//        System.out.printf("isMute = {%s}\n", isMute);
//        if (isMute) {
////            harmanSpeaker.speak(); // before
//            speaker.sound(); // after
//        }
//    }
//}
