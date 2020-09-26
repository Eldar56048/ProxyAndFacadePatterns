package com.company.entities;

import com.company.enums.JobTitle;

public class Manager extends Employee {
public Manager(String name, JobTitle jobTitle){

    super(name,jobTitle);
}

    @Override
    public void work() {
        System.out.println("I am managing the project");
    }
}
