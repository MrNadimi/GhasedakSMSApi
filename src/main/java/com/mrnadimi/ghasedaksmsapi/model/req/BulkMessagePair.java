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
public class BulkMessagePair {

    private final String message;
    private final List<String> receptors;
    private final String lineNumber;
    private final String sendDate;
    private final List<String> checkIds;


    public BulkMessagePair(String message) {
        this.message = message;
        this.lineNumber = "";
        this.sendDate = "";
        this.receptors = new ArrayList<>();
        this.checkIds = new ArrayList<>();
    }

    public BulkMessagePair(String message, String lineNumber) {
        this.message = message;
        this.lineNumber = lineNumber;
        this.sendDate = "";
        this.receptors = new ArrayList<>();
        this.checkIds = new ArrayList<>();
    }

    public BulkMessagePair(String messages, String lineNumber , String sendDate) {
        this.message = messages;
        this.lineNumber = lineNumber;
        this.sendDate = sendDate;
        this.receptors = new ArrayList<>();
        this.checkIds = new ArrayList<>();
    }

    public void addPhone(@NonNull String phone){
        this.receptors.add(phone);
    }

    public void addPhone(@NonNull String phone ,@NonNull String checkId){
        this.receptors.add(phone);
        this.checkIds.add(checkId);
    }


    public String getReceptors() {
        return String.join( "," , receptors);
    }


    public String getCheckIds() {
        return String.join( "," , checkIds);
    }

    public String getMessage() {
        return message;
    }

    public String getLineNumber() {
        return lineNumber;
    }

    public String getSendDate() {
        return sendDate;
    }
}
