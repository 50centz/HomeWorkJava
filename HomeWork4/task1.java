package HomeWork.HomeWork4;

public class task1 {
    public static void main(String[] args) {
        // Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который
        // вернет “перевернутый” список. Постараться не обращаться к листу по индексам.

        MyObjectTask1 lll = new MyObjectTask1();

        System.out.println(lll.task1Size());

        lll.task1Add(17);
        lll.task1Add(15);
        lll.task1Add(55);
        lll.task1Add(1);
        lll.task1Add(45);
        lll.task1Add(4);
        lll.task1Add(7);

        lll.task1Print();
        System.out.println();
        lll.task1Sort();
        lll.task1Print();

    }
}
