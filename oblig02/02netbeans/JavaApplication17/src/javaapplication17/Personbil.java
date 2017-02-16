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
public class Personbil extends Fossilbil {

    private int antallDorer;

    public Personbil(String kjennemerke, double co2Utslipp, int antallDorer) {
        super(kjennemerke, co2Utslipp);
        this.antallDorer = antallDorer;
    }

    /**
     *
     * @param antallDorer
     */
    public void setAntallDorer(int antallDorer) {
        this.antallDorer = antallDorer;
    }

    public int getAntallDorer() {
        return antallDorer;
    }

    @Override
    public void getInfo() {
	super.getInfo();
	System.out.printf("Biltype: Personbil \n Antall seter: %d", antallDorer);
    }
}
