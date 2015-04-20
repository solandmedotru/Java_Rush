package com.javarush.test.level07.lesson06.task03;

/* 5 строчек в обратном порядке
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в него.
3. Расположи их в обратном порядке.
4. Используя цикл выведи содержимое на экран, каждое значение с новой строки.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> str = new ArrayList<String>();
        ArrayList<String> str1 = new ArrayList<String>();

        for (int i = 0; i < 5; i++){
            str.add(i, reader.readLine());
        }

        for (int i = 5; i > 0; i--){
            String s = str.get(i-1);
            str1.add(s);

        }

        for (int i = 0; i < str1.size(); i++){
            System.out.println(str1.get(i));
        }

    }
}
