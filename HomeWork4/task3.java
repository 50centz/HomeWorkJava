package HomeWork.HomeWork4;

public class task3 {
    public static void main(String[] args) {
        // Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке. Используйте итератор

        MyObjectTask3 ll = new MyObjectTask3();

        ll.task3Add(15);
        ll.task3Add(14);
        ll.task3Add(45);
        ll.task3Add(19);
        ll.task3Add(10);
        ll.task3Add(15);
        ll.task3Add(16);
        ll.task3Add(4);

        System.out.println(ll.task3Sum());
    }
}
