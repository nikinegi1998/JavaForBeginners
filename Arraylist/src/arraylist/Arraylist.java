
package arraylist;

import java.util.ArrayList;
import java.util.List;


public class Arraylist {


    public static void main(String[] args) {
  
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("Somya");
        arr.add("CLAIRE");
        arr.add("Geeta");
        arr.add("Chetna");
        
        for(String i: arr){
            System.out.println("values: "+i);
        }
        
        System.out.println("item removed: " + arr.remove((2)));
        
        for(String i: arr){
            System.out.println("values: "+i);
        }
                
    }
    
}
