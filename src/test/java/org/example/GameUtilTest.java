package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameUtilTest {

    @Test
    void contest() {
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
    }

    @Test
    void validStr4() {
        assertNotEquals(true, GameUtil.validStr("rock'n'roll"));
    }

    @Test
    void validStr5() {
        assertNotEquals(false, GameUtil.validStr("rock"));
    }


}