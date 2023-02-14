package HomeWork.HomeWork2;

import java.io.FileWriter;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class task1 {
    public static void main(String[] args) {
        // 1 . Дана строка sql-запроса "select * from students where ". 
        //     Сформируйте часть WHERE этого запроса, используя StringBuilder. Данные для фильтрации приведены ниже в виде json строки.
        //     Если значение null, то параметр не должен попадать в запрос.
        //     Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
        StringBuilder sqlZapros = new StringBuilder("select * from students where");
        JSONObject data =  createJson();
        // sqlZapros = stroka(sqlZapros, data);
        // System.out.println(sqlZapros);
    }

    public static JSONObject createJson(){
        JSONObject jsonStroka = new JSONObject();
        jsonStroka.put("name", "Ivanov");
        jsonStroka.put("country", "Russia");
        jsonStroka.put("city", "Moscow");
        jsonStroka.put("age", "null");
        System.out.println(jsonStroka);
        try (FileWriter mywriter = new FileWriter("C:/Users/e.fedorov/Desktop/Java/HomeWork/HomeWork2/file.json")){
            mywriter.write(String.valueOf(jsonStroka));
        } catch (Exception e){
            System.out.println("Ошибка");
        }
        finally{
            System.out.println("Конец работы с файлом");
        }
        return jsonStroka;
    }
    



    // public static StringBuilder stroka(StringBuilder sqlZapros, JSONObject data){
        
        

    //     return sqlZapros;
    // }
}
