package HomeWork.HomeWork2;

import java.util.Arrays;
import java.util.Random;
import java.io.IOException;
import java.util.logging.*;

public class task2 {

    public static void main(String[] args) throws IOException {
        var s = System.currentTimeMillis();
        // 2 . Реализуйте алгоритм сортировки пузырьком числового массива, результат
        // после каждой итерации запишите в лог-файл
        int[] array = create_array();
        int[] array1 = sort_array(array);
     }

    public static int[] create_array() {
        var s = System.currentTimeMillis();
        Random random = new Random();
        int[] array = new int[random.nextInt(1, 100)];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1, 100);
        }
        return array;
    }

    public static int[] sort_array(int[] array) throws IOException {
        Logger log = log();
        var s = System.currentTimeMillis();
        boolean flag = false;
        while (!flag) {
            flag = true;
            for (int j = 1; j < array.length; j++) {
                if (array[j] < array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                    flag = false;

                    log.info(Arrays.toString(array));
                }
            }
        }
        System.out.println(System.currentTimeMillis() - s);
        return array;
    }

    public static Logger log() throws IOException {
        Logger logger = Logger.getLogger(task2.class.getName());
        FileHandler fh = new FileHandler("log.txt");
        logger.addHandler(fh);
        logger.setUseParentHandlers(false);

        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);

        return logger;
    }
}
