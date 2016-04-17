/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oefeningen;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author HP
 */
public class CopyBytesBuffered {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        try (BufferedInputStream bis = new BufferedInputStream(
                new FileInputStream("C:\\Users\\HP\\Desktop\\JAVA\\alfabetIn.txt"));
                BufferedOutputStream bos = new BufferedOutputStream(
                        new FileOutputStream("C:\\Users\\HP\\Desktop\\JAVA\\alfabetOut.txt", true));) {
            int c;
            while ((c = bis.read()) != -1) {
                bos.write(c);
            }
        } catch (IOException e) {
            System.out.println("FILE NIET GEVONDEN");
        }
    }

}
