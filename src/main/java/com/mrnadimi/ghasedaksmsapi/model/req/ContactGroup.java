package com.mrnadimi.ghasedaksmsapi.model.req;

import lombok.NonNull;

/**
 * Developer: Mohamad Nadimi
 * Company: Saghe
 * Website: https://www.mrnadimi.com
 * Created on 12 August 2021
 * <p>
 * Description: ...
 */
public class ContactGroup {

    private String name;
    private Integer parentGroupId;

    public ContactGroup(@NonNull  String name) {
        this.name = name;
    }

    public ContactGroup(@NonNull String name, Integer parentGroupId) {
        this.name = name;
        this.parentGroupId = parentGroupId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getParentGroupId() {
        return parentGroupId;
    }

    public void setParentGroupId(Integer parentGroupId) {
        this.parentGroupId = parentGroupId;
    }
}
