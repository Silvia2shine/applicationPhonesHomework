package org.example;

import java.util.List;

public interface PhoneInterface {
    void addContact(String name, String phoneNumber);
    Contact getContact(int index);
    void sendMessage(String phoneNumber, String message);
    public void getMessage(String phoneNumber);
//
    public void call(String phoneNumber);
   public void viewHistory();



}
