package week03;

import com.github.javafaker.Faker;
import org.json.JSONObject;

public class TestReading {

    public static void main(String[] args) {
        String user=JSONUtils.readJSONFile("UserCreatePayload");

        JSONObject jsonObject=new JSONObject(user);

        System.out.println(jsonObject.get("name"));
        System.out.println(jsonObject.get("age"));
       // jsonObject.remove("age");
       // jsonObject.put("last_name","Barry");


        System.out.println(user);

        Faker faker=new Faker();
        jsonObject.put("name",faker.name().firstName());
        System.out.println(jsonObject);

    }
}
