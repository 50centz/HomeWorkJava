package HomeWork.HomeWork4;

import java.util.Collections;
import java.util.LinkedList;

public class MyObjectTask1 {
    private LinkedList<Integer> ll = new LinkedList<>(); // поля
    private int length = 0;


    int task1Size() {
        return length;
    }


    LinkedList<Integer> task1Add(int item){
        ll.add(item);
        length++;

        return ll;
    }
    
    void task1Print(){
        for (int i = 0; i < ll.size(); i++) {
            System.out.print(ll.get(i) + " ");  
        }
    }

    LinkedList<Integer> task1Sort(){
        Collections.sort(ll);
        return ll;
    }
    

}
