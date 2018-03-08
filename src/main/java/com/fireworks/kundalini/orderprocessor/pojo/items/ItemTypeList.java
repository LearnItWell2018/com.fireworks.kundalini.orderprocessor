
package com.fireworks.kundalini.orderprocessor.pojo.items;

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
    "product_id",
    "brand",
    "item_name",
    "item_price",
    "item_stock"
})
public class ItemTypeList {

    @JsonProperty("product_id")
    private String productId;
    @JsonProperty("brand")
    private String brand;
    @JsonProperty("item_name")
    private String itemName;
    @JsonProperty("item_price")
    private String itemPrice;
    @JsonProperty("item_stock")
    private String itemStock;

    @JsonProperty("product_id")
    public String getProductId() {
        return productId;
    }

    @JsonProperty("product_id")
    public void setProductId(String productId) {
        this.productId = productId;
    }

    @JsonProperty("brand")
    public String getBrand() {
        return brand;
    }

    @JsonProperty("brand")
    public void setBrand(String brand) {
        this.brand = brand;
    }

    @JsonProperty("item_name")
    public String getItemName() {
        return itemName;
    }

    @JsonProperty("item_name")
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    @JsonProperty("item_price")
    public String getItemPrice() {
        return itemPrice;
    }

    @JsonProperty("item_price")
    public void setItemPrice(String itemPrice) {
        this.itemPrice = itemPrice;
    }

    @JsonProperty("item_stock")
    public String getItemStock() {
        return itemStock;
    }

    @JsonProperty("item_stock")
    public void setItemStock(String itemStock) {
        this.itemStock = itemStock;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("productId", productId).append("brand", brand).append("itemName", itemName).append("itemPrice", itemPrice).append("itemStock", itemStock).toString();
    }

}
