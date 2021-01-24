package br.com.petz.apis;

import br.com.petz.model.*;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Helper {
    private Pet pet;
    private User user;

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public void setPhotoUrls(List<String> photoUrls) {
        this.photoUrls = photoUrls;
    }

    private Category category;
    private List<Tag> tags;
    private List<String> photoUrls;
    public List<String> getPhotoUrls(){
        return photoUrls;
    }
    public Helper(){

    }
    public Helper(int petId, String categoryName
    ){

    }


    public Pet pet(int id, Category category, String name, List<String> photoUrls, List<Tag> tags, String status) {

        return new Pet(id, category, name, photoUrls, tags, status);
    }

    public Category category(int id, String name) {
        return new Category(id, name);
    }

    public List<Tag> tags(int id, String name) {
        var tag = new Tag(id, name);
        List<Tag> tags = new ArrayList<>();
        tags.add(tag);
        return tags;
    }
    public void addPhotoUrl(String photoUrl) {
        photoUrls.add(photoUrl);
    }

    public User user(String ... data) {
        return new User(data);
    }
    public Order order(int id, int petId, int quantity, String status, boolean completed){
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.ms");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        var date = formatter.format(calendar.getTime());
        System.out.println(date);

        return new Order(id,petId,quantity,date,status,completed);
    }
}
