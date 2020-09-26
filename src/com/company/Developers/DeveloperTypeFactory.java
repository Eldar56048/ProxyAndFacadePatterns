package com.company.Developers;

import com.company.enums.Types;
import com.company.interfaces.DeveloperType;

public class DeveloperTypeFactory {
    public static DeveloperType createDeveloperType(Types type){
        DeveloperType developerType = null;
        switch (type){
            case BACKEND:
                developerType = new BackendDeveloper();
                break;
            case FRONTEND:
                developerType = new FrontendDeveloper();
                break;
            case MOBILE_DEV:
                developerType = new MobileDeveloper();
                break;
        }
        return developerType;
    }
}
