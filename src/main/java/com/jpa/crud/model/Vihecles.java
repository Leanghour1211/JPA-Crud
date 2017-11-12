/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jpa.crud.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import org.springframework.hateoas.ResourceSupport;

/**
 *
 * @author Leanghour
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Vihecles extends ResourceSupport{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int vihecle_id;
    private int machine;
    private double power;
    private String type;
    private String brandName;
    private String model;
    private double price;
    private String plate;
    public Vihecles() {
    }

    public int getVihecle_id() {
        return vihecle_id;
    }

    public Vihecles(int machine, double power, String type) {
        this.machine = machine;
        this.power = power;
        this.type = type;
    }

    public void setVihecle_id(int vihecle_id) {
        this.vihecle_id = vihecle_id;
    }

    public int getMachine() {
        return machine;
    }

    public void setMachine(int machine) {
        this.machine = machine;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    @Override
    public String toString() {
        return "Vihecles{" + "vihecle_id=" + vihecle_id + ", machine=" + machine + ", power=" + power + ", type=" + type + ", brandName=" + brandName + ", model=" + model + ", price=" + price + ", plate=" + plate + '}';
    }
    
    
    
    
    
}
