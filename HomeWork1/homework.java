package HomeWork.HomeWork1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class homework {
    public static void main(String[] args) {
        /*
         * 1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), n!(произведение
         * чисел от 1 до n)
         * 
         * Scanner in = new Scanner(System.in);
         * System.out.println("Input a digit: ");
         * int number = in.nextInt();
         * in.close();
         * int count = 1;
         * if (number == 1){
         * System.out.println(number + "-е треугольного числа = " + number);
         * }
         * else{
         * for (int i = 2; i <= number; i++) {
         * count += i;
         * }
         * System.out.println(number + "-е треугольного числа = " + count);
         * }
         * 
         */

        /*
         * 2. Вывести все простые числа от 1 до 1000
         * 
         * int count = 0;
         * for (int i = 1; i <= 1000; i++) {
         * Boolean simple = i > 1;
         * for (int j = 2; j < i; j++) {
         * if (i % j == 0) {
         * simple = false;
         * break;
         * }
         * }
         * if (simple){
         * count += 1;
         * System.out.print(i + " ");
         * }
         * }
         * System.out.println();
         * System.out.println(count);
         * 
         */

        /*
         * 3. Реализовать простой калькулятор
         * 
         * Scanner in = new Scanner(System.in);
         * System.out.print("Enter two numbers and an arithmetic operation separated by
         * a space: ");
         * double num1 = in.nextInt();
         * char ao = in.next().charAt(0);
         * double num2 = in.nextInt();
         * in.close();
         * double res = 0;
         * switch(ao) {
         * case '+': res = num1 + num2;
         * break;
         * case '-': res = num1 - num2;
         * break;
         * case '*': res = num1 * num2;
         * break;
         * case '/': res = num1 / num2;
         * break;
         * default: System.out.printf("Error! Enter correct arithmetic operator");
         * return;
         * }
         * System.out.printf(num1 + " " + ao + " " + num2 + " = " + "%.2f", res);
         * 
         */

        /* */
        
        

        String function = "?2 + 3? = 75";
        String result = func(function);
        System.out.println(result);

        
        
    }

    // 4. *+Задано уравнение вида q + w = e, q, w, e >=0. Некоторые цифры могут быть
    // заменены знаком вопроса, например 2? + ?5 = 69.
    // Требуется восстановить выражение до верного равенства. Предложить хотя бы
    // одно решение или сообщить, что его нет.

    public static String func(String stroka) {
        
        
        String [] arr = stroka.split("\\s");
        String a = arr[0];
        String b = arr[2];
        String c = arr[arr.length - 1];
        boolean parametr = true;
        String result = "";
        for (int i = 0; i < 10; i++) {
           int q = Integer.parseInt(a.replace("?", Integer.toString(i)));
            for (int j =0; j < 10; j++) {
                int w = Integer.parseInt(b.replace("?", Integer.toString(j)));
                for (int k = 0; k < 10; k++) {
                    int e = Integer.parseInt(c.replace("?", Integer.toString(k)));
                    if (q + w == e) {
                        result = (q + " " + " + " + w + " = " + e);
                        parametr = false;
                        break;
                    }
                }
                if (parametr == false) break;
            }
            if (parametr == false) break;
        } 
        if (parametr){
            result = ("Нет решения!");

        } 
        return result;
    }

    
}
