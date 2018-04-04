package com.fireworks.kundalini.orderprocessor.pojo.customerorder;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fireworks.kundalini.orderprocessor.pojo.customer.CustomerAddress;
import com.fireworks.kundalini.orderprocessor.pojo.customerorder.OrderDetails;

import java.util.List;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "orders")
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "customerMail",
    "customerMobile",
    "orderDetails",
    "customerAddress"
})
public class CustomerOrder {

    @JsonProperty("customerMail")
    private String customerMail;
    @JsonProperty("customerMobile")
    private String customerMobile;
    @JsonProperty("orderDetails")
    private OrderDetails orderDetails;
    @JsonProperty("customerAddress")
    private List<CustomerAddress> customerAddress = null;

    @JsonProperty("customerAddress")
    public List<CustomerAddress> getCustomerAddress() {
        return customerAddress;
    }

    @JsonProperty("customerAddress")
    public void setCustomerAddress(List<CustomerAddress> customerAddress) {
        this.customerAddress = customerAddress;
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

    @JsonProperty("orderDetails")
    public OrderDetails getOrderDetails() {
        return orderDetails;
    }

    @JsonProperty("orderDetails")
    public void setOrderDetails(OrderDetails orderDetails) {
        this.orderDetails = orderDetails;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("customerMail", customerMail).append("customerMobile", customerMobile).append("orderDetails", orderDetails).toString();
    }

}
