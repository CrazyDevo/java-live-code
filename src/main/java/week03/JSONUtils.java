package week03;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class JSONUtils {


    public static String readJSONFile(String fileName) {

        String filePath=System.getProperty("user.dir")+"/src/main/resources/Payloads/"+fileName +".json";

        File file = new File(filePath);

        if (!file.exists()) {
            throw new RuntimeException("File Not Found!!!!!!!!!!!");
        }

        try {
            InputStream inputStream=new FileInputStream(file);

            return new String(inputStream.readAllBytes(), StandardCharsets.UTF_8);
        }catch (Exception e){

            throw new RuntimeException("There was a problem reading the file!!!!!!!!!!!");
        }



    }

}
