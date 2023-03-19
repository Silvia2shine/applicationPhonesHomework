package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Message {
    List<String> messages = new ArrayList<>();

    String message;
    public Message( String message) {

        this.message = message;
        messages.add(message);
    }

//        for (var i = 0; i < messages.size(); i++) {
//            messages.add(message);
//
//            HashMap<String, List<String>> messageMap = new HashMap<>();
//            messageMap.put(phoneNumber, messages);
//            System.out.println("The messages send at the number " + phoneNumber
//                    + " are " + messageMap.get(phoneNumber));
//        }

//    @Override
//    public String toString() {
//
//        return  " messages " + messages;
//    }

        @Override
        public String toString () {
            return
                     "message " + message;
        }
    }

