package com.javarush.test.level08.lesson08.task01;

import java.util.HashSet;
import java.util.Set;

/* 20 слов на букву «Л»
Создать множество строк (Set<String>), занести в него 20 слов на букву «Л».
*/

public class Solution
{
    public static HashSet<String> createSet()
    {
        //Напишите тут ваш код
        HashSet<String> set = new HashSet<String>();
        set.add("Люди");
        set.add("Лист");
        set.add("Лось");
        set.add("Лиса");
        set.add("Лузер");
        set.add("Лимон");
        set.add("Лох");
        set.add("Лес");
        set.add("Лев");
        set.add("Лава");

        set.add("Лодырь");
        set.add("Лак");
        set.add("Леопард");
        set.add("Лед");
        set.add("Лосось");
        set.add("Лекарь");
        set.add("Лоскут");
        set.add("Лаборант");
        set.add("Ледоруб");
        set.add("Лебедка");

        return set;
    }
}
