package HomeWork.HomeWork2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class task1 {
    public static void main(String[] args) {
        // 1 . Дана строка sql-запроса "select * from students where ". 
        //     Сформируйте часть WHERE этого запроса, используя StringBuilder. Данные для фильтрации приведены ниже в виде json строки.
        //     Если значение null, то параметр не должен попадать в запрос.
        //     Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
        StringBuilder sqlZapros = new StringBuilder("select * from students where");
        createJson();
        String getjsonFile = get_json_file("C:/Users/e.fedorov/Desktop/Java/HomeWork/HomeWork2/filetask1.json");
        //System.out.println(getjsonFile);
        // sqlZapros = stroka(sqlZapros, data);
        // System.out.println(sqlZapros);
    }

    public static void createJson(){
        JSONObject jsonFile = new JSONObject();
        jsonFile.put("name", "Ivanov");
        jsonFile.put("country", "Russia");
        jsonFile.put("city", "Moscow");
        jsonFile.put("age", null);
        System.out.println(jsonFile);
        try (FileWriter mywriter = new FileWriter("C:/Users/e.fedorov/Desktop/Java/HomeWork/HomeWork2/filetask1.json")){
            mywriter.write(String.valueOf(jsonFile));
        } catch (Exception e){
            System.out.println("Ошибка");
        }
        finally{
            System.out.println("Конец работы с файлом");
        }
    }
    
    public static String get_json_file(String filename){
        String jsonfileget = filename;
        System.out.println(jsonfileget);

        JSONObject getfile = new JSONObject();
        
        // try {
        //     BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));
        //     String line;
        //     while ((line = bufferedReader.readLine()) != null){
        //         jsonfileget += line + "\n";
        //     }
        //     bufferedReader.close();
        //     System.out.println(jsonfileget.getClass());
        //     System.out.println(jsonfileget.toString());
        // } catch (Exception e){
        //     e.printStackTrace();
        // }
        return jsonfileget;

    }



    // public static StringBuilder stroka(StringBuilder sqlZapros, JSONObject data){
        
        

    //     return sqlZapros;
    // }
}
