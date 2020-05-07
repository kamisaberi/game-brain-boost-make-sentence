package com.parsveda.brainboost.sentences.model;

import java.util.ArrayList;

/**
 * Created by kami on 1/6/2017.
 */

public class Sentences extends ArrayList<Sentence> {


    public Sentences getSentencesWithWordCount(int wordCount) {
        Sentences sentences = new Sentences();
        for (Sentence sentence : this) {
            if (sentence.getWordCount() == wordCount)
                sentences.add(sentence);
        }
        return sentences;
    }


}
