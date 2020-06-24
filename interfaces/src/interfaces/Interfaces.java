
package interfaces;

public class Interfaces {

    public static void main(String[] args) {

        // the concept of multiple inheritance
        
        
        //Here the normal class object is created.        
        Yoga stud1= new Yoga();
        
        
        //object of interface with refernce with the chil class
        Meditation ob1 = new Yoga();
        ob1.show();
        
        Breathing ob2 = new Yoga();
        ob2.out();
    }
    
}
