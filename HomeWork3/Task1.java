package HomeWorkJava.HomeWork3;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Task1
 */
public class Task1 {

    public static void main(String[] args) {
        // 1.Реализовать алгоритм сортировки слиянием
        ArrayList <String> firstList = createFirstList();
        ArrayList <String> secondList = createSecondList();
        ArrayList<ArrayList<String>> cars = new ArrayList<>(create2DList(firstList, secondList));
        ArrayList<String> mergingSheets = mergingSheets(cars);
        System.out.println(mergingSheets.toString());
        
    }

   

    public static ArrayList <String> createFirstList(){

        ArrayList <String> firstList = new ArrayList<>();
        firstList.add("Toyota");
        firstList.add("Mazda");
        firstList.add("Nissan");

        return firstList;
    }

    public static ArrayList <String> createSecondList(){

        ArrayList <String> secondList = new ArrayList<>();
        secondList.add("Audi");
        secondList.add("BMW");
        secondList.add("VW");

        return secondList;
    }

    public static ArrayList<ArrayList<String>> create2DList(ArrayList <String> firstList, ArrayList <String> secondList){

        ArrayList<ArrayList<String>> cars = new ArrayList<>();
        cars.add(firstList);
        cars.add(secondList);

        return cars;
    }

    public static ArrayList<String> mergingSheets(ArrayList<ArrayList<String>> cars){

        ArrayList <String> mergingSheets = new ArrayList<>();
        ArrayList <String> firstList = new ArrayList<>(cars.get(0));
        ArrayList <String> secondList = new ArrayList<>(cars.get(1));

        mergingSheets.addAll(firstList);
        mergingSheets.addAll(secondList);
    
        return mergingSheets;
    }
}