package org.example;

import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {


        Phone phone = new SamsungGalaxy6(45, "red", "plastic", 5678d);


        phone.addContact("Silvia", "0745359497");
        phone.addContact("Bogdan", "0728291607");

        System.out.println(phone.getContact(0));
        System.out.println(phone.getContact(1));


        phone.sendMessage("0745359497", "Ana are mere");
        phone.sendMessage("0745359497", "Ana are pere");

        phone.sendMessage("0728291607", "Bogdi are mere");
        phone.sendMessage("0728291607", "Bogdi are pere");
//        phone.messageMap("0745359497");

        System.out.println("Spune ceva plz "+ phone.getNumber(0));


//        phone.messageMap("0745359497",phone.messages);
//        phone.messageMap("0728291607",phone.messages);
//
//        phone.getMessage("0745359497");
//        phone.getMessage("0728291607");




//
//// send a message to the first contact from the previously listed
//
//// max number of characters - 100
//
//        phone.sendMessage("phone number", "message content");
//
//        phone.getFirstMessage("phone number");
//
//        phone.getSecondMessage("phone number");
//
//// make a call to the second contact from the previously listed
//
//        phone.call("second phone number");
//
//        phone.viewHistory();
    }
}
