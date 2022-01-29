package com.javarush.task.task07.task0716;

import java.util.ArrayList;
import java.util.Iterator;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("роза");
        strings.add("лоза");
        strings.add("лира");
        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    //".*р.*"
    /*public static ArrayList<String> fix(ArrayList<String> strings) {
        strings.removeIf(string -> string.contains("л"));
        return strings;
    }*/

    public static ArrayList<String> fix(ArrayList<String> strings) {
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            String str = iterator.next();
            if (str.matches(".*р.*")) {
                iterator.remove();
            }

        }
        return strings;
    }
}