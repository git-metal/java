package com.ljd.springmvc.controller;

import com.ljd.springmvc.config.ConfigurerUtil;
import com.ljd.springmvc.entity.Employee;
import com.ljd.springmvc.entity.Person;
import com.ljd.springmvc.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("DemoController")
@RequestMapping(produces = "application/json;charset=UTF-8")
public class DemoController {

    @Autowired
    DemoService demoService;

    @Autowired
    ConfigurerUtil configurerUtil;

    @GetMapping(value = "/index")
    public String index()
    {
        return "Hello springmvc! hahaha";
    }

    @GetMapping(value = "/version")
    public Object version()
    {
        return "{\"version:\":\"1.0.0\"}";
    }

    @GetMapping(value = "/person")
    public Object getPerson()
    {
        Person person = new Person();
        person.setName("test");
        person.setAge(18);
        person = demoService.getPerson();
        return person;
    }

    @GetMapping(value = "/person/{id}")
    public Object getPersonById(@PathVariable String id)
    {
        Person person = new Person();
        person.setName(id);
        person.setAge(18);
        return person;
    }

    @GetMapping(value = "/employee/{id}")
    public Object getEmployeeById(@PathVariable String id)
    {
        return demoService.getEmployee(Integer.valueOf(id));
    }

    @GetMapping(value = "/employee/add")
    public Object addEmployee()
    {
        Employee employee = new Employee();
        employee.setId(110);
        employee.setFirstName("spring");
        employee.setLastName("mvc");
        return demoService.addEmployee(employee);
    }

    @GetMapping(value = "/config")
    public Object getConfig()
    {
        return configurerUtil;
    }
}
