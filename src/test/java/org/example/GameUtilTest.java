package org.example;

import org.example.enums.Element;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameUtilTest {

    @Test
    void contest1() {
        assertEquals("First player is win!", GameUtil.contest(Element.scissors, Element.paper));
    }

    @Test
    void contest2() {
        assertEquals("Second player is win!", GameUtil.contest(Element.scissors, Element.rock));
    }

    @Test
    void contest3() {
        assertEquals("There is tie! You should repeat.", GameUtil.contest(Element.scissors, Element.scissors));
    }

    @Test
    void validStr1() {
        assertTrue(GameUtil.validStr("rock"));
    }

    @Test
    void validStr2() {
        assertTrue(GameUtil.validStr("paper"));
    }

    @Test
    void validStr3() {
        assertTrue(GameUtil.validStr("scissors"));
    } @Test
    void validStr4() {
        assertTrue(GameUtil.validStr("SCIssors"));
    }

    @Test
    void validStr5() {
        assertNotEquals(true, GameUtil.validStr("rock'n'roll"));
    }

    @Test
    void validStr6() {
        assertNotEquals(false, GameUtil.validStr("rock"));
    }
}