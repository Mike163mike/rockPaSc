package org.example;

import org.example.enums.Element;

public class Game {
    public String gameSet(String onePStep, String twoPlStep) {
        String result;
        if (!GameUtil.validStr(onePStep)) {
            result = "Insert correct value of first player step";
        } else if (!GameUtil.validStr(twoPlStep)) {
            result = "Insert correct value of second player step";
        } else {
            result = GameUtil.contest(Element.valueOf(onePStep.toLowerCase()), Element.valueOf(twoPlStep.toLowerCase()));
        }
        return result;
    }
}
