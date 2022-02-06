package com.yuanyiwang.cs673projectdemo.items;

public class CoachItems {
    private final String name;
    private final String title;
    private final String description;

    public CoachItems(String name, String title, String description) {
        this.name = name;
        this.title = title;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public String getTitle() {
        return title;
    }

    public String getName() {
        return name;
    }
}
