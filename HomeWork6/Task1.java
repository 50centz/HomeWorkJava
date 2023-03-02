package HomeWork.HomeWork6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;


public class Task1 {
    public static void main(String[] args) {
        
    
    /* 
    Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
    Создать множество ноутбуков.
    Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. 
    Критерии фильтрации можно хранить в Map. Например: “Введите цифру, соответствующую необходимому критерию:
    1 - ОЗУ
    2 - Объем ЖД
    3 - Операционная система
    4 - Цвет …
    Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
    Отфильтровать ноутбуки из первоначального множества и вывести проходящие по условиям.
    */

    Set<Laptop> set = createSetLaptop();
    System.out.println(set);

    HashMap<String, String> map = createFilter();

    laptop(set, map);

    }

    public static String scanner() {
        Scanner in = new Scanner(System.in);
        String scan = in.nextLine();
        return scan;
    } 


    
    public static Set<Laptop> createSetLaptop(){
        Set<Laptop> set = new HashSet<>();
        Laptop laptop1 = new Laptop("Asus", "Win 10", "AMD", "8",  "15");
        Laptop laptop2 = new Laptop("Lenovo", "Linux", "intel", "16", "17");
        Laptop laptop3 = new Laptop("Acer", "Win 10", "AMD", "32", "17");
        Laptop laptop4 = new Laptop("Dell", "Win 11", "intel", "16", "17");
        Laptop laptop5 = new Laptop("HP", "Win 10", "intel", "64", "15");
        Laptop laptop6 = new Laptop("Asus", "Linux", "AMD", "16", "16");
        Laptop laptop7 = new Laptop("Samsung", "Win 10", "AMD", "32", "15");
        Laptop laptop8 = new Laptop("Asus", "Win 11", "AMD", "16", "17");
        Laptop laptop9 = new Laptop("Dell", "Linux", "intel", "8", "15");
        Laptop laptop10 = new Laptop("HP", "Win 11", "AMD", "32", "17");
    
        set.add(laptop1);
        set.add(laptop2);
        set.add(laptop3);
        set.add(laptop4);
        set.add(laptop5);
        set.add(laptop6);
        set.add(laptop7);
        set.add(laptop8);
        set.add(laptop9);
        set.add(laptop10);
    
        return set;
    }


    public static HashMap<String, String> createFilter(){

        System.out.println("Enter the number corresponding to the required criteria: \n 1 - Brand \n " +
        "2 - Operating system \n 3 - Processor \n 4 - RAM \n 5 - Diagonal Screen");

        Scanner in = new Scanner(System.in);

        HashMap<String, String> map = new HashMap<>();

        Integer choice = in.nextInt();
        
        if (choice == 1){
            System.out.println("Choose a brand: Asus, Lenovo, Acer, Dell, HP, Samsung");   
        }
        else if(choice == 2){
            System.out.println("Select the operating system: Win 10, Linux");
        }
        else if(choice == 3){
            System.out.println("Select a processor: intel, AMD");
        }
        else if(choice == 4){
            System.out.println("Select the amount of RAM: 8, 16, 32 ,64");
        }
        else if(choice == 5){
            System.out.println("Select the diagonal of the screen: 15, 16, 17");
        }
        // String resul = in.nextLine();
        String result = scanner();
        String choice1 = Integer.toString(choice);
        map.put(choice1, result);
        in.close();

        return  map;
    }

    public static void laptop(Set<Laptop> set, HashMap<String, String> map ){

        Set<Laptop> set1 = new HashSet<>();
        List<Laptop> listLaptop = new ArrayList<>();
        Laptop lap = new Laptop(map.get("1"), map.get("2"), map.get("3"), map.get("4"), map.get("5"));
        set1.add(lap);

        for (Laptop laptop : set) {
            if(laptop.equals(lap)){
                //System.out.println(laptop);
                listLaptop.add(laptop);
            }
        }

        if(listLaptop.size() > 0){
            System.out.println("According to your request, these are the laptops:");
            System.out.println(listLaptop);
        }
        else{
            System.out.println("Nothing was found for your query");
        }
   }   
 }


