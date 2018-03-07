
package com.fireworks.kundalini.orderprocessor.pojo.customerorder;

import java.util.HashMap;
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
    "productId",
    "itemCount",
    "itemPrice"
})
public class OrderList {

    @JsonProperty("productId")
    private String productId;
    @JsonProperty("itemCount")
    private String itemCount;
    @JsonProperty("itemPrice")
    private String itemPrice;

    @JsonProperty("productId")
    public String getProductId() {
        return productId;
    }

    @JsonProperty("productId")
    public void setProductId(String productId) {
        this.productId = productId;
    }

    @JsonProperty("itemCount")
    public String getItemCount() {
        return itemCount;
    }

    @JsonProperty("itemCount")
    public void setItemCount(String itemCount) {
        this.itemCount = itemCount;
    }

    @JsonProperty("itemPrice")
    public String getItemPrice() {
        return itemPrice;
    }

    @JsonProperty("itemPrice")
    public void setItemPrice(String itemPrice) {
        this.itemPrice = itemPrice;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("productId", productId).append("itemCount", itemCount).append("itemPrice", itemPrice).toString();
    }

}
