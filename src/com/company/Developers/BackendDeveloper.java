package com.company.Developers;

import com.company.interfaces.DeveloperType;

public class BackendDeveloper implements DeveloperType {

    @Override
    public String developerType() {
        return "I am creating the server side of web application";
    }
}
