package com.ljd.springmvc.service;

import com.ljd.springmvc.entity.Person;
import org.springframework.stereotype.Service;

@Service
public class DemoService {

    public Person getPerson()
    {
        Person person = new Person();
        person.setName("test hahahah");
        person.setAge(9999);
        return person;
    }

}
