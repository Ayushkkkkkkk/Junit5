package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void answer() {
        String str = "{{{{}}}}";
        boolean expected = true;
        boolean actual = Main.answer(str);
        assertEquals(expected , actual);
    }
}