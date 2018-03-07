
package com.fireworks.kundalini.orderprocessor.pojo.items;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Items"
})
public class Items {

    @JsonProperty("Items")
    private List<Item> item = null;

    @JsonProperty("Items")
    public List<Item> getItems() {
        return item;
    }

    @JsonProperty("Items")
    public void setItems(List<Item> items) {
        this.item = items;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("items", item).toString();
    }

}
