package com.company.entities;

import com.company.Developers.AbstractDeveloperFactory;
import com.company.Salary.SalaryStrategy;
import com.company.enums.JobTitle;
import com.company.enums.Levels;
import com.company.enums.Types;

public class Developer extends Employee {
    private String language;
    private Types types;
    private Levels levels;
    private AbstractDeveloperFactory abstractDeveloperFactory;

    public Developer(String name, JobTitle jobTitle, String language, Types types, Levels levels) {
        super(name,jobTitle);
        this.language = language;
        abstractDeveloperFactory = new AbstractDeveloperFactory(types,levels);
        setSalary(SalaryStrategy.getSalary(types,levels));
        this.types = types;
        this.levels = levels;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Types getTypes() {
        return types;
    }

    public void setTypes(Types types) {
        this.types = types;
    }

    public Levels getLevels() {
        return levels;
    }

    public void setLevels(Levels levels) {
        this.levels = levels;
    }

    @Override
    public void work() {
        System.out.println("I am working using "+language+" programming language");
    }
}
