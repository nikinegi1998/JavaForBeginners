
package generics_4class;
import java.util.ArrayList;

class App{
    public String toString(){
        System.out.println();
        return "Method of class App";
    }

    void creation() {
        
        System.out.println("what is this behavior?? ");
    }
}

class Play extends App{
    @Override
    public String toString(){
        System.out.println();
        return "Method of class Play";
    }
        
}

public class Generics_4class {

    public static void main(String[] args) {

        ArrayList<App> items1 = new ArrayList<App>();
        items1.add(new App());
        items1.add(new App());
        
        ArrayList<Play> items2 = new ArrayList<Play>();
        items2.add(new Play());
        items2.add(new Play());
        
        show_result(items2);
        show_result2(items1);
    }
    
    public static void show_result(ArrayList <? extends App> itm){
        //the ? represents the wildcard which is used to represent the 
        //array list of unknown type
        for (App val: itm){
            System.out.println("items are: " + val);
            val.creation();
        }
        
        /*
            for (App val: itm){
            System.out.println("items are: " + val);
        }
        //this shows an error while using wildcard..... we can use this if 
        //the class is specified in method arguments....
        */
    }
    
    
    public static void show_result2(ArrayList<? super Play> itm){
        //this above argument shows that the object could be App or
        // sub type of App 
        for (Object val: itm){
            System.out.println("items are: " + val);
        }
    }
}
