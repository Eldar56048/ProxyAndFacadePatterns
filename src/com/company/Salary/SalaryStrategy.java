package com.company.Salary;

import com.company.enums.Levels;
import com.company.enums.Types;

public class SalaryStrategy {
    public static double getSalary(Types type, Levels level){
        double salary = 0;
        switch (type){
            case MOBILE_DEV:
                salary = new MobileDeveloperSalary().salary();
                break;
            case FRONTEND:
                salary = new FrontendDeveloperSalary().salary();
                break;
            case BACKEND:
                salary = new BackendDeveloperSalary().salary();
                break;
        }

        switch (level){
            case Junior:
                salary +=new JuniorSalary().salary();
                break;
            case Middle:
                salary += new MiddleSalary().salary();
                break;
            case Senior:
                salary += new SeniorSalary().salary();
                break;
            case Team_Lead:
                salary += new TeamLeadSalary().salary();
                break;
        }
        return  salary;
    }
}
