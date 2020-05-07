package com.parsveda.brainboost.sentences.model;

/**
 * Created by kami on 12/22/2016.
 */
public enum GameType {
    MAKE_SENTENCES(1), QUESTION_ANSWER(2);

    private int value;

    GameType(int value) {
        this.value = value;
    }
}
