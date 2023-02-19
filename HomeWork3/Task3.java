package HomeWorkJava.HomeWork3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Task3 {

    public static void main(String[] args) {
        // 3.Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое этого списка.
        
        ArrayList<Integer> newList = createArrayList();
        System.out.println(newList);
        Integer min = min(newList);
        Integer max = max(newList);
        ArrayList<Double> doubleList = convertToDouble(newList);
        Double average = average(doubleList);
        System.out.println("Минимальный элемент списка = " + min);
        System.out.println("Максимальный элемент списка = " + max);
        System.out.printf("Среднее арифметическое списка = " + "%.2f",average); 
         
    }

    public static ArrayList<Integer> createArrayList(){

        Random random = new Random();
        ArrayList<Integer> newList = new ArrayList<>();

        for (int i = 0; i < random.nextInt(4, 50); i++) {
            newList.add(random.nextInt(1, 20));
        }

        return newList;
    }

    public static Integer min(ArrayList<Integer> list){

        Collections.sort(list);
        Integer min = list.get(0);

        return min;
    }

    public static Integer max(ArrayList<Integer> list){

        Collections.sort(list);
        Integer max = list.get(list.size() - 1);

        return max;
    }

    public static ArrayList<Double> convertToDouble(ArrayList<Integer> list){
        
        ArrayList<Double> doubleList = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            Integer a = list.get(i);
            double b = (double) a;
            doubleList.add(b);
        }

        return doubleList;
    }
    
    public static Double average(ArrayList<Double> list){
        
        Double average = 0.00;
        Integer count = 0;

        for (int i = 0; i < list.size(); i++) {
            average += list.get(i);
            count++;
        }

        average /= count;
        return average;
    }
}
