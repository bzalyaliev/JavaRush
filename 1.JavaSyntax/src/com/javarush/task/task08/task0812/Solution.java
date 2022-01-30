package com.javarush.task.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/* 
Cамая длинная последовательность
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код


        List<Integer> listInitial = new ArrayList<>(10);
        List<Integer> repeat = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        IntStream.range(0, 10)
                .forEach(i -> listInitial.add(scanner.nextInt()));

        Collections.sort(listInitial);
        System.out.println(listInitial);

        IntStream.range(0, 10)
                .forEach(i -> repeat.add(Collections.frequency(listInitial, i)));

        int maxRepeat = Collections.max(repeat);

        System.out.println("Самая длинная последовательность содержит " + maxRepeat + " элемент/ов");
    }
}
