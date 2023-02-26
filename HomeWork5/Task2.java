package HomeWorkJava.HomeWork5;

import java.util.Arrays;
import java.util.TreeMap;

public class Task2 {
    public static void main(String[] args) {

        // Пусть дан список сотрудников: Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина, Анна Крутова, 
        // Иван Юрин, Петр Лыков, Павел Чернов, Петр Чернышов, Мария Федорова, Марина Светлова, Мария Савина, Мария Рыкова, 
        // Марина Лугова, Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов.

        // Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений. 
        // Отсортировать по убыванию популярности. Для сортировки использовать TreeMap.

        String s = "Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина, Анна Крутова" + "," +
        "Иван Юрин, Петр Лыков, Павел Чернов, Петр Чернышов, Мария Федорова, Марина Светлова, Мария Савина, Мария Рыкова," + 
        "Марина Лугова, Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов, Иван Иванов, Павел Чернов";
        TreeMap<String, Integer> tmap =  sortInDescending(s);
        System.out.println(tmap);
    }

    public static TreeMap<String, Integer> sortInDescending(String s){

        TreeMap<String, Integer> treem = new TreeMap<>();

        String[] s1 = s.split(",");
        // System.out.println(Arrays.toString(s1));
        // for (int i = 0; i < s1.length; i++) {
        //     System.out.println(s1[i].trim());
        // }
        int count = 1;  
        for (int i = 0; i < s1.length; i++) {
            if(treem.containsKey(s1[i].trim())){
                int a = treem.get(s1[i].trim());
                a += 1;
                treem.put(s1[i].trim(), a);
            }else{
                treem.put(s1[i].trim(), count);
            }
        }
        return treem;
    }
}
