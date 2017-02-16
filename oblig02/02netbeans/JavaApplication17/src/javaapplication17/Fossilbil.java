/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication17;

/**
 *
 * @author kennethravn
 */
abstract class Fossilbil extends Bil {

    private double co2Utslipp;


    public Fossilbil(String kjennemerke, double co2Utslipp) {
        super(kjennemerke);
        this.co2Utslipp = co2Utslipp;
    }

    public void setCo2Utslipp(double co2Utslipp) {
        this.co2Utslipp = co2Utslipp;
    }

    public double getCo2Utslipp() {
        return co2Utslipp;
    }

    @Override
    public void getInfo() {
	super.getInfo();
	System.out.printf("Motortype: Forbrenningsmotor \nBilen har Co2-utslipp: %f g/km\n", co2Utslipp);
    }
}

