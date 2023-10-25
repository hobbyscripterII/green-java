package com.green.first.day16.ch7;

class Time {
    private int hour, minute, second;
    private final int MIN_HOUR = 0;
    private final int MAX_HOUR = 23;

    public Time() {

    }

    // 1. 생성자
    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // 2. setter 메소드
    public void setHour(int hour) {
        this.hour = hour >= MAX_HOUR ? MAX_HOUR : (hour < MIN_HOUR ? MIN_HOUR : hour);

        if (hour < MIN_HOUR) {
            this.hour = MIN_HOUR;
            return;
        }

        if (hour > MAX_HOUR) {
            this.hour = MAX_HOUR;
            return;
        }

        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    // 3. getter 메소드
    public int getHour() {
        return this.hour;
    }

    public int getMinute() {
        return this.minute;
    }

    public int getSecond() {
        return this.second;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
}

public class TimeTest {
    public static void main(String[] args) {
        Time time = new Time(11, 20, 30);
        time.setHour(1);
        time.setMinute(5);
        System.out.println(time);
//        time.hour = 10;
    }
}
