package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void answer() {
        int expected = 42;
        int actual = Main.answer();
        assertEquals(expected , actual);
    }
}