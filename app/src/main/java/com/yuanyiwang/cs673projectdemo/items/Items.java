package com.yuanyiwang.cs673projectdemo.items;

public class Items {
    private final String userName;
    private final String title;
    private final String text;

    public Items(String userName, String title, String text) {
        this.userName = userName;
        this.title = title;
        this.text = text;
    }

    public String getUserName() {
        return userName;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }
}
