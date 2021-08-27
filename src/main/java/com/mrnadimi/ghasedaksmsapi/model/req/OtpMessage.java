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
public class OtpMessage {

    private List<String> receptors;
    private Type type;
    private String template;
    private String checkId;
    private List<String> params;

    public OtpMessage( String phone , String param  , Type type, String template) {
        this(phone , param , type , template , null);
    }

    public OtpMessage(@NonNull String phone , @NonNull String param , @NonNull Type type, @NonNull String template, String checkId) {
        this.type = type;
        this.template = template;
        this.checkId = checkId;
        this.receptors = new ArrayList<>();
        this.receptors.add(phone);
        this.params = new ArrayList<>(10);
        this.params.add(param);
    }



    public void addPhone(String phone){
        this.receptors.add(phone);
    }

    public void addParam(String param){
        this.params.add(param);
    }

    public String getReceptors() {
        return String.join( "," , receptors);
    }

    public Type getType() {
        return type;
    }

    public String getTemplate() {
        return template;
    }

    public String getCheckId() {
        return checkId;
    }

    public List<String> getParams() {
        return params;
    }

    public enum Type {
        TEXT(1),
        VOICE(2);

        private final int type;

        Type(int type) {
            this.type = type;
        }


        public int getType() {
            return type;
        }

        @Override
        public String toString() {
            return type+"";
        }
    }

}
