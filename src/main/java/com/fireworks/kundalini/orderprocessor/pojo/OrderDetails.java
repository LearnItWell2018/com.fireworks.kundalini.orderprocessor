package com.fireworks.kundalini.orderprocessor.pojo;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "orderDate",
    "orderList"
})
public class OrderDetails {

    @JsonProperty("orderDate")
    private String orderDate;
    @JsonProperty("orderList")
    private List<OrderList> orderList = null;

    @JsonProperty("orderDate")
    public String getOrderDate() {
        return orderDate;
    }

    @JsonProperty("orderDate")
    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    @JsonProperty("orderList")
    public List<OrderList> getOrderList() {
        return orderList;
    }

    @JsonProperty("orderList")
    public void setOrderList(List<OrderList> orderList) {
        this.orderList = orderList;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("orderDate", orderDate).append("orderList", orderList).toString();
    }

}
