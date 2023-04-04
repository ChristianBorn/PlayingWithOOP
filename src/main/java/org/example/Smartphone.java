package org.example;

import org.example.contacts.Contact;
import org.example.interfaces.GPS;
import org.example.interfaces.Radio;

import java.util.List;

public class Smartphone implements Radio, GPS {
    String model;
    String manufacturer;
    List<Contact> contacts;

    public Smartphone() {}

    public Smartphone(String model, String manufacturer, List<Contact> contacts) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.contacts = contacts;
    }

    public void addContact(Contact contact) {
        this.contacts.add(contact);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public Contact getContact(int index) {
        return this.contacts.get(index);
    }

    public Contact getContactByName(String name) {
            Contact foundContact = this.contacts.stream()
                    .filter(contact -> contact.getName().equals(name))
                    .findFirst()
                    .orElse(null);
            if (foundContact == null) {
                System.out.println("Contact not found");
                return null;
            }
            else {
                return foundContact;
            }
        }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    @Override
    public String getPosition() {
        return "Köln";
    }

    @Override
    public boolean startRadio() {
        System.out.println("Radio started");
        return true;
    }

    @Override
    public boolean stopRadio() {
        System.out.println("Radio stopped");
        return false;
    }

    @Override
    public String toString() {
        return "Model: " + this.model + "\nManufacturer: " + this.manufacturer + "\nContacs: " + this.contacts;
    }
}
