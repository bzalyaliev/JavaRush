package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static Set<Integer> createSet() {
        Set <Integer> set = new HashSet<>(20);
        IntStream.range(0,20)
                .forEach(set::add);
        System.out.println(set);
        return set;

    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
        Stream<Integer> myStream = set.stream().filter(element -> element < 10);
        Set<Integer> resultSet = myStream.collect(Collectors.toSet());
        System.out.println(resultSet);
        return resultSet;        // напишите тут ваш код
    }

    public static void main(String[] args) {
        removeAllNumbersGreaterThan10(createSet());

    }
}
