
package generics;

import java.util.ArrayList;
import java.util.HashMap;

public class Generics {

    public static void main(String[] args) {

        //---------------Earlier Methods (NOt efficient)----------------------
        ArrayList fruits = new ArrayList();
        fruits.add(" apple ");
        fruits.add(" mango ");
        fruits.add(" grapes ");
        fruits.add(" custard apple ");
        String show1 = (String) fruits.get(2);
        System.out.println(show1);
        
        //--------------New methods-------------------------------------------
        ArrayList<String> vegies = new ArrayList<String>();
        vegies.add("potato");
        vegies.add("laddy finger");
        vegies.add("brinjal");
        String show2 = (String) vegies.get(2);
        System.out.println(show2);
                
        //--------------more than 1 datatype----------------------------------
        HashMap<Integer, String> yo = new HashMap<Integer, String>();
        
    }
    
}
