package com.parsveda.brainboost.sentences.model;

import android.content.Context;
import android.widget.TextView;

/**
 * Created by kami on 1/3/2017.
 */

public class WordView extends TextView {

    private WordViewInfo info;

    public WordViewInfo getInfo() {
        return info;
    }

    public void setInfo(WordViewInfo info) {
        this.info = info;
    }

    public WordView(Context context) {
        super(context);
        info = new WordViewInfo();
    }

}
