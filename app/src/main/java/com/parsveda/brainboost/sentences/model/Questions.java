package com.parsveda.brainboost.sentences.model;

import java.util.ArrayList;

/**
 * Created by kami on 1/7/2017.
 */

public class Questions extends ArrayList<Question> {



    public Questions getQuestionsWithAnswersThatHaveWordCount(int wordCount) {
        Questions questions = new Questions ();
        for (Question question: this) {
            if (question.isAnswersHasWordCount(wordCount)== true)
                questions.add(question);
        }
        return questions;
    }

}
