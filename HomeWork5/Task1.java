package HomeWorkJava.HomeWork5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Task1
 */
public class Task1 {

    public static void main(String[] args) {

        // Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.

        Map<String, List<String>> hM = new HashMap<>();
        String s = "Николай Васильев 1111111,Алексей Михайлов 333333,Михаил Иванов 4444444 55555555,Николай Васильев 777777,Алексей Михайлов +7-495-525-00-00";
        hM = phoneBook(s);
        System.out.println(hM);
    }

    public static Map<String, List<String>> phoneBook(String s) {

        Map<String, List<String>> hm = new HashMap<>();
        String[] s1 = s.split(",");

        for (int i = 0; i < s1.length; i++) {
            String s2 = s1[i];
            String[] s3 = s2.split(" ");
            for (int j = 2; j < s3.length; j++) {
                String key = s3[0] + " " + s3[1];
                if (hm.containsKey(key)) {
                    List<String> list = hm.get(key);
                    list.add(s3[j]);
                } else {
                    List<String> list = new ArrayList<>();
                    list.add(s3[j]);
                    hm.put(key, list);
                }
            }
        }
        return hm;
    }
}