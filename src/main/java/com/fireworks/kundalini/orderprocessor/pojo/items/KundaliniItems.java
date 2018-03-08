
package com.fireworks.kundalini.orderprocessor.pojo.items;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@Document(collection = "items")
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "itemVersion",
    "itemStatus",
    "items"
})
public class KundaliniItems {

    @JsonProperty("itemVersion")
    private String itemVersion;
    @JsonProperty("itemStatus")
    private String itemStatus;
    @JsonProperty("items")
    private Items items;

    @JsonProperty("itemVersion")
    public String getItemVersion() {
        return itemVersion;
    }

    @JsonProperty("itemVersion")
    public void setItemVersion(String itemVersion) {
        this.itemVersion = itemVersion;
    }

    @JsonProperty("itemStatus")
    public String getItemStatus() {
        return itemStatus;
    }

    @JsonProperty("itemStatus")
    public void setItemStatus(String itemStatus) {
        this.itemStatus = itemStatus;
    }

    @JsonProperty("items")
    public Items getItems() {
        return items;
    }

    @JsonProperty("items")
    public void setItems(Items items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("itemVersion", itemVersion).append("itemStatus", itemStatus).append("items", items).toString();
    }

}
