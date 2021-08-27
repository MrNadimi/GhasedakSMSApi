package com.mrnadimi.ghasedaksmsapi.model.req;


import lombok.NonNull;

import java.util.ArrayList;
import java.util.List;

/**
 * Developer: Mohamad Nadimi
 * Company: Saghe
 * Website: https://www.mrnadimi.com
 * Created on 08 August 2021
 * <p>
 * Description: ...
 */
public class BulkMessage {

    private final List<String> messages;
    private final List<String> receptors;
    private final List<String> lineNumbers;
    private final List<String> sendDates;
    private final List<String> checkIds;


    public BulkMessage() {
        this.messages = new ArrayList<>();
        this.receptors = new ArrayList<>();
        this.lineNumbers = new ArrayList<>();
        this.sendDates = new ArrayList<>();
        this.checkIds = new ArrayList<>();
    }


    public void addMessage(String message , String phone , String lineNumber){
        addMessage(message , phone , lineNumber , null , null);
    }

    public void addMessage(String message , String phone , String lineNumber , String sendDate){
        addMessage(message , phone , lineNumber , sendDate , null);
    }

    public void addMessage(@NonNull String message , @NonNull String phone , @NonNull String lineNumber , String sendDate , String checkId){
        this.messages.add(message);
        this.receptors.add(phone);
        this.lineNumbers.add(lineNumber);
        if (sendDate != null) this.sendDates.add(sendDate);
        if (checkId != null)  this.checkIds.add(checkId);
    }


    public String getMessages() {
        return String.join( "," , messages);
    }

    public String getReceptors() {
        return String.join( "," , receptors);
    }

    public String getLineNumbers() {
        return String.join( "," , lineNumbers);
    }

    public String getSendDates() {
        return String.join( "," , sendDates);
    }

    public String getCheckIds() {
        return String.join( "," , checkIds);
    }

    public boolean hasBulkMessage(){
        return this.messages.size() != 0;
    }
}
