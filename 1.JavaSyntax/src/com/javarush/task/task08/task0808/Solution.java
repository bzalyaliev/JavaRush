package com.javarush.task.task08.task0808;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* 
10 тысяч удалений и вставок
*/

public class Solution {
    public static void main(String[] args) {

        int maxElement = 10000;
        List arrayList = new ArrayList();

        System.out.println("ArrayList Performance");
        insertToEnd10000(arrayList);
        get10000(arrayList);
        set10000(arrayList);
        remove10000(arrayList);
        insertToStart10000(arrayList);

        System.out.println("");

        System.out.println("LinkedList Performance");
        List linkedList = new LinkedList();
        insertToEnd10000(linkedList);
        get10000(linkedList);
        set10000(linkedList);
        remove10000(linkedList);
        insertToStart10000(linkedList);
    }

    public static void insertToEnd10000(List list) {
        //напишите тут ваш код
        long time_start = System.currentTimeMillis();
        for (int counter = 0; counter < 100000; counter++) {
            list.add(new Object());
        }
        long time_end = System.currentTimeMillis();
        long time_result = time_end - time_start;
        System.out.println("insert to the end 10000 elements: " + time_result+"ms");

    }

    public static void insertToStart10000(List list) {
        //напишите тут ваш код
        long time_start = System.currentTimeMillis();
        for (int counter = 0; counter < 100000; counter++) {
            list.add(0, new Object());
        }
        long time_end = System.currentTimeMillis();
        long time_result = time_end - time_start;
        System.out.println("insert to the start 10000 elements: " + time_result+"ms");

    }

    public static void get10000(List list) {
        //напишите тут ваш код
        long time_start = System.currentTimeMillis();
        for (int counter = 0; counter < list.size(); counter++) {
            list.get(counter);
        }
        long time_end = System.currentTimeMillis();
        long time_result = time_end - time_start;
        System.out.println("get 10000 elements: " + time_result+"ms");

    }

    public static void set10000(List list) {
        //напишите тут ваш код
        long time_start = System.currentTimeMillis();
        for (int counter = 0; counter < list.size(); counter++) {
            list.set(counter, new Object());
        }
        long time_end = System.currentTimeMillis();
        long time_result = time_end - time_start;
        System.out.println("set 10000 elements: " + time_result+"ms");
    }

    public static void remove10000(List list) {
        //напишите тут ваш код
        long time_start = System.currentTimeMillis();
        for (int counter = 0; counter < list.size(); counter++) {
            list.remove(counter);
        }
        long time_end = System.currentTimeMillis();
        long time_result = time_end - time_start;
        System.out.println("remove 10000 elements: " + time_result+"ms");
    }
}
