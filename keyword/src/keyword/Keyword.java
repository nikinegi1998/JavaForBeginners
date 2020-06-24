
package keyword;

class Institute{
    static int days=1;                      //static variable declared
    String tutorials;
    
    Institute(String tut){
        this.tutorials=tut;
    }
    
    void display(){
        System.out.println("total days: "+days+ "\nTutorials: "+tutorials);
        days++;       
    }
}
public class Keyword {
    
    public static void main(String[] args) {
        Institute ob1= new Institute("Rakesh");
        ob1.display();        
        
        Institute ob2= new Institute("Shiksha");
        ob2.display();
        
        //This concatenation of the string is not efficient because 
        //we are creating a new string everytime we add to the original string.
        String name = "";
        name+="Hey! ";
        name+=" ";
        name+="I am Nikita Negi.";
        System.out.println(name);
        //String builder used for effecient string formatting because 
        // it appends the string in the original string variable.
        StringBuilder st= new StringBuilder();        
        st.append("Hi.... ").append("How are you?");
        System.out.println(st);
        System.out.println(st.toString());
               
        
        //%2d for inserting space before the character
        //%.3f for precision in floating point number
        System.out.printf("id: %2d, name: %19s",5,"Ananya");
        System.out.println("");
        System.out.printf("Floating point: %8.3f",5.688944);    
                
        
        //Every class in java is child of Object class either directly 
        //or indirectly. Object class contains toString() method.
        //to assign the value to a string we need to override the 
        //toString() method.
        
    }
    
}
