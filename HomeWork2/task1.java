package HomeWork.HomeWork2;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;

import com.google.gson.Gson;

public class task1 {
    public static void main(String[] args) {
        // 1 . Дана строка sql-запроса "select * from students where ". 
        //     Сформируйте часть WHERE этого запроса, используя StringBuilder. Данные для фильтрации приведены ниже в виде json строки.
        //     Если значение null, то параметр не должен попадать в запрос.
        //     Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
        JSONObject jsonFile = createJson();
        StringBuilder sqlZapros = new StringBuilder("SELECT * FROM students WHERE ");
        createSQLZapros(jsonFile, sqlZapros);
        
    }

    public static JSONObject createJson(){
        JSONObject jsonFile = new JSONObject();
        jsonFile.put("name", "Ivanov");
        jsonFile.put("country", "Russia");
        jsonFile.put("city", "Moscow");
        jsonFile.put("age", null);
        return jsonFile;
    }

    public static void createSQLZapros(JSONObject jsonFile, StringBuilder sqlZapros){
        HashMap<String, String> mymap = new Gson().fromJson(jsonFile.toString(), HashMap.class);
        for(Map.Entry<String, String> itr: mymap.entrySet()){
            if (itr.getValue() != null){
                sqlZapros.append(itr.getKey());
                sqlZapros.append(" = ");
                sqlZapros.append(itr.getValue());
                sqlZapros.append(" AND ");
            }
        }
        int size = sqlZapros.length();
        int start = size - 5;
        sqlZapros.delete(start, size);
        sqlZapros.append(";");
        System.out.println(sqlZapros);
    }   
}
