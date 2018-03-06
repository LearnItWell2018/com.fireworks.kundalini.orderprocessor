
package com.fireworks.kundalini.orderprocessor.pojo.items;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "itemName",
    "itemTypeList"
})
public class Item {

    @JsonProperty("itemName")
    private String itemName;
    @JsonProperty("itemTypeList")
    private List<ItemTypeList> itemTypeList = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("itemName")
    public String getItemName() {
        return itemName;
    }

    @JsonProperty("itemName")
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    @JsonProperty("itemTypeList")
    public List<ItemTypeList> getItemTypeList() {
        return itemTypeList;
    }

    @JsonProperty("itemTypeList")
    public void setItemTypeList(List<ItemTypeList> itemTypeList) {
        this.itemTypeList = itemTypeList;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("itemName", itemName).append("itemTypeList", itemTypeList).append("additionalProperties", additionalProperties).toString();
    }

}
