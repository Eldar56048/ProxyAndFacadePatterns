package com.company.Proxy;

import com.company.entities.Employee;
import com.company.enums.JobTitle;
import com.company.entities.Manager;

public class ManagerProxy extends Employee {
    private Manager manager;
    public ManagerProxy(String name, JobTitle jobTitle){
        super(name,jobTitle);
    }

    @Override
    public void work() {
        if(manager == null){
            manager = new Manager(super.getName(),super.getJobTitle());
        }
        manager.work();
    }
}
