package com.company.Developers;

import com.company.interfaces.DeveloperLevel;

public class TeamLead extends SeniorDeveloper implements DeveloperLevel {
    @Override
    public String developInLevel() {
        return super.developInLevel()+" Im leading the Project Team";
    }
}
