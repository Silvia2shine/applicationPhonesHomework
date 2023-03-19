package org.example;

import java.util.*;
import java.util.Iterator;

abstract class Phone implements PhoneInterface {
    protected final Integer batteryLife;
    List<Contact> contact = new ArrayList<>();
    List<Message> messages = new ArrayList<>();
    List<PhoneNumber> listOfPhoneNumber = new ArrayList<>();
    String phoneNumber;
    List<Message> messagesFromAPhoneNumber = new ArrayList<>();


    Phone(Integer batteryLife) {

        this.batteryLife = batteryLife;

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
        Map<PhoneNumber, List<String>> mapForMessages = new HashMap<>();
//
//        Message messagesOfNumber = new Message(message);

        PhoneNumber theNumber = new PhoneNumber(phoneNumber);

        theNumber.addNumber(phoneNumber);
        theNumber.addMessages(message);

        mapForMessages.put(theNumber, theNumber.getMessages());
        System.out.println("The message is send " + mapForMessages);

    }
     public  seeMessagesOfANumber(PhoneNumber number){

         Map<PhoneNumber, List<String>> mapForMessages = new HashMap<>();

         if (mapForMessages.keySet()== number)
             System.out.println();
    return
     }


//    public void sendMessage(String phoneNumber, String message) {
//        Message messagesOfNumber = new Message(message);
//        PhoneNumber theNumber = new PhoneNumber(phoneNumber);
//
//        listOfPhoneNumber.add(theNumber);
//        for (int i=0 ; i< listOfPhoneNumber.size(); i++){
//            if (listOfPhoneNumber.get(i).equals(phoneNumber)){
//
//
//            }
//
//        }
//
//        messages.add(messagesOfNumber);
//        System.out.println("Pt nrde telefon  " + phoneNumber + " mesajul este " + messages);
//
//    }


//    public List<Message> getMessage(String phoneNumber) {
//
//
//        Iterator<Message> it = messages.iterator();
//        while (it.hasNext()) {
//
//            messagesFromAPhoneNumber.add(it.next());
//        }
//
//        System.out.println("Mesajele sunt" + messagesFromAPhoneNumber);
//
//
//        return messagesFromAPhoneNumber;
//    }
}


//        System.out.println("The messages send at the number: "
//                + phoneNumber + " are: " + messages);


//
//    @Override
//    public void call() {
//
//    }
//
//    @Override
//    public void viewHistory() {
//
//
//    }
//











