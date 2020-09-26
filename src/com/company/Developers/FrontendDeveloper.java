package com.company.Developers;

import com.company.interfaces.DeveloperType;

public class FrontendDeveloper implements DeveloperType {

    @Override
    public String developerType() {
        return "I am creating the client side of web application";
    }
}
