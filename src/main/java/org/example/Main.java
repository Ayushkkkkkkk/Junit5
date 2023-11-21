package org.example;

import java.util.ArrayList;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class Main {


    public static int minimumValue(int[] arr) {
        int mini = 100000000;
        for (int x : arr){
            mini = min(mini , x);
        }
        return mini;
    }

    public static int maximumValue(int[] arr) {
        int maxi = -1000000;
        for (int x : arr){
            maxi = max(maxi , x);
        }
        return maxi;
    }

    public static int NumberOfElements(int[] arr) {
        return arr.length;
    }

    public static double averageValue(int[] arr) {
        double avg = 0.0;
        double sum = 0.0;

        for (int i = 0 ; i < arr.length; i++){
            sum += arr[i];
        }
        avg = sum / arr.length;
        return avg;
    }


}
