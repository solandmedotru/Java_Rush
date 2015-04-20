package com.javarush.test.level06.lesson08.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Класс ConsoleReader
Сделать класс ConsoleReader, у которого будут 4 статических метода:
String readString() – читает с клавиатуры строку
int readInt() – читает с клавиатуры число
double readDouble() – читает с клавиатуры дробное число
void readLn() – ждет нажатия enter [использовать readString()]
*/

public class ConsoleReader
{
    public static String readString() throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader (System.in));
        String A = reader.readLine();
        return A;
    }

    public static int readInt() throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader (System.in));
        String A = reader.readLine();
        int a;
        a = Integer.parseInt(A);
        return a;
    }

    public static double readDouble() throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader (System.in));
        String A = reader.readLine();
        double a;
        a = Double.parseDouble(A);
        return a;
    }

    public static void readLn() throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader (System.in));
        String A = reader.readLine();
        while(A.equals("\n"))
            A = reader.readLine();

    }
}
