/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.vdab.gastenboek;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author HP
 */
public class GastenboekEntry implements Serializable {
public static final long serialVersionUID = 1L;
private final Date datum = new Date();
private String schrijver = "";
private String boodschap = "";
public GastenboekEntry (String naam, String boodschap) {
    if (naam !=null && (naam.isEmpty())) { 
        schrijver = naam;
    }
    if (boodschap !=null &&!(boodschap.isEmpty())) {
        this.boodschap = boodschap;
    }
        
    }

    public Date getDatum() {
        return datum;
    }

    public String getSchrijver() {
        return schrijver;
    }

    public String getBoodschap() {
        return boodschap;
    }
    

}
