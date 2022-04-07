package com.example.tp62_correctionrecyclerview.Model;

import java.util.ArrayList;
import java.util.List;

public class PersonProvider {

    public static List<Person> personList = new ArrayList<>();

    static{
        personList.add(new Person("toto","toto"));
        personList.add(new Person("tata", "tata"));
        personList.add(new Person("tutu", "tutu"));
        personList.add(new Person("titi","titi"));
    }
}
