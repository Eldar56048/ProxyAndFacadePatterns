package com.company.Developers;

import com.company.interfaces.DeveloperType;

public class MobileDeveloper implements DeveloperType {
    @Override
    public String developerType() {
        return "I am creating  mobile application";
    }
}
