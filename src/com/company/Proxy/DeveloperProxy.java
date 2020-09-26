package com.company.Proxy;

import com.company.Developers.AbstractDeveloperFactory;
import com.company.Salary.SalaryStrategy;
import com.company.entities.Developer;
import com.company.entities.Employee;
import com.company.enums.JobTitle;
import com.company.enums.Levels;
import com.company.enums.Types;

public class DeveloperProxy extends Employee {
    private Developer developer;
    private String language;
    private Types types;
    private Levels levels;
    private AbstractDeveloperFactory abstractDeveloperFactory;
    public DeveloperProxy(String name, JobTitle jobTitle, String language, Types types, Levels levels){
        super(name,jobTitle);
        this.language = language;
        abstractDeveloperFactory = new AbstractDeveloperFactory(types,levels);
        setSalary(SalaryStrategy.getSalary(types,levels));
        this.types = types;
        this.levels = levels;
    }

    @Override
    public void work() {
        if(developer == null){
            developer = new Developer(super.getName(),super.getJobTitle(),language,types,levels);
        }
        developer.work();
    }
}
