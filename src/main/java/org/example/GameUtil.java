package org.example;

import org.example.enums.Element;

public class GameUtil {

    private final static String w1 = "First player is win!";
    private final static String w2 = "Second player is win!";
    private final static String tie = "There is tie! You should repeat.";

    public static String contest(Element one, Element two) {
        String result = "";
        if (one.equals(Element.rock)) {
            switch (two) {
                case rock -> result = tie;
                case paper -> result = w2;
                case scissors -> result = w1;
            }
        } else if (one.equals(Element.paper)) {
            switch (two) {
                case rock -> result = w1;
                case paper -> result = tie;
                case scissors -> result = w2;
            }
        } else if (one.equals(Element.scissors)) {
            switch (two) {
                case rock -> result = w2;
                case paper -> result = w1;
                case scissors -> result = tie;
            }
        }
        return result;
    }

    public static boolean validStr(String playerStep) {
        boolean flag = false;
        Element[] elements = Element.values();
        for (Element tempElem : elements) {
            if (playerStep.equals(tempElem.name())) {
                flag = true;
            }
        }
        return flag;
    }
}
