package org.example;

import java.util.List;

public interface PhoneInterface {
    void addContact(String name, String phoneNumber);
    Contact getContact(int index);
    void sendMessage(String phoneNumber, String message);
//     public List<Message> getMessage(String phoneNumber);
//
//    public void call();
//
//    public void viewHistory();



}
