package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* 
Добрая Зинаида и летние каникулы
*/


public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Смирнов", dateFormat.parse("MAY 1 2012"));
        map.put("Иванов", dateFormat.parse("JUNE 3 2014"));
        map.put("Петров", dateFormat.parse("FEBRUARY 21 2013"));
        map.put("Сидоров", dateFormat.parse("JANUARY 23 2011"));
        map.put("Марков", dateFormat.parse("DECEMBER 6 2010"));
        map.put("Борисов", dateFormat.parse("OCTOBER 15 1990"));
        return map;

        //напишите тут ваш код
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        //напишите тут ваш код
        for (Map.Entry<String, Date> pair : map.entrySet()){

        }

    }

    public static void main(String[] args) {

    }
}
