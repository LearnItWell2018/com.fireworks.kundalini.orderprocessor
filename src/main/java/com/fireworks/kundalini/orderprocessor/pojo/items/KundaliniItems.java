
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
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "items")
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Items"
})
public class KundaliniItems {

    @JsonProperty("Items")
    private List<Item> items = null;

    @JsonProperty("Items")
    public List<Item> getItems() {
        return items;
    }

    @JsonProperty("Items")
    public void setItems(List<Item> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("items", items).toString();
    }

}
