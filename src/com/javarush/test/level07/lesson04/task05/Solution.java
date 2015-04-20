package com.javarush.test.level07.lesson04.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] bigmass = new int[20];
        for (int i = 0; i < bigmass.length; i++){
            bigmass[i] = Integer.parseInt(reader.readLine());
        }

        int[] smass1 = new int[10];
        int[] smass2 = new int[10];

        for (int i = 0; i < 10; i++){
            smass1[i] = bigmass[i];
        }

        for (int i = 10; i < 20; i++){
            smass2[i - 10] = bigmass[i];
        }

        for (int i = 0; i < smass2.length; i++){
            System.out.println(smass2[i]);
        }

    }
}
