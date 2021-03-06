package com.parsveda.brainboost.sentences.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kami on 12/20/2016.
 */
public class Score {

    private int currentValue = 0;
    private int score = 0;
    private float time = 0.0f;
    private int partCount = 0;
    private int highestNumber = 0;
    private int NormalModeBestScore = 0;
    private int ReverseModeBestScore = 0;
    private int ComplexModeBestScore = 0;
    private GamePlayType playType = GamePlayType.SURVIVAL;
    private StageTouchOrderType touchOrderType = StageTouchOrderType.NORMAL;
    public StageTouchOrderType partTouchOrderType = StageTouchOrderType.NORMAL;
    private List<Part> parts = new ArrayList<>();

    private GameType type = GameType.MAKE_SENTENCES;

    public List<Part> getParts() {
        return parts;
    }

    public void setParts(List<Part> parts) {
        this.parts = parts;
    }

    public StageTouchOrderType getPartTouchOrderType() {
        return partTouchOrderType;
    }

    public void setPartTouchOrderType(StageTouchOrderType partTouchOrderType) {
        this.partTouchOrderType = partTouchOrderType;
    }

    public GameType getType() {
        return type;
    }

    public void setType(GameType type) {
        this.type = type;
    }

    public int getComplexModeBestScore() {
        return ComplexModeBestScore;
    }

    public void setComplexModeBestScore(int complexModeBestScore) {
        ComplexModeBestScore = complexModeBestScore;
    }

    public int getNormalModeBestScore() {
        return NormalModeBestScore;
    }

    public void setNormalModeBestScore(int normalModeBestScore) {
        NormalModeBestScore = normalModeBestScore;
    }

    public int getReverseModeBestScore() {
        return ReverseModeBestScore;
    }

    public void setReverseModeBestScore(int reverseModeBestScore) {
        ReverseModeBestScore = reverseModeBestScore;
    }

    public int getHighestNumber() {
        return highestNumber;
    }

    public void setHighestNumber(int highestNumber) {
        this.highestNumber = highestNumber;
    }


    public StageTouchOrderType getTouchOrderType() {
        return touchOrderType;
    }

    public void setTouchOrderType(StageTouchOrderType touchOrderType) {
        this.touchOrderType = touchOrderType;
    }

    public GamePlayType getPlayType() {
        return playType;
    }

    public void setPlayType(GamePlayType playType) {
        this.playType = playType;
    }

    public int getPartCount() {
        return partCount;
    }

    public void setPartCount(int partCount) {
        this.partCount = partCount;
    }

    public void addPartCount(int partCount) {
        this.partCount += partCount;
    }


    public int getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(int currentValue) {
        this.currentValue = currentValue;
    }


    public void addCurrentValue(int currentValue) {
        this.currentValue += currentValue;
    }


    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void addScore(int score) {
        this.score += score;
    }


    public float getTime() {
        return time;
    }

    public void setTime(float time) {
        this.time = time;
    }
}
