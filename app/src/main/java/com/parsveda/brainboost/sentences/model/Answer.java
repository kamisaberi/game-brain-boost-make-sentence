package com.parsveda.brainboost.sentences.model;

/**
 * Created by kami on 1/7/2017.
 */

public class Answer {
    private int id;
    private String value;

    private int wordCount;


    public int getWordCount() {
        return wordCount;
    }

    public void setWordCount(int wordCount) {
        this.wordCount = wordCount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }



    public String[] getWords() {
        return this.value.split(" ");
    }

}
