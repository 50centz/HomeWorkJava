package HomeWork.HomeWork1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.security.Key;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class homeworknew {
    public static void main(String[] args) {
       // 1 . Дана строка sql-запроса "select * from students where ". 
        //     Сформируйте часть WHERE этого запроса, используя StringBuilder. Данные для фильтрации приведены ниже в виде json строки.
        //     Если значение null, то параметр не должен попадать в запрос.
        //     Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
        // // StringBuilder sqlZapros = new StringBuilder("select * from students where");
        // // createJson();
        // // String getjsonFile = get_json_file("HW2filetask1.json");
        // // // sqlZapros = stroka(sqlZapros, data);
        // System.out.println(sqlZapros);
    }

    // public static void createJson(){
    //     JSONObject jsonFile = new JSONObject();
    //     jsonFile.put("name", "Ivanov");
    //     jsonFile.put("country", "Russia");
    //     jsonFile.put("city", "Moscow");
    //     jsonFile.put("age", "null");


    //     try (FileWriter mywriter = new FileWriter("HW2filetask1.json")){
    //         mywriter.write(String.valueOf(jsonFile));
    //     } catch (Exception e){
    //         System.out.println("Ошибка");
    //     }
    //     finally{
    //         System.out.println("Конец работы с файлом");
    //     }
    // }
    
    // public static String get_json_file(String filename){
    //     String jsonfileget = "";
        
    //     try {
    //         BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));
    //         String line;
    //         while ((line = bufferedReader.readLine()) != null){
    //             jsonfileget += line + "\n";
    //         }
    //         bufferedReader.close();
    //         System.out.println(jsonfileget.getClass());
    //         System.out.println(jsonfileget.toString());
    //     } catch (Exception e){
    //         e.printStackTrace();
    //     }
    //     return jsonfileget;

    // }



    // public static StringBuilder stroka(StringBuilder sqlZapros, JSONObject data){
        
        

    //     return sqlZapros;
    // }
        
    }



    // public static Logger log() throws IOException {
    //     Logger logger = Logger.getLogger(task2.class.getName());
    //     FileHandler fh = new FileHandler("log.txt", true);
    //     logger.addHandler(fh);
    //     logger.setUseParentHandlers(false);

    //     SimpleFormatter sFormat = new SimpleFormatter();
    //     fh.setFormatter(sFormat);

    //     return logger;
    // }


