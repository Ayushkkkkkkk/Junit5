package org.example;

import java.util.ArrayList;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class Main {

//    public static void main(String[] args) {
//        int arr[] = {1 , 2 , 3 , 4 , 5};
//        closestToZero(arr);
//    }

    public static int closestToZero(int[] arr) {
        int fx = arr.length;
        int[] temp = new int[fx];
        for (int i = 0 ; i < fx ; i++){
            temp[i] = arr[i];
        }

        ArrayList<Integer> list = new ArrayList<>();
        int mini = 10000000;
        for (int i = 0 ; i < arr.length ; i++){
            int count = 0;
            if(arr[i] < 0){
                while(arr[i]!= 0){
                    count++;
                    arr[i] += 1;
                }
                mini = min(mini , count);
                count = 0;
            }
            else{
                while(arr[i]!=0){
                    count++;
                    arr[i] -= 1;
                }
                mini = min(mini , count);
                count = 0;
            }
        }
//        System.out.println(arr);
        for (int i = 0 ; i < arr.length ; i++){
            if(temp[i] - mini == 0){
                list.add(temp[i]);
            }
            if(temp[i] + mini == 0){
                list.add(temp[i]);
            }
        }
        for (int x : list){
            System.out.println(x);
        }

        if(list.size() > 1){
            int maxi = -1;
            for (int x : list){
                maxi = max(maxi , x);
            }
            return maxi;
        }

        return list.get(0);
    }




}
