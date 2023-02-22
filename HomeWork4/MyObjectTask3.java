package HomeWork.HomeWork4;

import java.util.LinkedList;

public class MyObjectTask3 {

    private LinkedList<Integer> ll = new LinkedList<>();
    private int length = 0;

    int task3Size() {
        return length;
    }

    LinkedList<Integer> task3Add(int item) {
        ll.add(item);
        length++;

        return ll;
    }

    Integer task3Sum() {
        int count = 0;

        for (Integer integer : ll) {
            count += integer;
        }
        return count;
    }
}
