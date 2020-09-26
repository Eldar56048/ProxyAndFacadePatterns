package com.company.Salary;

public class SeniorSalary extends MiddleSalary implements Salary{
    @Override
    public double salary() {
        return super.salary()+100000;
    }
}
