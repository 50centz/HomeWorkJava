package HomeWork.HomeWork1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class homework {
    public static void main(String[] args) {
        // 1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), n!(произведение чисел от 1 до n)
        Scanner in = new Scanner(System.in);
        System.out.println("Input a digit: ");
        int number = in.nextInt();
        in.close();
        int count = 1;
        if (number == 1){
            System.out.println(number + "-е треугольного числа = " + number);
        }
        else{
            for (int i = 2; i <= number; i++) {
                count += i;
            }
            System.out.println(number + "-е треугольного числа = " + count);
        }
        
        // 2. Вывести все простые числа от 1 до 1000
        // 3. Реализовать простой калькулятор
        // 4. *+Задано уравнение вида q + w = e, q, w, e >=0. Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69. 
        //     Требуется восстановить выражение до верного равенства. Предложить хотя бы одно решение или сообщить, что его нет.
    }
}

