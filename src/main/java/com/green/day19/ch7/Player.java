package com.green.day19.ch7;

public abstract class Player {
    public abstract void play(int pos);
}

class AudioPlayer extends Player {
    @Override
    public void play(int pos) {
        System.out.println("Audio Player 위치: " + pos);
    }
}

class VideoPlayer extends Player {
    @Override
    public void play(int pos) {
        System.out.println("Video Player 위치: " + pos);
    }
}

// 추상 메소드를 구현하지 않으려면 상속받은 클래스 또한 추상 클래스가 되면 된다.
abstract class DVDPlayer extends Player {
}

class PalyerTest {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play(10);
        VideoPlayer videoPlayer = new VideoPlayer();
        videoPlayer.play(20);
//        Player player = new Player(); // ERROR
        Player player = audioPlayer; // 다형성
        player.play(30);
        player = videoPlayer; // 다형성
        player.play(40);
    }
}

