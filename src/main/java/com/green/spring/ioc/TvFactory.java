package com.green.spring.ioc;

import com.green.spring.Speaker;
import com.green.spring.Woofer;

public class TvFactory {
    public static Tv instance(String strTv, String strSpeaker, String strWoofer) {
        // 초기화
        Woofer woofer = null;
        Speaker speaker = null;
        Tv tv = null;

        // `인자`에 받은 문자열에 따라 다른 객체를 생성한다.
        switch (strWoofer) {
            case "hanil":
                woofer = new HanilWoofer();
                break;
            case "hansung":
                woofer = new HansungWoofer();
                break;
        }

        switch (strSpeaker) {
            case "apple":
                speaker = new AppleSpeaker(woofer);
                break;
            case "harman":
                speaker = new HarmanSpeaker(woofer);
                break;
        }

        switch (strTv) {
            case "samsung":
                tv = new SamsungTv(speaker);
                break;
            case "lg":
                tv = new LgTv(speaker);
                break;
        }

        return tv;
    }
}
