package com.parsveda.brainboost.sentences.model;

/**
 * Created by kami on 1/6/2017.
 */

public class Sentence {
    private int id;
    private String value;
    private int wordCount;


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

    public int getWordCount() {
        return wordCount;
    }

    public void setWordCount(int wordCount) {
        this.wordCount = wordCount;
    }


    public String[] getWords() {
        return this.value.split(" ");
    }

}
