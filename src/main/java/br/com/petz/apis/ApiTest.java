package br.com.petz.apis;

import br.com.petz.apis.Api;
import br.com.petz.model.Order;
import br.com.petz.model.User;
import io.cucumber.datatable.DataTable;
import org.junit.Assert;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ApiTest {
    private DataTable petTable;
    private DataTable userTable;
    private final Helper helper = new Helper();
    private final Api api = new Api();
    private String[] userData;
    private String[] petData;
    public void setUserTable(DataTable userTable){
        this.userTable = userTable;
    }
    public DataTable getUserTable(){
        return userTable;
    }
    public void setPetTable(DataTable petTable){
        this.petTable = petTable;
    }
    public DataTable getPetTable(){
        return petTable;
    }

    public void testAddNewUser(){
        var data = getUserTable().asList();
        this.userData = new String[data.size()];
        this.userData = data.toArray(userData);
        var user = helper.user(this.userData);
        var res = api.addNewUser(user);
        Assert.assertEquals(res.statusCode(), 200);


    }

    public void testGetUserByUserName() {
        var res = api.getUserByUserName(this.userData[0]);
        Assert.assertEquals(res.statusCode(), 200);
    }

    public void testAddNewPet() {
        var data = this.petTable.asList();
        this.petData = new String[data.size()];
        this.petData = data.toArray(petData);
        var category = helper.category(20, petData[1]);
        var tags = helper.tags(20, petData[1]);
        var photoUrls = helper.getPhotoUrls();
        var pet = helper.pet(20, category, petData[0], photoUrls, tags, "AVAILABLE");
        var res = api.addNewPet(pet);
        Assert.assertEquals(res.statusCode(), 200);

    }

    public void testGetNewPet() {
        var res = api.getPetById(20);
        Assert.assertEquals(res.statusCode(), 200);
    }

    public void testAddNewOrder() {
        var order = helper.order(123,20,1,"placed",true);


    }
}
