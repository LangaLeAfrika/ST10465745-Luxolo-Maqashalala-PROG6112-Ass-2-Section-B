/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.iroadsconstructed;

/**
 *
 * @author Garfield
 */

public class RunApplication {
    public static void main(String[] args) {
        // Example report
        RoadConstructionReport report1 = new RoadConstructionReport("Port Elizabeth", 12);
        report1.printRoadsConstructedReport();

        RoadConstructionReport report2 = new RoadConstructionReport("Cape Town", 20);
        report2.printRoadsConstructedReport();
    }
}
