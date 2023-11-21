package org.example;

import org.junit.jupiter.api.Test;

import static java.lang.Math.max;
import static java.lang.Math.min;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void checkMinimumValue() {
        int[] arr = {6, 9, 15, -2, 92, 11};
        int mini = 100000000;
        for (int x : arr) {
            mini = min(mini, x);
        }
        int expected = mini;
        int actual = Main.minimumValue(arr);
        assertEquals(expected, actual);
    }

    @Test
    void checkMaximumValue() {
        int[] arr = {6, 9, 15, -2, 92, 11};
        int maxi = -1000000;
        for (int x : arr) {
            maxi = max(maxi, x);
        }
        int expected = maxi;
        int actual = Main.maximumValue(arr);
        assertEquals(expected, actual);
    }

    @Test
    void countNumberInSequence() {
        int[] arr = {6, 9, 15, -2, 92, 11};
        int expected = arr.length;
        int actual = Main.NumberOfElements(arr);
        assertEquals(expected, actual);
    }

    @Test
    void checkAverageValue() {
        int[] arr = {6, 9, 15, -2, 92, 11};
        double avg = 0.0;
        double sum = 0.0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        avg = sum / arr.length;
        double expected = avg;
        double actual = Main.averageValue(arr);
        assertEquals(expected, actual);
    }

}