package org.example;

public class Contact {
    String name;
    String phoneNumber;
    public Contact(String name, String phoneNumber){
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Nume " + name + " "
                + "phone number " + phoneNumber;
    }
}
