package org.example.contacts;

public class BusinessContact extends Contact {
    private String companyName;

    public BusinessContact(String companyName, String name) {
        this.companyName = companyName;
        super.setName(name);
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return "Name of contact: " + super.getName() + "\nName of business: " + this.companyName;
    }
}
