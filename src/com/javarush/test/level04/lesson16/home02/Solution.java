package com.javarush.test.level04.lesson16.home02;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        //Напишите тут ваш код
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        String n1 = read.readLine();
        String n2 = read.readLine();
        String n3 = read.readLine();

        int a = Integer.parseInt(n1);
        int b = Integer.parseInt(n2);
        int c = Integer.parseInt(n3);

        if(a>b && b>c || c>b && b>a) System.out.println(b);
        else if(b>a && a>c || c>a && a>b) System.out.println(a);
        else if(b>c && c>a || a>c && c>b) System.out.println(c);
    }
}
