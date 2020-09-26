package com.company.Proxy;

import com.company.entities.Company;
import com.company.entities.Employee;
import com.company.entities.Project;
import com.company.interfaces.Work;

import java.util.ArrayList;

public class CompanyProxy implements Work {
    private Company company;
    private String companyName;
    private ArrayList<Project> projects = new ArrayList<>();

    public CompanyProxy(String companyName){
        this.companyName = companyName;
    }

    public void addProject(String projectName,double budget){
        if(company == null){
            company = new Company(companyName,projects);
        }
        company.addProject(projectName,budget);
    }

    public void addProject(Project project){
        if(company == null){
            company = new Company(companyName,projects);
        }
        company.addProject(project);
    }

    public void addEmployee(String projectName,Employee e){
        if(company == null){
            company = new Company(companyName,projects);
        }
        company.addEmployee(projectName,e);
    }

    public void getCompanyProjects(){
        if(company == null){
            company = new Company(companyName,projects);
        }
        company.getCompanyProjects();
    }

    @Override
    public void work() {
        if(company == null){
            company = new Company(companyName,projects);
        }
        company.work();
    }
}
