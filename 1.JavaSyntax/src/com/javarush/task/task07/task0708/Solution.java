package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самая длинная строка
*/

public class Solution {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int stringLengthMax = 0;
        String stringMax = "";
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> listMax = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String s = reader.readLine();
            list.add(s);
        }


        for (int i = 0; i < list.size(); i++) {
            if (stringLengthMax <= list.get(i).length()) {
                stringMax = list.get(i);
                stringLengthMax = list.get(i).length();
                listMax.add(stringMax);
            }
        }


        for (String element : listMax) {
            System.out.println(element);
        }


    }
}
