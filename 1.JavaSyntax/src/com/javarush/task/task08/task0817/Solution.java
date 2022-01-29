package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.stream.Stream;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static Map<String, String> createMap() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<String, String>();
        map.put("Yorke", "Tom");
        map.put("Bellamy", "Math");
        map.put("Lennon", "John");
        map.put("White", "Jack");
        map.put("Osbourne", "Ozzy");
        map.put("Morello", "Tom");
        map.put("Black", "Jack");
        map.put("Starr", "Ringo");
        map.put("West", "Kanye");
        map.put("Lord", "John");
        System.out.println(map);
        return map;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        //напишите тут ваш код

    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
        Map<String, String> map = createMap();
        removeTheFirstNameDuplicates(map);
        System.out.println(map);
    }
}
