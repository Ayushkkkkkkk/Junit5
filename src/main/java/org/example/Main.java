package org.example;

import java.util.ArrayList;

import static java.lang.Math.min;

public class Main {
    static ArrayList<String> permu = new ArrayList<>();

    public static void main(String[] args) {
        answer("abc");
    }
    public static int answer(String str) {
        int score = 0;
        permutations("" , str);
        for (String s : permu){
            System.out.println(s);
        }
        // comparing which have the least score
        // tree -> permutations
        int val = 100000000;
        for (String s : permu){
            int count = 0;
            for (int i = 0 ; i < str.length();i++){
                if(s.charAt(i)==str.charAt(i)){
                    count++;
                }
            }
            val = min(val , count);
        }
        score  = val;
        return val;

    }

    static  void permutations(String p , String up){
        if(up.isEmpty()){
            permu.add(p);
            return;
        }
        char ch = up.charAt(0);
        for (int i = 0 ; i <= p.length();i++){
            String first = p.substring(0 , i);
            String second = p.substring(i , p.length());
            permutations(first + ch + second , up.substring(1));
        }

    }







}