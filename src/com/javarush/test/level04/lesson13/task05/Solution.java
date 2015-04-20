package com.javarush.test.level04.lesson13.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Все любят Мамбу
Ввести с клавиатуры имя и используя цикл for 10 раз вывести: [*имя* любит меня.]
Пример текста:
Света любит меня.
Света любит меня.
…
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Напишите тут ваш код
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        String name1 = read.readLine();
        for (int i = 1; i<=10; i++){
            System.out.println(name1 + " любит меня.");
        }

    }
}
