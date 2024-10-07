package com.example.newsbroker;

public class NewsChannel {

    private final String name;

    public NewsChannel(String name) {
        this.name = name;
    }


    public void notify(String news) {
        System.out.println(this + "is notified of" + news);
    }

    @Override
    public String toString() {
        return this.name;
    }
}
