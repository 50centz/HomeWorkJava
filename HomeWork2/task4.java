package HomeWork.HomeWork2;

import java.util.Scanner;
import java.io.IOException;
import java.util.logging.*;

public class task4 {
    public static void main(String[] args) throws IOException {
        // 4*. К калькулятору из предыдущего дз добавить логирование.
        Logger log = log();
        Scanner in = new Scanner(System.in);
        System.out.print("Enter two numbers and an arithmetic operation separated by a space: ");
        double num1 = in.nextInt();
        Character ao = in.next().charAt(0);
        double num2 = in.nextInt();
        in.close();
        double res = 0;
        switch (ao) {
            case '+':
                res = num1 + num2;
                break;
            case '-':
                res = num1 - num2;
                break;
            case '*':
                res = num1 * num2;
                break;
            case '/':
                res = num1 / num2;
                break;
            default:
                System.out.printf("Error! Enter correct arithmetic operator");
                return;
        }
        System.out.printf(num1 + " " + ao + " " + num2 + " = " + "%.2f", res);
        String num11 = Double.toString(num1);
        String num22 = Double.toString(num2);
        String ao1 = Character.toString(ao);
        String res1 = Double.toString(res);
        log.info(num11 + " " + ao1 + " " + num22 + " = " + res1);

    }

    public static Logger log() throws IOException {
        Logger logger = Logger.getLogger(task4.class.getName());
        FileHandler fh = new FileHandler("log.txt", true);
        logger.addHandler(fh);
        logger.setUseParentHandlers(false);

        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);

        return logger;
    }
}
