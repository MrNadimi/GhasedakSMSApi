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
public class MessageStatus {

    private List<String> ids;
    private Type type;

    public MessageStatus(@NonNull String id ,@NonNull Type type) {
        this.type = type;
        this.ids = new ArrayList<>();
        this.ids.add(id);
    }

    public String getIds() {
        return String.join( "," , ids);
    }
    public void addId(String id){
        this.ids.add(id);
    }

    public Type getType() {
        return type;
    }

    public enum Type {
        MESSAGE_ID(1),
        CHECKID(2);

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
