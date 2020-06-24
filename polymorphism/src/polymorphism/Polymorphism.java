
package polymorphism;


public class Polymorphism {

    public static void main(String[] args) {

        Shapes s1 =  new Shapes();
        Square sobj = new Square();
        Triangle tobj =  new Triangle();
        
        tobj.info();
        
        //methods of class square
        sobj.info();
        sobj.speciality();
        
        
        //reference to the child class object
        Shapes s2 = sobj;
        s2.info();
        /*
        * s2.speciality(); 
        * won't work since speciality is the method of child class only         
        */
            
    }
    
}
