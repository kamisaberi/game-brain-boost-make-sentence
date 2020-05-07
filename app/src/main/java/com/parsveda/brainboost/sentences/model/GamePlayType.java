package com.parsveda.brainboost.sentences.model;

/**
 * Created by kami on 12/22/2016.
 */
public enum GamePlayType {
    SUDDEN_DEATH(1), SURVIVAL(2), TIME_TRIAL(3);

    private int value;

    GamePlayType(int value) {
        this.value = value;
    }
}
