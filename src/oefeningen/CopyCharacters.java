/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oefeningen;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author HP
 */
public class CopyCharacters {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("C:\\Users\\HP\\Desktop\\JAVA\\alfabetIn.txt");
                FileWriter fw = new FileWriter("C:\\Users\\HP\\Desktop\\JAVA\\alfabetOut.txt", true);){
            int c;
            while ((c = fr.read()) != -1) {
                fw.write(c);
            }
        } 
        catch (IOException e) {
            System.out.println("FILE NIET GEVONDEN");
        }
    }
}



