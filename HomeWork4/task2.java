package HomeWork.HomeWork4;

public class task2 {
    public static void main(String[] args) {
        // Реализуйте очередь с помощью LinkedList со следующими методами: 
        // enqueue() - помещает элемент в конец очереди,
        // dequeue() - возвращает первый элемент из очереди и удаляет его, 
        // first() - возвращает первый элемент из очереди, не удаляя

        MyObjectTask2 ll = new MyObjectTask2();

        ll.task2Add(15);
        ll.task2Add(47);
        ll.task2Add(78);
        ll.task2Enqueue(12);

        ll.task2Print();
        System.out.println();
        System.out.println(ll.task2first());
        System.out.println(ll.task2Size());
        System.out.println(ll.task2Dequeue());
        ll.task2Print();
        System.out.println();
        System.out.println(ll.task2Dequeue());
        System.out.println(ll.task2Dequeue());
        System.out.println(ll.task2Dequeue());
        ll.task2Print();
        System.out.println(ll.task2Dequeue());

    }
}
