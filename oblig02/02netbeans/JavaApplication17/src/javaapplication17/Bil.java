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
public class Bil {

    private String kjennemerke;

    public Bil(String kjennemerke) {
        this.kjennemerke = kjennemerke;
    }

    public void setKjennemerke(String kjennemerke) {
        this.kjennemerke = kjennemerke;

    }

    public String getKjennemerke() {
        return kjennemerke;
    }

    public void getInfo() {
	System.out.printf("Kjennemerke: %s\n", kjennemerke);
    }

}

