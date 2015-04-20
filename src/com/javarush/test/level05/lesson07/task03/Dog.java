package com.javarush.test.level05.lesson07.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя инициализаторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Dog
{
    //Напишите тут ваш код
    public String name;
    public int size;
    public String color;

    public void initialize (String name){
        this.name = name;
        this.size = 2;
        this.color = "grey";
    }

    public void initialize (String name, int size){
        this.name = name;
        this.size = size;
        this.color = "grey";
    }

    public void initialize (String name, int size, String color){
        this.name = name;
        this.size = size;
        this.color = color;
    }

}
