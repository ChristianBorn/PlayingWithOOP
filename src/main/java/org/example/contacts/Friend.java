package org.example.contacts;

public class Friend extends Contact{
    private String telephone;

    public Friend(){}

    public Friend(String name, String telephone){
        super.setName(name);
        this.telephone = telephone;
    }

    @Override
    public String toString() {
        return "Name of contact: " + super.getName() + "\nTelephone number of contact: " + this.telephone;
    }
}
