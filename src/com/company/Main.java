package com.company;

import com.company.Facade.Facade;
import com.company.Proxy.CompanyProxy;
import com.company.Proxy.DeveloperProxy;
import com.company.Proxy.ManagerProxy;
import com.company.entities.Company;
import com.company.entities.Employee;
import com.company.enums.JobTitle;
import com.company.enums.Levels;
import com.company.enums.Types;

public class Main {

    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.newCompany("DemoCompany");
        facade.addProject("DemoProject",20000000);
        facade.addEmployee("DemoProject","Eldar",JobTitle.Developer,"Java",Types.BACKEND,Levels.Team_Lead);
        facade.addEmployee("DemoProject","Talgat",JobTitle.Developer,"JS",Types.FRONTEND,Levels.Team_Lead);
        facade.addEmployee("DemoProject","Kuanysh",JobTitle.Developer,"Swift",Types.MOBILE_DEV,Levels.Team_Lead);
        facade.addEmployee("DemoProject","Batyr",JobTitle.Manager);
        facade.work();
    }
}
