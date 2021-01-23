package br.com.petz.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.processing.Generated;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

@Generated("br.com.petz")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Pet {
    @JsonProperty("id")
    private int id;
    @JsonProperty("category")
    private Category category;
    @JsonProperty("name")
    private String name;
    @JsonProperty("photoUrls")
    private List<String> photourls;
    @JsonProperty("tags")
    private List<Tag> tags;
    @JsonProperty("status")
    private String status;
    public Pet (){

    }
    public Pet (int id, Category category, String name, List<String> photoUrls, List<Tag> tags, String status){
        this.id = id;
        this.category = category;
        this.photourls = photoUrls;
        this.tags = tags;
        this.status = status;

    }

    public int getId () {
            return id;
        }

        public void setId ( int id){
            this.id = id;
        }

        public Category getCategory () {
            return category;
        }

        public void setCategory (Category category){
            this.category = category;
        }

        public String getName () {
            return name;
        }

        public void setName (String name){
            this.name = name;
        }

        public String getStatus () {
            return status;
        }

        public void setStatus (String status){
            this.status = status;
        }

        public List<String> getPhotourls () {
            return photourls;
        }

        public void setPhotourls (List < String > photourls) {
            this.photourls = photourls;
        }

        public List<Tag> getTags () {
            return tags;
        }

        public void setTags (List < Tag > tags) {
            this.tags = tags;
        }


    }
