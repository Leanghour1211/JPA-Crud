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
public class Motobike extends Vihecles{
    
    private double speed;
    private String wheelType;
    private String bestRun;
    private String supportType;

    public Motobike() {
    }

    public Motobike(double speed, String wheelType, String bestRun, String supportType) {
        this.speed = speed;
        this.wheelType = wheelType;
        this.bestRun = bestRun;
        this.supportType = supportType;
    }

    public Motobike( int machine, double power, String type,double speed, String wheelType, String bestRun, String supportType) {
        super(machine, power, type);
        this.speed = speed;
        this.wheelType = wheelType;
        this.bestRun = bestRun;
        this.supportType = supportType;
    }

    
    
    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public String getWheelType() {
        return wheelType;
    }

    public void setWheelType(String wheelType) {
        this.wheelType = wheelType;
    }

    public String getBestRun() {
        return bestRun;
    }

    public void setBestRun(String bestRun) {
        this.bestRun = bestRun;
    }

    public String getSupportType() {
        return supportType;
    }

    public void setSupportType(String supportType) {
        this.supportType = supportType;
    }

    @Override
    public String toString() {
        return "Motobike{"+super.toString() + "speed=" + speed + ", wheelType=" + wheelType + ", bestRun=" + bestRun + ", supportType=" + supportType + '}';
    }
    
    
    
}
