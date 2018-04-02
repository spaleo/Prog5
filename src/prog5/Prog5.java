/*
CSE 017-012
Samuel Paleologopoulos
880369413
Program Description: 
Program #5
 */
package prog5;

import java.util.*;
import java.lang.*;
import java.io.*;
import java.net.*;
import javax.imageio.ImageIO;
import java.awt.image.*;

public class Prog5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the image file path or url (starting with http:):");
        String path = sc.next();
        BufferedImage img = null;
        try {
            if (path.contains("http")) {
                URL url = new URL(path);
                img = ImageIO.read(url);
            } else {
                File file = new File(path);
                img = ImageIO.read(file);
            }
        } catch (IOException e) {

        } finally {
            GImage image = new GImage(img);
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    System.out.println("Nuthin'");
    }

}
