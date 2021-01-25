package br.com.petz.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.annotation.processing.Generated;
import java.util.Date;

public class Order {
    private int id;
    private int petId;
    private int quantity;
    private String shipDate;
    private String status;
    private boolean complete;

    public Order(){

    }

    public Order(int id, int petId, int quantity, String shipDate, String status, boolean complete) {
        this.id = id;
        this.petId = petId;
        this.quantity = quantity;
        this.shipDate = shipDate;
        this.status = status;
        this.complete = complete;
    }

    public int getId() {
        return id;
    }

    public int getPetId() {
        return petId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getShipDate() {
        return shipDate;
    }

    public String getStatus() {
        return status;
    }

    public boolean isComplete() {
        return complete;
    }
}