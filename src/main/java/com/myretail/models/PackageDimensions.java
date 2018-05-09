
package com.myretail.models;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "weight",
    "weight_unit_of_measure",
    "width",
    "depth",
    "height",
    "dimension_unit_of_measure"
})
public class PackageDimensions implements Serializable
{

    @JsonProperty("weight")
    private String weight;
    @JsonProperty("weight_unit_of_measure")
    private String weightUnitOfMeasure;
    @JsonProperty("width")
    private String width;
    @JsonProperty("depth")
    private String depth;
    @JsonProperty("height")
    private String height;
    @JsonProperty("dimension_unit_of_measure")
    private String dimensionUnitOfMeasure;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 971088088400364497L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public PackageDimensions() {
    }

    /**
     * 
     * @param weightUnitOfMeasure
     * @param dimensionUnitOfMeasure
     * @param height
     * @param weight
     * @param width
     * @param depth
     */
    public PackageDimensions(String weight, String weightUnitOfMeasure, String width, String depth, String height, String dimensionUnitOfMeasure) {
        super();
        this.weight = weight;
        this.weightUnitOfMeasure = weightUnitOfMeasure;
        this.width = width;
        this.depth = depth;
        this.height = height;
        this.dimensionUnitOfMeasure = dimensionUnitOfMeasure;
    }

    @JsonProperty("weight")
    public String getWeight() {
        return weight;
    }

    @JsonProperty("weight")
    public void setWeight(String weight) {
        this.weight = weight;
    }

    @JsonProperty("weight_unit_of_measure")
    public String getWeightUnitOfMeasure() {
        return weightUnitOfMeasure;
    }

    @JsonProperty("weight_unit_of_measure")
    public void setWeightUnitOfMeasure(String weightUnitOfMeasure) {
        this.weightUnitOfMeasure = weightUnitOfMeasure;
    }

    @JsonProperty("width")
    public String getWidth() {
        return width;
    }

    @JsonProperty("width")
    public void setWidth(String width) {
        this.width = width;
    }

    @JsonProperty("depth")
    public String getDepth() {
        return depth;
    }

    @JsonProperty("depth")
    public void setDepth(String depth) {
        this.depth = depth;
    }

    @JsonProperty("height")
    public String getHeight() {
        return height;
    }

    @JsonProperty("height")
    public void setHeight(String height) {
        this.height = height;
    }

    @JsonProperty("dimension_unit_of_measure")
    public String getDimensionUnitOfMeasure() {
        return dimensionUnitOfMeasure;
    }

    @JsonProperty("dimension_unit_of_measure")
    public void setDimensionUnitOfMeasure(String dimensionUnitOfMeasure) {
        this.dimensionUnitOfMeasure = dimensionUnitOfMeasure;
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
		return "PackageDimensions [weight=" + weight + ", weightUnitOfMeasure=" + weightUnitOfMeasure + ", width="
				+ width + ", depth=" + depth + ", height=" + height + ", dimensionUnitOfMeasure="
				+ dimensionUnitOfMeasure + ", additionalProperties=" + additionalProperties + "]";
	}

}