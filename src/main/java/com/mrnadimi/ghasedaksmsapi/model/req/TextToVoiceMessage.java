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
public class TextToVoiceMessage {

    private String message;
    private String sendDate;
    private List<String> receptors;

    public TextToVoiceMessage(@NonNull String phone ,@NonNull String message) {
        this(phone , message , null);
    }

    public TextToVoiceMessage(@NonNull String phone ,@NonNull String message, String sendDate) {
        this.message = message;
        this.sendDate = sendDate;
        this.receptors = new ArrayList<>();
        this.receptors.add(phone);
    }

    public void addPhone(String phone){
        this.receptors.add(phone);
    }

    public String getReceptors() {
        return String.join( "," , receptors);
    }

    public String getMessage() {
        return message;
    }

    public String getSendDate() {
        return sendDate;
    }
}
