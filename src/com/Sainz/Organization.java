package com.Sainz;

public class Organization {
    private String organizationName;

    public Organization(String organizationName) {
        this.organizationName = organizationName;
    }

    public Organization(){
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }
}
