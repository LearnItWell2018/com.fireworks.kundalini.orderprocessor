
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
    "comment",
    "tag",
    "replies"
})
public class Example {

    @JsonProperty("customerMail")
    private String customerMail;
    @JsonProperty("customerMobile")
    private String customerMobile;
    @JsonProperty("customerName")
    private String customerName;
    @JsonProperty("comment")
    private Comment comment;
    @JsonProperty("tag")
    private List<String> tag = null;
    @JsonProperty("replies")
    private List<Reply> replies = null;

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

    @JsonProperty("comment")
    public Comment getComment() {
        return comment;
    }

    @JsonProperty("comment")
    public void setComment(Comment comment) {
        this.comment = comment;
    }

    @JsonProperty("tag")
    public List<String> getTag() {
        return tag;
    }

    @JsonProperty("tag")
    public void setTag(List<String> tag) {
        this.tag = tag;
    }

    @JsonProperty("replies")
    public List<Reply> getReplies() {
        return replies;
    }

    @JsonProperty("replies")
    public void setReplies(List<Reply> replies) {
        this.replies = replies;
    }

}
