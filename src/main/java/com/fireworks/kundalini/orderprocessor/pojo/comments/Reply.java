
package com.fireworks.kundalini.orderprocessor.pojo.comments;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "customerMail",
    "customerMobile",
    "customerName",
    "reply",
    "tag"
})
public class Reply {

    @JsonProperty("customerMail")
    private String customerMail;
    @JsonProperty("customerMobile")
    private String customerMobile;
    @JsonProperty("customerName")
    private String customerName;
    @JsonProperty("reply")
    private Reply_ reply;
    @JsonProperty("tag")
    private List<String> tag = null;

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

    @JsonProperty("customerName")
    public String getCustomerName() {
        return customerName;
    }

    @JsonProperty("customerName")
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    @JsonProperty("reply")
    public Reply_ getReply() {
        return reply;
    }

    @JsonProperty("reply")
    public void setReply(Reply_ reply) {
        this.reply = reply;
    }

    @JsonProperty("tag")
    public List<String> getTag() {
        return tag;
    }

    @JsonProperty("tag")
    public void setTag(List<String> tag) {
        this.tag = tag;
    }

}
