package com.ljd.springmvc.service;

import com.ljd.springmvc.dao.EmployeeDao;
import com.ljd.springmvc.entity.Employee;
import com.ljd.springmvc.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class DemoService {

    @Autowired
    private EmployeeDao employeeDao;

    public Person getPerson()
    {
        Person person = new Person();
        person.setName("test hahahah");
        person.setAge(9999);
        return person;
    }

    public Employee getEmployee(int id)
    {
        return employeeDao.get(id);
    }

    public String addEmployee(Employee employee)
    {
        return employeeDao.save(employee);
    }

}
