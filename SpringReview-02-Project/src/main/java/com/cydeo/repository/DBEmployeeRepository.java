package com.cydeo.repository;

import com.cydeo.model.Employee;
import org.springframework.stereotype.Component;

@Component
public class DBEmployeeRepository implements EmployeeRepository{


    // Assume we are getting info from database
    @Override
    public int getHourlyRate() {

        Employee employee = new Employee("Mike", "IT", 55);

        return employee.getHourlyRate();
    }
}
