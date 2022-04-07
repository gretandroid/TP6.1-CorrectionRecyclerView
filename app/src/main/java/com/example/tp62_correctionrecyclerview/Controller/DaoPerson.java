package com.example.tp62_correctionrecyclerview.Controller;

import com.example.tp62_correctionrecyclerview.Model.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DaoPerson {

    private List<Person> personList = new ArrayList<>();

    public DaoPerson() {
    }

    public List<Person> getAllPersons() {
            return Collections.unmodifiableList(personList);
    }

    public void addPerson(Person p) {
        personList.add(p);
    }
}
