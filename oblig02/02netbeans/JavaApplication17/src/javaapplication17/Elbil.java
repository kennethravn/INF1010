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


public class Elbil extends Bil {
    private double batteriKapasitet;

    public Elbil(String kjennemerke, double batteriKapasitet) {
        super(kjennemerke);
        this.batteriKapasitet = batteriKapasitet;
    }

    public void setBatteriKapasitet(double batteriKapasitet) {
        this.batteriKapasitet = batteriKapasitet;
    }

    public double getBatteriKapasitet() {
        return batteriKapasitet;
    }

    @Override
    public void getInfo() {
	super.getInfo();
	    System.out.printf("Motortype: Elektrisk motor\nElbilen har batterikapasitet: %f\n", batteriKapasitet);    
    }

}


