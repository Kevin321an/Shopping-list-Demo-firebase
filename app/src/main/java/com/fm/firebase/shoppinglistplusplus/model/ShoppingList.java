package com.fm.firebase.shoppinglistplusplus.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fm.firebase.shoppinglistplusplus.utils.Constants;

import java.util.HashMap;

/**
 * Created by FM on 5/29/2016.
 */
public class ShoppingList {

    String listName;
    String owner;
    private HashMap<String, Object> timestampLastChanged;

    public ShoppingList() {
    }

    /**
     * Use this constructor to create new ShoppingLists.
     * Takes shopping list listName and owner. Set's the last
     * changed time to what is stored in ServerValue.TIMESTAMP
     *
     * @param listName
     * @param owner
     */

    public ShoppingList(String listName, String owner) {
        this.listName = listName;
        this.owner = owner;
        HashMap<String, Object> timestampLastChangedObj = new HashMap<String, Object>();
        this.timestampLastChanged = timestampLastChangedObj;
    }

    public String getListName() {
        return listName;
    }

    public HashMap<String, Object> getTimestampLastChanged() {
        return timestampLastChanged;
    }

    @JsonIgnore
    public long getTimestampLastChangedLong() {
        return (long) timestampLastChanged.get(Constants.FIREBASE_PROPERTY_TIMESTAMP);
    }

    public String getOwner() {
        return owner;
    }
}
