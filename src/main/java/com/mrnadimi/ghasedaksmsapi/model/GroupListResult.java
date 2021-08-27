package com.mrnadimi.ghasedaksmsapi.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Developer: Mohamad Nadimi
 * Company: Saghe
 * Website: https://www.mrnadimi.com
 * Created on 12 August 2021
 * <p>
 * Description: ...
 */
public class GroupListResult {

    @SerializedName("items")
    private List<Item> items;

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }


    @Override
    public String toString() {
        return "GroupListResult{" +
                "items=" + items +
                '}';
    }

    public static class Item{
        @SerializedName("id")
        private int id;
        @SerializedName("group")
        private String group;
        @SerializedName("parent")
        private Integer parent;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getGroup() {
            return group;
        }

        public void setGroup(String group) {
            this.group = group;
        }

        public Integer getParent() {
            return parent;
        }

        public void setParent(Integer parent) {
            this.parent = parent;
        }


        @Override
        public String toString() {
            return "Item{" +
                    "id=" + id +
                    ", group='" + group + '\'' +
                    ", parent=" + parent +
                    '}';
        }
    }
}
