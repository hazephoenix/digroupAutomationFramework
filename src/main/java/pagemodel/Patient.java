package pagemodel;

import java.util.Map;

public class Patient {

    private String name;
    private int id;
    private int  age;
    private String diagnos;
    private Map<String, String > li4nieDannie;


    public Patient(String name, int id, int age, String diagnos) {

        this.name = name;
        this.id = id;
        this.age = age;
        this.diagnos = diagnos;
    }


}
