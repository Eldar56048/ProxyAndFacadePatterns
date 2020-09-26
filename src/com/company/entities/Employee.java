package com.company.entities;

import com.company.enums.JobTitle;
import com.company.interfaces.Work;

public abstract class Employee implements Work {
    private String name;
    private JobTitle jobTitle;
    private double salary;

    public Employee(String name, JobTitle jobTitle) {
        this.name = name;
        this.jobTitle = jobTitle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public JobTitle getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(JobTitle jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public abstract void work();
}
