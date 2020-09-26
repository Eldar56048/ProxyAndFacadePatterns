package com.company.Facade;

import com.company.Proxy.CompanyProxy;
import com.company.Proxy.DeveloperProxy;
import com.company.Proxy.ManagerProxy;
import com.company.enums.JobTitle;
import com.company.enums.Levels;
import com.company.enums.Types;

public class Facade {
private CompanyProxy companyProxy;
private DeveloperProxy developerProxy;
private ManagerProxy managerProxy;

public void newCompany(String companyName){
    this.companyProxy = new CompanyProxy(companyName);
}
public void addProject(String projectName, double budget){
    this.companyProxy.addProject(projectName,budget);
}

public void addEmployee(String projectName,String name, JobTitle jobTitle, String language, Types type, Levels level){
this.companyProxy.addEmployee(projectName,new DeveloperProxy(name,jobTitle,language,type,level));
}

public void addEmployee(String projectName,String name,JobTitle jobTitle){
    this.companyProxy.addEmployee(projectName,new ManagerProxy(name,jobTitle));
}

public void work(){
    this.companyProxy.work();
}

}
