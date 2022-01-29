package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        List<Integer> listDividedOnTwo = new ArrayList<>();
        List<Integer> listDividedOnThree = new ArrayList<>();
        List<Integer> listOthers = new ArrayList<>();
        List<Integer> listInitial = new ArrayList<>(20);

        for (int i = 0; i < 20; i++) {
            Scanner scanner = new Scanner(System.in);
            Integer s = scanner.nextInt();
            listInitial.add(s);
        }

        listInitial.forEach(next -> {
            if (next % 2 == 0) {
                listDividedOnTwo.add(next);
            } else if (next % 3 == 0) {
                listDividedOnThree.add(next);
            } else if (next % 2 == 0 | next % 3 == 0) {
                listDividedOnTwo.add(next);
                listDividedOnThree.add(next);
            } else {
                listOthers.add(next);
            }
        });

        System.out.println("Initial list:");
        Solution.printList(listInitial);
        System.out.println("Numbers that divided on three:");
        Solution.printList(listDividedOnThree);
        System.out.println("Numbers that divided on two:");
        Solution.printList(listDividedOnTwo);
        System.out.println("Others numbers");
        Solution.printList(listOthers);
    }


    public static void printList(List<Integer> list) {
        System.out.println(list);
        //напишите тут ваш код
    }
}
