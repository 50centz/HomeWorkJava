package HomeWorkJava.HomeWork3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        // 2.Пусть дан произвольный список целых чисел, удалить из него четные числа
        ArrayList <Integer> mylist = new ArrayList<Integer>();
        mylist = createRandomList();
        System.out.println(mylist);
        mylist = deleteOddOnes(mylist);
        System.out.println(mylist);
    }

    public static ArrayList <Integer> createRandomList(){
        Random random = new Random();
        ArrayList <Integer> newlist = new ArrayList<Integer>();

        for (int i = 0; i < 40; i++) {
            newlist.add(random.nextInt(1, 999));
        }
        return newlist;
    }

    public static ArrayList <Integer> deleteOddOnes (ArrayList<Integer> list){
        //ArrayList <Integer> mylist = new ArrayList<>(list);
        // for (int i = 0; i < list.size(); i++) {
        //     if (list.get(i) % 2 == 0){
        //         list.remove(i);
        //         i = 0;
        //     } 
        // }
        Iterator<Integer> listIteratir = list.iterator();
        
        while(listIteratir.hasNext()){
            if (listIteratir.next() % 2 == 0){
                listIteratir.remove();
            }
        }
        return list;
    }
    
}
