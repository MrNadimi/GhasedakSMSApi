package com.mrnadimi.ghasedaksmsapi.model.req;

import lombok.NonNull;

/**
 * Developer: Mohamad Nadimi
 * Company: Saghe
 * Website: https://www.mrnadimi.com
 * Created on 08 August 2021
 * <p>
 * Description: ...
 */
public class Message {

    String phone ;
    String message ;
    String lineNumber;
    String sendDate ;
    String checkId;

    public Message(String phone, String message) {
        this(phone , message , "" , null , null);
    }

    public Message(String phone, String message, String lineNumber) {
        this(phone , message , lineNumber , null , null);
    }

    public Message(String phone, String message, String lineNumber, String sendDate) {
        this(phone , message , lineNumber , sendDate , null);
    }

    public Message(@NonNull String phone,@NonNull String message,@NonNull String lineNumber, String sendDate, String checkId) {
        this.phone = phone;
        this.message = message;
        this.lineNumber = lineNumber;
        this.sendDate = sendDate;
        this.checkId = checkId;
    }

    public void setLineNumber(@NonNull String lineNumber) {
        this.lineNumber = lineNumber;
    }

    public void setSendDate(String sendDate) {
        this.sendDate = sendDate;
    }

    public void setCheckId(String checkId) {
        this.checkId = checkId;
    }

    public String getPhone() {
        return phone;
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

    public String getCheckId() {
        return checkId;
    }
}
