package org.example;

import java.util.ArrayList;
import java.util.List;

public class PhoneNumber {
    List<String> messagesOfList;
    String phoneNumber;

    public PhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        this.messagesOfList = new ArrayList<>();
    }

    public void addNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }


    public void addMessages(String message) {
        this.messagesOfList.add(message);

    }
    public List<String> getMessages() {

        return this.messagesOfList;
    }

    @Override
    public String toString() {
        return phoneNumber;
    }
}
