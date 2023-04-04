package org.example;

import org.example.contacts.BusinessContact;
import org.example.contacts.Friend;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        BusinessContact businessContact = new BusinessContact("BWM", "Peter Meier");
        Friend friend = new Friend("Arian", "23453462");
        System.out.println(businessContact);
        Smartphone myPhone = new Smartphone("Pixel 3", "Google", new ArrayList<>());
        System.out.println(myPhone);
        myPhone.addContact(businessContact);
        myPhone.addContact(friend);
        System.out.println(myPhone);
        System.out.println(myPhone.getContact(1));
        System.out.println(myPhone.getContactByName("a"));

    }
}