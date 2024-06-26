package com.zoho.subscriptions.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.zoho.subscriptions.net.Resource;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Tag extends Resource {
    String tagOptionId;

    String tagName;

    String tagId;

    String tagOptionName;

    public void setTagOptionId(String tagOptionId) {this.tagOptionId = tagOptionId;}
    public String getTagOptionId() {return tagOptionId;}

    public void setTagName(String tagName) {this.tagName = tagName;}
    public String getTagName() {return tagName;}

    public void setTagId(String tagId) {this.tagId = tagId;}
    public String getTagId() {return tagId;}

    public void setTagOptionName(String tagOptionName) {this.tagOptionName= tagOptionName;}
    public String getTagOptionName() {return tagOptionName;}

}
