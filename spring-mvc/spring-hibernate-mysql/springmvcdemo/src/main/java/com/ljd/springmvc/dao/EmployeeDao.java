package com.ljd.springmvc.dao;

import com.ljd.springmvc.entity.Employee;

public abstract interface EmployeeDao {

    public abstract Employee get(int id);

    public abstract String save(Employee employee);

}
