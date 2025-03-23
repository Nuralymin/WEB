package com.example;

import com.example.domain.Employee;

public class EmployeeTest {
    public static void main(String[] args){
        Employee temp = new Employee();

        temp.setId(1);
        // temp.setName("Nuraly");
        temp.setKey("aisjdf");
        temp.setSalary(129313);

        System.out.println("ID:" + temp.getId());
        System.out.println("Name:" + temp.getName());
        System.out.println("Key:" + temp.getKey());
        System.out.println("Salary:" + temp.getSalary());
    }
}
