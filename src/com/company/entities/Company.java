package com.company.entities;

import com.company.interfaces.Work;

import java.util.ArrayList;

public class Company implements Work {
    private String companyName;
    private ArrayList<Project> projects = new ArrayList<>();

    public Company(String companyName){
        this.companyName = companyName;
    }

    public Company(String companyName,ArrayList<Project> projects){
        this.companyName = companyName;
        this.projects = projects;
    }

    public void addProject(String projectName,double budget){
        Project project = new Project(projectName,budget);
        projects.add(project);
    }

    public void addProject(Project project){
        projects.add(project);
    }

    public void addEmployee(String projectName, Employee employee){
        for(Project project : projects){
            if(project.getProject_name().equals(projectName)){
                project.addEmployees(employee);
            }
        }
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public ArrayList<Project> getProjects() {
        return projects;
    }

    public void getCompanyProjects(){
        for(Project project : projects){
            System.out.println(project.getProject_name());
        }
    }

    @Override
    public void work() {
        System.out.println(companyName);
        for (Project project : projects){
            project.work();
        }
    }
}
