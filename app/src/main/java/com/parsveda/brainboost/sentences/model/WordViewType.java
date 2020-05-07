package com.parsveda.brainboost.sentences.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by kami on 12/19/2016.
 */
public enum WordViewType {

    NUMBER(1),
    TIME(2);

    private int value;
    private static Map map = new HashMap<>();

    WordViewType(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    public static WordViewType fromInteger(int x) {
        switch (x) {
            case 1:
                return NUMBER;
            case 2:
                return TIME;
        }
        return null;
    }


    static {
        for (WordViewType pageType : WordViewType.values()) {
            map.put(pageType.value, pageType);
        }
    }

    public static WordViewType valueOf(int pageType) {
        return (WordViewType) map.get(pageType);
    }


}
