package oefeningen;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author HP
 */
public class CopyBytes {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            fis = new FileInputStream("C:\\Users\\HP\\Desktop\\JAVA\\alfabetIn.txt");
            fos = new FileOutputStream("C:\\Users\\HP\\Desktop\\JAVA\\alfabetOut.txt",true);
            int c;
            while ((c = fis.read()) != -1) {
                fos.write(c);
            }

        } catch (IOException e) {
            System.out.println("file niet gevonden");

        } finally {
            if (fis != null) {
                fis.close();
            }
            if (fos != null) {
                fos.close();
            }

        }
    }

}
