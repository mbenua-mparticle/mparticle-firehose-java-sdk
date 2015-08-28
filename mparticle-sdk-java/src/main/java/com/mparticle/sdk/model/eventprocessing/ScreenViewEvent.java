package com.mparticle.sdk.model.eventprocessing;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

public class ScreenViewEvent extends Event {

    @JsonProperty(value="screen_name", required=true)
    private String screenName;

    @JsonProperty("attributes")
    private Map<String, String> attributes;

    public String getScreenName() {
        return screenName;
    }

    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }

    public Map<String, String> getAttributes() {
        return attributes;
    }

    public void setAttributes(Map<String, String> attributes) {
        this.attributes = attributes;
    }

    public ScreenViewEvent() {
        super(Type.SCREEN_VIEW);
    }
}

