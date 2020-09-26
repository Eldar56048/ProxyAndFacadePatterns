package com.company.Developers;

import com.company.interfaces.DeveloperLevel;

public class SeniorDeveloper implements DeveloperLevel {
    @Override
    public String developInLevel() {
        return "Implementing senior Developer code";
    }
}
