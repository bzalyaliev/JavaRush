package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static Set<Integer> createSet() {
        // напишите тут ваш код
        Set <Integer> set = new HashSet<>();
        for (int counter : set){
            int value = (int)(Math.random() * 20);
            set.add(value);
        }
        return set;
    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
        return set;
        // напишите тут ваш код

    }

    public static void main(String[] args) {
        System.out.println(createSet());



    }
}
