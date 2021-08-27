package com.mrnadimi.ghasedaksmsapi.model;


import java.util.List;

/**
 * Developer: Mohamad Nadimi
 * Company: Saghe
 * Website: https://www.mrnadimi.com
 * Created on 07 August 2021
 * <p>
 * Description: ...
 */
public class BaseResult extends ResponseFather {

    private String items;


    public String getItems() {
        return items;
    }

    public void setItems(String items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "SentSMSResult{" +
                "items=" + items +
                "} " + super.toString();
    }
}
