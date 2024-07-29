package com.skyscanner;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Search {

    @JsonProperty
    private string city;

    public Search() {

    }

    public Search(string city) { this.city = city; }

    public string getCity() {
        return city;
    }
}
