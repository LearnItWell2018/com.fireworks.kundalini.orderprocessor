
package com.fireworks.kundalini.orderprocessor.pojo.items;

import java.util.List;

import org.apache.commons.lang.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "itemCreator",
    "itemList"
})
public class Items {

    @JsonProperty("itemCreator")
    private String itemCreator;
    @JsonProperty("itemList")
    private List<ItemList> itemList = null;

    @JsonProperty("itemCreator")
    public String getItemCreator() {
        return itemCreator;
    }

    @JsonProperty("itemCreator")
    public void setItemCreator(String itemCreator) {
        this.itemCreator = itemCreator;
    }

    @JsonProperty("itemList")
    public List<ItemList> getItemList() {
        return itemList;
    }

    @JsonProperty("itemList")
    public void setItemList(List<ItemList> itemList) {
        this.itemList = itemList;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("itemCreator", itemCreator).append("itemList", itemList).toString();
    }

}
