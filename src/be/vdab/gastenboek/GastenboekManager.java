/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.vdab.gastenboek;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author HP
 */
public class GastenboekManager {

    private Gastenboek gastenboek = new Gastenboek();

    public GastenboekManager() {
        leesGastenboek(); // leest het reeds geschreven gastenboek 
    }

    public Gastenboek getGastenboek() {
        return gastenboek;
    }

    private void leesGastenboek() {
        try (FileInputStream fis = new FileInputStream("C:\\Users\\HP\\Desktop\\JAVA\\NETBEANS_PROJECTS\\gastenboek.dat");
                ObjectInputStream ois = new ObjectInputStream(fis);) {
            gastenboek = (Gastenboek) ois.readObject();
        } catch (IOException e) {
            System.out.println("Kan het gastenboek niet vinden, er wordt gestart met een nieuwe gastenboek!");

        } catch (ClassNotFoundException e) {
            System.out.println("kan de klasse niet vinden : ");

        }

    }

    public void schrijfEntry(GastenboekEntry entry) {
        gastenboek.toevoegen(entry);
    }

    public void schrijfGastenboek() {
      try (FileOutputStream fos = new 
               FileOutputStream("C:\\Users\\HP\\Desktop\\JAVA\\NETBEANS_PROJECTS\\gastenboek.dat");
           ObjectOutputStream oos = new ObjectOutputStream(fos); ){
           oos.writeObject(gastenboek);
      }
      catch (IOException e) {
         System.out.println("Gastenboek kan niet weggeschreven worden!");
      }
  }
} 
