package HomeWork.HomeWork4;

import java.util.LinkedList;

public class MyObjectTask2 {
    private LinkedList<Integer> ll = new LinkedList<>(); // поля
    private int length = 0;

    int task2Size() {
        return length;
    }

    LinkedList<Integer> task2Add(int item) {
        ll.add(item);
        length++;

        return ll;
    }

    void task2Print() {
        if (length <= 0) {
            System.out.println("null");
        } else {
            for (int i = 0; i < length; i++) {
                System.out.print(ll.get(i) + " ");
            }
        }
    }

    LinkedList<Integer> task2Enqueue(int item) {
        ll.addLast(item);
        length++;

        return ll;
    }

    Integer task2Dequeue() {
        if (length <= 0) {
            return null;
        } else {
            length--;
            int a = ll.getFirst();
            ll.removeFirst();
            return a;
        }
    }

    Integer task2first() {
        if (length <= 0) {
            return null;
        } else {
            return ll.getFirst();
        }
    }
}
