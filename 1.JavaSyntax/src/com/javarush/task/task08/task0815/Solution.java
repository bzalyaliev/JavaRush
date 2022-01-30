package com.javarush.task.task08.task0815;

import java.util.*;
import java.util.stream.Collectors;

/*
Перепись населения
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map <String, String> map = new HashMap<>();
        map.put("Petty", "Tom");
        map.put("Guilbert", "Paul");
        map.put("Greenwood", "John");
        map.put("White", "Jack");
        map.put("Osbourne", "Ozzy");
        map.put("Morello", "Tom");
        map.put("McCartney", "Shawn");
        map.put("Starr", "Ringo");
        map.put("West", "Kanye");
        map.put("Lord", "John");

        return map;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        List<String> firstName = new ArrayList<String>(map.values());
        return Collections.frequency(firstName, name);
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        List<String> lastNames = new ArrayList<String>(map.keySet());
        return Collections.frequency(lastNames, lastName);
    }

    public static void main(String[] args) {
        System.out.println(createMap());
        System.out.println(getCountTheSameFirstName(createMap(), "Paul"));
        System.out.println(getCountTheSameLastName(createMap(), "Lord"));
    }
}
