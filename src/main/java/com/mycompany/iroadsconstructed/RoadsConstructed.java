/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.iroadsconstructed;

/**
 *
 * @author Garfield
 */

public abstract class RoadsConstructed implements IRoadsConstructed {
    private String city;
    private int totalRoadsConstructed;

    public RoadsConstructed(String city, int totalRoadsConstructed) {
        this.city = city;
        this.totalRoadsConstructed = totalRoadsConstructed;
    }

    @Override
    public String getCity() {
        return city;
    }

    @Override
    public int getTotalRoadsConstructed() {
        return totalRoadsConstructed;
    }
}
