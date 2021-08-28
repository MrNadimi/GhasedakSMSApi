package com.mrnadimi.ghasedaksmsapi.model;

import java.util.List;

/**
 * Developer: Mohamad Nadimi
 * Company: Saghe
 * Website: https://www.mrnadimi.com
 * Created on 28 August 2021
 * <p>
 * Description: ...
 */
public class OtpResponse extends ResponseFather{

    private List<String> items;


    public List<String> getItems() {
        return items;
    }

    public void setItems(List<String> items) {
        this.items = items;
    }
}
