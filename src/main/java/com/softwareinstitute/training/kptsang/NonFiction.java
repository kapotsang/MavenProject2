package com.softwareinstitute.training.kptsang;

public class NonFiction extends Book implements com.softwareinstitute.training.kptsang.Availability {

    private String topic;
    private int pages;

    public NonFiction(String name, String Author, int pages, String topic) {
        super(name, Author, pages);
        this.topic = topic;
    }

    public void setTopic(String topic){
        this.topic = topic;
    }
    public String getTopic(){
        return topic;
    }

    @Override
    public void borrow() {

    }
}