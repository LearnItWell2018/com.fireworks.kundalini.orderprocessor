
package com.fireworks.kundalini.orderprocessor.pojo.itemcategories;

import org.apache.commons.lang.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "itemName",
    "itemIMGPath",
    "itemURL"
})
public class Item {

    @JsonProperty("itemName")
    private String itemName;
    
    @JsonProperty("itemIMGPath")
    private String itemIMGPath;
    
    @JsonProperty("itemURL")
    private String itemURL;
    
    @JsonProperty("itemURL")
    public String getItemURL() {
		return itemURL;
	}

    @JsonProperty("itemURL")
	public void setItemURL(String itemURL) {
		this.itemURL = itemURL;
	}

	@JsonProperty("itemIMGPath")
    public String getItemIMGPath() {
		return itemIMGPath;
	}
    
    @JsonProperty("itemIMGPath")
	public void setItemIMGPath(String itemIMGPath) {
		this.itemIMGPath = itemIMGPath;
	}
    
    @JsonProperty("itemName")
    public String getItemName() {
        return itemName;
    }

    @JsonProperty("itemName")
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("itemName", itemName).append("itemIMGPath", itemIMGPath).append("itemURL", itemURL).toString();
    }

}
