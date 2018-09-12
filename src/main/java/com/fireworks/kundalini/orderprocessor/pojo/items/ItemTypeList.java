
package com.fireworks.kundalini.orderprocessor.pojo.items;

import java.util.List;

import org.apache.commons.lang.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "productId",
    "productImgPath",
    "brand",
    "itemName",
    "itemDesc",
    "itemPrice",
    "itemStock",
    "itemActive",
    "offer",
    "similarProduct"
})
public class ItemTypeList {

    @JsonProperty("productId")
    private String productId;
    @JsonProperty("productImgPath")
    private String productImgPath;
    @JsonProperty("brand")
    private String brand;
    @JsonProperty("itemName")
    private String itemName;
    @JsonProperty("itemDesc")
    private String itemDesc;
	@JsonProperty("itemPrice")
    private String itemPrice;
    @JsonProperty("itemStock")
    private String itemStock;
    @JsonProperty("itemActive")
    private String itemActive;
    @JsonProperty("offer")
    private String offer;
    @JsonProperty("similarProduct")
    private List<String> similarProduct = null;
    
    @JsonProperty("similarProduct")
    public List<String> getSimilarProduct() {
		return similarProduct;
	}

    @JsonProperty("similarProduct")
	public void setSimilarProduct(List<String> similarProduct) {
		this.similarProduct = similarProduct;
	}

	@JsonProperty("offer")
    public String getOffer() {
		return offer;
	}

    @JsonProperty("offer")
	public void setOffer(String offer) {
		this.offer = offer;
	}

	@JsonProperty("itemDesc")
    public String getItemDesc() {
		return itemDesc;
	}

    @JsonProperty("itemDesc")
	public void setItemDesc(String itemDesc) {
		this.itemDesc = itemDesc;
	}
    
    @JsonProperty("productId")
    public String getProductId() {
        return productId;
    }

    @JsonProperty("productId")
    public void setProductId(String productId) {
        this.productId = productId;
    }

    @JsonProperty("productImgPath")
    public String getProductImgPath() {
        return productImgPath;
    }

    @JsonProperty("productImgPath")
    public void setProductImgPath(String productImgPath) {
        this.productImgPath = productImgPath;
    }

    @JsonProperty("brand")
    public String getBrand() {
        return brand;
    }

    @JsonProperty("brand")
    public void setBrand(String brand) {
        this.brand = brand;
    }

    @JsonProperty("itemName")
    public String getItemName() {
        return itemName;
    }

    @JsonProperty("itemName")
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    @JsonProperty("itemPrice")
    public String getItemPrice() {
        return itemPrice;
    }

    @JsonProperty("itemPrice")
    public void setItemPrice(String itemPrice) {
        this.itemPrice = itemPrice;
    }

    @JsonProperty("itemStock")
    public String getItemStock() {
        return itemStock;
    }

    @JsonProperty("itemStock")
    public void setItemStock(String itemStock) {
        this.itemStock = itemStock;
    }

    @JsonProperty("itemActive")
    public String getItemActive() {
        return itemActive;
    }

    @JsonProperty("itemActive")
    public void setItemActive(String itemActive) {
        this.itemActive = itemActive;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("productId", productId).append("productImgPath", productImgPath).append("brand", brand).append("itemName", itemName).append("itemPrice", itemPrice).append("itemStock", itemStock).append("itemActive", itemActive).toString();
    }

}
