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
class Lastebil extends Fossilbil {

    private double nyttevekt;

    public Lastebil(String kjennemerke, double co2Utslipp, double nyttevekt) {
        super(kjennemerke, co2Utslipp);
        this.nyttevekt = nyttevekt;
    
}

    public void setNyttevekt(double nyttevekt) {
        this.nyttevekt = nyttevekt;
    }

    public double getNyttevekt() {
        return nyttevekt;
    }

    @Override
    public void getInfo() {
	super.getInfo();
	System.out.printf("Biltype: Lastebil\nLastebilen har nyttevekt %f kg\n", nyttevekt);
    }


}

