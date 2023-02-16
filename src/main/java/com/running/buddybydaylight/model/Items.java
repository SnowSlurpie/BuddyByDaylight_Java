package com.running.buddybydaylight.model;

import jakarta.persistence.*;

@Entity
@Table
public class Items {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer itemId;
    private String itemName;
    private String itemDesc;

    public Items(Integer itemId, String itemName, String itemDesc) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.itemDesc = itemDesc;
    }

    public Items() {
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemDesc() {
        return itemDesc;
    }

    public void setItemDesc(String itemDesc) {
        this.itemDesc = itemDesc;
    }

    @Override
    public String toString() {
        return "Items{" +
                "itemId=" + itemId +
                ", itemName='" + itemName + '\'' +
                ", itemDesc='" + itemDesc + '\'' +
                '}';
    }
}
