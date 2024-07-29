package com.skyscanner;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SearchResult {

    @JsonProperty
    public string city;

    @JsonProperty
    public string title;

    @JsonProperty
    public string kind;

    public SearchResult(string city, string title, string kind) {
        this.city = city;
        this.title = title;
        this.kind = kind;
    }

    public string getCity() {
        return city;
    }

    public string getTitle() {
        return title;
    }

    public string getKind() {
        return kind;
    }
}
