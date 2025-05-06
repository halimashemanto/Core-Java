package maphashmap;

import java.util.*;
import maphashmap.stu.Student;

public class MapHashMap {

    public static void main(String[] args) {

        // eta normal way kivabe map banano hoy ta.
        Map<String, Integer> names = new HashMap<>();

        names.put("Shemanto", 10);
        names.put("Suprova", 20);
        names.put("Simki", 10);
        names.put("Shemanto", 50);
        names.put("Innu moni", 15);
        names.put("Shawon", 17);
        names.put("Suhaib", 16);
        names.put("Zorein", 1);
        names.put("Sehjin Munjir Arish", 2);

        //  System.out.println(names); 
// eita class create kore map a call kora object baniye.
        Map<Integer, Student> student = new HashMap<>();

        student.put(1, new Student("Shemanto", 25, 1287046, "suprovaShemanto@gmail.com"));
        student.put(2, new Student("KamruzZaman", 20, 128704, "suprovaShemanto@gmail.com"));
        student.put(3, new Student("Azmain Inqiad Arabi", 35, 1287046, "suprovaShemanto@gmail.com"));
        student.put(4, new Student("Sehzil Munzir Arish", 65, 1287046, "suprovaShemanto@gmail.com"));
        student.put(5, new Student("Mehwish Rahman Innaya", 2, 1287046, "suprovaShemanto@gmail.com"));

        // System.out.println(student);

        // eta while loop use kore class object k r o efficient kora
        Iterator<Map.Entry<Integer, Student>> li = student.entrySet().iterator();

        while (li.hasNext()) {
            Map.Entry<Integer, Student> entry = li.next();
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }

}
