
package com.fireworks.kundalini.orderprocessor.pojo.offer;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "offer")
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "offerID",
    "offerCreator",
    "offerStartTime",
    "offerEndTime",
    "offerDetails"
})
public class Offers {

    @JsonProperty("offerID")
    private String offerID;
    @JsonProperty("offerCreator")
    private String offerCreator;
    @JsonProperty("offerStartTime")
    private String offerStartTime;
    @JsonProperty("offerEndTime")
    private String offerEndTime;
    @JsonProperty("offerDetails")
    private OfferDetails offerDetails;

    @JsonProperty("offerID")
    public String getOfferID() {
        return offerID;
    }

    @JsonProperty("offerID")
    public void setOfferID(String offerID) {
        this.offerID = offerID;
    }

    @JsonProperty("offerCreator")
    public String getOfferCreator() {
        return offerCreator;
    }

    @JsonProperty("offerCreator")
    public void setOfferCreator(String offerCreator) {
        this.offerCreator = offerCreator;
    }

    @JsonProperty("offerStartTime")
    public String getOfferStartTime() {
        return offerStartTime;
    }

    @JsonProperty("offerStartTime")
    public void setOfferStartTime(String offerStartTime) {
        this.offerStartTime = offerStartTime;
    }

    @JsonProperty("offerEndTime")
    public String getOfferEndTime() {
        return offerEndTime;
    }

    @JsonProperty("offerEndTime")
    public void setOfferEndTime(String offerEndTime) {
        this.offerEndTime = offerEndTime;
    }

    @JsonProperty("offerDetails")
    public OfferDetails getOfferDetails() {
        return offerDetails;
    }

    @JsonProperty("offerDetails")
    public void setOfferDetails(OfferDetails offerDetails) {
        this.offerDetails = offerDetails;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("offerID", offerID).append("offerCreator", offerCreator).append("offerStartTime", offerStartTime).append("offerEndTime", offerEndTime).append("offerDetails", offerDetails).toString();
    }

}
