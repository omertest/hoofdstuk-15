package oefeningen;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author HP
 */
public class CopyByteTwr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
   try (FileInputStream fis=new FileInputStream("C:\\Users\\HP\\Desktop\\JAVA\\alfabetIn.txt"); 
        FileOutputStream fos=new FileOutputStream("C:\\Users\\HP\\Desktop\\JAVA\\alfabetOut.txt",true);) {  
       int c;
       while ((c = fis.read()) != -1) {
           fos.write(c);
       }
   } 
   catch (IOException e) {
       System.out.println("file niet gevonden");
   }
  }
}

