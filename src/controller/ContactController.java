package controller;

import model.Human;
import exceptions.WrongDataFormat;
import exceptions.WrongSizeOfInputData;
import view.ContactValidator;
import view.StringParser;
import view.ViewerContact;
import model.Contact;

public class ContactController {
    public void run(){
        Human contact = new Contact();
        ViewerContact viewerContact = new ViewerContact();
        boolean exit = false;
        while (!exit){
            try {
                contact = new ContactValidator().validate(new StringParser().getDataFromString(viewerContact.getContact()));
            } catch (WrongSizeOfInputData | WrongDataFormat e) {
                System.err.println(e.getMessage());
                System.out.println("Попробуйте позже еще раз...");
                exit = true;
            }
            if (!exit) {
                System.out.println(contact);
                System.out.printf("Записываю данные в файл %s.csv%n", contact.getLastname());
                new SaveToFile().saveToFile(contact.getLastname() + ".csv", contact);
            }
        }
        viewerContact.close();
    }
}