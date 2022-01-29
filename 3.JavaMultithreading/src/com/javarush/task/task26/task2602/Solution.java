package com.javarush.task.task26.task2602;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

/* 
Был бы ум - будет и успех
*/

public class Solution {
    public static void main(String[] args) {

        //With Comparator
        /*Set<Soldier> soldiers = new TreeSet<>(new Comparator<Soldier>() {
            @Override
            public int compare(Soldier o1, Soldier o2) {
                if (o1.height>o2.height){
                    return -1;
                }
                else if (o1.height < o2.height){
                    return 1;
                }
                else
                    return 0;
            }
        });*/

        Set<Soldier> soldiers = new TreeSet<>();
        soldiers.add(new Soldier("Ivanov", 170));
        soldiers.add(new Soldier("Petrov", 180));
        soldiers.add(new Soldier("Sidorov", 175));

        for (Soldier soldier : soldiers) {
            System.out.println(soldier.name);
        }
    }

    public static class Soldier implements Comparable<Soldier> {
        private String name;
        private int height;

        public Soldier(String name, int height) {
            this.name = name;
            this.height = height;
        }

        public int getHeight() {
            return height;
        }

        @Override
        public int compareTo(Soldier o) {
            if (this.height > o.getHeight()) {
                return -1;
            } else if (this.height < o.getHeight()) {
                return 1;
            } else return 0;
        }
    }


}
