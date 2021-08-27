package com.mrnadimi.ghasedaksmsapi.model;

import com.google.gson.annotations.SerializedName;

/**
 * Developer: Mohamad Nadimi
 * Company: Saghe
 * Website: https://www.mrnadimi.com
 * Created on 12 August 2021
 * <p>
 * Description: ...
 */
public class CreateGroupResult extends ResponseFather{

    private Items items;

    public Items getItems() {
        return items;
    }

    public void setItems(Items items) {
        this.items = items;
    }

    public  static class Items{

        @SerializedName("groupid")
        private int groupId;

        public int getGroupId() {
            return groupId;
        }

        public void setGroupId(int groupId) {
            this.groupId = groupId;
        }
    }
}
