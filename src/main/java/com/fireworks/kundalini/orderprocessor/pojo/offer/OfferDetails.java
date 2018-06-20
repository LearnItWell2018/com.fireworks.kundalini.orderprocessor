
package com.fireworks.kundalini.orderprocessor.pojo.offer;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "description",
    "percentageApplicable",
    "initialPreBookPercentage",
    "preBookPercentageApplicable",
    "strategy"
})
public class OfferDetails {

    @JsonProperty("description")
    private String description;
    @JsonProperty("percentageApplicable")
    private String percentageApplicable;
    @JsonProperty("initialPreBookPercentage")
    private String initialPreBookPercentage;
    @JsonProperty("preBookPercentageApplicable")
    private String preBookPercentageApplicable;
    @JsonProperty("strategy")
    private String strategy;

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("percentageApplicable")
    public String getPercentageApplicable() {
        return percentageApplicable;
    }

    @JsonProperty("percentageApplicable")
    public void setPercentageApplicable(String percentageApplicable) {
        this.percentageApplicable = percentageApplicable;
    }

    @JsonProperty("initialPreBookPercentage")
    public String getInitialPreBookPercentage() {
        return initialPreBookPercentage;
    }

    @JsonProperty("initialPreBookPercentage")
    public void setInitialPreBookPercentage(String initialPreBookPercentage) {
        this.initialPreBookPercentage = initialPreBookPercentage;
    }

    @JsonProperty("preBookPercentageApplicable")
    public String getPreBookPercentageApplicable() {
        return preBookPercentageApplicable;
    }

    @JsonProperty("preBookPercentageApplicable")
    public void setPreBookPercentageApplicable(String preBookPercentageApplicable) {
        this.preBookPercentageApplicable = preBookPercentageApplicable;
    }

    @JsonProperty("strategy")
    public String getStrategy() {
        return strategy;
    }

    @JsonProperty("strategy")
    public void setStrategy(String strategy) {
        this.strategy = strategy;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("description", description).append("percentageApplicable", percentageApplicable).append("initialPreBookPercentage", initialPreBookPercentage).append("preBookPercentageApplicable", preBookPercentageApplicable).append("strategy", strategy).toString();
    }

}
