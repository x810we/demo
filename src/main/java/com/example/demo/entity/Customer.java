package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Customer {
    @Id
    String name;

    protected Customer() {}

    public Customer(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
}
