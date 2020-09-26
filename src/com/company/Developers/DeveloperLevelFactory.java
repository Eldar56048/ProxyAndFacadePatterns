package com.company.Developers;

import com.company.enums.Levels;
import com.company.interfaces.DeveloperLevel;

public class DeveloperLevelFactory {
    public static DeveloperLevel createDeveloperLevel(Levels level){
        DeveloperLevel developerLevel = null;
        switch (level){
            case Junior:
                developerLevel = new JuniorDeveloper();
                break;
            case Middle:
                developerLevel = new MiddleDeveloper();
                break;
            case Senior:
                developerLevel = new SeniorDeveloper();
                break;
        }
        return developerLevel;
    }
}
