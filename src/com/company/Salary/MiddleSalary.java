package com.company.Salary;

public class MiddleSalary extends JuniorSalary implements Salary{
    @Override
    public double salary() {
        return super.salary()+100000;
    }
}
