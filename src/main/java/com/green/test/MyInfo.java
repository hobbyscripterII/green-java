package com.green.test;


public class MyInfo {
    private String title;
    private String description;

    public MyInfo title(String title) {
        this.title = title;
        return this;            // title = {title}
//        return null;          // null
//        return new MyInfo();  // title = {null}
    }

    public MyInfo description(String description) {
        this.description = description;
        return this;
    }

    @Override
    public String toString() {
        return String.format("title = {%s}, description = {%s}", title, description);
    }
}
