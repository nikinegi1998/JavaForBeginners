
package continents;
import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Continents {

    public static void main(String[] args) {

        //try catch exception handler used for identifying the validity of file
        
        FileReader rd = null;
        
        System.out.println("File reading: ");
        try {
            File tf = new File("Antarctica.txt");
            rd = new FileReader(tf);
            
            //if an exception occurs the following code doesn't gets executed
            System.out.println("Continued....");
        } catch (FileNotFoundException ex) {
            System.out.println("Sorry!! File does not exist....");
        } 
             
    }

    public void Ocean() throws FileNotFoundException{
        
        File fn = new File("Ocean.txt");
        FileReader f= new FileReader(fn);
        
        
    }
}
