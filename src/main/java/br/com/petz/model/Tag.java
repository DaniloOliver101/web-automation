package br.com.petz.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.annotation.processing.Generated;

@Generated("br.com.petz")
public class Tag {
    @JsonProperty("id")
    private int id;
    @JsonProperty("name")
    private String name;

    public Tag() {

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Tag(int id, String name) {
        this.id = id;
        this.name = name;
    }
}