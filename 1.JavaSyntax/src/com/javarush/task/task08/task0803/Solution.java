package com.javarush.task.task08.task0803;

import java.util.*;

/* 
Коллекция Map из котов
*/

public class Solution {
    public static Integer increment = 0;

    public static void main(String[] args) throws Exception {
        String[] cats = new String[]{"васька", "васька", "дымка", "рыжик", "серый", "снежок", "босс", "борис", "визя", "гарфи"};

        //Map<String, Cat> map = addCatsToMap(cats);

        /*for (Map.Entry<String, Cat> pair : map.entrySet()) {
            //System.out.println(pair.getKey() + " - " + pair.getValue());
        }*/

        Cat cat1 = new Cat("John", "1");
        Cat cat2 = new Cat("John", "2");
        System.out.println(cat1.equals(cat2));
        System.out.println(cat1.hashCode());
        System.out.println(cat2.hashCode());

        Set<Cat> catSet = new HashSet<>();
        for (String str : cats){
            catSet.add(new Cat(str, str+"-" + increment));
            ++increment;
        }

        for (Cat cat : catSet){
            System.out.println(cat);
        }
    }

    public static Map<String, Cat> addCatsToMap(String[] cats) {
        //напишите тут ваш код
        Map<String, Cat> catMap = new HashMap<>();
        for (String str : cats){
            Cat cat = new Cat(str, str+"-" + increment);
            ++increment;
            catMap.put(str, cat);
        }
        return catMap;
    }

    public static class Cat {
        String name;
        String id;

        @Override
        public int hashCode() {
            return Objects.hash(name, id);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Cat)) return false;
            Cat cat = (Cat) o;
            return Objects.equals(name, cat.name) && Objects.equals(id, cat.id);
        }

        public Cat(String name, String id) {
            this.name = name;
            this.id = id;
        }

        @Override
        public String toString() {
            return id;
        }
    }
}
