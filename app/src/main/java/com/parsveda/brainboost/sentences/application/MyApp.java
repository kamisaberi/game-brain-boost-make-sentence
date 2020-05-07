package com.parsveda.brainboost.sentences.application;

import android.app.Application;
import android.graphics.Typeface;
import android.os.Environment;
import android.speech.tts.TextToSpeech;

import com.parsveda.brainboost.sentences.base.Globals;

import java.util.Locale;

/**
 * Created by kami on 12/20/2016.
 */
public class MyApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Globals.context = getBaseContext();
        Globals.loadPresets();
        Globals.loadStages();
        Globals.loadLevels();
        Globals.loadSentences();
        Globals.loadQuestions();
        Globals.ReckonerFace = Typeface.createFromAsset(getBaseContext().getAssets(), "fonts/Reckoner.ttf");
        Globals.OpenSansFace = Typeface.createFromAsset(getBaseContext().getAssets(), "fonts/OpenSans-Regular.ttf");
        Globals.CanSaveData = checkExternalStorage();


        Globals.textToSpeech = new TextToSpeech(getBaseContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {
                if (i != TextToSpeech.ERROR) {
                    Globals.textToSpeech.setLanguage(Locale.US);
                }
            }
        });

    }

    public boolean checkExternalStorage() {
        String state = Environment.getExternalStorageState();
        if (state.equals(Environment.MEDIA_MOUNTED)) {
            return true;
        } else if (state.equals(Environment.MEDIA_MOUNTED_READ_ONLY)) {
            return false;
        } else {
            return false;
        }
    }

}
