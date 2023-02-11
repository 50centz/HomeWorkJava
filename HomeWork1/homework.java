package HomeWork.HomeWork1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class homework {
    public static void main(String[] args) {
        /* 
        1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), n!(произведение чисел от 1 до n)

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

        */

        /*     
        2. Вывести все простые числа от 1 до 1000

        int count = 0;    
        for (int i = 1; i <= 1000; i++) {
            Boolean simple = i > 1;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    simple = false;
                    break;
                }
            }
            if (simple){
                count += 1;
                System.out.print(i + " ");
            }  
        }
        System.out.println();
        System.out.println(count);

        */

        /* 
        3. Реализовать простой калькулятор

        Scanner in = new Scanner(System.in);
        System.out.print("Enter two numbers and an arithmetic operation separated by
        a space: ");
        double num1 = in.nextInt();
        char ao = in.next().charAt(0);
        double num2 = in.nextInt();
        in.close();
        double res = 0;
        switch(ao) {
        case '+': res = num1 + num2;
        break;
        case '-': res = num1 - num2;
        break;
        case '*': res = num1 * num2;
        break;
        case '/': res = num1 / num2;
        break;
        default: System.out.printf("Error! Enter correct arithmetic operator");
        return;
        }
        System.out.printf(num1 + " " + ao + " " + num2 + " = " + "%.2f", res);

        */

        // 4. *+Задано уравнение вида q + w = e, q, w, e >=0. Некоторые цифры могут быть
        // заменены знаком вопроса, например 2? + ?5 = 69.
        // Требуется восстановить выражение до верного равенства. Предложить хотя бы
        // одно решение или сообщить, что его нет.
    }
}
