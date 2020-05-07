package com.parsveda.brainboost.sentences.model;

/**
 * Created by kami on 1/3/2017.
 */

public class WordViewInfo {

    private int value;
    private WordViewType type;
    private boolean active;

    public WordViewInfo() {
        this.value = 0;
        this.active = true;
        this.type = WordViewType.NUMBER;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public WordViewType getType() {
        return type;
    }

    public void setType(WordViewType type) {
        this.type = type;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
