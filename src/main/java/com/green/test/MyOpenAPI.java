package com.green.test;


public class MyOpenAPI {
    private MyInfo info;

    public MyOpenAPI info(MyInfo info) {
        this.info = info;
        return this;
    }

    @Override
    public String toString() {
        return String.format("info = {%s}", info);
    }
}
