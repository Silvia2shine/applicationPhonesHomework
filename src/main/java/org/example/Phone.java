package org.example;

import java.util.*;
import java.util.Iterator;

abstract class Phone implements PhoneInterface {
    protected final Integer batteryLife;
    List<Contact> contact = new ArrayList<>();
    Map<String, List<String>> messages = new HashMap<>();
    List<String> calls =new ArrayList<>();

    String phoneNumber;
   Integer battery ;


    Phone(Integer batteryLife) {

        this.batteryLife = batteryLife;
        battery = batteryLife;

    }

    @Override
    public void addContact(String name, String phoneNumber) {
        Contact personFromList = new Contact(name, phoneNumber);
        contact.add(personFromList);
        System.out.println(personFromList);

    }

    public Contact getContact(int index) {
        if (index >= 0 && index < contact.size()) {
            contact.get(index);
        } else {
            System.out.println("Index out of range ");
        }
        return contact.get(index);
    }

    public String getNumber(int i) {
        ;
        return contact.get(i).phoneNumber;
    }

    public void sendMessage(String phoneNumber, String message) {
        if( message.length()<=500) {
            for (int i = 0; i < contact.size(); i++) {
                if (getNumber(i) == phoneNumber) {
                    if (!messages.containsKey(phoneNumber)) {
                        messages.put(phoneNumber, new ArrayList<>());
                    }
                    messages.get(phoneNumber).add(message);
                    System.out.println("Message " + "'" + message + "'"
                            + " is sent to phone number " + phoneNumber);

                    battery -=  1;
                }
            }
        }
        else {
                System.out.println("The message is to long, it can't be sent");
            }
    }

    public void getMessage(String phoneNumber) {

        if (messages.containsKey(phoneNumber)) {
            System.out.println("Messages for " + phoneNumber + ":");
            for (String message1 : messages.get(phoneNumber)) {
                System.out.println(message1);
            }
        } else {
            System.out.println("No messages found for " + phoneNumber + ".");
        }
    }

    public void call(String phoneNumber){
        calls.add(phoneNumber);
        System.out.println("The phone has made a call to phone number " + phoneNumber);
        battery-= 2;
    }
    public void viewHistory(){
        System.out.println("The history of calls is: " + calls);
    }
}













