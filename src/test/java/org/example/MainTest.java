package org.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static java.lang.Math.max;
import static java.lang.Math.min;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void checkMinimumValue() {
        int[] arr = {-1, 2, 3, 29, 11};
        Arrays.sort(arr);
        int mini = 100000000;
        for (int x : arr) {
            mini = min(mini, x);
        }
        int expected = -1;
        int actual = Main.closestToZero(arr);
        assertEquals(expected, actual);
    }

    @Test
    void draw(){
        int[] arr = {-1, 2, 3, 1, 29, 11};
        Arrays.sort(arr);
        int mini = 100000000;
        for (int x : arr) {
            mini = min(mini, x);
        }
        int expected = 1;
        int actual = Main.closestToZero(arr);
        assertEquals(expected, actual);
    }



}