/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jpa.crud.model;

import javax.persistence.Entity;

/**
 *
 * @author Leanghour
 */
@Entity
public class Autobike extends Vihecles{
    
    private double speed;
    private double load;
    private int wheels;
    private String loadType;
    private String drive;

    public Autobike() {
    }

    public Autobike(double speed, double load, int wheels, String loadType, String drive) {
        this.speed = speed;
        this.load = load;
        this.wheels = wheels;
        this.loadType = loadType;
        this.drive = drive;
    }

    public Autobike(int machine, double power, String type,double speed, double load, int wheels, String loadType, String drive) {
        super(machine, power, type);
        this.speed = speed;
        this.load = load;
        this.wheels = wheels;
        this.loadType = loadType;
        this.drive = drive;
    }

    
    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getLoad() {
        return load;
    }

    public void setLoad(double load) {
        this.load = load;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getLoadType() {
        return loadType;
    }

    public void setLoadType(String loadType) {
        this.loadType = loadType;
    }

    public String getDrive() {
        return drive;
    }

    public void setDrive(String drive) {
        this.drive = drive;
    }

    @Override
    public String toString() {
        return "Autobike{" +super.toString()+ "speed=" + speed + ", load=" + load + ", wheels=" + wheels + ", loadType=" + loadType + ", drive=" + drive + '}';
    }
    
}
