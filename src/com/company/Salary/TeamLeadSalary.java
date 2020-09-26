package com.company.Salary;

public class TeamLeadSalary extends SeniorSalary implements Salary{
    @Override
    public double salary() {
        return super.salary()+200000;
    }
}
