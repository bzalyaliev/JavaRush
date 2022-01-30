/*package com.javarush.task.task08.task0824;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Собираем семейство
*/

/*
public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        // два дедушки, две бабушки, отец, мать, трое детей
        Human children1 = new Human("Nikolay", true, 10, null );
        Human children2 = new Human("Petr", true, 9, null);
        Human children3 = new Human("Alex", true, 8, null);

        List<Human> childrens = new ArrayList<String>(children1, children2, children3);


        Human grandFather1 = new Human("Nikolay", true, 60, childrens);
    }

    public static class Human {
        String name;
        Boolean sex;
        int age;
        List<Human> children = new ArrayList<>();

        public Human(String name, Boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Boolean getSex() {
            return sex;
        }

        public void setSex(Boolean sex) {
            this.sex = sex;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public List<Human> getChildren() {
            return children;
        }

        public void setChildren(ArrayList<Human> children) {
            this.children = children;
        }

        //напишите тут ваш код

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
*/
