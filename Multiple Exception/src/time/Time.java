
package time;

import java.io.IOException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Time {

    public static void main(String[] args) {

        Clock obj = new Clock();
        
        /*
        * There are 2 types of exception - Checked and Runtime Exception
        * Runtime exceptions are not necessarily required to be handled whereas 
        * Checked exception are handled before execution        
        */
        

        //Multiple exception using try-catch 
        try {
            obj.run();
        } catch (IOException ex) {
            System.out.println("Input/ Output Exception encountered..");
        } catch (ParseException ex) {
            System.out.println("Parse Exception");
        }
        
        //Multiple exception handling in single catch statement
        try {
            obj.run();
        } catch (IOException |ParseException ex) {
            System.out.println("Exception");
        }
        
        //use of the parent class of exception in catch statement
        try {
            obj.run();
        } catch (Exception ex) {
            System.out.println("Not Valid");
        }
            
    }
    
}
