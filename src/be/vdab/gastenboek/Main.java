/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.vdab.gastenboek;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GastenboekManager manager = new GastenboekManager();
        String keuze, naam, boodschap;

        try (Scanner sc = new Scanner(System.in)) {
            sc.useDelimiter("\n"); //om er voor te zorgen dat een naam enboodschap uit meerdere woorden kan bestaan 

            System.out.println("Wat wil je doen? \nTonen, Schrijven of Eindigen\nGeef T, S of E\n");
            keuze = sc.next();

            while (!keuze.equalsIgnoreCase("E")) {
                switch (keuze) {
                    case "S":
                    case "s":
                        System.out.println("Geef uw naam: ");
                        naam = sc.next();
                        System.out.println("Geef uw boodschap: ");
                        boodschap = sc.next();
                        manager.schrijfEntry(
                                new GastenboekEntry(naam, boodschap));
                        break;

                    case "T":
                    case "t":
                        List<GastenboekEntry> alleEntries
                                = manager.getGastenboek().getGastenboek();
                        System.out.println("Aantal entries: "
                                + alleEntries.size());

                        for (int i = alleEntries.size() - 1; i >= 0; i--) {
                            System.out.println(
                                    alleEntries.get(i).getDatum() + "\t"
                                    + alleEntries.get(i).getSchrijver() + "\t"
                                    + alleEntries.get(i).getBoodschap());
                        }
                        break;

                    default:
                        System.out.println("Foute keuze");
                }

                System.out.println("\nWat wil je doen? \nTonen, Schrijven of Eindigen\nGeef T, S of E\n");
                keuze = sc.next();
            }
        }
        //op het einde het gastenboek volledig schrijven naar de file
        manager.schrijfGastenboek();
    }
}
