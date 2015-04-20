package com.javarush.test.level08.lesson08.task05;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{

    public static HashMap<String, String> createMap()
    {
        //Напишите тут ваш код
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Иванов", "Иван");
        map.put("Петров", "Петр");
        map.put("Сидоров", "Петр");
        map.put("Михайлов", "Михаил");
        map.put("Денисов", "Денис");

        map.put("Симунова", "Алла");
        map.put("Кузьмина", "Галина");
        map.put("Баранкина", "Лизавета");
        map.put("Шемякина", "Галина");
        map.put("Соломина", "Анна");

        return map;


    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        //Напишите тут ваш код
        HashMap<String, String> map2 = new HashMap<String, String>(map);
        HashMap<String, String> map3 = new HashMap<String, String>(map);

        //цикл по map2
        for (Map.Entry<String, String> pair : map2.entrySet())
        {
            //удаляем из map3 пару, которая соответствует pair
            map3.remove(pair.getKey());
            //проверяем на наличе  в map3 значений соответсвующего значению из pair
            if (map3.containsValue(pair.getValue()))
            {   //Если есть такие же значения - вызываем удаления текующего значения pair из переданной map
                removeItemFromMapByValue(map, pair.getValue());
            }
        }

    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }


}