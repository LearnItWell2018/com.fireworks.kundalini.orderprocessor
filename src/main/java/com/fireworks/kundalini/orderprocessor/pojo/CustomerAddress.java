package com.fireworks.kundalini.orderprocessor.pojo;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "pincode",
    "street",
    "roomorflatno",
    "nearestLandMark"
})
public class CustomerAddress {

    @JsonProperty("pincode")
    private String pincode;
    @JsonProperty("street")
    private String street;
    @JsonProperty("roomorflatno")
    private String roomorflatno;
    @JsonProperty("nearestLandMark")
    private String nearestLandMark;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("pincode")
    public String getPincode() {
        return pincode;
    }

    @JsonProperty("pincode")
    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    @JsonProperty("street")
    public String getStreet() {
        return street;
    }

    @JsonProperty("street")
    public void setStreet(String street) {
        this.street = street;
    }

    @JsonProperty("roomorflatno")
    public String getRoomorflatno() {
        return roomorflatno;
    }

    @JsonProperty("roomorflatno")
    public void setRoomorflatno(String roomorflatno) {
        this.roomorflatno = roomorflatno;
    }

    @JsonProperty("nearestLandMark")
    public String getNearestLandMark() {
        return nearestLandMark;
    }

    @JsonProperty("nearestLandMark")
    public void setNearestLandMark(String nearestLandMark) {
        this.nearestLandMark = nearestLandMark;
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
        return new ToStringBuilder(this).append("pincode", pincode).append("street", street).append("roomorflatno", roomorflatno).append("nearestLandMark", nearestLandMark).append("additionalProperties", additionalProperties).toString();
    }

}
