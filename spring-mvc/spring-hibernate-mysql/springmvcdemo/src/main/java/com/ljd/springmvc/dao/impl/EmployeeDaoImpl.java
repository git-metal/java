package com.ljd.springmvc.dao.impl;

import com.ljd.springmvc.dao.AbstractDao;
import com.ljd.springmvc.dao.EmployeeDao;
import com.ljd.springmvc.entity.Employee;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDaoImpl extends AbstractDao<Employee> implements EmployeeDao {
    @Override
    public Employee get(int id) {
        return (Employee) super.get(Employee.class, id);
    }

    @Override
    public String save(Employee employee) {
        return (String) super.save(employee);
    }
}
