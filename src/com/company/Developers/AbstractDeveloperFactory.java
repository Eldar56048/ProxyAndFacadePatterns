package com.company.Developers;

import com.company.enums.Levels;
import com.company.enums.Types;
import com.company.interfaces.DeveloperLevel;
import com.company.interfaces.DeveloperType;

public class AbstractDeveloperFactory {
    private DeveloperLevel levelFactory;
    private DeveloperType typeFactory;

    public AbstractDeveloperFactory(Types type, Levels level) {
        this.levelFactory = DeveloperLevelFactory.createDeveloperLevel(level);
        this.typeFactory = DeveloperTypeFactory.createDeveloperType(type);
    }

    public void work(){
        System.out.println(levelFactory.developInLevel()+" "+typeFactory.developerType());
    }
}
