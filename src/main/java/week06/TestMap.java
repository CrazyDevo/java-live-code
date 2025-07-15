package week06;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class TestMap {


    public static void main(String[] args) {

        Map<Integer, Person> map = new HashMap<>();


        Person person1=new Student(101,"A",20);
        Person person2=new Student(102,"B",25);
        Person person3=new Student(103,"C",23);
        Person person4=new Student(104,"D",33);


        Person person5=new Teacher(105,"E",55);
        Person person6=new Teacher(106,"F",70);
        Person person7=new Teacher(107,"G",45);
        Person person8=new Teacher(108,"H",60);

        map.put(101,person1);
        map.put(102,person2);
        map.put(103,person3);
        map.put(104,person4);
        map.put(105,person5);
        map.put(106,person6);
        map.put(107,person7);
        map.put(108,person8);



        //fetch the teachers are greater than 58

        for (Map.Entry<Integer, Person> personEntry : map.entrySet()) {
            Person value = personEntry.getValue();
            // we are using instanceof keyword to understand the object type
            if (value instanceof Teacher && value.age>58)
                System.out.println(value);

        }


        //fetch the students are younger than 25

        System.out.println("-----------------------------------");

        for (Integer eachKey : map.keySet()) {
            Person person = map.get(eachKey);

            if (person instanceof Student && person.age<25)
                System.out.println(person);
        }













    }
}
