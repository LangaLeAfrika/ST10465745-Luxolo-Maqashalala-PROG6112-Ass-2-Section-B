/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.iroadsconstructed;

/**
 *
 * @author Garfield
 */

public class RoadConstructionReport extends RoadsConstructed {

    public RoadConstructionReport(String city, int totalRoadsConstructed) {
        super(city, totalRoadsConstructed);
    }

    public void printRoadsConstructedReport() {
        System.out.println("----- Road Construction Report -----");
        System.out.println("City: " + getCity());
        System.out.println("Total Roads Constructed: " + getTotalRoadsConstructed());
        System.out.println("-----------------------------------");
    }
}
