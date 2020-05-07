package com.parsveda.brainboost.sentences.model;

/**
 * Created by kami on 1/7/2017.
 */

public class Question {
    private int id;
    private String value;

    private Answers answers = new Answers();

    private Answer selectedAnswer = new Answer();

    public Answer getSelectedAnswer() {
        return selectedAnswer;
    }

    public void setSelectedAnswer(Answer selectedAnswer) {
        this.selectedAnswer = selectedAnswer;
    }

    public Answers getAnswers() {
        return answers;
    }

    public void setAnswers(Answers answers) {
        this.answers = answers;
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

    public boolean isAnswersHasWordCount(int wordCount) {
        for (Answer answer : this.answers) {
            if (answer.getWordCount() == wordCount)
                return true;
        }
        return false;
    }

    public Answers getAnswersThatHasWordCount(int wordCount) {
        Answers answers = new Answers();
        for (Answer answer : this.answers) {
            if (answer.getWordCount() == wordCount)
                answers.add(answer);
        }
        return answers;
    }


}
