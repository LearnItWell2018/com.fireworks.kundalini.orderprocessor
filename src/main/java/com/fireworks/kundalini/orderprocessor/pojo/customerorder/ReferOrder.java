package com.fireworks.kundalini.orderprocessor.pojo.customerorder;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonInclude;

@Document(collection = "refer")
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "customerMail",
    "customerMobile",
    "customerReferMail",
    "customerReferMobile",
    "orderID",
    "orderStatus"
})
public class ReferOrder {

    @Id
    @JsonProperty
    private String id;
    
	@JsonProperty("customerMail")
    private String customerMail;
	
    @JsonProperty("customerMobile")
    private String customerMobile;
    
    @JsonProperty("orderStatus")
    private String orderStatus;
    
	@JsonProperty("customerReferMail")
    private String customerReferMail;
	
    @JsonProperty("customerReferMobile")
    private String customerReferMobile;
    
    @JsonProperty("orderID")
    private String orderID;
    
    @JsonProperty
    public String getId() {
		return id;
	}

    @JsonProperty
	public void setId(String id) {
		this.id = id;
	}

    @JsonProperty("customerMail")
	public String getCustomerMail() {
		return customerMail;
	}

    @JsonProperty("customerMail")
	public void setCustomerMail(String customerMail) {
		this.customerMail = customerMail;
	}

    @JsonProperty("customerMobile")
	public String getCustomerMobile() {
		return customerMobile;
	}

    @JsonProperty("customerMobile")
	public void setCustomerMobile(String customerMobile) {
		this.customerMobile = customerMobile;
	}

    @JsonProperty("orderStatus")
	public String getOrderStatus() {
		return orderStatus;
	}

    @JsonProperty("orderStatus")
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

    @JsonProperty("customerReferMail")
	public String getCustomerReferMail() {
		return customerReferMail;
	}

    @JsonProperty("customerReferMail")
	public void setCustomerReferMail(String customerReferMail) {
		this.customerReferMail = customerReferMail;
	}

    @JsonProperty("customerReferMobile")
	public String getCustomerReferMobile() {
		return customerReferMobile;
	}

    @JsonProperty("customerReferMobile")
	public void setCustomerReferMobile(String customerReferMobile) {
		this.customerReferMobile = customerReferMobile;
	}

    @JsonProperty("orderID")
	public String getOrderID() {
		return orderID;
	}

    @JsonProperty("orderID")
	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}
    
    
}
