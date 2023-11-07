package com.green.spring.nomal;

public class SamsungTv {
    private AppleSpeaker appleSpeaker;
    private HarmanSpeaker harmanSpeaker;
    private boolean isMute; // 무음

    public SamsungTv() {
//        appleSpeaker = new AppleSpeaker();
        harmanSpeaker = new HarmanSpeaker();
    }

    public void toggleMute() {
        isMute = !isMute;
    }

    public void sound() {
        System.out.printf("isMute = {%s}\n", isMute);
        if (isMute) { harmanSpeaker.speak(); }
    }
}
