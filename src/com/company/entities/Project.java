package com.company.entities;

import com.company.interfaces.Work;

import java.util.ArrayList;

public class Project implements Work {
    private String project_name;
    private double budget;
    private ArrayList<Employee>employees = new ArrayList();

    public Project(String project_name, double budget) {
        this.project_name = project_name;
        this.budget = budget;
    }

    public String getProject_name() {
        return project_name;
    }

    public void setProject_name(String project_name) {
        this.project_name = project_name;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void addEmployees(Employee employee) {
        this.employees.add(employee);
    }

    public void aboutEmployees(){
        for(Employee employee : employees){
            System.out.println(employee.getName()+" "+employee.getSalary()+" "+employee.getJobTitle());
            employee.work();
        }
    }

    @Override
    public void work() {
        System.out.println(getProject_name()+" "+getBudget()+"Employees");
        aboutEmployees();
    }
}
