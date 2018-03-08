
package com.fireworks.kundalini.orderprocessor.pojo.customer;

import java.util.List;

import org.apache.commons.lang.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "customerDOB",
    "customerAddress"
})
public class CustomerDetails {

    @JsonProperty("customerDOB")
    private String customerDOB;
    @JsonProperty("customerAddress")
    private List<CustomerAddress> customerAddress = null;

    @JsonProperty("customerDOB")
    public String getCustomerDOB() {
        return customerDOB;
    }

    @JsonProperty("customerDOB")
    public void setCustomerDOB(String customerDOB) {
        this.customerDOB = customerDOB;
    }

    @JsonProperty("customerAddress")
    public List<CustomerAddress> getCustomerAddress() {
        return customerAddress;
    }

    @JsonProperty("customerAddress")
    public void setCustomerAddress(List<CustomerAddress> customerAddress) {
        this.customerAddress = customerAddress;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("customerDOB", customerDOB).append("customerAddress", customerAddress).toString();
    }

}
