package com.fireworks.kundalini.orderprocessor.pojo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "productId",
    "itemCount"
})
public class OrderList {

    @JsonProperty("productId")
    private String productId;
    @JsonProperty("itemCount")
    private String itemCount;

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


    @Override
    public String toString() {
        return new ToStringBuilder(this).append("productId", productId).append("itemCount", itemCount).toString();
    }

}
