package com.mrnadimi.ghasedaksmsapi.model.req;

import lombok.NonNull;

import java.util.ArrayList;
import java.util.List;

/**
 * Developer: Mohamad Nadimi
 * Company: Saghe
 * Website: https://www.mrnadimi.com
 * Created on 12 August 2021
 * <p>
 * Description: ...
 */
public class AddContact {

    private String groupId;
    private List<String> numbers;
    private List<String> firstNames;
    private List<String> lastNames;
    private List<String> emails;


    public AddContact(String groupId , String phone) {
        this(groupId , phone , null , null , null);
    }

    public AddContact(String groupId , String phone , String firstName) {
        this(groupId , phone , firstName , null , null);
    }

    public AddContact(String groupId , String phone , String firstName , String lastName) {
        this(groupId , phone , firstName , lastName , null);
    }

    public AddContact(@NonNull  String groupId ,@NonNull String phone , String firstName , String lastName , String email) {
        this.groupId = groupId;
        this.numbers = new ArrayList<>();
        this.firstNames = new ArrayList<>();
        this.lastNames = new ArrayList<>();
        this.emails = new ArrayList<>();
        addContact(phone , firstName , lastName , email);

    }

    public void addContact(@NonNull String phone , String firstName , String lastName , String email){
        this.numbers.add(phone);
        this.firstNames.add(firstName == null ? "" : firstName);
        this.lastNames.add(lastName == null ? "" : lastName);
        this.emails.add(email == null ? "" : email);
    }

    public String getNumbers() {
        return String.join( "," , numbers);
    }


    public String getFirstNames() {
        return String.join( "," , firstNames);
    }

    public String getLastNames() {
        return String.join( "," , lastNames);
    }

    public String getEmails() {
        return String.join( "," , emails);
    }

    public String getGroupId() {
        return groupId;
    }
}
