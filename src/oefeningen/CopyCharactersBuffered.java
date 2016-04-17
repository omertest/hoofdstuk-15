/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oefeningen;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author HP
 */
public class CopyCharactersBuffered {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader("D:/JPF/alfabetIn.txt"));
                BufferedWriter bw = new BufferedWriter(new FileWriter("D:/JPF/alfabetOutChar.txt"));) {
            int c;
            while ((c = br.read()) != -1) {
                bw.write(c);
            }
        } catch (IOException e) {
            System.out.println("file niet gevonden");
        }
    }

}
